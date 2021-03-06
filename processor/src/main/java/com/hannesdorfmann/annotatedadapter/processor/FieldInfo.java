package com.hannesdorfmann.annotatedadapter.processor;

import com.hannesdorfmann.annotatedadapter.annotation.Field;
import javax.lang.model.type.MirroredTypeException;

/**
 * @author Hannes Dorfmann
 */
public class FieldInfo {

  private String qualifiedClassName;
  private String fieldName;


  public FieldInfo(Field view){
    fieldName = view.name();

    try
    {
      qualifiedClassName = view.type().getCanonicalName();
    }
    catch( MirroredTypeException mte )
    {
      qualifiedClassName = mte.getTypeMirror().toString();
    }

  }

  public String getQualifiedClassName() {
    return qualifiedClassName;
  }

  public String getViewFieldName() {
    return fieldName;
  }

}
