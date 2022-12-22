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
    date = "2022-12-22T14:30:54+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.4.1 (Eclipse Adoptium)"
)
*/
@Component
public class SurvayURLMapperImpl implements SurvayURLMapper {

    @Override
    public SurvayURLDTO toSurvayURLDTO(SurvayURL survayURL) {
        if ( survayURL == null ) {
            return null;
        }

        SurvayURLDTO survayURLDTO = new SurvayURLDTO();

        survayURLDTO.setSurvayUrlId( survayURL.getSurvayUrlId() );
        survayURLDTO.setData( survayURL.getData() );
        survayURLDTO.setSurvay( survayToSurvayDTO( survayURL.getSurvay() ) );

        return survayURLDTO;
    }

    @Override
    public List<SurvayURLDTO> toSurvayURLDTOs(List<SurvayURL> survay) {
        if ( survay == null ) {
            return null;
        }

        List<SurvayURLDTO> list = new ArrayList<SurvayURLDTO>( survay.size() );
        for ( SurvayURL survayURL : survay ) {
            list.add( toSurvayURLDTO( survayURL ) );
        }

        return list;
    }

    @Override
    public SurvayURL toSurvayURL(SurvayURLDTO survayDTO) {
        if ( survayDTO == null ) {
            return null;
        }

        SurvayURL survayURL = new SurvayURL();

        survayURL.setSurvayUrlId( survayDTO.getSurvayUrlId() );
        survayURL.setData( survayDTO.getData() );
        survayURL.setSurvay( survayDTOToSurvay( survayDTO.getSurvay() ) );

        return survayURL;
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

    protected SurvayPasswordDTO survayPasswordToSurvayPasswordDTO(SurvayPassword survayPassword) {
        if ( survayPassword == null ) {
            return null;
        }

        SurvayPasswordDTO survayPasswordDTO = new SurvayPasswordDTO();

        survayPasswordDTO.setPasswordId( survayPassword.getPasswordId() );
        survayPasswordDTO.setPassword( survayPassword.getPassword() );
        survayPasswordDTO.setSurvay( survayToSurvayDTO( survayPassword.getSurvay() ) );

        return survayPasswordDTO;
    }

    protected SurvayDTO survayToSurvayDTO(Survay survay) {
        if ( survay == null ) {
            return null;
        }

        SurvayDTO survayDTO = new SurvayDTO();

        survayDTO.setSurvayId( survay.getSurvayId() );
        survayDTO.setSurvayData( survayDataToSurvayDataDTO( survay.getSurvayData() ) );
        survayDTO.setPublish( publishToPublishDTO( survay.getPublish() ) );
        survayDTO.setSurvayUrl( toSurvayURLDTOs( survay.getSurvayUrl() ) );
        survayDTO.setSurvayPassword( survayPasswordToSurvayPasswordDTO( survay.getSurvayPassword() ) );

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

        publishData.setPublishId( publishDataDTO.getPublishId() );
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

    protected List<SurvayURL> survayURLDTOListToSurvayURLList(List<SurvayURLDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<SurvayURL> list1 = new ArrayList<SurvayURL>( list.size() );
        for ( SurvayURLDTO survayURLDTO : list ) {
            list1.add( toSurvayURL( survayURLDTO ) );
        }

        return list1;
    }

    protected SurvayPassword survayPasswordDTOToSurvayPassword(SurvayPasswordDTO survayPasswordDTO) {
        if ( survayPasswordDTO == null ) {
            return null;
        }

        SurvayPassword survayPassword = new SurvayPassword();

        survayPassword.setPasswordId( survayPasswordDTO.getPasswordId() );
        survayPassword.setPassword( survayPasswordDTO.getPassword() );
        survayPassword.setSurvay( survayDTOToSurvay( survayPasswordDTO.getSurvay() ) );

        return survayPassword;
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
        survay.setSurvayPassword( survayPasswordDTOToSurvayPassword( survayDTO.getSurvayPassword() ) );

        return survay;
    }
}
