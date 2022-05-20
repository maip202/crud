package com.example.crud.MarketplaceTest;

import com.example.crud.marketplace.MarketplaceRepository;
import com.example.crud.marketplace.MarketplaceService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)

class MarketplaceServiceTest {


    @Mock private MarketplaceRepository marketplaceRepositoryMock;

    private MarketplaceService marketplaceServiceUnderTest;

    @BeforeEach
    void setUp() {
        marketplaceServiceUnderTest = new MarketplaceService(marketplaceRepositoryMock);
    }

    @Test
    void getAllMarketplace() {
    }
}