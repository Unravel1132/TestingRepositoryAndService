package com.MyJUnitTesting.UnitTesting.Service;

import com.MyJUnitTesting.UnitTesting.Entity.DeveloperEntity;
import com.MyJUnitTesting.UnitTesting.Repository.DeveloperRepository;
import com.MyJUnitTesting.UnitTesting.Util.DataUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.xml.crypto.Data;

import static jdk.internal.org.objectweb.asm.util.CheckClassAdapter.verify;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.*;

@ExtendWith(MockitoExtension.class)
public class Underdevelopment {

    @Mock
    private DeveloperRepository developerRepository;
    @InjectMocks
    private ImplService serviceUnderTest;

    @Test
    @DisplayName("Сохранение")
    public void givenToSave() {

         DeveloperEntity developer1 = DataUtil.getJohnDoeTransient();

         BDDMockito.given(developerRepository.findByEmail(anyString())).willReturn(null);

         BDDMockito.given(developerRepository.save(any(DeveloperEntity.class)))
                .willReturn(DataUtil.getJohnDoeTransient());

         DeveloperEntity savedDeveloper = serviceUnderTest.saveDeveloper(developer1);

         assertNotNull(savedDeveloper);
    }


        @Test
        @DisplayName("Test update")
        public void givenDeveloper(){
            //given
            DeveloperEntity developer = DataUtil.getJohnDoePersisted();
            BDDMockito.given(developerRepository.existsById(anyInt())).willReturn(null);

            BDDMockito.given(developerRepository.save(any(DeveloperEntity.class)))
                    .willReturn(developer);
            //when
DeveloperEntity updateEntity = serviceUnderTest.update(developer);
            //then

            assertThat(developer).isNotNull();
            verify(developerRepositorym, times)
        }
}
