{
  "filepath": "/tmp/Lang-17b/src/main/java/org/apache/commons/lang3/exception/DefaultExceptionContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultExceptionContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.exception.ExceptionContext",
        "java.io.Serializable"
      ],
      "begin_line": 41,
      "end_line": 158,
      "comment": "\n * Default implementation of the context storing the label-value pairs for contexted exceptions.\n * \u003cp\u003e\n * This implementation is serializable, however this is dependent on the values that\n * are added also being serializable.\n * \u003c/p\u003e\n * \n * @see ContextedException\n * @see ContextedRuntimeException\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The serialization version. "
    },
    {
      "type": "field",
      "varNames": [
        "contextValues"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The list storing the label-data pairs. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.DefaultExceptionContext.addContextValue(java.lang.String, java.lang.Object)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 75)",
        "(line 54,col 9)-(line 54,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.DefaultExceptionContext.setContextValue(java.lang.String, java.lang.Object)",
      "begin_line": 60,
      "end_line": 69,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 67,col 38)",
        "(line 68,col 9)-(line 68,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.DefaultExceptionContext.getContextValues(java.lang.String)",
      "begin_line": 74,
      "end_line": 82,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 60)",
        "(line 76,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.DefaultExceptionContext.getFirstContextValue(java.lang.String)",
      "begin_line": 87,
      "end_line": 94,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.DefaultExceptionContext.getContextLabels()",
      "begin_line": 99,
      "end_line": 105,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 57)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.DefaultExceptionContext.getContextEntries()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.DefaultExceptionContext.getFormattedExceptionMessage(java.lang.String)",
      "begin_line": 120,
      "end_line": 156,
      "comment": "\n     * Builds the message containing the contextual information.\n     * \n     * @param baseMessage  the base exception message \u003cb\u003ewithout\u003c/b\u003e context information appended\n     * @return the exception message \u003cb\u003ewith\u003c/b\u003e context information appended, never null\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 54)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 33)"
      ]
    }
  ]
}