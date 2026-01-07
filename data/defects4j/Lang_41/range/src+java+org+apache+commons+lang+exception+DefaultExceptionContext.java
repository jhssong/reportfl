{
  "filepath": "/tmp/Lang-41b/src/java/org/apache/commons/lang/exception/DefaultExceptionContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultExceptionContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.exception.ExceptionContext"
      ],
      "begin_line": 34,
      "end_line": 130,
      "comment": "\n * Provides context feature for exceptions.  Used by both checked and unchecked version of the contexted exceptions.\n * @see ContextedRuntimeException\n * @author D. Ashmore\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contextKeyList"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * This value list could really be obtained from the Map, however, some\n     * callers want to control the order of the list as it appears in the \n     * Message.  The list allows that.  name/value pairs will appear in\n     * the order that they\u0027re provided.   D. Ashmore\n     "
    },
    {
      "type": "field",
      "varNames": [
        "contextValueMap"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.DefaultExceptionContext.addLabeledValue(java.lang.String, java.io.Serializable)",
      "begin_line": 56,
      "end_line": 61,
      "comment": "\n     * Adds information helpful to a developer in diagnosing and correcting\n     * the problem.  \n     * @see ContextedException#addLabeledValue(String, Serializable)\n     * @param label  a textual label associated with information\n     * @param value  information needed to understand exception.  May be null.\n     * @return this\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 39)",
        "(line 58,col 9)-(line 58,col 47)",
        "(line 60,col 9)-(line 60,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.DefaultExceptionContext.getLabeledValue(java.lang.String)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Retrieves the value for a given label.\n     * @param label  a textual label associated with information\n     * @return value  information needed to understand exception.  May be null.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.DefaultExceptionContext.getLabelSet()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Retrieves currently defined labels.\n     * @return labelSet\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.DefaultExceptionContext.getFormattedExceptionMessage(java.lang.String)",
      "begin_line": 89,
      "end_line": 128,
      "comment": "\n     * Centralized message logic for both checked and unchecked version of\n     * context exceptions\n     * @param baseMessage message retained by super class\n     * @return message -- exception message\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 52)",
        "(line 91,col 9)-(line 93,col 9)",
        "(line 95,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 33)"
      ]
    }
  ]
}