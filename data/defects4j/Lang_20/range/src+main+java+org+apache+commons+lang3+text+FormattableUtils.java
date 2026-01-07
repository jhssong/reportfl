{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/text/FormattableUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FormattableUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 151,
      "comment": "\n * \u003cp\u003eProvides utilities for working with the {@code Formattable} interface.\u003c/p\u003e\n * \n * \u003cp\u003eThe {@link Formattable} interface provides basic control over formatting\n * when using a {@code Formatter}. It is primarily concerned with numeric precision\n * and padding, and is not designed to allow generalised alternate formats.\u003c/p\u003e\n * \n * @since Lang 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SIMPLEST_FORMAT"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * A format that simply outputs the value as a string.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.FormattableUtils.FormattableUtils()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * \u003cp\u003e{@code FormattableUtils} instances should NOT be constructed in\n     * standard programming. Instead, the methods of the class should be invoked\n     * statically.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.FormattableUtils.toString(java.util.Formattable)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Get the default formatted representation of the specified\n     * {@code Formattable}.\n     * \n     * @param formattable  the instance to convert to a string, not null\n     * @return the resulting string, not null\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.FormattableUtils.append(java.lang.CharSequence, java.util.Formatter, int, int, int)",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\n     * Handles the common {@code Formattable} operations of truncate-pad-append,\n     * with no ellipsis on precision overflow, and padding width underflow with\n     * spaces.\n     * \n     * @param seq  the string to handle, not null\n     * @param formatter  the destination formatter, not null\n     * @param flags  the flags for formatting, see {@code Formattable}\n     * @param width  the width of the output, see {@code Formattable}\n     * @param precision  the precision of the output, see {@code Formattable}\n     * @return the {@code formatter} instance, not null\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.FormattableUtils.append(java.lang.CharSequence, java.util.Formatter, int, int, int, char)",
      "begin_line": 98,
      "end_line": 101,
      "comment": "\n     * Handles the common {@link Formattable} operations of truncate-pad-append,\n     * with no ellipsis on precision overflow.\n     * \n     * @param seq  the string to handle, not null\n     * @param formatter  the destination formatter, not null\n     * @param flags  the flags for formatting, see {@code Formattable}\n     * @param width  the width of the output, see {@code Formattable}\n     * @param precision  the precision of the output, see {@code Formattable}\n     * @param padChar  the pad character to use\n     * @return the {@code formatter} instance, not null\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.FormattableUtils.append(java.lang.CharSequence, java.util.Formatter, int, int, int, java.lang.CharSequence)",
      "begin_line": 116,
      "end_line": 119,
      "comment": "\n     * Handles the common {@link Formattable} operations of truncate-pad-append,\n     * padding width underflow with spaces.\n     * \n     * @param seq  the string to handle, not null\n     * @param formatter  the destination formatter, not null\n     * @param flags  the flags for formatting, see {@code Formattable}\n     * @param width  the width of the output, see {@code Formattable}\n     * @param precision  the precision of the output, see {@code Formattable}\n     * @param ellipsis  the ellipsis to use when precision dictates truncation, null or\n     *  empty causes a hard truncation\n     * @return the {@code formatter} instance, not null\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.FormattableUtils.append(java.lang.CharSequence, java.util.Formatter, int, int, int, char, java.lang.CharSequence)",
      "begin_line": 134,
      "end_line": 149,
      "comment": "\n     * Handles the common {@link Formattable} operations of truncate-pad-append.\n     * \n     * @param seq  the string to handle, not null\n     * @param formatter  the destination formatter, not null\n     * @param flags  the flags for formatting, see {@code Formattable}\n     * @param width  the width of the output, see {@code Formattable}\n     * @param precision  the precision of the output, see {@code Formattable}\n     * @param padChar  the pad character to use\n     * @param ellipsis  the ellipsis to use when precision dictates truncation, null or\n     *  empty causes a hard truncation\n     * @return the {@code formatter} instance, not null\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 137,col 109)",
        "(line 138,col 9)-(line 138,col 51)",
        "(line 139,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 69)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 41)",
        "(line 148,col 9)-(line 148,col 25)"
      ]
    }
  ]
}