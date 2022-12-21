package com.survay.survay.dto;

import com.survay.survay.entity.Publish;
import com.survay.survay.entity.PublishData;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-21T22:25:49+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.4.1 (Eclipse Adoptium)"
)
*/
@Component
public class PublishDataMapperImpl implements PublishDataMapper {

    @Override
    public PublishDataDTO toPublishDataDTO(PublishData publishData) {
        if ( publishData == null ) {
            return null;
        }

        PublishDataDTO publishDataDTO = new PublishDataDTO();

        publishDataDTO.setPublishId( publishData.getPublishId() );
        publishDataDTO.setData( publishData.getData() );
        publishDataDTO.setPublish( publishToPublishDTO( publishData.getPublish() ) );

        return publishDataDTO;
    }

    @Override
    public List<PublishDataDTO> toPublishDataDTOs(List<PublishData> publishData) {
        if ( publishData == null ) {
            return null;
        }

        List<PublishDataDTO> list = new ArrayList<PublishDataDTO>( publishData.size() );
        for ( PublishData publishData1 : publishData ) {
            list.add( toPublishDataDTO( publishData1 ) );
        }

        return list;
    }

    @Override
    public PublishData toPublishData(PublishDataDTO publishDataDTO) {
        if ( publishDataDTO == null ) {
            return null;
        }

        PublishData publishData = new PublishData();

        publishData.setPublishId( publishDataDTO.getPublishId() );
        publishData.setData( publishDataDTO.getData() );
        publishData.setPublish( publishDTOToPublish( publishDataDTO.getPublish() ) );

        return publishData;
    }

    protected PublishDTO publishToPublishDTO(Publish publish) {
        if ( publish == null ) {
            return null;
        }

        PublishDTO publishDTO = new PublishDTO();

        publishDTO.setPublishId( publish.getPublishId() );
        publishDTO.setSurvay( publish.getSurvay() );

        return publishDTO;
    }

    protected Publish publishDTOToPublish(PublishDTO publishDTO) {
        if ( publishDTO == null ) {
            return null;
        }

        Publish publish = new Publish();

        publish.setPublishId( publishDTO.getPublishId() );
        publish.setPublishData( toPublishData( publishDTO.getPublishData() ) );
        publish.setSurvay( publishDTO.getSurvay() );

        return publish;
    }
}
