{
  "filepath": "/tmp/Lang-64b/src/java/org/apache/commons/lang/builder/StandardToStringStyle.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.ToStringStyle"
      ],
      "begin_line": 33,
      "end_line": 544,
      "comment": "\n * \u003cp\u003eWorks with {@link ToStringBuilder} to create a \u003ccode\u003etoString\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eThis class is intended to be used as a singleton.\n * There is no need to instantiate a new style each time.\n * Simply instantiate the class once, customize the values as required, and\n * store the result in a public static final variable for the rest of the\n * program to access.\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @author Pete Gieser\n * @author Gary Gregory\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.StandardToStringStyle()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * \u003cp\u003eConstructor.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.isUseClassName()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * \u003cp\u003eGets whether to use the class name.\u003c/p\u003e\n     *\n     * @return the current useClassName flag\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setUseClassName(boolean)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * \u003cp\u003eSets whether to use the class name.\u003c/p\u003e\n     *\n     * @param useClassName  the new useClassName flag\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.isUseShortClassName()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * \u003cp\u003eGets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @return the current useShortClassName flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.isShortClassName()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * \u003cp\u003eGets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @return the current shortClassName flag\n     * @deprecated Use {@link #isUseShortClassName()}\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setUseShortClassName(boolean)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * \u003cp\u003eSets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @param useShortClassName  the new useShortClassName flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setShortClassName(boolean)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * \u003cp\u003eSets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @param shortClassName  the new shortClassName flag\n     * @deprecated Use {@link #setUseShortClassName(boolean)}\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.isUseIdentityHashCode()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * \u003cp\u003eGets whether to use the identity hash code.\u003c/p\u003e\n     * @return the current useIdentityHashCode flag\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setUseIdentityHashCode(boolean)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * \u003cp\u003eSets whether to use the identity hash code.\u003c/p\u003e\n     *\n     * @param useIdentityHashCode  the new useIdentityHashCode flag\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.isUseFieldNames()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * \u003cp\u003eGets whether to use the field names passed in.\u003c/p\u003e\n     *\n     * @return the current useFieldNames flag\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setUseFieldNames(boolean)",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * \u003cp\u003eSets whether to use the field names passed in.\u003c/p\u003e\n     *\n     * @param useFieldNames  the new useFieldNames flag\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.isDefaultFullDetail()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * \u003cp\u003eGets whether to use full detail when the caller doesn\u0027t\n     * specify.\u003c/p\u003e\n     *\n     * @return the current defaultFullDetail flag\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setDefaultFullDetail(boolean)",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * \u003cp\u003eSets whether to use full detail when the caller doesn\u0027t\n     * specify.\u003c/p\u003e\n     *\n     * @param defaultFullDetail  the new defaultFullDetail flag\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.isArrayContentDetail()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * \u003cp\u003eGets whether to output array content detail.\u003c/p\u003e\n     *\n     * @return the current array content detail setting\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setArrayContentDetail(boolean)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * \u003cp\u003eSets whether to output array content detail.\u003c/p\u003e\n     *\n     * @param arrayContentDetail  the new arrayContentDetail flag\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getArrayStart()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\n     * \u003cp\u003eGets the array start text.\u003c/p\u003e\n     *\n     * @return the current array start text\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setArrayStart(java.lang.String)",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n     * \u003cp\u003eSets the array start text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param arrayStart  the new array start text\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getArrayEnd()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * \u003cp\u003eGets the array end text.\u003c/p\u003e\n     *\n     * @return the current array end text\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setArrayEnd(java.lang.String)",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * \u003cp\u003eSets the array end text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param arrayEnd  the new array end text\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getArraySeparator()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n     * \u003cp\u003eGets the array separator text.\u003c/p\u003e\n     *\n     * @return the current array separator text\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setArraySeparator(java.lang.String)",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\n     * \u003cp\u003eSets the array separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param arraySeparator  the new array separator text\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getContentStart()",
      "begin_line": 270,
      "end_line": 272,
      "comment": "\n     * \u003cp\u003eGets the content start text.\u003c/p\u003e\n     *\n     * @return the current content start text\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setContentStart(java.lang.String)",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\n     * \u003cp\u003eSets the content start text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param contentStart  the new content start text\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getContentEnd()",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\n     * \u003cp\u003eGets the content end text.\u003c/p\u003e\n     *\n     * @return the current content end text\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setContentEnd(java.lang.String)",
      "begin_line": 305,
      "end_line": 307,
      "comment": "\n     * \u003cp\u003eSets the content end text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param contentEnd  the new content end text\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getFieldNameValueSeparator()",
      "begin_line": 316,
      "end_line": 318,
      "comment": "\n     * \u003cp\u003eGets the field name value separator text.\u003c/p\u003e\n     *\n     * @return the current field name value separator text\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setFieldNameValueSeparator(java.lang.String)",
      "begin_line": 328,
      "end_line": 330,
      "comment": "\n     * \u003cp\u003eSets the field name value separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param fieldNameValueSeparator  the new field name value separator text\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getFieldSeparator()",
      "begin_line": 339,
      "end_line": 341,
      "comment": "\n     * \u003cp\u003eGets the field separator text.\u003c/p\u003e\n     *\n     * @return the current field separator text\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setFieldSeparator(java.lang.String)",
      "begin_line": 351,
      "end_line": 353,
      "comment": "\n     * \u003cp\u003eSets the field separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param fieldSeparator  the new field separator text\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.isFieldSeparatorAtStart()",
      "begin_line": 364,
      "end_line": 366,
      "comment": "\n     * \u003cp\u003eGets whether the field separator should be added at the start \n     * of each buffer.\u003c/p\u003e\n     * \n     * @return the fieldSeparatorAtStart flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setFieldSeparatorAtStart(boolean)",
      "begin_line": 375,
      "end_line": 377,
      "comment": "\n     * \u003cp\u003eSets whether the field separator should be added at the start \n     * of each buffer.\u003c/p\u003e\n     * \n     * @param fieldSeparatorAtStart  the fieldSeparatorAtStart flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.isFieldSeparatorAtEnd()",
      "begin_line": 388,
      "end_line": 390,
      "comment": "\n     * \u003cp\u003eGets whether the field separator should be added at the end \n     * of each buffer.\u003c/p\u003e\n     * \n     * @return fieldSeparatorAtEnd flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setFieldSeparatorAtEnd(boolean)",
      "begin_line": 399,
      "end_line": 401,
      "comment": "\n     * \u003cp\u003eSets whether the field separator should be added at the end \n     * of each buffer.\u003c/p\u003e\n     * \n     * @param fieldSeparatorAtEnd  the fieldSeparatorAtEnd flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getNullText()",
      "begin_line": 410,
      "end_line": 412,
      "comment": "\n     * \u003cp\u003eGets the text to output when \u003ccode\u003enull\u003c/code\u003e found.\u003c/p\u003e\n     *\n     * @return the current text to output when \u003ccode\u003enull\u003c/code\u003e found\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setNullText(java.lang.String)",
      "begin_line": 422,
      "end_line": 424,
      "comment": "\n     * \u003cp\u003eSets the text to output when \u003ccode\u003enull\u003c/code\u003e found.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param nullText  the new text to output when \u003ccode\u003enull\u003c/code\u003e found\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getSizeStartText()",
      "begin_line": 436,
      "end_line": 438,
      "comment": "\n     * \u003cp\u003eGets the text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or \u003ccode\u003eArray\u003c/code\u003e size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * @return the current start of size text\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setSizeStartText(java.lang.String)",
      "begin_line": 451,
      "end_line": 453,
      "comment": "\n     * \u003cp\u003eSets the start text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or \u003ccode\u003eArray\u003c/code\u003e size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param sizeStartText  the new start of size text\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getSizeEndText()",
      "begin_line": 465,
      "end_line": 467,
      "comment": "\n     * Gets the end text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or \u003ccode\u003eArray\u003c/code\u003e size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * @return the current end of size text\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setSizeEndText(java.lang.String)",
      "begin_line": 480,
      "end_line": 482,
      "comment": "\n     * \u003cp\u003eSets the end text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or \u003ccode\u003eArray\u003c/code\u003e size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param sizeEndText  the new end of size text\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getSummaryObjectStartText()",
      "begin_line": 494,
      "end_line": 496,
      "comment": "\n     * \u003cp\u003eGets the start text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cP\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * @return the current start of summary text\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setSummaryObjectStartText(java.lang.String)",
      "begin_line": 509,
      "end_line": 511,
      "comment": "\n     * \u003cp\u003eSets the start text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param summaryObjectStartText  the new start of summary text\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getSummaryObjectEndText()",
      "begin_line": 523,
      "end_line": 525,
      "comment": "\n     * \u003cp\u003eGets the end text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * @return the current end of summary text\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setSummaryObjectEndText(java.lang.String)",
      "begin_line": 538,
      "end_line": 540,
      "comment": "\n     * \u003cp\u003eSets the end text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param summaryObjectEndText  the new end of summary text\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 60)"
      ]
    }
  ]
}