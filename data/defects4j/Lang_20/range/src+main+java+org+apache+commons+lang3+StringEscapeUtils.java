{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/StringEscapeUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringEscapeUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 585,
      "comment": "\n * \u003cp\u003eEscapes and unescapes {@code String}s for\n * Java, Java Script, HTML and XML.\u003c/p\u003e\n *\n * \u003cp\u003e#ThreadSafe#\u003c/p\u003e\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPE_JAVA"
      ],
      "begin_line": 52,
      "end_line": 61,
      "comment": "\n     * Translator object for escaping Java. \n     * \n     * While {@link #escapeJava(String)} is the expected method of use, this \n     * object allows the Java escaping functionality to be used \n     * as the foundation for a custom translator. \n     *\n     * @since 3.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPE_ECMASCRIPT"
      ],
      "begin_line": 72,
      "end_line": 83,
      "comment": "\n     * Translator object for escaping EcmaScript/JavaScript. \n     * \n     * While {@link #escapeEcmaScript(String)} is the expected method of use, this \n     * object allows the EcmaScript escaping functionality to be used \n     * as the foundation for a custom translator. \n     *\n     * @since 3.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPE_XML"
      ],
      "begin_line": 94,
      "end_line": 98,
      "comment": "\n     * Translator object for escaping XML.\n     * \n     * While {@link #escapeXml(String)} is the expected method of use, this \n     * object allows the XML escaping functionality to be used \n     * as the foundation for a custom translator. \n     *\n     * @since 3.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPE_HTML3"
      ],
      "begin_line": 109,
      "end_line": 113,
      "comment": "\n     * Translator object for escaping HTML version 3.0.\n     * \n     * While {@link #escapeHtml3(String)} is the expected method of use, this \n     * object allows the HTML escaping functionality to be used \n     * as the foundation for a custom translator. \n     *\n     * @since 3.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPE_HTML4"
      ],
      "begin_line": 124,
      "end_line": 129,
      "comment": "\n     * Translator object for escaping HTML version 4.0.\n     * \n     * While {@link #escapeHtml4(String)} is the expected method of use, this \n     * object allows the HTML escaping functionality to be used \n     * as the foundation for a custom translator. \n     *\n     * @since 3.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPE_CSV"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": "\n     * Translator object for escaping individual Comma Separated Values. \n     * \n     * While {@link #escapeCsv(String)} is the expected method of use, this \n     * object allows the CSV escaping functionality to be used \n     * as the foundation for a custom translator. \n     *\n     * @since 3.0\n     "
    },
    {
      "type": "class_interface",
      "name": "CsvEscaper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.translate.CharSequenceTranslator"
      ],
      "begin_line": 145,
      "end_line": 169,
      "comment": "       and could also have an optimization check method."
    },
    {
      "type": "field",
      "varNames": [
        "CSV_DELIMITER"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_QUOTE"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_QUOTE_STR"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_SEARCH_CHARS"
      ],
      "begin_line": 150,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.CsvEscaper.translate(java.lang.CharSequence, int, java.io.Writer)",
      "begin_line": 153,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 156,col 13)-(line 158,col 13)",
        "(line 160,col 13)-(line 166,col 13)",
        "(line 167,col 13)-(line 167,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "UNESCAPE_JAVA"
      ],
      "begin_line": 183,
      "end_line": 195,
      "comment": " TODO: throw \"illegal character: \\92\" as an Exception if a \\ on the end of the Java (as per the compiler)?"
    },
    {
      "type": "field",
      "varNames": [
        "UNESCAPE_ECMASCRIPT"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": "\n     * Translator object for unescaping escaped EcmaScript. \n     * \n     * While {@link #unescapeEcmaScript(String)} is the expected method of use, this \n     * object allows the EcmaScript unescaping functionality to be used \n     * as the foundation for a custom translator. \n     *\n     * @since 3.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UNESCAPE_HTML3"
      ],
      "begin_line": 217,
      "end_line": 222,
      "comment": "\n     * Translator object for unescaping escaped HTML 3.0. \n     * \n     * While {@link #unescapeHtml3(String)} is the expected method of use, this \n     * object allows the HTML unescaping functionality to be used \n     * as the foundation for a custom translator. \n     *\n     * @since 3.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UNESCAPE_HTML4"
      ],
      "begin_line": 233,
      "end_line": 239,
      "comment": "\n     * Translator object for unescaping escaped HTML 4.0. \n     * \n     * While {@link #unescapeHtml4(String)} is the expected method of use, this \n     * object allows the HTML unescaping functionality to be used \n     * as the foundation for a custom translator. \n     *\n     * @since 3.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UNESCAPE_XML"
      ],
      "begin_line": 250,
      "end_line": 255,
      "comment": "\n     * Translator object for unescaping escaped XML.\n     * \n     * While {@link #unescapeXml(String)} is the expected method of use, this \n     * object allows the XML unescaping functionality to be used \n     * as the foundation for a custom translator. \n     *\n     * @since 3.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UNESCAPE_CSV"
      ],
      "begin_line": 266,
      "end_line": 266,
      "comment": "\n     * Translator object for unescaping escaped Comma Separated Value entries.\n     * \n     * While {@link #unescapeCsv(String)} is the expected method of use, this \n     * object allows the CSV unescaping functionality to be used \n     * as the foundation for a custom translator. \n     *\n     * @since 3.0\n     "
    },
    {
      "type": "class_interface",
      "name": "CsvUnescaper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.translate.CharSequenceTranslator"
      ],
      "begin_line": 268,
      "end_line": 299,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_DELIMITER"
      ],
      "begin_line": 270,
      "end_line": 270,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_QUOTE"
      ],
      "begin_line": 271,
      "end_line": 271,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_QUOTE_STR"
      ],
      "begin_line": 272,
      "end_line": 272,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_SEARCH_CHARS"
      ],
      "begin_line": 273,
      "end_line": 274,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.CsvUnescaper.translate(java.lang.CharSequence, int, java.io.Writer)",
      "begin_line": 276,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 279,col 13)-(line 281,col 13)",
        "(line 283,col 13)-(line 286,col 13)",
        "(line 289,col 13)-(line 289,col 83)",
        "(line 291,col 13)-(line 296,col 13)",
        "(line 297,col 13)-(line 297,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.StringEscapeUtils()",
      "begin_line": 313,
      "end_line": 315,
      "comment": "\n     * \u003cp\u003e{@code StringEscapeUtils} instances should NOT be constructed in\n     * standard programming.\u003c/p\u003e\n     *\n     * \u003cp\u003eInstead, the class should be used as:\n     * \u003cpre\u003eStringEscapeUtils.escapeJava(\"foo\");\u003c/pre\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 314,col 7)-(line 314,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.escapeJava(java.lang.String)",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a {@code String} using Java String rules.\u003c/p\u003e\n     *\n     * \u003cp\u003eDeals correctly with quotes and control-chars (tab, backslash, cr, ff, etc.) \u003c/p\u003e\n     *\n     * \u003cp\u003eSo a tab becomes the characters {@code \u0027\\\\\u0027} and\n     * {@code \u0027t\u0027}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe only difference between Java strings and JavaScript strings\n     * is that in JavaScript, a single quote and forward-slash (/) are escaped.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample:\n     * \u003cpre\u003e\n     * input string: He didn\u0027t say, \"Stop!\"\n     * output string: He didn\u0027t say, \\\"Stop!\\\"\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param input  String to escape values in, may be null\n     * @return String with escaped values, {@code null} if null string input\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(java.lang.String)",
      "begin_line": 369,
      "end_line": 371,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a {@code String} using EcmaScript String rules.\u003c/p\u003e\n     * \u003cp\u003eEscapes any values it finds into their EcmaScript String form.\n     * Deals correctly with quotes and control-chars (tab, backslash, cr, ff, etc.) \u003c/p\u003e\n     *\n     * \u003cp\u003eSo a tab becomes the characters {@code \u0027\\\\\u0027} and\n     * {@code \u0027t\u0027}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe only difference between Java strings and EcmaScript strings\n     * is that in EcmaScript, a single quote and forward-slash (/) are escaped.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote that EcmaScript is best known by the JavaScript and ActionScript dialects. \u003c/p\u003e\n     *\n     * \u003cp\u003eExample:\n     * \u003cpre\u003e\n     * input string: He didn\u0027t say, \"Stop!\"\n     * output string: He didn\\\u0027t say, \\\"Stop!\\\"\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param input  String to escape values in, may be null\n     * @return String with escaped values, {@code null} if null string input\n     *\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.unescapeJava(java.lang.String)",
      "begin_line": 382,
      "end_line": 384,
      "comment": "\n     * \u003cp\u003eUnescapes any Java literals found in the {@code String}.\n     * For example, it will turn a sequence of {@code \u0027\\\u0027} and\n     * {@code \u0027n\u0027} into a newline character, unless the {@code \u0027\\\u0027}\n     * is preceded by another {@code \u0027\\\u0027}.\u003c/p\u003e\n     * \n     * @param input  the {@code String} to unescape, may be null\n     * @return a new unescaped {@code String}, {@code null} if null string input\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.unescapeEcmaScript(java.lang.String)",
      "begin_line": 399,
      "end_line": 401,
      "comment": "\n     * \u003cp\u003eUnescapes any EcmaScript literals found in the {@code String}.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, it will turn a sequence of {@code \u0027\\\u0027} and {@code \u0027n\u0027}\n     * into a newline character, unless the {@code \u0027\\\u0027} is preceded by another\n     * {@code \u0027\\\u0027}.\u003c/p\u003e\n     *\n     * @see #unescapeJava(String)\n     * @param input  the {@code String} to unescape, may be null\n     * @return A new unescaped {@code String}, {@code null} if null string input\n     *\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(java.lang.String)",
      "begin_line": 432,
      "end_line": 434,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a {@code String} using HTML entities.\u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * For example:\n     * \u003c/p\u003e \n     * \u003cp\u003e\u003ccode\u003e\"bread\" \u0026 \"butter\"\u003c/code\u003e\u003c/p\u003e\n     * becomes:\n     * \u003cp\u003e\n     * \u003ccode\u003e\u0026amp;quot;bread\u0026amp;quot; \u0026amp;amp; \u0026amp;quot;butter\u0026amp;quot;\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eSupports all known HTML 4.0 entities, including funky accents.\n     * Note that the commonly used apostrophe escape character (\u0026amp;apos;)\n     * is not a legal entity and so is not supported). \u003c/p\u003e\n     *\n     * @param input  the {@code String} to escape, may be null\n     * @return a new escaped {@code String}, {@code null} if null string input\n     * \n     * @see \u003ca href\u003d\"http://hotwired.lycos.com/webmonkey/reference/special_characters/\"\u003eISO Entities\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/REC-html32#latin1\"\u003eHTML 3.2 Character Entities for ISO Latin-1\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/REC-html40/sgml/entities.html\"\u003eHTML 4.0 Character entity references\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/html401/charset.html#h-5.3\"\u003eHTML 4.01 Character References\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/html401/charset.html#code-position\"\u003eHTML 4.01 Code positions\u003c/a\u003e\n     * \n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.escapeHtml3(java.lang.String)",
      "begin_line": 445,
      "end_line": 447,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a {@code String} using HTML entities.\u003c/p\u003e\n     * \u003cp\u003eSupports only the HTML 3.0 entities. \u003c/p\u003e\n     *\n     * @param input  the {@code String} to escape, may be null\n     * @return a new escaped {@code String}, {@code null} if null string input\n     * \n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(java.lang.String)",
      "begin_line": 467,
      "end_line": 469,
      "comment": "\n     * \u003cp\u003eUnescapes a string containing entity escapes to a string\n     * containing the actual Unicode characters corresponding to the\n     * escapes. Supports HTML 4.0 entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, the string \"\u0026amp;lt;Fran\u0026amp;ccedil;ais\u0026amp;gt;\"\n     * will become \"\u0026lt;Fran\u0026ccedil;ais\u0026gt;\"\u003c/p\u003e\n     *\n     * \u003cp\u003eIf an entity is unrecognized, it is left alone, and inserted\n     * verbatim into the result string. e.g. \"\u0026amp;gt;\u0026amp;zzzz;x\" will\n     * become \"\u0026gt;\u0026amp;zzzz;x\".\u003c/p\u003e\n     *\n     * @param input  the {@code String} to unescape, may be null\n     * @return a new unescaped {@code String}, {@code null} if null string input\n     * \n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.unescapeHtml3(java.lang.String)",
      "begin_line": 481,
      "end_line": 483,
      "comment": "\n     * \u003cp\u003eUnescapes a string containing entity escapes to a string\n     * containing the actual Unicode characters corresponding to the\n     * escapes. Supports only HTML 3.0 entities.\u003c/p\u003e\n     *\n     * @param input  the {@code String} to unescape, may be null\n     * @return a new unescaped {@code String}, {@code null} if null string input\n     * \n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.escapeXml(java.lang.String)",
      "begin_line": 505,
      "end_line": 507,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a {@code String} using XML entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example: \u003ctt\u003e\"bread\" \u0026 \"butter\"\u003c/tt\u003e \u003d\u003e\n     * \u003ctt\u003e\u0026amp;quot;bread\u0026amp;quot; \u0026amp;amp; \u0026amp;quot;butter\u0026amp;quot;\u003c/tt\u003e.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eSupports only the five basic XML entities (gt, lt, quot, amp, apos).\n     * Does not support DTDs or external entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote that unicode characters greater than 0x7f are as of 3.0, no longer \n     *    escaped. If you still wish this functionality, you can achieve it \n     *    via the following: \n     * {@code StringEscapeUtils.ESCAPE_XML.with( new UnicodeEscaper(Range.between(0x7f, Integer.MAX_VALUE)) );}\u003c/p\u003e\n     *\n     * @param input  the {@code String} to escape, may be null\n     * @return a new escaped {@code String}, {@code null} if null string input\n     * @see #unescapeXml(java.lang.String)\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.unescapeXml(java.lang.String)",
      "begin_line": 526,
      "end_line": 528,
      "comment": "\n     * \u003cp\u003eUnescapes a string containing XML entity escapes to a string\n     * containing the actual Unicode characters corresponding to the\n     * escapes.\u003c/p\u003e\n     *\n     * \u003cp\u003eSupports only the five basic XML entities (gt, lt, quot, amp, apos).\n     * Does not support DTDs or external entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote that numerical \\\\u unicode codes are unescaped to their respective \n     *    unicode characters. This may change in future releases. \u003c/p\u003e\n     *\n     * @param input  the {@code String} to unescape, may be null\n     * @return a new unescaped {@code String}, {@code null} if null string input\n     * @see #escapeXml(String)\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.escapeCsv(java.lang.String)",
      "begin_line": 555,
      "end_line": 557,
      "comment": "\n     * \u003cp\u003eReturns a {@code String} value for a CSV column enclosed in double quotes,\n     * if required.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the value contains a comma, newline or double quote, then the\n     *    String value is returned enclosed in double quotes.\u003c/p\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eAny double quote characters in the value are escaped with another double quote.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the value does not contain a comma, newline or double quote, then the\n     *    String value is returned unchanged.\u003c/p\u003e\n     * \u003c/p\u003e\n     *\n     * see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Comma-separated_values\"\u003eWikipedia\u003c/a\u003e and\n     * \u003ca href\u003d\"http://tools.ietf.org/html/rfc4180\"\u003eRFC 4180\u003c/a\u003e.\n     *\n     * @param input the input CSV column String, may be null\n     * @return the input String, enclosed in double quotes if the value contains a comma,\n     * newline or double quote, {@code null} if null string input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.unescapeCsv(java.lang.String)",
      "begin_line": 581,
      "end_line": 583,
      "comment": "\n     * \u003cp\u003eReturns a {@code String} value for an unescaped CSV column. \u003c/p\u003e\n     *\n     * \u003cp\u003eIf the value is enclosed in double quotes, and contains a comma, newline \n     *    or double quote, then quotes are removed. \n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eAny double quote escaped characters (a pair of double quotes) are unescaped \n     *    to just one double quote. \u003c/p\u003e\n     *\n     * \u003cp\u003eIf the value is not enclosed in double quotes, or is and does not contain a \n     *    comma, newline or double quote, then the String value is returned unchanged.\u003c/p\u003e\n     * \u003c/p\u003e\n     *\n     * see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Comma-separated_values\"\u003eWikipedia\u003c/a\u003e and\n     * \u003ca href\u003d\"http://tools.ietf.org/html/rfc4180\"\u003eRFC 4180\u003c/a\u003e.\n     *\n     * @param input the input CSV column String, may be null\n     * @return the input String, with enclosing double quotes removed and embedded double \n     * quotes unescaped, {@code null} if null string input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 45)"
      ]
    }
  ]
}