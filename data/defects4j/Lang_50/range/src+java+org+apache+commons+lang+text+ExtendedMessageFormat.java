{
  "filepath": "/tmp/Lang-50b/src/java/org/apache/commons/lang/text/ExtendedMessageFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtendedMessageFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.MessageFormat"
      ],
      "begin_line": 37,
      "end_line": 344,
      "comment": "\n * Extends \u003ccode\u003eMessageFormat\u003c/code\u003e to allow pluggable/additional formatting\n * options for embedded format elements; requires a \"meta-format\", i.e. a\n * \u003ccode\u003eFormat\u003c/code\u003e capable of parsing and formatting other\n * \u003ccode\u003eFormat\u003c/code\u003es.\n * \n * @author Matt Benson\n * @since 2.4\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.createDefaultMetaFormat()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Get a default meta-format for the default Locale. This will produce\n     * behavior identical to a \u003ccode\u003ejava.lang.MessageFormat\u003c/code\u003e using the\n     * default locale.\n     * \n     * @return Format\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.createDefaultMetaFormat(java.util.Locale)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Get a default meta-format for the specified Locale. This will produce\n     * behavior identical to a \u003ccode\u003ejava.lang.MessageFormat\u003c/code\u003e using\n     * \u003ccode\u003elocale\u003c/code\u003e.\n     * \n     * @param locale\n     *            the Locale for the resulting Format instance.\n     * @return Format\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Parser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 64,
      "end_line": 247,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPED_QUOTE"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "START_FMT"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "END_FE"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "START_FE"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "QUOTE"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.Parser.stripFormats(java.lang.String)",
      "begin_line": 71,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 72,col 13)-(line 72,col 65)",
        "(line 73,col 13)-(line 73,col 53)",
        "(line 74,col 13)-(line 96,col 13)",
        "(line 97,col 13)-(line 97,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.Parser.insertFormats(java.lang.String, java.text.Format[], java.text.Format)",
      "begin_line": 100,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 102,col 13)-(line 104,col 13)",
        "(line 105,col 13)-(line 105,col 69)",
        "(line 106,col 13)-(line 106,col 53)",
        "(line 107,col 13)-(line 107,col 24)",
        "(line 108,col 13)-(line 127,col 13)",
        "(line 128,col 13)-(line 128,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.Parser.parseFormats(java.lang.String, java.text.Format)",
      "begin_line": 131,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 132,col 13)-(line 132,col 47)",
        "(line 133,col 13)-(line 133,col 53)",
        "(line 134,col 13)-(line 156,col 13)",
        "(line 157,col 13)-(line 157,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.Parser.seekNonWs(java.lang.String, java.text.ParsePosition)",
      "begin_line": 160,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 161,col 13)-(line 161,col 24)",
        "(line 162,col 13)-(line 162,col 50)",
        "(line 163,col 13)-(line 166,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.Parser.next(java.text.ParsePosition)",
      "begin_line": 169,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 170,col 13)-(line 170,col 45)",
        "(line 171,col 13)-(line 171,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.Parser.readArgumentIndex(java.lang.String, java.text.ParsePosition)",
      "begin_line": 174,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 175,col 13)-(line 175,col 39)",
        "(line 176,col 13)-(line 186,col 13)",
        "(line 187,col 13)-(line 188,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.Parser.appendQuotedString(java.lang.String, java.text.ParsePosition, java.lang.StringBuffer, boolean)",
      "begin_line": 191,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 193,col 13)-(line 193,col 39)",
        "(line 194,col 13)-(line 196,col 13)",
        "(line 197,col 13)-(line 197,col 33)",
        "(line 198,col 13)-(line 215,col 13)",
        "(line 216,col 13)-(line 217,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.Parser.getQuotedString(java.lang.String, java.text.ParsePosition, boolean)",
      "begin_line": 220,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 222,col 13)-(line 222,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.Parser.eatFormat(java.lang.String, java.text.ParsePosition)",
      "begin_line": 225,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 226,col 13)-(line 226,col 39)",
        "(line 227,col 13)-(line 227,col 26)",
        "(line 228,col 13)-(line 243,col 13)",
        "(line 244,col 13)-(line 245,col 72)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "PARSER"
      ],
      "begin_line": 249,
      "end_line": 249,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "metaFormat"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "strippedPattern"
      ],
      "begin_line": 252,
      "end_line": 252,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.ExtendedMessageFormat(java.lang.String, java.text.Format)",
      "begin_line": 263,
      "end_line": 274,
      "comment": "\n     * Create a new ExtendedMessageFormat.\n     * \n     * @param pattern\n     * @param metaFormat\n     * @throws IllegalArgumentException\n     *             if \u003ccode\u003emetaFormat\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e or in\n     *             case of a bad pattern.\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 23)",
        "(line 272,col 9)-(line 272,col 34)",
        "(line 273,col 9)-(line 273,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.applyPattern(java.lang.String)",
      "begin_line": 282,
      "end_line": 291,
      "comment": "\n     * Apply the specified pattern.\n     * \n     * @param pattern\n     *            pattern String\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 286,col 33)",
        "(line 287,col 9)-(line 287,col 55)",
        "(line 288,col 9)-(line 288,col 44)",
        "(line 289,col 9)-(line 289,col 61)",
        "(line 290,col 9)-(line 290,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.applyPatternPre(java.lang.String)",
      "begin_line": 299,
      "end_line": 301,
      "comment": "\n     * Pre-execution hook that allows subclasses to customize the behavior of\n     * the final applyPattern implementation.\n     * \n     * @param pattern\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.applyPatternPost(java.lang.String)",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\n     * Post-execution hook that allows subclasses to customize the behavior of\n     * the final applyPattern implementation.\n     * \n     * @param pattern\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.toPattern()",
      "begin_line": 319,
      "end_line": 321,
      "comment": "\n     * Render the pattern from the current state of the\n     * \u003ccode\u003eExtendedMessageFormat\u003c/code\u003e.\n     * \n     * @return pattern String\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.getMetaFormat()",
      "begin_line": 328,
      "end_line": 330,
      "comment": "\n     * Get the meta-format currently configured.\n     * \n     * @return Format.\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.setMetaFormat(java.text.Format)",
      "begin_line": 339,
      "end_line": 342,
      "comment": "\n     * Set the meta-format. Has no effect until a subsequent call to\n     * {@link #applyPattern(String)}.\n     * \n     * @param metaFormat\n     *            the Format metaFormat to set.\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 59)",
        "(line 341,col 9)-(line 341,col 37)"
      ]
    }
  ]
}