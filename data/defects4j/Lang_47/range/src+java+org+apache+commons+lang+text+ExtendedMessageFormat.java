{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/text/ExtendedMessageFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtendedMessageFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.MessageFormat"
      ],
      "begin_line": 47,
      "end_line": 435,
      "comment": "\n * Extends \u003ccode\u003eMessageFormat\u003c/code\u003e to allow pluggable/additional formatting\n * options for embedded format elements; requires a \"meta-format\", that is a\n * \u003ccode\u003eFormat\u003c/code\u003e capable of parsing and formatting other\n * \u003ccode\u003eFormat\u003c/code\u003es.\n * \n * Limitations:\n * \u003cul\u003e\n * \u003cli\u003e\u003ccode\u003etoPattern()\u003c/code\u003e results are tailored to JDK 1.4+ output and\n * will produce fairly drastically different results on earlier JDKs.\u003c/li\u003e\n * \u003cli\u003eRecursive choice formats do not inherit knowledge of the extended\n * formatters and are limited to those available with\n * \u003ccode\u003ejava.text.MessageFormat\u003c/code\u003e.\u003c/li\u003e\n * \u003c/ul\u003e\n * \n * @author Matt Benson\n * @since 2.4\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.createDefaultMetaFormat()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Get a default meta-format for the default Locale. This will produce\n     * behavior identical to a \u003ccode\u003ejava.lang.MessageFormat\u003c/code\u003e using the\n     * default locale.\n     * \n     * @return Format\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.createDefaultMetaFormat(java.util.Locale)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Get a default meta-format for the specified Locale. This will produce\n     * behavior identical to a \u003ccode\u003ejava.lang.MessageFormat\u003c/code\u003e using\n     * \u003ccode\u003elocale\u003c/code\u003e.\n     * \n     * @param locale the Locale for the resulting Format instance.\n     * @return Format\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Parser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 76,
      "end_line": 326,
      "comment": "\n     * Conceptual demarcation of methods to parse the pattern.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPED_QUOTE"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "START_FMT"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "END_FE"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "START_FE"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "QUOTE"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.Parser.stripFormats(java.lang.String)",
      "begin_line": 89,
      "end_line": 117,
      "comment": "\n         * Strip all formats from the pattern.\n         * \n         * @param pattern String to strip\n         * @return stripped pattern\n         ",
      "child_ranges": [
        "(line 90,col 13)-(line 90,col 65)",
        "(line 91,col 13)-(line 91,col 53)",
        "(line 92,col 13)-(line 92,col 45)",
        "(line 93,col 13)-(line 115,col 13)",
        "(line 116,col 13)-(line 116,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.Parser.insertFormats(java.lang.String, java.text.Format[], java.text.Format)",
      "begin_line": 127,
      "end_line": 158,
      "comment": "\n         * Insert formats back into the pattern for toPattern() support.\n         * \n         * @param pattern source\n         * @param formats the Formats to insert\n         * @param metaFormat Format to format the Formats\n         * @return full pattern\n         ",
      "child_ranges": [
        "(line 129,col 13)-(line 131,col 13)",
        "(line 132,col 13)-(line 132,col 69)",
        "(line 133,col 13)-(line 133,col 53)",
        "(line 134,col 13)-(line 134,col 24)",
        "(line 135,col 13)-(line 156,col 13)",
        "(line 157,col 13)-(line 157,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.Parser.parseFormats(java.lang.String, java.text.Format)",
      "begin_line": 167,
      "end_line": 194,
      "comment": "\n         * Parse the formats from the given pattern.\n         * \n         * @param pattern String to parse\n         * @param metaFormat Format to parse the Formats\n         * @return array of parsed Formats\n         ",
      "child_ranges": [
        "(line 168,col 13)-(line 168,col 47)",
        "(line 169,col 13)-(line 169,col 53)",
        "(line 170,col 13)-(line 192,col 13)",
        "(line 193,col 13)-(line 193,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.Parser.seekNonWs(java.lang.String, java.text.ParsePosition)",
      "begin_line": 202,
      "end_line": 209,
      "comment": "\n         * Consume whitespace from the current parse position.\n         * \n         * @param pattern String to read\n         * @param pos current position\n         ",
      "child_ranges": [
        "(line 203,col 13)-(line 203,col 24)",
        "(line 204,col 13)-(line 204,col 50)",
        "(line 205,col 13)-(line 208,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.Parser.next(java.text.ParsePosition)",
      "begin_line": 217,
      "end_line": 220,
      "comment": "\n         * Convenience method to advance parse position by 1\n         * \n         * @param pos ParsePosition\n         * @return \u003ccode\u003epos\u003c/code\u003e\n         ",
      "child_ranges": [
        "(line 218,col 13)-(line 218,col 45)",
        "(line 219,col 13)-(line 219,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.Parser.readArgumentIndex(java.lang.String, java.text.ParsePosition)",
      "begin_line": 229,
      "end_line": 244,
      "comment": "\n         * Read the argument index from the current format element\n         * \n         * @param pattern pattern to parse\n         * @param pos current parse position\n         * @return argument index as string\n         ",
      "child_ranges": [
        "(line 230,col 13)-(line 230,col 39)",
        "(line 231,col 13)-(line 241,col 13)",
        "(line 242,col 13)-(line 243,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.Parser.appendQuotedString(java.lang.String, java.text.ParsePosition, java.lang.StringBuffer, boolean)",
      "begin_line": 256,
      "end_line": 284,
      "comment": "\n         * Consume a quoted string, adding it to \u003ccode\u003eappendTo\u003c/code\u003e if\n         * specified.\n         * \n         * @param pattern pattern to parse\n         * @param pos current parse position\n         * @param appendTo optional StringBuffer to append\n         * @param escapingOn whether to process escaped quotes\n         * @return \u003ccode\u003eappendTo\u003c/code\u003e\n         ",
      "child_ranges": [
        "(line 258,col 13)-(line 258,col 39)",
        "(line 259,col 13)-(line 259,col 45)",
        "(line 260,col 13)-(line 262,col 13)",
        "(line 263,col 13)-(line 263,col 33)",
        "(line 264,col 13)-(line 281,col 13)",
        "(line 282,col 13)-(line 283,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.Parser.getQuotedString(java.lang.String, java.text.ParsePosition, boolean)",
      "begin_line": 293,
      "end_line": 296,
      "comment": "\n         * Consume quoted string only\n         * \n         * @param pattern pattern to parse\n         * @param pos current parse position\n         * @param escapingOn whether to process escaped quotes\n         ",
      "child_ranges": [
        "(line 295,col 13)-(line 295,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.Parser.eatFormat(java.lang.String, java.text.ParsePosition)",
      "begin_line": 304,
      "end_line": 325,
      "comment": "\n         * Consume the entire format found at the current position.\n         * \n         * @param pattern string to parse\n         * @param pos current parse position\n         ",
      "child_ranges": [
        "(line 305,col 13)-(line 305,col 39)",
        "(line 306,col 13)-(line 306,col 26)",
        "(line 307,col 13)-(line 322,col 13)",
        "(line 323,col 13)-(line 324,col 72)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "PARSER"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "metaFormat"
      ],
      "begin_line": 330,
      "end_line": 330,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "strippedPattern"
      ],
      "begin_line": 331,
      "end_line": 331,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.ExtendedMessageFormat(java.lang.String, java.text.Format)",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\n     * Create a new ExtendedMessageFormat for the default locale.\n     * \n     * @param pattern String\n     * @param metaFormat Format\n     * @throws IllegalArgumentException if \u003ccode\u003emetaFormat\u003c/code\u003e is\n     *             \u003ccode\u003enull\u003c/code\u003e or in case of a bad pattern.\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.ExtendedMessageFormat(java.lang.String, java.util.Locale, java.text.Format)",
      "begin_line": 354,
      "end_line": 367,
      "comment": "\n     * Create a new ExtendedMessageFormat.\n     * \n     * @param pattern String\n     * @param locale Locale\n     * @param metaFormat Format\n     * @throws IllegalArgumentException if \u003ccode\u003emetaFormat\u003c/code\u003e is\n     *             \u003ccode\u003enull\u003c/code\u003e or in case of a bad pattern.\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 23)",
        "(line 364,col 9)-(line 364,col 26)",
        "(line 365,col 9)-(line 365,col 34)",
        "(line 366,col 9)-(line 366,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.applyPattern(java.lang.String)",
      "begin_line": 374,
      "end_line": 383,
      "comment": "\n     * Apply the specified pattern.\n     * \n     * @param pattern String\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 377,col 9)",
        "(line 378,col 9)-(line 378,col 33)",
        "(line 379,col 9)-(line 379,col 55)",
        "(line 380,col 9)-(line 380,col 44)",
        "(line 381,col 9)-(line 381,col 61)",
        "(line 382,col 9)-(line 382,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.applyPatternPre(java.lang.String)",
      "begin_line": 391,
      "end_line": 393,
      "comment": "\n     * Pre-execution hook by means of which a subclass can customize the\n     * behavior of the final applyPattern implementation.\n     * \n     * @param pattern String\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.applyPatternPost(java.lang.String)",
      "begin_line": 401,
      "end_line": 403,
      "comment": "\n     * Post-execution hook by means of which a subclass can customize the\n     * behavior of the final applyPattern implementation.\n     * \n     * @param pattern String\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.toPattern()",
      "begin_line": 411,
      "end_line": 413,
      "comment": "\n     * Render the pattern from the current state of the\n     * \u003ccode\u003eExtendedMessageFormat\u003c/code\u003e.\n     * \n     * @return pattern String\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.getMetaFormat()",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\n     * Get the meta-format currently configured.\n     * \n     * @return Format.\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.ExtendedMessageFormat.setMetaFormat(java.text.Format)",
      "begin_line": 430,
      "end_line": 433,
      "comment": "\n     * Set the meta-format. Has no effect until a subsequent call to\n     * {@link #applyPattern(String)}.\n     * \n     * @param metaFormat the Format metaFormat to set.\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 59)",
        "(line 432,col 9)-(line 432,col 37)"
      ]
    }
  ]
}