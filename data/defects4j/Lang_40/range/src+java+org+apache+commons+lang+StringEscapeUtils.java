{
  "filepath": "/tmp/Lang-40b/src/java/org/apache/commons/lang/StringEscapeUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringEscapeUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 513,
      "comment": "\n * \u003cp\u003eEscapes and unescapes \u003ccode\u003eString\u003c/code\u003es for\n * Java, Java Script, HTML, XML, and SQL.\u003c/p\u003e\n *\n * @author Apache Jakarta Turbine\n * @author Purple Technology\n * @author \u003ca href\u003d\"mailto:alex@purpletech.com\"\u003eAlexander Day Chaffee\u003c/a\u003e\n * @author Antony Riley\n * @author Helge Tesgaard\n * @author \u003ca href\u003d\"sean@boohai.com\"\u003eSean Brown\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @author Phil Steitz\n * @author Pete Gieser\n * @since 2.0\n * @version $Id$\n *\n * @deprecated Use text.translate.EscapeUtils and text.translate.UnescapeUtils instead\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.StringEscapeUtils.StringEscapeUtils()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eStringEscapeUtils\u003c/code\u003e instances should NOT be constructed in\n     * standard programming.\u003c/p\u003e\n     *\n     * \u003cp\u003eInstead, the class should be used as:\n     * \u003cpre\u003eStringEscapeUtils.escapeJava(\"foo\");\u003c/pre\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 57,col 7)-(line 57,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeJava(java.lang.String)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using Java String rules.\u003c/p\u003e\n     *\n     * \u003cp\u003eDeals correctly with quotes and control-chars (tab, backslash, cr, ff, etc.) \u003c/p\u003e\n     *\n     * \u003cp\u003eSo a tab becomes the characters \u003ccode\u003e\u0027\\\\\u0027\u003c/code\u003e and\n     * \u003ccode\u003e\u0027t\u0027\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe only difference between Java strings and JavaScript strings\n     * is that in JavaScript, a single quote and forward-slash (/) are escaped.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample:\n     * \u003cpre\u003e\n     * input string: He didn\u0027t say, \"Stop!\"\n     * output string: He didn\u0027t say, \\\"Stop!\\\"\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param str  String to escape values in, may be null\n     * @return String with escaped values, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeJava(java.io.Writer, java.lang.String)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using Java String rules to\n     * a \u003ccode\u003eWriter\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input has no effect.\u003c/p\u003e\n     * \n     * @see #escapeJava(java.lang.String)\n     * @param out  Writer to write escaped string into\n     * @param str  String to escape values in, may be null\n     * @throws IllegalArgumentException if the Writer is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IOException if error occurs on underlying Writer\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(java.lang.String)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using JavaScript String rules.\u003c/p\u003e\n     * \u003cp\u003eEscapes any values it finds into their JavaScript String form.\n     * Deals correctly with quotes and control-chars (tab, backslash, cr, ff, etc.) \u003c/p\u003e\n     *\n     * \u003cp\u003eSo a tab becomes the characters \u003ccode\u003e\u0027\\\\\u0027\u003c/code\u003e and\n     * \u003ccode\u003e\u0027t\u0027\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe only difference between Java strings and JavaScript strings\n     * is that in JavaScript, a single quote and forward-slash (/) are escaped.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample:\n     * \u003cpre\u003e\n     * input string: He didn\u0027t say, \"Stop!\"\n     * output string: He didn\\\u0027t say, \\\"Stop!\\\"\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param str  String to escape values in, may be null\n     * @return String with escaped values, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(java.io.Writer, java.lang.String)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using JavaScript String rules\n     * to a \u003ccode\u003eWriter\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input has no effect.\u003c/p\u003e\n     * \n     * @see #escapeJavaScript(java.lang.String)\n     * @param out  Writer to write escaped string into\n     * @param str  String to escape values in, may be null\n     * @throws IllegalArgumentException if the Writer is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IOException if error occurs on underlying Writer\n     *",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeJava(java.lang.String)",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * \u003cp\u003eUnescapes any Java literals found in the \u003ccode\u003eString\u003c/code\u003e.\n     * For example, it will turn a sequence of \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e and\n     * \u003ccode\u003e\u0027n\u0027\u003c/code\u003e into a newline character, unless the \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e\n     * is preceded by another \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @return a new unescaped \u003ccode\u003eString\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeJava(java.io.Writer, java.lang.String)",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * \u003cp\u003eUnescapes any Java literals found in the \u003ccode\u003eString\u003c/code\u003e to a\n     * \u003ccode\u003eWriter\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, it will turn a sequence of \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e and\n     * \u003ccode\u003e\u0027n\u0027\u003c/code\u003e into a newline character, unless the \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e\n     * is preceded by another \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input has no effect.\u003c/p\u003e\n     * \n     * @param out  the \u003ccode\u003eWriter\u003c/code\u003e used to output unescaped characters\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @throws IllegalArgumentException if the Writer is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IOException if error occurs on underlying Writer\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(java.lang.String)",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * \u003cp\u003eUnescapes any JavaScript literals found in the \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, it will turn a sequence of \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e and \u003ccode\u003e\u0027n\u0027\u003c/code\u003e\n     * into a newline character, unless the \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e is preceded by another\n     * \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @see #unescapeJava(String)\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @return A new unescaped \u003ccode\u003eString\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(java.io.Writer, java.lang.String)",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\n     * \u003cp\u003eUnescapes any JavaScript literals found in the \u003ccode\u003eString\u003c/code\u003e to a\n     * \u003ccode\u003eWriter\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, it will turn a sequence of \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e and \u003ccode\u003e\u0027n\u0027\u003c/code\u003e\n     * into a newline character, unless the \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e is preceded by another\n     * \u003ccode\u003e\u0027\\\u0027\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input has no effect.\u003c/p\u003e\n     * \n     * @see #unescapeJava(Writer,String)\n     * @param out  the \u003ccode\u003eWriter\u003c/code\u003e used to output unescaped characters\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @throws IllegalArgumentException if the Writer is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IOException if error occurs on underlying Writer\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeHtml(java.lang.String)",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using HTML entities.\u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * For example:\n     * \u003c/p\u003e \n     * \u003cp\u003e\u003ccode\u003e\"bread\" \u0026 \"butter\"\u003c/code\u003e\u003c/p\u003e\n     * becomes:\n     * \u003cp\u003e\n     * \u003ccode\u003e\u0026amp;quot;bread\u0026amp;quot; \u0026amp;amp; \u0026amp;quot;butter\u0026amp;quot;\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eSupports all known HTML 4.0 entities, including funky accents.\n     * Note that the commonly used apostrophe escape character (\u0026amp;apos;)\n     * is not a legal entity and so is not supported). \u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to escape, may be null\n     * @return a new escaped \u003ccode\u003eString\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * \n     * @see #unescapeHtml(String)\n     * @see \u003ca href\u003d\"http://hotwired.lycos.com/webmonkey/reference/special_characters/\"\u003eISO Entities\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/REC-html32#latin1\"\u003eHTML 3.2 Character Entities for ISO Latin-1\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/REC-html40/sgml/entities.html\"\u003eHTML 4.0 Character entity references\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/html401/charset.html#h-5.3\"\u003eHTML 4.01 Character References\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/html401/charset.html#code-position\"\u003eHTML 4.01 Code positions\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeHtml(java.io.Writer, java.lang.String)",
      "begin_line": 272,
      "end_line": 274,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using HTML entities and writes\n     * them to a \u003ccode\u003eWriter\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * For example:\n     * \u003c/p\u003e \n     * \u003ccode\u003e\"bread\" \u0026 \"butter\"\u003c/code\u003e\n     * \u003cp\u003ebecomes:\u003c/p\u003e\n     * \u003ccode\u003e\u0026amp;quot;bread\u0026amp;quot; \u0026amp;amp; \u0026amp;quot;butter\u0026amp;quot;\u003c/code\u003e.\n     *\n     * \u003cp\u003eSupports all known HTML 4.0 entities, including funky accents.\n     * Note that the commonly used apostrophe escape character (\u0026amp;apos;)\n     * is not a legal entity and so is not supported). \u003c/p\u003e\n     *\n     * @param writer  the writer receiving the escaped string, not null\n     * @param string  the \u003ccode\u003eString\u003c/code\u003e to escape, may be null\n     * @throws IllegalArgumentException if the writer is null\n     * @throws IOException when \u003ccode\u003eWriter\u003c/code\u003e passed throws the exception from\n     *                                       calls to the {@link Writer#write(int)} methods.\n     * \n     * @see #escapeHtml(String)\n     * @see #unescapeHtml(String)\n     * @see \u003ca href\u003d\"http://hotwired.lycos.com/webmonkey/reference/special_characters/\"\u003eISO Entities\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/REC-html32#latin1\"\u003eHTML 3.2 Character Entities for ISO Latin-1\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/REC-html40/sgml/entities.html\"\u003eHTML 4.0 Character entity references\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/html401/charset.html#h-5.3\"\u003eHTML 4.01 Character References\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/html401/charset.html#code-position\"\u003eHTML 4.01 Code positions\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeHtml(java.lang.String)",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\n     * \u003cp\u003eUnescapes a string containing entity escapes to a string\n     * containing the actual Unicode characters corresponding to the\n     * escapes. Supports HTML 4.0 entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, the string \"\u0026amp;lt;Fran\u0026amp;ccedil;ais\u0026amp;gt;\"\n     * will become \"\u0026lt;Fran\u0026ccedil;ais\u0026gt;\"\u003c/p\u003e\n     *\n     * \u003cp\u003eIf an entity is unrecognized, it is left alone, and inserted\n     * verbatim into the result string. e.g. \"\u0026amp;gt;\u0026amp;zzzz;x\" will\n     * become \"\u0026gt;\u0026amp;zzzz;x\".\u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @return a new unescaped \u003ccode\u003eString\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @see #escapeHtml(Writer, String)\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeHtml(java.io.Writer, java.lang.String)",
      "begin_line": 315,
      "end_line": 317,
      "comment": "\n     * \u003cp\u003eUnescapes a string containing entity escapes to a string\n     * containing the actual Unicode characters corresponding to the\n     * escapes. Supports HTML 4.0 entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, the string \"\u0026amp;lt;Fran\u0026amp;ccedil;ais\u0026amp;gt;\"\n     * will become \"\u0026lt;Fran\u0026ccedil;ais\u0026gt;\"\u003c/p\u003e\n     *\n     * \u003cp\u003eIf an entity is unrecognized, it is left alone, and inserted\n     * verbatim into the result string. e.g. \"\u0026amp;gt;\u0026amp;zzzz;x\" will\n     * become \"\u0026gt;\u0026amp;zzzz;x\".\u003c/p\u003e\n     *\n     * @param writer  the writer receiving the unescaped string, not null\n     * @param string  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @throws IllegalArgumentException if the writer is null\n     * @throws IOException if an IOException occurs\n     * @see #escapeHtml(String)\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeXml(java.io.Writer, java.lang.String)",
      "begin_line": 339,
      "end_line": 341,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using XML entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example: \u003ctt\u003e\"bread\" \u0026 \"butter\"\u003c/tt\u003e \u003d\u003e\n     * \u003ctt\u003e\u0026amp;quot;bread\u0026amp;quot; \u0026amp;amp; \u0026amp;quot;butter\u0026amp;quot;\u003c/tt\u003e.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eSupports only the five basic XML entities (gt, lt, quot, amp, apos).\n     * Does not support DTDs or external entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote that unicode characters greater than 0x7f are currently escaped to \n     *    their numerical \\\\u equivalent. This may change in future releases. \u003c/p\u003e\n     *\n     * @param writer  the writer receiving the unescaped string, not null\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to escape, may be null\n     * @throws IllegalArgumentException if the writer is null\n     * @throws IOException if there is a problem writing\n     * @see #unescapeXml(java.lang.String)\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeXml(java.lang.String)",
      "begin_line": 360,
      "end_line": 362,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e using XML entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example: \u003ctt\u003e\"bread\" \u0026 \"butter\"\u003c/tt\u003e \u003d\u003e\n     * \u003ctt\u003e\u0026amp;quot;bread\u0026amp;quot; \u0026amp;amp; \u0026amp;quot;butter\u0026amp;quot;\u003c/tt\u003e.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eSupports only the five basic XML entities (gt, lt, quot, amp, apos).\n     * Does not support DTDs or external entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote that unicode characters greater than 0x7f are currently escaped to \n     *    their numerical \\\\u equivalent. This may change in future releases. \u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to escape, may be null\n     * @return a new escaped \u003ccode\u003eString\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @see #unescapeXml(java.lang.String)\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeXml(java.io.Writer, java.lang.String)",
      "begin_line": 382,
      "end_line": 384,
      "comment": "\n     * \u003cp\u003eUnescapes a string containing XML entity escapes to a string\n     * containing the actual Unicode characters corresponding to the\n     * escapes.\u003c/p\u003e\n     *\n     * \u003cp\u003eSupports only the five basic XML entities (gt, lt, quot, amp, apos).\n     * Does not support DTDs or external entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote that numerical \\\\u unicode codes are unescaped to their respective \n     *    unicode characters. This may change in future releases. \u003c/p\u003e\n     *\n     * @param writer  the writer receiving the unescaped string, not null\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @throws IllegalArgumentException if the writer is null\n     * @throws IOException if there is a problem writing\n     * @see #escapeXml(String)\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeXml(java.lang.String)",
      "begin_line": 401,
      "end_line": 403,
      "comment": "\n     * \u003cp\u003eUnescapes a string containing XML entity escapes to a string\n     * containing the actual Unicode characters corresponding to the\n     * escapes.\u003c/p\u003e\n     *\n     * \u003cp\u003eSupports only the five basic XML entities (gt, lt, quot, amp, apos).\n     * Does not support DTDs or external entities.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote that numerical \\\\u unicode codes are unescaped to their respective \n     *    unicode characters. This may change in future releases. \u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to unescape, may be null\n     * @return a new unescaped \u003ccode\u003eString\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @see #escapeXml(String)\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeCsv(java.lang.String)",
      "begin_line": 429,
      "end_line": 431,
      "comment": "\n     * \u003cp\u003eReturns a \u003ccode\u003eString\u003c/code\u003e value for a CSV column enclosed in double quotes,\n     * if required.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the value contains a comma, newline or double quote, then the\n     *    String value is returned enclosed in double quotes.\u003c/p\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eAny double quote characters in the value are escaped with another double quote.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the value does not contain a comma, newline or double quote, then the\n     *    String value is returned unchanged.\u003c/p\u003e\n     * \u003c/p\u003e\n     *\n     * see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Comma-separated_values\"\u003eWikipedia\u003c/a\u003e and\n     * \u003ca href\u003d\"http://tools.ietf.org/html/rfc4180\"\u003eRFC 4180\u003c/a\u003e.\n     *\n     * @param str the input CSV column String, may be null\n     * @return the input String, enclosed in double quotes if the value contains a comma,\n     * newline or double quote, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.escapeCsv(java.io.Writer, java.lang.String)",
      "begin_line": 456,
      "end_line": 458,
      "comment": "\n     * \u003cp\u003eWrites a \u003ccode\u003eString\u003c/code\u003e value for a CSV column enclosed in double quotes,\n     * if required.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the value contains a comma, newline or double quote, then the\n     *    String value is written enclosed in double quotes.\u003c/p\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eAny double quote characters in the value are escaped with another double quote.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the value does not contain a comma, newline or double quote, then the\n     *    String value is written unchanged (null values are ignored).\u003c/p\u003e\n     * \u003c/p\u003e\n     *\n     * see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Comma-separated_values\"\u003eWikipedia\u003c/a\u003e and\n     * \u003ca href\u003d\"http://tools.ietf.org/html/rfc4180\"\u003eRFC 4180\u003c/a\u003e.\n     *\n     * @param str the input CSV column String, may be null\n     * @param out Writer to write input string to, enclosed in double quotes if it contains\n     * a comma, newline or double quote\n     * @throws IOException if error occurs on underlying Writer\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeCsv(java.lang.String)",
      "begin_line": 482,
      "end_line": 484,
      "comment": "\n     * \u003cp\u003eReturns a \u003ccode\u003eString\u003c/code\u003e value for an unescaped CSV column. \u003c/p\u003e\n     *\n     * \u003cp\u003eIf the value is enclosed in double quotes, and contains a comma, newline \n     *    or double quote, then quotes are removed. \n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eAny double quote escaped characters (a pair of double quotes) are unescaped \n     *    to just one double quote. \u003c/p\u003e\n     *\n     * \u003cp\u003eIf the value is not enclosed in double quotes, or is and does not contain a \n     *    comma, newline or double quote, then the String value is returned unchanged.\u003c/p\u003e\n     * \u003c/p\u003e\n     *\n     * see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Comma-separated_values\"\u003eWikipedia\u003c/a\u003e and\n     * \u003ca href\u003d\"http://tools.ietf.org/html/rfc4180\"\u003eRFC 4180\u003c/a\u003e.\n     *\n     * @param str the input CSV column String, may be null\n     * @return the input String, with enclosing double quotes removed and embedded double \n     * quotes unescaped, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringEscapeUtils.unescapeCsv(java.io.Writer, java.lang.String)",
      "begin_line": 509,
      "end_line": 511,
      "comment": "\n     * \u003cp\u003eReturns a \u003ccode\u003eString\u003c/code\u003e value for an unescaped CSV column. \u003c/p\u003e\n     *\n     * \u003cp\u003eIf the value is enclosed in double quotes, and contains a comma, newline \n     *    or double quote, then quotes are removed. \n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eAny double quote escaped characters (a pair of double quotes) are unescaped \n     *    to just one double quote. \u003c/p\u003e\n     *\n     * \u003cp\u003eIf the value is not enclosed in double quotes, or is and does not contain a \n     *    comma, newline or double quote, then the String value is returned unchanged.\u003c/p\u003e\n     * \u003c/p\u003e\n     *\n     * see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Comma-separated_values\"\u003eWikipedia\u003c/a\u003e and\n     * \u003ca href\u003d\"http://tools.ietf.org/html/rfc4180\"\u003eRFC 4180\u003c/a\u003e.\n     *\n     * @param str the input CSV column String, may be null\n     * @param out Writer to write the input String to, with enclosing double quotes \n     * removed and embedded double quotes unescaped, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @throws IOException if error occurs on underlying Writer\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 55)"
      ]
    }
  ]
}