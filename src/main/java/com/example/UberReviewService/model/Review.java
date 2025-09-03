package com.example.UberReviewService.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bookingreview")
@Inheritance(strategy = InheritanceType.JOINED)
public class Review extends BaseModel {


    private String content;

        private Double rating;

    @Override
    public String toString() {
        return this.id + " " + this.content + " " + this.rating + " " + this.createdAt + " " + this.updatedAt;
    }

}
