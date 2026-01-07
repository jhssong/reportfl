{
  "filepath": "/tmp/Lang-23b/src/main/java/org/apache/commons/lang3/exception/DefaultExceptionContext.java",
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
      "end_line": 152,
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
      "begin_line": 55,
      "end_line": 67,
      "comment": "\n     * Adds a contextual label-value pair into this context.\n     * \u003cp\u003e\n     * This label-value pair provides information useful for debugging. If the\n     * label already exists and the provided information is different, the \n     * label will be added with an appended index.\n     * \u003c/p\u003e\n     * \n     * @param label  the label of the item to add, null not recommended\n     * @param value  the value of item to add, may be null\n     * @return this, for method chaining\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 27)",
        "(line 57,col 9)-(line 57,col 18)",
        "(line 58,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 65,col 40)",
        "(line 66,col 9)-(line 66,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.DefaultExceptionContext.replaceValue(java.lang.String, java.lang.Object)",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * Replaces a contextual label-value pair of this context.\n     * \u003cp\u003e\n     * This label-value pair provides information useful for debugging. If the\n     * label does not yet exists, a simply add operation is performed.\n     * \u003c/p\u003e\n     * \n     * @param label  the label of the item to add, null not recommended\n     * @param value  the value of item to add, may be null\n     * @return this, for method chaining\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 42)",
        "(line 82,col 9)-(line 82,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.DefaultExceptionContext.getValue(java.lang.String)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Retrieves a contextual data value associated with the label.\n     * \n     * @param label  the label to get the contextual value for, may be null\n     * @return the contextual value associated with the label, may be null\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.DefaultExceptionContext.getLabelSet()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Retrieves the labels defined in the contextual data.\n     * \n     * @return the set of labels, never null\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.DefaultExceptionContext.getFormattedExceptionMessage(java.lang.String)",
      "begin_line": 110,
      "end_line": 150,
      "comment": "\n     * Builds the message containing the contextual information.\n     * \n     * @param baseMessage  the base exception message \u003cb\u003ewithout\u003c/b\u003e context information appended\n     * @return the exception message \u003cb\u003ewith\u003c/b\u003e context information appended, never null\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 54)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 116,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 33)"
      ]
    }
  ]
}