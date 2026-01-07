{
  "filepath": "/tmp/Lang-49b/src/java/org/apache/commons/lang/text/NumberMetaFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumberMetaFormat",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.MetaFormatSupport"
      ],
      "begin_line": 36,
      "end_line": 130,
      "comment": "\n * Stock \"number\" MetaFormat.\n * \n * @see ExtendedMessageFormat\n * @author Matt Benson\n * @since 2.4\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INTEGER"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CURRENCY"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PERCENT"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "locale"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subformats"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reverseSubformats"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "decimalFormatSymbols"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.NumberMetaFormat.NumberMetaFormat()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Create a new NumberMetaFormat.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.NumberMetaFormat.NumberMetaFormat(java.util.Locale)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Create a new NumberMetaFormat.\n     * \n     * @param locale Locale\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 16)",
        "(line 63,col 9)-(line 63,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.NumberMetaFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 69,
      "end_line": 83,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 21)",
        "(line 72,col 9)-(line 72,col 63)",
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 82,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.NumberMetaFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 88,
      "end_line": 101,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 35)",
        "(line 90,col 9)-(line 90,col 42)",
        "(line 91,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 74)",
        "(line 95,col 9)-(line 95,col 21)",
        "(line 96,col 9)-(line 96,col 50)",
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.NumberMetaFormat.getLocale()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Get the locale in use by this \u003ccode\u003eNumberMetaFormat\u003c/code\u003e.\n     * \n     * @return Locale\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.NumberMetaFormat.initialize()",
      "begin_line": 115,
      "end_line": 129,
      "comment": "\n     * Initialize this NumberMetaFormat.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 128,col 9)"
      ]
    }
  ]
}