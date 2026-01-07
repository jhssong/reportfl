{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/text/NumberMetaFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumberMetaFormat",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.MetaFormatSupport"
      ],
      "begin_line": 39,
      "end_line": 168,
      "comment": "\n * Stock \"number\" MetaFormat.\n * \n * @see ExtendedMessageFormat\n * @author Matt Benson\n * @since 2.4\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INTEGER"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CURRENCY"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PERCENT"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GET_INTEGER_INSTANCE"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "locale"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subformats"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reverseSubformats"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "decimalFormatSymbols"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.NumberMetaFormat.NumberMetaFormat()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Create a new NumberMetaFormat.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.NumberMetaFormat.NumberMetaFormat(java.util.Locale)",
      "begin_line": 78,
      "end_line": 81,
      "comment": "\n     * Create a new NumberMetaFormat.\n     * \n     * @param locale Locale\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 16)",
        "(line 80,col 9)-(line 80,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.NumberMetaFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 86,
      "end_line": 100,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 21)",
        "(line 89,col 9)-(line 89,col 63)",
        "(line 90,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.NumberMetaFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 105,
      "end_line": 118,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 35)",
        "(line 107,col 9)-(line 107,col 42)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 74)",
        "(line 112,col 9)-(line 112,col 21)",
        "(line 113,col 9)-(line 113,col 50)",
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.NumberMetaFormat.getLocale()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Get the locale in use by this \u003ccode\u003eNumberMetaFormat\u003c/code\u003e.\n     * \n     * @return Locale\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.NumberMetaFormat.initialize()",
      "begin_line": 132,
      "end_line": 145,
      "comment": "\n     * Initialize this NumberMetaFormat.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 144,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.NumberMetaFormat.createIntegerInstance(java.util.Locale)",
      "begin_line": 153,
      "end_line": 167,
      "comment": "\n     * Create the \"integer\" NumberFormat instance for the specified Locale.\n     * \n     * @param locale the Locale to use\n     * @return integer NumberFormat\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 63)",
        "(line 164,col 9)-(line 164,col 43)",
        "(line 165,col 9)-(line 165,col 41)",
        "(line 166,col 9)-(line 166,col 22)"
      ]
    }
  ]
}