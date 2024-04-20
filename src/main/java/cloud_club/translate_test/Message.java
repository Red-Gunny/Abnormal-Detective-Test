package cloud_club.translate_test;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Builder
public class Message {
    private final String userId;
    private final String messageId;
    private final Long messageSeq;
    private final String message;

}
