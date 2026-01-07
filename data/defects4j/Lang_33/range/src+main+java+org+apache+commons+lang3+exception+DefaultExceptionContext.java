{
  "filepath": "/tmp/Lang-33b/src/main/java/org/apache/commons/lang3/exception/DefaultExceptionContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultExceptionContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.exception.ExceptionContext",
        "java.io.Serializable"
      ],
      "begin_line": 36,
      "end_line": 124,
      "comment": "\n * Default implementation of the context storing the label-value pairs for contexted exceptions.\n * \u003cp\u003e\n * This implementation is serializable, however this is dependent on the values that\n * are added also being serializable.\n * \n * @author Apache Software Foundation\n * @author D. Ashmore\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The serialization version. "
    },
    {
      "type": "field",
      "varNames": [
        "contextValueMap"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The ordered map storing the label-data pairs. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.DefaultExceptionContext.addValue(java.lang.String, java.lang.Object)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Adds a contextual label-value pair into this context.\n     * \u003cp\u003e\n     * This label-value pair provides information useful for debugging.\n     * \n     * @param label  the label of the item to add, null not recommended\n     * @param value  the value of item to add, may be null\n     * @return this, for method chaining\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 42)",
        "(line 54,col 9)-(line 54,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.DefaultExceptionContext.getValue(java.lang.String)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Retrieves a contextual data value associated with the label.\n     * \n     * @param label  the label to get the contextual value for, may be null\n     * @return the contextual value associated with the label, may be null\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.DefaultExceptionContext.getLabelSet()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Retrieves the labels defined in the contextual data.\n     * \n     * @return the set of labels, never null\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.DefaultExceptionContext.getFormattedExceptionMessage(java.lang.String)",
      "begin_line": 82,
      "end_line": 122,
      "comment": "\n     * Builds the message containing the contextual information.\n     * \n     * @param baseMessage  the base exception message \u003cb\u003ewithout\u003c/b\u003e context information appended\n     * @return the exception message \u003cb\u003ewith\u003c/b\u003e context information appended, never null\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 54)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 88,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 33)"
      ]
    }
  ]
}