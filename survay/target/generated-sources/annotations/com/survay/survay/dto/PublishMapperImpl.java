package com.survay.survay.dto;

import com.survay.survay.entity.Publish;
import com.survay.survay.entity.PublishData;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-22T21:09:48+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.4.1 (Eclipse Adoptium)"
)
*/
@Component
public class PublishMapperImpl implements PublishMapper {

    @Override
    public PublishDTO toPublishDTO(Publish publish) {
        if ( publish == null ) {
            return null;
        }

        PublishDTO publishDTO = new PublishDTO();

        publishDTO.setPublishId( publish.getPublishId() );
        publishDTO.setSurvay( publish.getSurvay() );

        return publishDTO;
    }

    @Override
    public List<PublishDTO> toPublishDTOs(List<Publish> publish) {
        if ( publish == null ) {
            return null;
        }

        List<PublishDTO> list = new ArrayList<PublishDTO>( publish.size() );
        for ( Publish publish1 : publish ) {
            list.add( toPublishDTO( publish1 ) );
        }

        return list;
    }

    @Override
    public Publish toPublish(PublishDTO publishDTO) {
        if ( publishDTO == null ) {
            return null;
        }

        Publish publish = new Publish();

        publish.setPublishId( publishDTO.getPublishId() );
        publish.setPublishData( publishDataDTOToPublishData( publishDTO.getPublishData() ) );
        publish.setSurvay( publishDTO.getSurvay() );

        return publish;
    }

    protected PublishData publishDataDTOToPublishData(PublishDataDTO publishDataDTO) {
        if ( publishDataDTO == null ) {
            return null;
        }

        PublishData publishData = new PublishData();

        publishData.setData( publishDataDTO.getData() );
        publishData.setPublish( toPublish( publishDataDTO.getPublish() ) );

        return publishData;
    }
}
