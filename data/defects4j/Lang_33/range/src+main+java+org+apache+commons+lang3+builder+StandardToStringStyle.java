{
  "filepath": "/tmp/Lang-33b/src/main/java/org/apache/commons/lang3/builder/StandardToStringStyle.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.ToStringStyle"
      ],
      "begin_line": 34,
      "end_line": 563,
      "comment": "\n * \u003cp\u003eWorks with {@link ToStringBuilder} to create a \u003ccode\u003etoString\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eThis class is intended to be used as a singleton.\n * There is no need to instantiate a new style each time.\n * Simply instantiate the class once, customize the values as required, and\n * store the result in a public static final variable for the rest of the\n * program to access.\u003c/p\u003e\n *\n * @author Apache Software Foundation\n * @author Pete Gieser\n * @author Gary Gregory\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.StandardToStringStyle()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * \u003cp\u003eConstructor.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.isUseClassName()",
      "begin_line": 57,
      "end_line": 60,
      "comment": "\n     * \u003cp\u003eGets whether to use the class name.\u003c/p\u003e\n     *\n     * @return the current useClassName flag\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setUseClassName(boolean)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\n     * \u003cp\u003eSets whether to use the class name.\u003c/p\u003e\n     *\n     * @param useClassName  the new useClassName flag\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.isUseShortClassName()",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * \u003cp\u003eGets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @return the current useShortClassName flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setUseShortClassName(boolean)",
      "begin_line": 91,
      "end_line": 94,
      "comment": "\n     * \u003cp\u003eSets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @param useShortClassName  the new useShortClassName flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.isUseIdentityHashCode()",
      "begin_line": 102,
      "end_line": 105,
      "comment": "\n     * \u003cp\u003eGets whether to use the identity hash code.\u003c/p\u003e\n     * @return the current useIdentityHashCode flag\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setUseIdentityHashCode(boolean)",
      "begin_line": 112,
      "end_line": 115,
      "comment": "\n     * \u003cp\u003eSets whether to use the identity hash code.\u003c/p\u003e\n     *\n     * @param useIdentityHashCode  the new useIdentityHashCode flag\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.isUseFieldNames()",
      "begin_line": 124,
      "end_line": 127,
      "comment": "\n     * \u003cp\u003eGets whether to use the field names passed in.\u003c/p\u003e\n     *\n     * @return the current useFieldNames flag\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setUseFieldNames(boolean)",
      "begin_line": 134,
      "end_line": 137,
      "comment": "\n     * \u003cp\u003eSets whether to use the field names passed in.\u003c/p\u003e\n     *\n     * @param useFieldNames  the new useFieldNames flag\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.isDefaultFullDetail()",
      "begin_line": 147,
      "end_line": 150,
      "comment": "\n     * \u003cp\u003eGets whether to use full detail when the caller doesn\u0027t\n     * specify.\u003c/p\u003e\n     *\n     * @return the current defaultFullDetail flag\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setDefaultFullDetail(boolean)",
      "begin_line": 158,
      "end_line": 161,
      "comment": "\n     * \u003cp\u003eSets whether to use full detail when the caller doesn\u0027t\n     * specify.\u003c/p\u003e\n     *\n     * @param defaultFullDetail  the new defaultFullDetail flag\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.isArrayContentDetail()",
      "begin_line": 170,
      "end_line": 173,
      "comment": "\n     * \u003cp\u003eGets whether to output array content detail.\u003c/p\u003e\n     *\n     * @return the current array content detail setting\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setArrayContentDetail(boolean)",
      "begin_line": 180,
      "end_line": 183,
      "comment": "\n     * \u003cp\u003eSets whether to output array content detail.\u003c/p\u003e\n     *\n     * @param arrayContentDetail  the new arrayContentDetail flag\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.getArrayStart()",
      "begin_line": 192,
      "end_line": 195,
      "comment": "\n     * \u003cp\u003eGets the array start text.\u003c/p\u003e\n     *\n     * @return the current array start text\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setArrayStart(java.lang.String)",
      "begin_line": 205,
      "end_line": 208,
      "comment": "\n     * \u003cp\u003eSets the array start text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param arrayStart  the new array start text\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.getArrayEnd()",
      "begin_line": 217,
      "end_line": 220,
      "comment": "\n     * \u003cp\u003eGets the array end text.\u003c/p\u003e\n     *\n     * @return the current array end text\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setArrayEnd(java.lang.String)",
      "begin_line": 230,
      "end_line": 233,
      "comment": "\n     * \u003cp\u003eSets the array end text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param arrayEnd  the new array end text\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.getArraySeparator()",
      "begin_line": 242,
      "end_line": 245,
      "comment": "\n     * \u003cp\u003eGets the array separator text.\u003c/p\u003e\n     *\n     * @return the current array separator text\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setArraySeparator(java.lang.String)",
      "begin_line": 255,
      "end_line": 258,
      "comment": "\n     * \u003cp\u003eSets the array separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param arraySeparator  the new array separator text\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.getContentStart()",
      "begin_line": 267,
      "end_line": 270,
      "comment": "\n     * \u003cp\u003eGets the content start text.\u003c/p\u003e\n     *\n     * @return the current content start text\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setContentStart(java.lang.String)",
      "begin_line": 280,
      "end_line": 283,
      "comment": "\n     * \u003cp\u003eSets the content start text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param contentStart  the new content start text\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.getContentEnd()",
      "begin_line": 292,
      "end_line": 295,
      "comment": "\n     * \u003cp\u003eGets the content end text.\u003c/p\u003e\n     *\n     * @return the current content end text\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setContentEnd(java.lang.String)",
      "begin_line": 305,
      "end_line": 308,
      "comment": "\n     * \u003cp\u003eSets the content end text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param contentEnd  the new content end text\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.getFieldNameValueSeparator()",
      "begin_line": 317,
      "end_line": 320,
      "comment": "\n     * \u003cp\u003eGets the field name value separator text.\u003c/p\u003e\n     *\n     * @return the current field name value separator text\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setFieldNameValueSeparator(java.lang.String)",
      "begin_line": 330,
      "end_line": 333,
      "comment": "\n     * \u003cp\u003eSets the field name value separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param fieldNameValueSeparator  the new field name value separator text\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.getFieldSeparator()",
      "begin_line": 342,
      "end_line": 345,
      "comment": "\n     * \u003cp\u003eGets the field separator text.\u003c/p\u003e\n     *\n     * @return the current field separator text\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setFieldSeparator(java.lang.String)",
      "begin_line": 355,
      "end_line": 358,
      "comment": "\n     * \u003cp\u003eSets the field separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param fieldSeparator  the new field separator text\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.isFieldSeparatorAtStart()",
      "begin_line": 369,
      "end_line": 372,
      "comment": "\n     * \u003cp\u003eGets whether the field separator should be added at the start \n     * of each buffer.\u003c/p\u003e\n     * \n     * @return the fieldSeparatorAtStart flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setFieldSeparatorAtStart(boolean)",
      "begin_line": 381,
      "end_line": 384,
      "comment": "\n     * \u003cp\u003eSets whether the field separator should be added at the start \n     * of each buffer.\u003c/p\u003e\n     * \n     * @param fieldSeparatorAtStart  the fieldSeparatorAtStart flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.isFieldSeparatorAtEnd()",
      "begin_line": 395,
      "end_line": 398,
      "comment": "\n     * \u003cp\u003eGets whether the field separator should be added at the end \n     * of each buffer.\u003c/p\u003e\n     * \n     * @return fieldSeparatorAtEnd flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setFieldSeparatorAtEnd(boolean)",
      "begin_line": 407,
      "end_line": 410,
      "comment": "\n     * \u003cp\u003eSets whether the field separator should be added at the end \n     * of each buffer.\u003c/p\u003e\n     * \n     * @param fieldSeparatorAtEnd  the fieldSeparatorAtEnd flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.getNullText()",
      "begin_line": 419,
      "end_line": 422,
      "comment": "\n     * \u003cp\u003eGets the text to output when \u003ccode\u003enull\u003c/code\u003e found.\u003c/p\u003e\n     *\n     * @return the current text to output when \u003ccode\u003enull\u003c/code\u003e found\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setNullText(java.lang.String)",
      "begin_line": 432,
      "end_line": 435,
      "comment": "\n     * \u003cp\u003eSets the text to output when \u003ccode\u003enull\u003c/code\u003e found.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param nullText  the new text to output when \u003ccode\u003enull\u003c/code\u003e found\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.getSizeStartText()",
      "begin_line": 447,
      "end_line": 450,
      "comment": "\n     * \u003cp\u003eGets the text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or \u003ccode\u003eArray\u003c/code\u003e size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * @return the current start of size text\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setSizeStartText(java.lang.String)",
      "begin_line": 463,
      "end_line": 466,
      "comment": "\n     * \u003cp\u003eSets the start text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or \u003ccode\u003eArray\u003c/code\u003e size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param sizeStartText  the new start of size text\n     ",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.getSizeEndText()",
      "begin_line": 478,
      "end_line": 481,
      "comment": "\n     * Gets the end text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or \u003ccode\u003eArray\u003c/code\u003e size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * @return the current end of size text\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setSizeEndText(java.lang.String)",
      "begin_line": 494,
      "end_line": 497,
      "comment": "\n     * \u003cp\u003eSets the end text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or \u003ccode\u003eArray\u003c/code\u003e size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param sizeEndText  the new end of size text\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.getSummaryObjectStartText()",
      "begin_line": 509,
      "end_line": 512,
      "comment": "\n     * \u003cp\u003eGets the start text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cP\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * @return the current start of summary text\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setSummaryObjectStartText(java.lang.String)",
      "begin_line": 525,
      "end_line": 528,
      "comment": "\n     * \u003cp\u003eSets the start text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param summaryObjectStartText  the new start of summary text\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.getSummaryObjectEndText()",
      "begin_line": 540,
      "end_line": 543,
      "comment": "\n     * \u003cp\u003eGets the end text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * @return the current end of summary text\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.StandardToStringStyle.setSummaryObjectEndText(java.lang.String)",
      "begin_line": 556,
      "end_line": 559,
      "comment": "\n     * \u003cp\u003eSets the end text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param summaryObjectEndText  the new end of summary text\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 60)"
      ]
    }
  ]
}