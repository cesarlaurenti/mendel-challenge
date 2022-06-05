import com.mendel.challenge.dto.TransactionRequest;
import com.mendel.challenge.dto.TransactionResponse;
import com.mendel.challenge.enums.TransactionType;
import com.mendel.challenge.service.TransactionServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.client.HttpClientErrorException;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TransactionServiceTest {

    @InjectMocks
    private TransactionServiceImpl transactionService;

    @Test
    void whenRequestIsCompleteThenTransactionIsCreated(){
        TransactionRequest request = TransactionRequest.builder()
                .amount(120.23)
                .type(TransactionType.CASHIN)
                .build();
        TransactionResponse response = transactionService.createTransaction(request);
        assertEquals(UUID.fromString("5277df5d-bcf5-47f3-a2c3-216d798ec0ad"),response.getId());
    }

    @Test
    void whenTypeIsNotDefinedThenBadRequestExceptionIsThrown(){
        TransactionRequest request = TransactionRequest.builder()
                .amount(120.23)
                .build();
        Exception expectedException =
                Assertions.assertThrows(
                        HttpClientErrorException.BadRequest.class,
                        () -> transactionService.createTransaction(request));
        TransactionResponse response = transactionService.createTransaction(request);
    }
}
