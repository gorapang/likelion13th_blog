package likelion13th.blog.controller;

import likelion13th.blog.dto.ChatRequest;
import likelion13th.blog.dto.ChatResponse;
import likelion13th.blog.service.OpenAIChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
@RequiredArgsConstructor
public class OpenAIController {
    private final OpenAIChatService openAiChatService;

    @PostMapping
    public ResponseEntity<ChatResponse> chat(@RequestBody ChatRequest request){
        String response=openAiChatService.getChatResponse(request);
        return ResponseEntity.ok(new ChatResponse(response));
    }

}

