package com.survay.survay.dto;

import com.survay.survay.entity.Publish;
import com.survay.survay.entity.PublishData;
import com.survay.survay.entity.Survay;
import com.survay.survay.entity.SurvayData;
import com.survay.survay.entity.SurvayPassword;
import com.survay.survay.entity.SurvayURL;
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
public class SurvayPasswordMapperImpl implements SurvayPasswordMapper {

    @Override
    public SurvayPasswordDTO toSurvayPasswordDTO(SurvayPassword survay) {
        if ( survay == null ) {
            return null;
        }

        SurvayPasswordDTO survayPasswordDTO = new SurvayPasswordDTO();

        survayPasswordDTO.setPasswordId( survay.getPasswordId() );
        survayPasswordDTO.setPassword( survay.getPassword() );
        survayPasswordDTO.setSurvay( survayToSurvayDTO( survay.getSurvay() ) );

        return survayPasswordDTO;
    }

    @Override
    public List<SurvayPasswordDTO> toSurvayPasswordDTOs(List<SurvayPassword> survay) {
        if ( survay == null ) {
            return null;
        }

        List<SurvayPasswordDTO> list = new ArrayList<SurvayPasswordDTO>( survay.size() );
        for ( SurvayPassword survayPassword : survay ) {
            list.add( toSurvayPasswordDTO( survayPassword ) );
        }

        return list;
    }

    @Override
    public SurvayPassword toSurvayPassword(SurvayPasswordDTO survayDTO) {
        if ( survayDTO == null ) {
            return null;
        }

        SurvayPassword survayPassword = new SurvayPassword();

        survayPassword.setPasswordId( survayDTO.getPasswordId() );
        survayPassword.setPassword( survayDTO.getPassword() );
        survayPassword.setSurvay( survayDTOToSurvay( survayDTO.getSurvay() ) );

        return survayPassword;
    }

    protected SurvayDataDTO survayDataToSurvayDataDTO(SurvayData survayData) {
        if ( survayData == null ) {
            return null;
        }

        SurvayDataDTO survayDataDTO = new SurvayDataDTO();

        survayDataDTO.setSurvayDataId( survayData.getSurvayDataId() );
        survayDataDTO.setData( survayData.getData() );
        survayDataDTO.setSurvay( survayToSurvayDTO( survayData.getSurvay() ) );

        return survayDataDTO;
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

    protected SurvayURLDTO survayURLToSurvayURLDTO(SurvayURL survayURL) {
        if ( survayURL == null ) {
            return null;
        }

        SurvayURLDTO survayURLDTO = new SurvayURLDTO();

        survayURLDTO.setSurvayUrlId( survayURL.getSurvayUrlId() );
        survayURLDTO.setData( survayURL.getData() );
        survayURLDTO.setSurvay( survayToSurvayDTO( survayURL.getSurvay() ) );

        return survayURLDTO;
    }

    protected List<SurvayURLDTO> survayURLListToSurvayURLDTOList(List<SurvayURL> list) {
        if ( list == null ) {
            return null;
        }

        List<SurvayURLDTO> list1 = new ArrayList<SurvayURLDTO>( list.size() );
        for ( SurvayURL survayURL : list ) {
            list1.add( survayURLToSurvayURLDTO( survayURL ) );
        }

        return list1;
    }

    protected SurvayDTO survayToSurvayDTO(Survay survay) {
        if ( survay == null ) {
            return null;
        }

        SurvayDTO survayDTO = new SurvayDTO();

        survayDTO.setSurvayId( survay.getSurvayId() );
        survayDTO.setSurvayData( survayDataToSurvayDataDTO( survay.getSurvayData() ) );
        survayDTO.setPublish( publishToPublishDTO( survay.getPublish() ) );
        survayDTO.setSurvayUrl( survayURLListToSurvayURLDTOList( survay.getSurvayUrl() ) );
        survayDTO.setSurvayPassword( toSurvayPasswordDTO( survay.getSurvayPassword() ) );

        return survayDTO;
    }

    protected SurvayData survayDataDTOToSurvayData(SurvayDataDTO survayDataDTO) {
        if ( survayDataDTO == null ) {
            return null;
        }

        SurvayData survayData = new SurvayData();

        survayData.setSurvayDataId( survayDataDTO.getSurvayDataId() );
        survayData.setData( survayDataDTO.getData() );
        survayData.setSurvay( survayDTOToSurvay( survayDataDTO.getSurvay() ) );

        return survayData;
    }

    protected PublishData publishDataDTOToPublishData(PublishDataDTO publishDataDTO) {
        if ( publishDataDTO == null ) {
            return null;
        }

        PublishData publishData = new PublishData();

        publishData.setData( publishDataDTO.getData() );
        publishData.setPublish( publishDTOToPublish( publishDataDTO.getPublish() ) );

        return publishData;
    }

    protected Publish publishDTOToPublish(PublishDTO publishDTO) {
        if ( publishDTO == null ) {
            return null;
        }

        Publish publish = new Publish();

        publish.setPublishId( publishDTO.getPublishId() );
        publish.setPublishData( publishDataDTOToPublishData( publishDTO.getPublishData() ) );
        publish.setSurvay( publishDTO.getSurvay() );

        return publish;
    }

    protected SurvayURL survayURLDTOToSurvayURL(SurvayURLDTO survayURLDTO) {
        if ( survayURLDTO == null ) {
            return null;
        }

        SurvayURL survayURL = new SurvayURL();

        survayURL.setSurvayUrlId( survayURLDTO.getSurvayUrlId() );
        survayURL.setData( survayURLDTO.getData() );
        survayURL.setSurvay( survayDTOToSurvay( survayURLDTO.getSurvay() ) );

        return survayURL;
    }

    protected List<SurvayURL> survayURLDTOListToSurvayURLList(List<SurvayURLDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<SurvayURL> list1 = new ArrayList<SurvayURL>( list.size() );
        for ( SurvayURLDTO survayURLDTO : list ) {
            list1.add( survayURLDTOToSurvayURL( survayURLDTO ) );
        }

        return list1;
    }

    protected Survay survayDTOToSurvay(SurvayDTO survayDTO) {
        if ( survayDTO == null ) {
            return null;
        }

        Survay survay = new Survay();

        survay.setSurvayId( survayDTO.getSurvayId() );
        survay.setSurvayData( survayDataDTOToSurvayData( survayDTO.getSurvayData() ) );
        survay.setPublish( publishDTOToPublish( survayDTO.getPublish() ) );
        survay.setSurvayUrl( survayURLDTOListToSurvayURLList( survayDTO.getSurvayUrl() ) );
        survay.setSurvayPassword( toSurvayPassword( survayDTO.getSurvayPassword() ) );

        return survay;
    }
}
