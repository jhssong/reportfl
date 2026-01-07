{
  "filepath": "/tmp/Lang-49b/src/java/org/apache/commons/lang/text/ExtendedMessageFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtendedMessageFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.MessageFormat"
      ],
      "begin_line": 40,
      "end_line": 427,
      "comment": "\n * Extends \u003ccode\u003eMessageFormat\u003c/code\u003e to allow pluggable/additional formatting\n * options for embedded format elements; requires a \"meta-format\", i.e. a\n * \u003ccode\u003eFormat\u003c/code\u003e capable of parsing and formatting other\n * \u003ccode\u003eFormat\u003c/code\u003es. One shortcoming is that recursive choice formats do\n * not inherit knowledge of the extended formatters and are limited to those\n * available with \u003ccode\u003ejava.text.MessageFormat\u003c/code\u003e (patches welcome).\n * \n * @author Matt Benson\n * @since 2.4\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.createDefaultMetaFormat()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Get a default meta-format for the default Locale. This will produce\n     * behavior identical to a \u003ccode\u003ejava.lang.MessageFormat\u003c/code\u003e using the\n     * default locale.\n     * \n     * @return Format\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.createDefaultMetaFormat(java.util.Locale)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Get a default meta-format for the specified Locale. This will produce\n     * behavior identical to a \u003ccode\u003ejava.lang.MessageFormat\u003c/code\u003e using\n     * \u003ccode\u003elocale\u003c/code\u003e.\n     * \n     * @param locale the Locale for the resulting Format instance.\n     * @return Format\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Parser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 69,
      "end_line": 319,
      "comment": "\n     * Conceptual demarcation of methods to parse the pattern.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPED_QUOTE"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "START_FMT"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "END_FE"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "START_FE"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "QUOTE"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.Parser.stripFormats(java.lang.String)",
      "begin_line": 82,
      "end_line": 110,
      "comment": "\n         * Strip all formats from the pattern.\n         * \n         * @param pattern String to strip\n         * @return stripped pattern\n         ",
      "child_ranges": [
        "(line 83,col 13)-(line 83,col 65)",
        "(line 84,col 13)-(line 84,col 53)",
        "(line 85,col 13)-(line 85,col 45)",
        "(line 86,col 13)-(line 108,col 13)",
        "(line 109,col 13)-(line 109,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.Parser.insertFormats(java.lang.String, java.text.Format[], java.text.Format)",
      "begin_line": 120,
      "end_line": 151,
      "comment": "\n         * Insert formats back into the pattern for toPattern() support.\n         * \n         * @param pattern source\n         * @param formats the Formats to insert\n         * @param metaFormat Format to format the Formats\n         * @return full pattern\n         ",
      "child_ranges": [
        "(line 122,col 13)-(line 124,col 13)",
        "(line 125,col 13)-(line 125,col 69)",
        "(line 126,col 13)-(line 126,col 53)",
        "(line 127,col 13)-(line 127,col 24)",
        "(line 128,col 13)-(line 149,col 13)",
        "(line 150,col 13)-(line 150,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.Parser.parseFormats(java.lang.String, java.text.Format)",
      "begin_line": 160,
      "end_line": 187,
      "comment": "\n         * Parse the formats from the given pattern.\n         * \n         * @param pattern String to parse\n         * @param metaFormat Format to parse the Formats\n         * @return array of parsed Formats\n         ",
      "child_ranges": [
        "(line 161,col 13)-(line 161,col 47)",
        "(line 162,col 13)-(line 162,col 53)",
        "(line 163,col 13)-(line 185,col 13)",
        "(line 186,col 13)-(line 186,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.Parser.seekNonWs(java.lang.String, java.text.ParsePosition)",
      "begin_line": 195,
      "end_line": 202,
      "comment": "\n         * Consume whitespace from the current parse position.\n         * \n         * @param pattern String to read\n         * @param pos current position\n         ",
      "child_ranges": [
        "(line 196,col 13)-(line 196,col 24)",
        "(line 197,col 13)-(line 197,col 50)",
        "(line 198,col 13)-(line 201,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.Parser.next(java.text.ParsePosition)",
      "begin_line": 210,
      "end_line": 213,
      "comment": "\n         * Convenience method to advance parse position by 1\n         * \n         * @param pos ParsePosition\n         * @return \u003ccode\u003epos\u003c/code\u003e\n         ",
      "child_ranges": [
        "(line 211,col 13)-(line 211,col 45)",
        "(line 212,col 13)-(line 212,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.Parser.readArgumentIndex(java.lang.String, java.text.ParsePosition)",
      "begin_line": 222,
      "end_line": 237,
      "comment": "\n         * Read the argument index from the current format element\n         * \n         * @param pattern pattern to parse\n         * @param pos current parse position\n         * @return argument index as string\n         ",
      "child_ranges": [
        "(line 223,col 13)-(line 223,col 39)",
        "(line 224,col 13)-(line 234,col 13)",
        "(line 235,col 13)-(line 236,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.Parser.appendQuotedString(java.lang.String, java.text.ParsePosition, java.lang.StringBuffer, boolean)",
      "begin_line": 249,
      "end_line": 277,
      "comment": "\n         * Consume a quoted string, adding it to \u003ccode\u003eappendTo\u003c/code\u003e if\n         * specified.\n         * \n         * @param pattern pattern to parse\n         * @param pos current parse position\n         * @param appendTo optional StringBuffer to append\n         * @param escapingOn whether to process escaped quotes\n         * @return \u003ccode\u003eappendTo\u003c/code\u003e\n         ",
      "child_ranges": [
        "(line 251,col 13)-(line 251,col 39)",
        "(line 252,col 13)-(line 252,col 45)",
        "(line 253,col 13)-(line 255,col 13)",
        "(line 256,col 13)-(line 256,col 33)",
        "(line 257,col 13)-(line 274,col 13)",
        "(line 275,col 13)-(line 276,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.Parser.getQuotedString(java.lang.String, java.text.ParsePosition, boolean)",
      "begin_line": 286,
      "end_line": 289,
      "comment": "\n         * Consume quoted string only\n         * \n         * @param pattern pattern to parse\n         * @param pos current parse position\n         * @param escapingOn whether to process escaped quotes\n         ",
      "child_ranges": [
        "(line 288,col 13)-(line 288,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.Parser.eatFormat(java.lang.String, java.text.ParsePosition)",
      "begin_line": 297,
      "end_line": 318,
      "comment": "\n         * Consume the entire format found at the current position.\n         * \n         * @param pattern string to parse\n         * @param pos current parse position\n         ",
      "child_ranges": [
        "(line 298,col 13)-(line 298,col 39)",
        "(line 299,col 13)-(line 299,col 26)",
        "(line 300,col 13)-(line 315,col 13)",
        "(line 316,col 13)-(line 317,col 72)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "PARSER"
      ],
      "begin_line": 321,
      "end_line": 321,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "metaFormat"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "strippedPattern"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.ExtendedMessageFormat(java.lang.String, java.text.Format)",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\n     * Create a new ExtendedMessageFormat for the default locale.\n     * \n     * @param pattern String\n     * @param metaFormat Format\n     * @throws IllegalArgumentException if \u003ccode\u003emetaFormat\u003c/code\u003e is\n     *             \u003ccode\u003enull\u003c/code\u003e or in case of a bad pattern.\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.ExtendedMessageFormat(java.lang.String, java.util.Locale, java.text.Format)",
      "begin_line": 347,
      "end_line": 359,
      "comment": "\n     * Create a new ExtendedMessageFormat.\n     * \n     * @param pattern String\n     * @param locale Locale\n     * @param metaFormat Format\n     * @throws IllegalArgumentException if \u003ccode\u003emetaFormat\u003c/code\u003e is\n     *             \u003ccode\u003enull\u003c/code\u003e or in case of a bad pattern.\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 31)",
        "(line 357,col 9)-(line 357,col 34)",
        "(line 358,col 9)-(line 358,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.applyPattern(java.lang.String)",
      "begin_line": 366,
      "end_line": 375,
      "comment": "\n     * Apply the specified pattern.\n     * \n     * @param pattern String\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 370,col 33)",
        "(line 371,col 9)-(line 371,col 55)",
        "(line 372,col 9)-(line 372,col 44)",
        "(line 373,col 9)-(line 373,col 61)",
        "(line 374,col 9)-(line 374,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.applyPatternPre(java.lang.String)",
      "begin_line": 383,
      "end_line": 385,
      "comment": "\n     * Pre-execution hook by means of which a subclass can customize the\n     * behavior of the final applyPattern implementation.\n     * \n     * @param pattern String\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.applyPatternPost(java.lang.String)",
      "begin_line": 393,
      "end_line": 395,
      "comment": "\n     * Post-execution hook by means of which a subclass can customize the\n     * behavior of the final applyPattern implementation.\n     * \n     * @param pattern String\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.toPattern()",
      "begin_line": 403,
      "end_line": 405,
      "comment": "\n     * Render the pattern from the current state of the\n     * \u003ccode\u003eExtendedMessageFormat\u003c/code\u003e.\n     * \n     * @return pattern String\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.getMetaFormat()",
      "begin_line": 412,
      "end_line": 414,
      "comment": "\n     * Get the meta-format currently configured.\n     * \n     * @return Format.\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.setMetaFormat(java.text.Format)",
      "begin_line": 422,
      "end_line": 425,
      "comment": "\n     * Set the meta-format. Has no effect until a subsequent call to\n     * {@link #applyPattern(String)}.\n     * \n     * @param metaFormat the Format metaFormat to set.\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 59)",
        "(line 424,col 9)-(line 424,col 37)"
      ]
    }
  ]
}