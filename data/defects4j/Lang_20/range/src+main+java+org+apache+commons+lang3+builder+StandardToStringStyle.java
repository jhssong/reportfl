{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/builder/StandardToStringStyle.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.ToStringStyle"
      ],
      "begin_line": 31,
      "end_line": 560,
      "comment": "\n * \u003cp\u003eWorks with {@link ToStringBuilder} to create a \u003ccode\u003etoString\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eThis class is intended to be used as a singleton.\n * There is no need to instantiate a new style each time.\n * Simply instantiate the class once, customize the values as required, and\n * store the result in a public static final variable for the rest of the\n * program to access.\u003c/p\u003e\n *\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.StandardToStringStyle()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * \u003cp\u003eConstructor.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.isUseClassName()",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * \u003cp\u003eGets whether to use the class name.\u003c/p\u003e\n     *\n     * @return the current useClassName flag\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setUseClassName(boolean)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * \u003cp\u003eSets whether to use the class name.\u003c/p\u003e\n     *\n     * @param useClassName  the new useClassName flag\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.isUseShortClassName()",
      "begin_line": 77,
      "end_line": 80,
      "comment": "\n     * \u003cp\u003eGets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @return the current useShortClassName flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setUseShortClassName(boolean)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "\n     * \u003cp\u003eSets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @param useShortClassName  the new useShortClassName flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.isUseIdentityHashCode()",
      "begin_line": 99,
      "end_line": 102,
      "comment": "\n     * \u003cp\u003eGets whether to use the identity hash code.\u003c/p\u003e\n     * @return the current useIdentityHashCode flag\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setUseIdentityHashCode(boolean)",
      "begin_line": 109,
      "end_line": 112,
      "comment": "\n     * \u003cp\u003eSets whether to use the identity hash code.\u003c/p\u003e\n     *\n     * @param useIdentityHashCode  the new useIdentityHashCode flag\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.isUseFieldNames()",
      "begin_line": 121,
      "end_line": 124,
      "comment": "\n     * \u003cp\u003eGets whether to use the field names passed in.\u003c/p\u003e\n     *\n     * @return the current useFieldNames flag\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setUseFieldNames(boolean)",
      "begin_line": 131,
      "end_line": 134,
      "comment": "\n     * \u003cp\u003eSets whether to use the field names passed in.\u003c/p\u003e\n     *\n     * @param useFieldNames  the new useFieldNames flag\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.isDefaultFullDetail()",
      "begin_line": 144,
      "end_line": 147,
      "comment": "\n     * \u003cp\u003eGets whether to use full detail when the caller doesn\u0027t\n     * specify.\u003c/p\u003e\n     *\n     * @return the current defaultFullDetail flag\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setDefaultFullDetail(boolean)",
      "begin_line": 155,
      "end_line": 158,
      "comment": "\n     * \u003cp\u003eSets whether to use full detail when the caller doesn\u0027t\n     * specify.\u003c/p\u003e\n     *\n     * @param defaultFullDetail  the new defaultFullDetail flag\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.isArrayContentDetail()",
      "begin_line": 167,
      "end_line": 170,
      "comment": "\n     * \u003cp\u003eGets whether to output array content detail.\u003c/p\u003e\n     *\n     * @return the current array content detail setting\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setArrayContentDetail(boolean)",
      "begin_line": 177,
      "end_line": 180,
      "comment": "\n     * \u003cp\u003eSets whether to output array content detail.\u003c/p\u003e\n     *\n     * @param arrayContentDetail  the new arrayContentDetail flag\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.getArrayStart()",
      "begin_line": 189,
      "end_line": 192,
      "comment": "\n     * \u003cp\u003eGets the array start text.\u003c/p\u003e\n     *\n     * @return the current array start text\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setArrayStart(java.lang.String)",
      "begin_line": 202,
      "end_line": 205,
      "comment": "\n     * \u003cp\u003eSets the array start text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param arrayStart  the new array start text\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.getArrayEnd()",
      "begin_line": 214,
      "end_line": 217,
      "comment": "\n     * \u003cp\u003eGets the array end text.\u003c/p\u003e\n     *\n     * @return the current array end text\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setArrayEnd(java.lang.String)",
      "begin_line": 227,
      "end_line": 230,
      "comment": "\n     * \u003cp\u003eSets the array end text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param arrayEnd  the new array end text\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.getArraySeparator()",
      "begin_line": 239,
      "end_line": 242,
      "comment": "\n     * \u003cp\u003eGets the array separator text.\u003c/p\u003e\n     *\n     * @return the current array separator text\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setArraySeparator(java.lang.String)",
      "begin_line": 252,
      "end_line": 255,
      "comment": "\n     * \u003cp\u003eSets the array separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param arraySeparator  the new array separator text\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.getContentStart()",
      "begin_line": 264,
      "end_line": 267,
      "comment": "\n     * \u003cp\u003eGets the content start text.\u003c/p\u003e\n     *\n     * @return the current content start text\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setContentStart(java.lang.String)",
      "begin_line": 277,
      "end_line": 280,
      "comment": "\n     * \u003cp\u003eSets the content start text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param contentStart  the new content start text\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.getContentEnd()",
      "begin_line": 289,
      "end_line": 292,
      "comment": "\n     * \u003cp\u003eGets the content end text.\u003c/p\u003e\n     *\n     * @return the current content end text\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setContentEnd(java.lang.String)",
      "begin_line": 302,
      "end_line": 305,
      "comment": "\n     * \u003cp\u003eSets the content end text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param contentEnd  the new content end text\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.getFieldNameValueSeparator()",
      "begin_line": 314,
      "end_line": 317,
      "comment": "\n     * \u003cp\u003eGets the field name value separator text.\u003c/p\u003e\n     *\n     * @return the current field name value separator text\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setFieldNameValueSeparator(java.lang.String)",
      "begin_line": 327,
      "end_line": 330,
      "comment": "\n     * \u003cp\u003eSets the field name value separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param fieldNameValueSeparator  the new field name value separator text\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.getFieldSeparator()",
      "begin_line": 339,
      "end_line": 342,
      "comment": "\n     * \u003cp\u003eGets the field separator text.\u003c/p\u003e\n     *\n     * @return the current field separator text\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setFieldSeparator(java.lang.String)",
      "begin_line": 352,
      "end_line": 355,
      "comment": "\n     * \u003cp\u003eSets the field separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param fieldSeparator  the new field separator text\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.isFieldSeparatorAtStart()",
      "begin_line": 366,
      "end_line": 369,
      "comment": "\n     * \u003cp\u003eGets whether the field separator should be added at the start \n     * of each buffer.\u003c/p\u003e\n     * \n     * @return the fieldSeparatorAtStart flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setFieldSeparatorAtStart(boolean)",
      "begin_line": 378,
      "end_line": 381,
      "comment": "\n     * \u003cp\u003eSets whether the field separator should be added at the start \n     * of each buffer.\u003c/p\u003e\n     * \n     * @param fieldSeparatorAtStart  the fieldSeparatorAtStart flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.isFieldSeparatorAtEnd()",
      "begin_line": 392,
      "end_line": 395,
      "comment": "\n     * \u003cp\u003eGets whether the field separator should be added at the end \n     * of each buffer.\u003c/p\u003e\n     * \n     * @return fieldSeparatorAtEnd flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setFieldSeparatorAtEnd(boolean)",
      "begin_line": 404,
      "end_line": 407,
      "comment": "\n     * \u003cp\u003eSets whether the field separator should be added at the end \n     * of each buffer.\u003c/p\u003e\n     * \n     * @param fieldSeparatorAtEnd  the fieldSeparatorAtEnd flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.getNullText()",
      "begin_line": 416,
      "end_line": 419,
      "comment": "\n     * \u003cp\u003eGets the text to output when \u003ccode\u003enull\u003c/code\u003e found.\u003c/p\u003e\n     *\n     * @return the current text to output when \u003ccode\u003enull\u003c/code\u003e found\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setNullText(java.lang.String)",
      "begin_line": 429,
      "end_line": 432,
      "comment": "\n     * \u003cp\u003eSets the text to output when \u003ccode\u003enull\u003c/code\u003e found.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param nullText  the new text to output when \u003ccode\u003enull\u003c/code\u003e found\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.getSizeStartText()",
      "begin_line": 444,
      "end_line": 447,
      "comment": "\n     * \u003cp\u003eGets the text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or \u003ccode\u003eArray\u003c/code\u003e size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * @return the current start of size text\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setSizeStartText(java.lang.String)",
      "begin_line": 460,
      "end_line": 463,
      "comment": "\n     * \u003cp\u003eSets the start text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or \u003ccode\u003eArray\u003c/code\u003e size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param sizeStartText  the new start of size text\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.getSizeEndText()",
      "begin_line": 475,
      "end_line": 478,
      "comment": "\n     * Gets the end text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or \u003ccode\u003eArray\u003c/code\u003e size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * @return the current end of size text\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setSizeEndText(java.lang.String)",
      "begin_line": 491,
      "end_line": 494,
      "comment": "\n     * \u003cp\u003eSets the end text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or \u003ccode\u003eArray\u003c/code\u003e size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param sizeEndText  the new end of size text\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.getSummaryObjectStartText()",
      "begin_line": 506,
      "end_line": 509,
      "comment": "\n     * \u003cp\u003eGets the start text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cP\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * @return the current start of summary text\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setSummaryObjectStartText(java.lang.String)",
      "begin_line": 522,
      "end_line": 525,
      "comment": "\n     * \u003cp\u003eSets the start text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param summaryObjectStartText  the new start of summary text\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.getSummaryObjectEndText()",
      "begin_line": 537,
      "end_line": 540,
      "comment": "\n     * \u003cp\u003eGets the end text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * @return the current end of summary text\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setSummaryObjectEndText(java.lang.String)",
      "begin_line": 553,
      "end_line": 556,
      "comment": "\n     * \u003cp\u003eSets the end text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param summaryObjectEndText  the new end of summary text\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 60)"
      ]
    }
  ]
}