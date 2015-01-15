package com.netbrasoft.gnuob.api.contract;

import java.util.List;

import org.javasimon.aop.Monitored;
import org.springframework.stereotype.Repository;

import com.netbrasoft.gnuob.api.Contract;
import com.netbrasoft.gnuob.api.ContractWebServiceImpl;
import com.netbrasoft.gnuob.api.ContractWebServiceImplService;
import com.netbrasoft.gnuob.api.CountContract;
import com.netbrasoft.gnuob.api.CountContractResponse;
import com.netbrasoft.gnuob.api.FindContract;
import com.netbrasoft.gnuob.api.FindContractById;
import com.netbrasoft.gnuob.api.FindContractByIdResponse;
import com.netbrasoft.gnuob.api.FindContractResponse;
import com.netbrasoft.gnuob.api.MergeContract;
import com.netbrasoft.gnuob.api.MergeContractResponse;
import com.netbrasoft.gnuob.api.MetaData;
import com.netbrasoft.gnuob.api.OrderBy;
import com.netbrasoft.gnuob.api.Paging;
import com.netbrasoft.gnuob.api.PersistContract;
import com.netbrasoft.gnuob.api.PersistContractResponse;
import com.netbrasoft.gnuob.api.RefreshContract;
import com.netbrasoft.gnuob.api.RefreshContractResponse;
import com.netbrasoft.gnuob.api.RemoveContract;
import com.netbrasoft.gnuob.api.generic.GenericTypeWebServiceRepository;

@Monitored
@Repository("ContractWebServiceRepository")
public class ContractWebServiceRepository<C extends Contract> implements GenericTypeWebServiceRepository<C> {

   private ContractWebServiceImpl contractWebServiceImpl;

   public ContractWebServiceRepository() {
   }

   @Override
   public long count(MetaData paramMetaData, C paramContract) {
      CountContract paramCountContract = new CountContract();
      paramCountContract.setContract(paramContract);
      CountContractResponse countContractResponse = getContractWebServiceImpl().countContract(paramCountContract,
            paramMetaData);
      return countContractResponse.getReturn();
   }

   @SuppressWarnings("unchecked")
   @Override
   public C find(MetaData paramMetaData, C paramContract) {
      FindContractById paramFindContractById = new FindContractById();
      paramFindContractById.setContract(paramContract);
      FindContractByIdResponse findContractByIdResponse = getContractWebServiceImpl().findContractById(
            paramFindContractById, paramMetaData);
      return (C) findContractByIdResponse.getReturn();

   }

   @SuppressWarnings("unchecked")
   @Override
   public List<C> find(MetaData paramMetaData, C paramContract, Paging paramPaging, OrderBy paramOrderBy) {
      FindContract paramFindContract = new FindContract();
      paramFindContract.setContract(paramContract);
      paramFindContract.setPaging(paramPaging);
      paramFindContract.setOrderBy(paramOrderBy);
      FindContractResponse findContractResponse = getContractWebServiceImpl().findContract(paramFindContract,
            paramMetaData);
      return (List<C>) findContractResponse.getReturn();
   }

   private ContractWebServiceImpl getContractWebServiceImpl() {
      if (contractWebServiceImpl == null) {
         ContractWebServiceImplService contractWebServiceImplService = new ContractWebServiceImplService(
               ContractWebServiceImplService.WSDL_LOCATION);
         contractWebServiceImpl = contractWebServiceImplService.getContractWebServiceImplPort();
      }

      return contractWebServiceImpl;
   }

   @SuppressWarnings("unchecked")
   @Override
   public C merge(MetaData paramMetaData, C paramContract) {
      MergeContract paramMergeContract = new MergeContract();
      paramMergeContract.setContract(paramContract);
      MergeContractResponse mergeContractResponse = getContractWebServiceImpl().mergeContract(paramMergeContract,
            paramMetaData);
      return (C) mergeContractResponse.getReturn();
   }

   @SuppressWarnings("unchecked")
   @Override
   public C persist(MetaData paramMetaData, C paramContract) {
      PersistContract paramPersistContract = new PersistContract();
      paramPersistContract.setContract(paramContract);
      PersistContractResponse persistContractResponse = getContractWebServiceImpl().persistContract(
            paramPersistContract, paramMetaData);
      return (C) persistContractResponse.getReturn();
   }

   @SuppressWarnings("unchecked")
   @Override
   public C refresh(MetaData paramMetaData, C paramContract) {
      RefreshContract paramRefresContract = new RefreshContract();
      paramRefresContract.setContract(paramContract);
      RefreshContractResponse refresContractResponse = getContractWebServiceImpl().refreshContract(paramRefresContract,
            paramMetaData);
      return (C) refresContractResponse.getReturn();
   }

   @Override
   public void remove(MetaData paramMetaData, C paramContract) {
      RemoveContract paramRemoveContract = new RemoveContract();
      paramRemoveContract.setContract(paramContract);
      getContractWebServiceImpl().removeContract(paramRemoveContract, paramMetaData);
   }
}
