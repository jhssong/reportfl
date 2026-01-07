{
  "filepath": "/tmp/Lang-21b/src/main/java/org/apache/commons/lang3/StringEscapeUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringEscapeUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 49,
      "end_line": 474,
      "comment": "\n * \u003cp\u003eEscapes and unescapes \u003ccode\u003eString\u003c/code\u003es for\n * Java, Java Script, HTML and XML.\u003c/p\u003e\n *\n * \u003cp\u003e#ThreadSafe#\u003c/p\u003e\n * @author Apache Software Foundation\n * @author Apache Jakarta Turbine\n * @author Purple Technology\n * @author \u003ca href\u003d\"mailto:alex@purpletech.com\"\u003eAlexander Day Chaffee\u003c/a\u003e\n * @author Antony Riley\n * @author Helge Tesgaard\n * @author \u003ca href\u003d\"sean@boohai.com\"\u003eSean Brown\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @author Phil Steitz\n * @author Pete Gieser\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPE_JAVA"
      ],
      "begin_line": 53,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPE_ECMASCRIPT"
      ],
      "begin_line": 64,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPE_XML"
      ],
      "begin_line": 77,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPE_HTML3"
      ],
      "begin_line": 83,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPE_HTML4"
      ],
      "begin_line": 89,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPE_CSV"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "CsvEscaper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.translate.CharSequenceTranslator"
      ],
      "begin_line": 101,
      "end_line": 125,
      "comment": "       and could also have an optimization check method."
    },
    {
      "type": "field",
      "varNames": [
        "CSV_DELIMITER"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_QUOTE"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_QUOTE_STR"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_SEARCH_CHARS"
      ],
      "begin_line": 106,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.CsvEscaper.translate(java.lang.CharSequence, int, java.io.Writer)",
      "begin_line": 109,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 112,col 13)-(line 114,col 13)",
        "(line 116,col 13)-(line 122,col 13)",
        "(line 123,col 13)-(line 123,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "UNESCAPE_JAVA"
      ],
      "begin_line": 130,
      "end_line": 142,
      "comment": " TODO: throw \"illegal character: \\92\" as an Exception if a \\ on the end of the Java (as per the compiler)?"
    },
    {
      "type": "field",
      "varNames": [
        "UNESCAPE_ECMASCRIPT"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNESCAPE_HTML3"
      ],
      "begin_line": 146,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNESCAPE_HTML4"
      ],
      "begin_line": 153,
      "end_line": 159,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNESCAPE_XML"
      ],
      "begin_line": 161,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNESCAPE_CSV"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "CsvUnescaper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.translate.CharSequenceTranslator"
      ],
      "begin_line": 170,
      "end_line": 201,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_DELIMITER"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_QUOTE"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_QUOTE_STR"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_SEARCH_CHARS"
      ],
      "begin_line": 175,
      "end_line": 176,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.CsvUnescaper.translate(java.lang.CharSequence, int, java.io.Writer)",
      "begin_line": 178,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 181,col 13)-(line 183,col 13)",
        "(line 185,col 13)-(line 188,col 13)",
        "(line 191,col 13)-(line 191,col 83)",
        "(line 193,col 13)-(line 198,col 13)",
        "(line 199,col 13)-(line 199,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.StringEscapeUtils()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eStringEscapeUtils\u003c/code\u003e instances should NOT be constructed in\n     * standard programming.\u003c/p\u003e\n     *\n     * \u003cp\u003eInstead, the class should be used as:\n     * \u003cpre\u003eStringEscapeUtils.escapeJava(\"foo\");\u003c/pre\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 216,col 7)-(line 216,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.escapeJava(java.lang.String)",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using Java String rules.\u003c/p\u003e\n     *\n     * \u003cp\u003eDeals correctly with quotes and control-chars (tab, backslash, cr, ff, etc.) \u003c/p\u003e\n     *\n     * \u003cp\u003eSo a tab becomes the characters \u003ccode\u003e\u0027\\\\\u0027\u003c/code\u003e and\n     * \u003ccode\u003e\u0027t\u0027\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe only difference between Java strings and JavaScript strings\n     * is that in JavaScript, a single quote and forward-slash (/) are escaped.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample:\n     * \u003cpre\u003e\n     * input string: He didn\u0027t say, \"Stop!\"\n     * output string: He didn\u0027t say, \\\"Stop!\\\"\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param input  String to escape values in, may be null\n     * @return String with escaped values, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(java.lang.String)",
      "begin_line": 269,
      "end_line": 271,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using EcmaScript String rules.\u003c/p\u003e\n     * \u003cp\u003eEscapes any values it finds into their EcmaScript String form.\n     * Deals correctly with quotes and control-chars (tab, backslash, cr, ff, etc.) \u003c/p\u003e\n     *\n     * \u003cp\u003eSo a tab becomes the characters \u003ccode\u003e\u0027\\\\\u0027\u003c/code\u003e and\n     * \u003ccode\u003e\u0027t\u0027\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe only difference between Java strings and EcmaScript strings\n     * is that in EcmaScript, a single quote and forward-slash (/) are escaped.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote that EcmaScript is best known by the JavaScript and ActionScript dialects. \u003c/p\u003e\n     *\n     * \u003cp\u003eExample:\n     * \u003cpre\u003e\n     * input string: He didn\u0027t say, \"Stop!\"\n     * output string: He didn\\\u0027t say, \\\"Stop!\\\"\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param input  String to escape values in, may be null\n     * @return String with escaped values, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.unescapeJava(java.lang.String)",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\n     * \u003cp\u003eUnescapes any Java literals found in the \u003ccode\u003eString\u003c/code\u003e.\n     * For example, it will turn a sequence of \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e and\n     * \u003ccode\u003e\u0027n\u0027\u003c/code\u003e into a newline character, unless the \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e\n     * is preceded by another \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param input  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @return a new unescaped \u003ccode\u003eString\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.unescapeEcmaScript(java.lang.String)",
      "begin_line": 297,
      "end_line": 299,
      "comment": "\n     * \u003cp\u003eUnescapes any EcmaScript literals found in the \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, it will turn a sequence of \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e and \u003ccode\u003e\u0027n\u0027\u003c/code\u003e\n     * into a newline character, unless the \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e is preceded by another\n     * \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @see #unescapeJava(String)\n     * @param input  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @return A new unescaped \u003ccode\u003eString\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(java.lang.String)",
      "begin_line": 328,
      "end_line": 330,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using HTML entities.\u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * For example:\n     * \u003c/p\u003e \n     * \u003cp\u003e\u003ccode\u003e\"bread\" \u0026 \"butter\"\u003c/code\u003e\u003c/p\u003e\n     * becomes:\n     * \u003cp\u003e\n     * \u003ccode\u003e\u0026amp;quot;bread\u0026amp;quot; \u0026amp;amp; \u0026amp;quot;butter\u0026amp;quot;\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eSupports all known HTML 4.0 entities, including funky accents.\n     * Note that the commonly used apostrophe escape character (\u0026amp;apos;)\n     * is not a legal entity and so is not supported). \u003c/p\u003e\n     *\n     * @param input  the \u003ccode\u003eString\u003c/code\u003e to escape, may be null\n     * @return a new escaped \u003ccode\u003eString\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * \n     * @see \u003ca href\u003d\"http://hotwired.lycos.com/webmonkey/reference/special_characters/\"\u003eISO Entities\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/REC-html32#latin1\"\u003eHTML 3.2 Character Entities for ISO Latin-1\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/REC-html40/sgml/entities.html\"\u003eHTML 4.0 Character entity references\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/html401/charset.html#h-5.3\"\u003eHTML 4.01 Character References\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/html401/charset.html#code-position\"\u003eHTML 4.01 Code positions\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.escapeHtml3(java.lang.String)",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using HTML entities.\u003c/p\u003e\n     * \u003cp\u003eSupports only the HTML 3.0 entities. \u003c/p\u003e\n     *\n     * @param input  the \u003ccode\u003eString\u003c/code\u003e to escape, may be null\n     * @return a new escaped \u003ccode\u003eString\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * \n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(java.lang.String)",
      "begin_line": 360,
      "end_line": 362,
      "comment": "\n     * \u003cp\u003eUnescapes a string containing entity escapes to a string\n     * containing the actual Unicode characters corresponding to the\n     * escapes. Supports HTML 4.0 entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, the string \"\u0026amp;lt;Fran\u0026amp;ccedil;ais\u0026amp;gt;\"\n     * will become \"\u0026lt;Fran\u0026ccedil;ais\u0026gt;\"\u003c/p\u003e\n     *\n     * \u003cp\u003eIf an entity is unrecognized, it is left alone, and inserted\n     * verbatim into the result string. e.g. \"\u0026amp;gt;\u0026amp;zzzz;x\" will\n     * become \"\u0026gt;\u0026amp;zzzz;x\".\u003c/p\u003e\n     *\n     * @param input  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @return a new unescaped \u003ccode\u003eString\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.unescapeHtml3(java.lang.String)",
      "begin_line": 372,
      "end_line": 374,
      "comment": "\n     * \u003cp\u003eUnescapes a string containing entity escapes to a string\n     * containing the actual Unicode characters corresponding to the\n     * escapes. Supports only HTML 3.0 entities.\u003c/p\u003e\n     *\n     * @param input  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @return a new unescaped \u003ccode\u003eString\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.escapeXml(java.lang.String)",
      "begin_line": 394,
      "end_line": 396,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using XML entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example: \u003ctt\u003e\"bread\" \u0026 \"butter\"\u003c/tt\u003e \u003d\u003e\n     * \u003ctt\u003e\u0026amp;quot;bread\u0026amp;quot; \u0026amp;amp; \u0026amp;quot;butter\u0026amp;quot;\u003c/tt\u003e.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eSupports only the five basic XML entities (gt, lt, quot, amp, apos).\n     * Does not support DTDs or external entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote that unicode characters greater than 0x7f are as of 3.0, no longer \n     *    escaped. \u003c/p\u003e\n     *\n     * @param input  the \u003ccode\u003eString\u003c/code\u003e to escape, may be null\n     * @return a new escaped \u003ccode\u003eString\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @see #unescapeXml(java.lang.String)\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.unescapeXml(java.lang.String)",
      "begin_line": 415,
      "end_line": 417,
      "comment": "\n     * \u003cp\u003eUnescapes a string containing XML entity escapes to a string\n     * containing the actual Unicode characters corresponding to the\n     * escapes.\u003c/p\u003e\n     *\n     * \u003cp\u003eSupports only the five basic XML entities (gt, lt, quot, amp, apos).\n     * Does not support DTDs or external entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote that numerical \\\\u unicode codes are unescaped to their respective \n     *    unicode characters. This may change in future releases. \u003c/p\u003e\n     *\n     * @param input  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @return a new unescaped \u003ccode\u003eString\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @see #escapeXml(String)\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.escapeCsv(java.lang.String)",
      "begin_line": 444,
      "end_line": 446,
      "comment": "\n     * \u003cp\u003eReturns a \u003ccode\u003eString\u003c/code\u003e value for a CSV column enclosed in double quotes,\n     * if required.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the value contains a comma, newline or double quote, then the\n     *    String value is returned enclosed in double quotes.\u003c/p\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eAny double quote characters in the value are escaped with another double quote.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the value does not contain a comma, newline or double quote, then the\n     *    String value is returned unchanged.\u003c/p\u003e\n     * \u003c/p\u003e\n     *\n     * see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Comma-separated_values\"\u003eWikipedia\u003c/a\u003e and\n     * \u003ca href\u003d\"http://tools.ietf.org/html/rfc4180\"\u003eRFC 4180\u003c/a\u003e.\n     *\n     * @param input the input CSV column String, may be null\n     * @return the input String, enclosed in double quotes if the value contains a comma,\n     * newline or double quote, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringEscapeUtils.unescapeCsv(java.lang.String)",
      "begin_line": 470,
      "end_line": 472,
      "comment": "\n     * \u003cp\u003eReturns a \u003ccode\u003eString\u003c/code\u003e value for an unescaped CSV column. \u003c/p\u003e\n     *\n     * \u003cp\u003eIf the value is enclosed in double quotes, and contains a comma, newline \n     *    or double quote, then quotes are removed. \n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eAny double quote escaped characters (a pair of double quotes) are unescaped \n     *    to just one double quote. \u003c/p\u003e\n     *\n     * \u003cp\u003eIf the value is not enclosed in double quotes, or is and does not contain a \n     *    comma, newline or double quote, then the String value is returned unchanged.\u003c/p\u003e\n     * \u003c/p\u003e\n     *\n     * see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Comma-separated_values\"\u003eWikipedia\u003c/a\u003e and\n     * \u003ca href\u003d\"http://tools.ietf.org/html/rfc4180\"\u003eRFC 4180\u003c/a\u003e.\n     *\n     * @param input the input CSV column String, may be null\n     * @return the input String, with enclosing double quotes removed and embedded double \n     * quotes unescaped, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 45)"
      ]
    }
  ]
}