{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/linear/RealVectorFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealVectorFormat",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.util.CompositeFormat"
      ],
      "begin_line": 45,
      "end_line": 340,
      "comment": "\n * Formats a vector in components list format \"{v0; v1; ...; vk-1}\".\n * \u003cp\u003eThe prefix and suffix \"{\" and \"}\" and the separator \"; \" can be replaced by\n * any user-defined strings. The number format for components can be configured.\u003c/p\u003e\n * \u003cp\u003eWhite space is ignored at parse time, even if it is in the prefix, suffix\n * or separator specifications. So even if the default separator does include a space\n * character that is used at format time, both input string \"{1;1;1}\" and\n * \" { 1 ; 1 ; 1 } \" will be parsed without error and the same vector will be\n * returned. In the second case, however, the parse position after parsing will be\n * just after the closing curly brace, i.e. just before the trailing space.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PREFIX"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " The default prefix: \"{\". "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SUFFIX"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The default suffix: \"}\". "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SEPARATOR"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The default separator: \", \". "
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "suffix"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Suffix. "
    },
    {
      "type": "field",
      "varNames": [
        "separator"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Separator. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedPrefix"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Trimmed prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedSuffix"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Trimmed suffix. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedSeparator"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Trimmed separator. "
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The format used for components. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.RealVectorFormat()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Create an instance with default settings.\n     * \u003cp\u003eThe instance uses the default prefix, suffix and separator:\n     * \"{\", \"}\", and \"; \" and the default number format for components.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 90)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.RealVectorFormat(java.text.NumberFormat)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Create an instance with a custom number format for components.\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.RealVectorFormat(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "\n     * Create an instance with custom prefix, suffix and separator.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param separator separator to use instead of the default \"; \"\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.RealVectorFormat(java.lang.String, java.lang.String, java.lang.String, java.text.NumberFormat)",
      "begin_line": 116,
      "end_line": 125,
      "comment": "\n     * Create an instance with custom prefix, suffix, separator and format\n     * for components.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param separator separator to use instead of the default \"; \"\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 34)",
        "(line 119,col 9)-(line 119,col 34)",
        "(line 120,col 9)-(line 120,col 37)",
        "(line 121,col 9)-(line 121,col 41)",
        "(line 122,col 9)-(line 122,col 41)",
        "(line 123,col 9)-(line 123,col 44)",
        "(line 124,col 9)-(line 124,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getAvailableLocales()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * Get the set of locales for which real vectors formats are available.\n     * \u003cp\u003eThis is the same set as the {@link NumberFormat} set.\u003c/p\u003e\n     * @return available real vector format locales.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getPrefix()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Get the format prefix.\n     * @return format prefix.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getSuffix()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * Get the format suffix.\n     * @return format suffix.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getSeparator()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * Get the format separator between components.\n     * @return format separator.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getFormat()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Get the components format.\n     * @return components format.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getInstance()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * Returns the default real vector format for the current locale.\n     * @return the default real vector format.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getInstance(java.util.Locale)",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * Returns the default real vector format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the real vector format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.formatRealVector(org.apache.commons.math.linear.RealVector)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * This static method calls {@link #format(Object)} on a default instance of\n     * RealVectorFormat.\n     *\n     * @param v RealVector object to format\n     * @return A formatted vector\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.format(org.apache.commons.math.linear.RealVector, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 204,
      "end_line": 226,
      "comment": "\n     * Formats a {@link RealVector} object to produce a string.\n     * @param vector the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 29)",
        "(line 208,col 9)-(line 208,col 27)",
        "(line 211,col 9)-(line 211,col 34)",
        "(line 214,col 9)-(line 219,col 9)",
        "(line 222,col 9)-(line 222,col 34)",
        "(line 224,col 9)-(line 224,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 240,
      "end_line": 252,
      "comment": "\n     * Formats a object to produce a string.\n     * \u003cp\u003e\u003ccode\u003eobj\u003c/code\u003e must be a  {@link RealVector} object. Any other type of\n     * object will result in an {@link IllegalArgumentException} being thrown.\u003c/p\u003e\n     * @param obj the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     * @see java.text.Format#format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)\n     * @throws IllegalArgumentException is \u003ccode\u003eobj\u003c/code\u003e is not a valid type.\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 246,col 9)",
        "(line 248,col 9)-(line 250,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.parse(java.lang.String)",
      "begin_line": 261,
      "end_line": 270,
      "comment": "\n     * Parses a string to produce a {@link RealVector} object.\n     * @param source the string to parse\n     * @return the parsed {@link RealVector} object.\n     * @exception ParseException if the beginning of the specified string\n     *            cannot be parsed.\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 59)",
        "(line 263,col 9)-(line 263,col 62)",
        "(line 264,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 269,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 278,
      "end_line": 326,
      "comment": "\n     * Parses a string to produce a {@link RealVector} object.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed {@link RealVector} object.\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 42)",
        "(line 282,col 9)-(line 282,col 46)",
        "(line 283,col 9)-(line 285,col 9)",
        "(line 288,col 9)-(line 288,col 58)",
        "(line 289,col 9)-(line 311,col 9)",
        "(line 314,col 9)-(line 314,col 46)",
        "(line 315,col 9)-(line 317,col 9)",
        "(line 320,col 9)-(line 320,col 54)",
        "(line 321,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 335,
      "end_line": 338,
      "comment": "\n     * Parses a string to produce a object.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed object.\n     * @see java.text.Format#parseObject(java.lang.String, java.text.ParsePosition)\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 34)"
      ]
    }
  ]
}