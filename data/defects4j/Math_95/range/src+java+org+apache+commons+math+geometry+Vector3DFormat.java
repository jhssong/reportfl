{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/geometry/Vector3DFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Vector3DFormat",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.util.CompositeFormat"
      ],
      "begin_line": 41,
      "end_line": 337,
      "comment": "\n * Formats a 3D vector in components list format \"{x; y; z}\".\n * \u003cp\u003eThe prefix and suffix \"{\" and \"}\" and the separator \"; \" can be replaced by\n * any user-defined strings. The number format for components can be configured.\u003c/p\u003e\n * \u003cp\u003eWhite space is ignored at parse time, even if it is in the prefix, suffix\n * or separator specifications. So even if the default separator does include a space\n * character that is used at format time, both input string \"{1;1;1}\" and\n * \" { 1 ; 1 ; 1 } \" will be parsed without error and the same vector will be\n * returned. In the second case, however, the parse position after parsing will be\n * just after the closing curly brace, i.e. just before the trailing space.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PREFIX"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The default prefix: \"{\". "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SUFFIX"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " The default suffix: \"}\". "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SEPARATOR"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " The default separator: \", \". "
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "suffix"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Suffix. "
    },
    {
      "type": "field",
      "varNames": [
        "separator"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Separator. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedPrefix"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Trimmed prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedSuffix"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Trimmed suffix. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedSeparator"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Trimmed separator. "
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " The format used for components. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.Vector3DFormat()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Create an instance with default settings.\n     * \u003cp\u003eThe instance uses the default prefix, suffix and separator:\n     * \"{\", \"}\", and \"; \" and the default number format for components.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 90)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.Vector3DFormat(java.text.NumberFormat)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Create an instance with a custom number format for components.\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.Vector3DFormat(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 99,
      "end_line": 102,
      "comment": "\n     * Create an instance with custom prefix, suffix and separator.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param separator separator to use instead of the default \"; \"\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.Vector3DFormat(java.lang.String, java.lang.String, java.lang.String, java.text.NumberFormat)",
      "begin_line": 112,
      "end_line": 121,
      "comment": "\n     * Create an instance with custom prefix, suffix, separator and format\n     * for components.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param separator separator to use instead of the default \"; \"\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 34)",
        "(line 115,col 9)-(line 115,col 34)",
        "(line 116,col 9)-(line 116,col 37)",
        "(line 117,col 9)-(line 117,col 41)",
        "(line 118,col 9)-(line 118,col 41)",
        "(line 119,col 9)-(line 119,col 44)",
        "(line 120,col 9)-(line 120,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getAvailableLocales()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * Get the set of locales for which 3D vectors formats are available.\n     * \u003cp\u003eThis is the same set as the {@link NumberFormat} set.\u003c/p\u003e\n     * @return available 3D vector format locales.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getPrefix()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Get the format prefix.\n     * @return format prefix.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getSuffix()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Get the format suffix.\n     * @return format suffix.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getSeparator()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Get the format separator between components.\n     * @return format separator.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getFormat()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Get the components format.\n     * @return components format.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getInstance()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * Returns the default 3D vector format for the current locale.\n     * @return the default 3D vector format.\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getInstance(java.util.Locale)",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Returns the default 3D vector format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the 3D vector format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.formatVector3D(org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * This static method calls {@link #format(Object)} on a default instance of\n     * Vector3DFormat.\n     *\n     * @param v Vector3D object to format\n     * @return A formatted vector\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.format(org.apache.commons.math.geometry.Vector3D, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 200,
      "end_line": 221,
      "comment": "\n     * Formats a {@link Vector3D} object to produce a string.\n     * @param vector the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 29)",
        "(line 204,col 9)-(line 204,col 27)",
        "(line 207,col 9)-(line 207,col 34)",
        "(line 210,col 9)-(line 210,col 61)",
        "(line 211,col 9)-(line 211,col 37)",
        "(line 212,col 9)-(line 212,col 61)",
        "(line 213,col 9)-(line 213,col 37)",
        "(line 214,col 9)-(line 214,col 61)",
        "(line 217,col 9)-(line 217,col 34)",
        "(line 219,col 9)-(line 219,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 235,
      "end_line": 244,
      "comment": "\n     * Formats a object to produce a string.\n     * \u003cp\u003e\u003ccode\u003eobj\u003c/code\u003e must be a  {@link Vector3D} object. Any other type of\n     * object will result in an {@link IllegalArgumentException} being thrown.\u003c/p\u003e\n     * @param obj the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     * @see java.text.Format#format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)\n     * @throws IllegalArgumentException is \u003ccode\u003eobj\u003c/code\u003e is not a valid type.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 242,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.parse(java.lang.String)",
      "begin_line": 253,
      "end_line": 261,
      "comment": "\n     * Parses a string to produce a {@link Vector3D} object.\n     * @param source the string to parse\n     * @return the parsed {@link Vector3D} object.\n     * @exception ParseException if the beginning of the specified string\n     *            cannot be parsed.\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 59)",
        "(line 255,col 9)-(line 255,col 55)",
        "(line 256,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 269,
      "end_line": 324,
      "comment": "\n     * Parses a string to produce a {@link Vector3D} object.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed {@link Vector3D} object.\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 42)",
        "(line 273,col 9)-(line 273,col 46)",
        "(line 274,col 9)-(line 276,col 9)",
        "(line 279,col 9)-(line 279,col 46)",
        "(line 280,col 9)-(line 280,col 52)",
        "(line 281,col 9)-(line 286,col 9)",
        "(line 289,col 9)-(line 289,col 46)",
        "(line 290,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 46)",
        "(line 294,col 9)-(line 294,col 52)",
        "(line 295,col 9)-(line 300,col 9)",
        "(line 303,col 9)-(line 303,col 46)",
        "(line 304,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 307,col 46)",
        "(line 308,col 9)-(line 308,col 52)",
        "(line 309,col 9)-(line 314,col 9)",
        "(line 317,col 9)-(line 317,col 46)",
        "(line 318,col 9)-(line 320,col 9)",
        "(line 322,col 9)-(line 322,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\n     * Parses a string to produce a object.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed object.\n     * @see java.text.Format#parseObject(java.lang.String, java.text.ParsePosition)\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 34)"
      ]
    }
  ]
}