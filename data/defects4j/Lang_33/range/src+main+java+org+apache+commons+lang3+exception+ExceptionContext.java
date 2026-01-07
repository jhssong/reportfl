{
  "filepath": "/tmp/Lang-33b/src/main/java/org/apache/commons/lang3/exception/ExceptionContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExceptionContext",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 68,
      "comment": "\n * Allows the storage and retrieval of contextual information based on label-value\n * pairs for exceptions.\n * \n * @see ContextedException\n * @see ContextedRuntimeException\n * @author Apache Software Foundation\n * @author D. Ashmore\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionContext.addValue(java.lang.String, java.lang.Object)",
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Adds a contextual label-value pair into this context.\n     * \u003cp\u003e\n     * This label-value pair provides information useful for debugging.\n     * \n     * @param label  the label of the item to add, null not recommended\n     * @param value  the value of item to add, may be null\n     * @return context itself to allow method chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionContext.getValue(java.lang.String)",
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Retrieves a contextual data value associated with the label.\n     * \n     * @param label  the label to get the contextual value for, may be null\n     * @return the contextual value associated with the label, may be null\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionContext.getLabelSet()",
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Retrieves the labels defined in the contextual data.\n     * \n     * @return the set of labels, never null\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionContext.getFormattedExceptionMessage(java.lang.String)",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Implementors provide the given base message with context label/value item \n     * information appended.\n     * \n     * @param baseMessage  the base exception message \u003cb\u003ewithout\u003c/b\u003e context information appended\n     * @return the exception message \u003cb\u003ewith\u003c/b\u003e context information appended, never null\n     ",
      "child_ranges": []
    }
  ]
}