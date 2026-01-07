{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/exception/DefaultExceptionContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultExceptionContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.exception.ExceptionContext",
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 149,
      "comment": "\n * Default implementation of the context storing the label-value pairs for contexted exceptions.\n * \u003cp\u003e\n * This implementation is serializable, however this is dependent on the values that\n * are added also being serializable.\n * \n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The serialization version. "
    },
    {
      "type": "field",
      "varNames": [
        "contextValueMap"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The ordered map storing the label-data pairs. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.DefaultExceptionContext.addValue(java.lang.String, java.lang.Object)",
      "begin_line": 53,
      "end_line": 66,
      "comment": "\n     * Adds a contextual label-value pair into this context.\n     * \u003cp\u003e\n     * This label-value pair provides information useful for debugging. If the\n     * label already exists and the provided information is different, the \n     * label will be added with an appended index.\n     * \u003c/p\u003e\n     * \n     * @param label  the label of the item to add, null not recommended\n     * @param value  the value of item to add, may be null\n     * @return this, for method chaining\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 27)",
        "(line 55,col 9)-(line 55,col 18)",
        "(line 56,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 40)",
        "(line 65,col 9)-(line 65,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.DefaultExceptionContext.replaceValue(java.lang.String, java.lang.Object)",
      "begin_line": 79,
      "end_line": 82,
      "comment": "\n     * Replaces a contextual label-value pair of this context.\n     * \u003cp\u003e\n     * This label-value pair provides information useful for debugging. If the\n     * label does not yet exists, a simply add operation is performed.\n     * \u003c/p\u003e\n     * \n     * @param label  the label of the item to add, null not recommended\n     * @param value  the value of item to add, may be null\n     * @return this, for method chaining\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 42)",
        "(line 81,col 9)-(line 81,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.DefaultExceptionContext.getValue(java.lang.String)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Retrieves a contextual data value associated with the label.\n     * \n     * @param label  the label to get the contextual value for, may be null\n     * @return the contextual value associated with the label, may be null\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.DefaultExceptionContext.getLabelSet()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Retrieves the labels defined in the contextual data.\n     * \n     * @return the set of labels, never null\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.DefaultExceptionContext.getFormattedExceptionMessage(java.lang.String)",
      "begin_line": 109,
      "end_line": 147,
      "comment": "\n     * Builds the message containing the contextual information.\n     * \n     * @param baseMessage  the base exception message \u003cb\u003ewithout\u003c/b\u003e context information appended\n     * @return the exception message \u003cb\u003ewith\u003c/b\u003e context information appended, never null\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 54)",
        "(line 111,col 9)-(line 113,col 9)",
        "(line 115,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 33)"
      ]
    }
  ]
}