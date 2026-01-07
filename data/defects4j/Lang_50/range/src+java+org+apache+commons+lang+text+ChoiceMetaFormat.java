{
  "filepath": "/tmp/Lang-50b/src/java/org/apache/commons/lang/text/ChoiceMetaFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChoiceMetaFormat",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.MetaFormatSupport"
      ],
      "begin_line": 31,
      "end_line": 72,
      "comment": "\n * Stock \"choice\" MetaFormat.\n * \n * @see {@link ExtendedMessageFormat}\n * @author Matt Benson\n * @since 2.4\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Singleton-usable instance.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.ChoiceMetaFormat.ChoiceMetaFormat()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Create a new ChoiceMetaFormat.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ChoiceMetaFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 52,
      "end_line": 58,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.text.Format#format(java.lang.Object, java.lang.StringBuffer,\n     *      java.text.FieldPosition)\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 57,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ChoiceMetaFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.text.Format#parseObject(java.lang.String,\n     *      java.text.ParsePosition)\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 35)",
        "(line 68,col 9)-(line 68,col 42)",
        "(line 69,col 9)-(line 69,col 73)"
      ]
    }
  ]
}