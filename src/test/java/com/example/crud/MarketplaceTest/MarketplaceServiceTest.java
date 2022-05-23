package com.example.crud.MarketplaceTest;

import com.example.crud.marketplace.MarketplaceRepository;
import com.example.crud.marketplace.MarketplaceService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)

class MarketplaceServiceTest {


    @Mock private MarketplaceRepository marketplaceRepositoryMock;

    private MarketplaceService marketplaceServiceUnderTest;

    @BeforeEach
    void setUp() {
        marketplaceServiceUnderTest = new MarketplaceService(marketplaceRepositoryMock);
    }

    @Test
    void canGetAllMarketplace() {

        // when
        marketplaceServiceUnderTest.getAllMarketplace();
        // then
        verify(marketplaceRepositoryMock).findAll();
    }

    @Test
    void canGetMarketplaceById() {

        // when
        marketplaceServiceUnderTest.getMarketplacetById(1L);

        ArgumentCaptor<Long> marketplaceIdArgumentCaptor = ArgumentCaptor.forClass(Long.class);

        // then
        verify(marketplaceRepositoryMock).findById(marketplaceIdArgumentCaptor.capture());

        Long captureMarketplaceId = marketplaceIdArgumentCaptor.getValue();

        assertThat(captureMarketplaceId).isEqualTo(1L);
    }
}