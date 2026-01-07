{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/geometry/Vector3DFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Vector3DFormat",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.util.CompositeFormat"
      ],
      "begin_line": 43,
      "end_line": 343,
      "comment": "\n * Formats a 3D vector in components list format \"{x; y; z}\".\n * \u003cp\u003eThe prefix and suffix \"{\" and \"}\" and the separator \"; \" can be replaced by\n * any user-defined strings. The number format for components can be configured.\u003c/p\u003e\n * \u003cp\u003eWhite space is ignored at parse time, even if it is in the prefix, suffix\n * or separator specifications. So even if the default separator does include a space\n * character that is used at format time, both input string \"{1;1;1}\" and\n * \" { 1 ; 1 ; 1 } \" will be parsed without error and the same vector will be\n * returned. In the second case, however, the parse position after parsing will be\n * just after the closing curly brace, i.e. just before the trailing space.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PREFIX"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The default prefix: \"{\". "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SUFFIX"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " The default suffix: \"}\". "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SEPARATOR"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " The default separator: \", \". "
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "suffix"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Suffix. "
    },
    {
      "type": "field",
      "varNames": [
        "separator"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Separator. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedPrefix"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Trimmed prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedSuffix"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Trimmed suffix. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedSeparator"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Trimmed separator. "
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " The format used for components. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.Vector3DFormat()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Create an instance with default settings.\n     * \u003cp\u003eThe instance uses the default prefix, suffix and separator:\n     * \"{\", \"}\", and \"; \" and the default number format for components.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 90)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.Vector3DFormat(java.text.NumberFormat)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Create an instance with a custom number format for components.\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.Vector3DFormat(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 101,
      "end_line": 104,
      "comment": "\n     * Create an instance with custom prefix, suffix and separator.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param separator separator to use instead of the default \"; \"\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.Vector3DFormat(java.lang.String, java.lang.String, java.lang.String, java.text.NumberFormat)",
      "begin_line": 114,
      "end_line": 123,
      "comment": "\n     * Create an instance with custom prefix, suffix, separator and format\n     * for components.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param separator separator to use instead of the default \"; \"\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 34)",
        "(line 117,col 9)-(line 117,col 34)",
        "(line 118,col 9)-(line 118,col 37)",
        "(line 119,col 9)-(line 119,col 41)",
        "(line 120,col 9)-(line 120,col 41)",
        "(line 121,col 9)-(line 121,col 44)",
        "(line 122,col 9)-(line 122,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getAvailableLocales()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * Get the set of locales for which 3D vectors formats are available.\n     * \u003cp\u003eThis is the same set as the {@link NumberFormat} set.\u003c/p\u003e\n     * @return available 3D vector format locales.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getPrefix()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Get the format prefix.\n     * @return format prefix.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getSuffix()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Get the format suffix.\n     * @return format suffix.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getSeparator()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Get the format separator between components.\n     * @return format separator.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getFormat()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Get the components format.\n     * @return components format.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getInstance()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * Returns the default 3D vector format for the current locale.\n     * @return the default 3D vector format.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getInstance(java.util.Locale)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n     * Returns the default 3D vector format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the 3D vector format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.formatVector3D(org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * This static method calls {@link #format(Object)} on a default instance of\n     * Vector3DFormat.\n     *\n     * @param v Vector3D object to format\n     * @return A formatted vector\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.format(org.apache.commons.math.geometry.Vector3D, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 202,
      "end_line": 223,
      "comment": "\n     * Formats a {@link Vector3D} object to produce a string.\n     * @param vector the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 29)",
        "(line 206,col 9)-(line 206,col 27)",
        "(line 209,col 9)-(line 209,col 34)",
        "(line 212,col 9)-(line 212,col 61)",
        "(line 213,col 9)-(line 213,col 37)",
        "(line 214,col 9)-(line 214,col 61)",
        "(line 215,col 9)-(line 215,col 37)",
        "(line 216,col 9)-(line 216,col 61)",
        "(line 219,col 9)-(line 219,col 34)",
        "(line 221,col 9)-(line 221,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 237,
      "end_line": 248,
      "comment": "\n     * Formats a object to produce a string.\n     * \u003cp\u003e\u003ccode\u003eobj\u003c/code\u003e must be a  {@link Vector3D} object. Any other type of\n     * object will result in an {@link IllegalArgumentException} being thrown.\u003c/p\u003e\n     * @param obj the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     * @see java.text.Format#format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)\n     * @throws IllegalArgumentException is \u003ccode\u003eobj\u003c/code\u003e is not a valid type.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 243,col 9)",
        "(line 245,col 9)-(line 246,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.parse(java.lang.String)",
      "begin_line": 257,
      "end_line": 266,
      "comment": "\n     * Parses a string to produce a {@link Vector3D} object.\n     * @param source the string to parse\n     * @return the parsed {@link Vector3D} object.\n     * @exception ParseException if the beginning of the specified string\n     *            cannot be parsed.\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 59)",
        "(line 259,col 9)-(line 259,col 55)",
        "(line 260,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 265,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 274,
      "end_line": 329,
      "comment": "\n     * Parses a string to produce a {@link Vector3D} object.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed {@link Vector3D} object.\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 42)",
        "(line 278,col 9)-(line 278,col 46)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 284,col 9)-(line 284,col 46)",
        "(line 285,col 9)-(line 285,col 52)",
        "(line 286,col 9)-(line 291,col 9)",
        "(line 294,col 9)-(line 294,col 46)",
        "(line 295,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 298,col 46)",
        "(line 299,col 9)-(line 299,col 52)",
        "(line 300,col 9)-(line 305,col 9)",
        "(line 308,col 9)-(line 308,col 46)",
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 46)",
        "(line 313,col 9)-(line 313,col 52)",
        "(line 314,col 9)-(line 319,col 9)",
        "(line 322,col 9)-(line 322,col 46)",
        "(line 323,col 9)-(line 325,col 9)",
        "(line 327,col 9)-(line 327,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 338,
      "end_line": 341,
      "comment": "\n     * Parses a string to produce a object.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed object.\n     * @see java.text.Format#parseObject(java.lang.String, java.text.ParsePosition)\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 34)"
      ]
    }
  ]
}