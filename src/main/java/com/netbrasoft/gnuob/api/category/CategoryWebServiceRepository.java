package com.netbrasoft.gnuob.api.category;

import java.util.List;

import org.javasimon.aop.Monitored;
import org.springframework.stereotype.Repository;

import com.netbrasoft.gnuob.api.Category;
import com.netbrasoft.gnuob.api.CategoryWebServiceImpl;
import com.netbrasoft.gnuob.api.CategoryWebServiceImplService;
import com.netbrasoft.gnuob.api.CountCategory;
import com.netbrasoft.gnuob.api.CountCategoryResponse;
import com.netbrasoft.gnuob.api.FindCategory;
import com.netbrasoft.gnuob.api.FindCategoryById;
import com.netbrasoft.gnuob.api.FindCategoryByIdResponse;
import com.netbrasoft.gnuob.api.FindCategoryResponse;
import com.netbrasoft.gnuob.api.MergeCategory;
import com.netbrasoft.gnuob.api.MergeCategoryResponse;
import com.netbrasoft.gnuob.api.MetaData;
import com.netbrasoft.gnuob.api.OrderBy;
import com.netbrasoft.gnuob.api.Paging;
import com.netbrasoft.gnuob.api.PersistCategory;
import com.netbrasoft.gnuob.api.PersistCategoryResponse;
import com.netbrasoft.gnuob.api.RefreshCategory;
import com.netbrasoft.gnuob.api.RefreshCategoryResponse;
import com.netbrasoft.gnuob.api.RemoveCategory;
import com.netbrasoft.gnuob.api.generic.GenericTypeWebServiceRepository;

@Monitored
@Repository("CategoryWebServiceRepository")
public class CategoryWebServiceRepository<C extends Category> implements GenericTypeWebServiceRepository<C> {

   private CategoryWebServiceImpl categoryWebServiceImpl = null;

   public CategoryWebServiceRepository() {

   }

   @Override
   public long count(MetaData paramMetaData, C paramCategory) {
      CountCategory paramCountCategory = new CountCategory();
      paramCountCategory.setCategory(paramCategory);
      CountCategoryResponse countCategoryResponse = getCategoryWebServiceImpl().countCategory(paramCountCategory,
            paramMetaData);
      return countCategoryResponse.getReturn();
   }

   @Override
   @SuppressWarnings("unchecked")
   public C find(MetaData paramMetaData, C paramCategory) {
      FindCategoryById paramFindCategoryById = new FindCategoryById();
      paramFindCategoryById.setCategory(paramCategory);
      FindCategoryByIdResponse findCategoryByIdResponse = getCategoryWebServiceImpl().findCategoryById(
            paramFindCategoryById, paramMetaData);
      return (C) findCategoryByIdResponse.getReturn();

   }

   @Override
   @SuppressWarnings("unchecked")
   public List<C> find(MetaData paramMetaData, C paramCategory, Paging paramPaging, OrderBy paramOrderBy) {
      FindCategory paramFindCategory = new FindCategory();
      paramFindCategory.setCategory(paramCategory);
      paramFindCategory.setPaging(paramPaging);
      paramFindCategory.setOrderBy(paramOrderBy);
      FindCategoryResponse findCategoryResponse = getCategoryWebServiceImpl().findCategory(paramFindCategory,
            paramMetaData);
      return (List<C>) findCategoryResponse.getReturn();
   }

   private CategoryWebServiceImpl getCategoryWebServiceImpl() {

      if (categoryWebServiceImpl == null) {
         CategoryWebServiceImplService categoryWebServiceImplService = new CategoryWebServiceImplService(
               CategoryWebServiceImplService.WSDL_LOCATION);
         categoryWebServiceImpl = categoryWebServiceImplService.getCategoryWebServiceImplPort();
      }

      return categoryWebServiceImpl;
   }

   @Override
   @SuppressWarnings("unchecked")
   public C merge(MetaData paramMetaData, C paramCategory) {
      MergeCategory paramMergeCategory = new MergeCategory();
      paramMergeCategory.setCategory(paramCategory);
      MergeCategoryResponse mergeCategoryResponse = getCategoryWebServiceImpl().mergeCategory(paramMergeCategory,
            paramMetaData);
      return (C) mergeCategoryResponse.getReturn();
   }

   @Override
   @SuppressWarnings("unchecked")
   public C persist(MetaData paramMetaData, C paramCategory) {
      PersistCategory paramPersistCategory = new PersistCategory();
      paramPersistCategory.setCategory(paramCategory);
      PersistCategoryResponse persistCategoryResponse = getCategoryWebServiceImpl().persistCategory(
            paramPersistCategory, paramMetaData);
      return (C) persistCategoryResponse.getReturn();
   }

   @Override
   @SuppressWarnings("unchecked")
   public C refresh(MetaData paramMetaData, C paramCategory) {
      RefreshCategory paramRefresCategory = new RefreshCategory();
      paramRefresCategory.setCategory(paramCategory);
      RefreshCategoryResponse refreshCategoryResponse = getCategoryWebServiceImpl().refreshCategory(
            paramRefresCategory, paramMetaData);
      return (C) refreshCategoryResponse.getReturn();
   }

   @Override
   public void remove(MetaData paramMetaData, C paramCategory) {
      RemoveCategory paramRemoveCategory = new RemoveCategory();
      paramRemoveCategory.setCategory(paramCategory);
      getCategoryWebServiceImpl().removeCategory(paramRemoveCategory, paramMetaData);
   }
}
