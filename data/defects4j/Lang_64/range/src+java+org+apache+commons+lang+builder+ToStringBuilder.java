{
  "filepath": "/tmp/Lang-64b/src/java/org/apache/commons/lang/builder/ToStringBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ToStringBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 92,
      "end_line": 1042,
      "comment": "\n * \u003cp\u003eAssists in implementing {@link Object#toString()} methods.\u003c/p\u003e\n *\n * \u003cp\u003eThis class enables a good and consistent \u003ccode\u003etoString()\u003c/code\u003e to be built for any\n * class or object. This class aims to simplify the process by:\u003c/p\u003e\n * \u003cul\u003e\n *  \u003cli\u003eallowing field names\u003c/li\u003e\n *  \u003cli\u003ehandling all types consistently\u003c/li\u003e\n *  \u003cli\u003ehandling nulls consistently\u003c/li\u003e\n *  \u003cli\u003eoutputting arrays and multi-dimensional arrays\u003c/li\u003e\n *  \u003cli\u003eenabling the detail level to be controlled for Objects and Collections\u003c/li\u003e\n *  \u003cli\u003ehandling class hierarchies\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003eTo use this class write code as follows:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * public class Person {\n *   String name;\n *   int age;\n *   boolean smoker;\n * \n *   ...\n * \n *   public String toString() {\n *     return new ToStringBuilder(this).\n *       append(\"name\", name).\n *       append(\"age\", age).\n *       append(\"smoker\", smoker).\n *       toString();\n *   }\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003eThis will produce a toString of the format:\n * \u003ccode\u003ePerson@7f54[name\u003dStephen,age\u003d29,smoker\u003dfalse]\u003c/code\u003e\u003c/p\u003e\n * \n * \u003cp\u003eTo add the superclass \u003ccode\u003etoString\u003c/code\u003e, use {@link #appendSuper}.\n * To append the \u003ccode\u003etoString\u003c/code\u003e from an object that is delegated\n * to (or any other object), use {@link #appendToString}.\u003c/p\u003e\n *\n * \u003cp\u003eAlternatively, there is a method that uses reflection to determine\n * the fields to test. Because these fields are usually private, the method, \n * \u003ccode\u003ereflectionToString\u003c/code\u003e, uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to\n * change the visibility of the fields. This will fail under a security manager,\n * unless the appropriate permissions are set up correctly. It is also\n * slower than testing explicitly.\u003c/p\u003e\n *\n * \u003cp\u003eA typical invocation for this method would look like:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * public String toString() {\n *   return ToStringBuilder.reflectionToString(this);\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003eYou can also use the builder to debug 3rd party objects:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * System.out.println(\"An object: \" + ToStringBuilder.reflectionToString(anObject));\n * \u003c/pre\u003e\n * \n * \u003cp\u003eThe exact format of the \u003ccode\u003etoString\u003c/code\u003e is determined by\n * the {@link ToStringStyle} passed into the constructor.\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @author Gary Gregory\n * @author Pete Gieser\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "defaultStyle"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * The default style of output to use.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.getDefaultStyle()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * \u003cp\u003eGets the default \u003ccode\u003eToStringStyle\u003c/code\u003e to use.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis could allow the \u003ccode\u003eToStringStyle\u003c/code\u003e to be\n     * controlled for an entire application with one call.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis might be used to have a verbose\n     * \u003ccode\u003eToStringStyle\u003c/code\u003e during development and a compact\n     * \u003ccode\u003eToStringStyle\u003c/code\u003e in production.\u003c/p\u003e\n     * \n     * @return the default \u003ccode\u003eToStringStyle\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(java.lang.Object)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * \u003cp\u003eForwards to \u003ccode\u003eReflectionToStringBuilder\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @see ReflectionToStringBuilder#toString(Object)\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(java.lang.Object, org.apache.commons.lang.builder.ToStringStyle)",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * \u003cp\u003eForwards to \u003ccode\u003eReflectionToStringBuilder\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @see ReflectionToStringBuilder#toString(Object,ToStringStyle)\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(java.lang.Object, org.apache.commons.lang.builder.ToStringStyle, boolean)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * \u003cp\u003eForwards to \u003ccode\u003eReflectionToStringBuilder\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @see ReflectionToStringBuilder#toString(Object,ToStringStyle,boolean)\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(java.lang.Object, org.apache.commons.lang.builder.ToStringStyle, boolean, java.lang.Class)",
      "begin_line": 150,
      "end_line": 156,
      "comment": "\n     * \u003cp\u003eForwards to \u003ccode\u003eReflectionToStringBuilder\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @see ReflectionToStringBuilder#toString(Object,ToStringStyle,boolean,boolean,Class)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.setDefaultStyle(org.apache.commons.lang.builder.ToStringStyle)",
      "begin_line": 164,
      "end_line": 169,
      "comment": "\n     * \u003cp\u003eSets the default \u003ccode\u003eToStringStyle\u003c/code\u003e to use.\u003c/p\u003e\n     * \n     * @param style  the default \u003ccode\u003eToStringStyle\u003c/code\u003e\n     * @throws IllegalArgumentException if the style is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": "\n     * Current toString buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "object"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": "\n     * The object being output.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "style"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": "\n     * The style of output to use.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.ToStringBuilder(java.lang.Object)",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * \u003cp\u003eConstructor for \u003ccode\u003eToStringBuilder\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor outputs using the default style set with\n     * \u003ccode\u003esetDefaultStyle\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param object  the Object to build a \u003ccode\u003etoString\u003c/code\u003e for\n     * @throws IllegalArgumentException  if the Object passed in is\n     *  \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.ToStringBuilder(java.lang.Object, org.apache.commons.lang.builder.ToStringStyle)",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     * \u003cp\u003eConstructor for \u003ccode\u003eToStringBuilder\u003c/code\u003e specifying the\n     * output style.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the style is \u003ccode\u003enull\u003c/code\u003e, the default style is used.\u003c/p\u003e\n     * \n     * @param object  the Object to build a \u003ccode\u003etoString\u003c/code\u003e for\n     * @param style  the style of the \u003ccode\u003etoString\u003c/code\u003e to create,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException  if the Object passed in is\n     *  \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.ToStringBuilder(java.lang.Object, org.apache.commons.lang.builder.ToStringStyle, java.lang.StringBuffer)",
      "begin_line": 229,
      "end_line": 241,
      "comment": "\n     * \u003cp\u003eConstructor for \u003ccode\u003eToStringBuilder\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the style is \u003ccode\u003enull\u003c/code\u003e, the default style is used.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the buffer is \u003ccode\u003enull\u003c/code\u003e, a new one is created.\u003c/p\u003e\n     * \n     * @param object  the Object to build a \u003ccode\u003etoString\u003c/code\u003e for\n     * @param style  the style of the \u003ccode\u003etoString\u003c/code\u003e to create,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate, may be\n     *  \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 29)",
        "(line 237,col 9)-(line 237,col 27)",
        "(line 238,col 9)-(line 238,col 29)",
        "(line 240,col 9)-(line 240,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(boolean)",
      "begin_line": 252,
      "end_line": 255,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 42)",
        "(line 254,col 9)-(line 254,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(boolean[])",
      "begin_line": 266,
      "end_line": 269,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 48)",
        "(line 268,col 9)-(line 268,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(byte)",
      "begin_line": 280,
      "end_line": 283,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 42)",
        "(line 282,col 9)-(line 282,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(byte[])",
      "begin_line": 294,
      "end_line": 297,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 48)",
        "(line 296,col 9)-(line 296,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(char)",
      "begin_line": 308,
      "end_line": 311,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 42)",
        "(line 310,col 9)-(line 310,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(char[])",
      "begin_line": 322,
      "end_line": 325,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 48)",
        "(line 324,col 9)-(line 324,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(double)",
      "begin_line": 336,
      "end_line": 339,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 42)",
        "(line 338,col 9)-(line 338,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(double[])",
      "begin_line": 350,
      "end_line": 353,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 48)",
        "(line 352,col 9)-(line 352,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(float)",
      "begin_line": 364,
      "end_line": 367,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 42)",
        "(line 366,col 9)-(line 366,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(float[])",
      "begin_line": 378,
      "end_line": 381,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 48)",
        "(line 380,col 9)-(line 380,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(int)",
      "begin_line": 392,
      "end_line": 395,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 42)",
        "(line 394,col 9)-(line 394,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(int[])",
      "begin_line": 406,
      "end_line": 409,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 48)",
        "(line 408,col 9)-(line 408,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(long)",
      "begin_line": 420,
      "end_line": 423,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 42)",
        "(line 422,col 9)-(line 422,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(long[])",
      "begin_line": 434,
      "end_line": 437,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 48)",
        "(line 436,col 9)-(line 436,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.Object)",
      "begin_line": 448,
      "end_line": 451,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param object  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 49)",
        "(line 450,col 9)-(line 450,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.Object[])",
      "begin_line": 462,
      "end_line": 465,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 48)",
        "(line 464,col 9)-(line 464,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(short)",
      "begin_line": 476,
      "end_line": 479,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 42)",
        "(line 478,col 9)-(line 478,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(short[])",
      "begin_line": 490,
      "end_line": 493,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 48)",
        "(line 492,col 9)-(line 492,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, boolean)",
      "begin_line": 503,
      "end_line": 506,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 47)",
        "(line 505,col 9)-(line 505,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, boolean[])",
      "begin_line": 516,
      "end_line": 519,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 53)",
        "(line 518,col 9)-(line 518,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, boolean[], boolean)",
      "begin_line": 536,
      "end_line": 539,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 89)",
        "(line 538,col 9)-(line 538,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, byte)",
      "begin_line": 549,
      "end_line": 552,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003ebyte\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 47)",
        "(line 551,col 9)-(line 551,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, byte[])",
      "begin_line": 561,
      "end_line": 564,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 53)",
        "(line 563,col 9)-(line 563,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, byte[], boolean)",
      "begin_line": 581,
      "end_line": 584,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 89)",
        "(line 583,col 9)-(line 583,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, char)",
      "begin_line": 594,
      "end_line": 597,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 47)",
        "(line 596,col 9)-(line 596,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, char[])",
      "begin_line": 607,
      "end_line": 610,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 53)",
        "(line 609,col 9)-(line 609,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, char[], boolean)",
      "begin_line": 627,
      "end_line": 630,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 89)",
        "(line 629,col 9)-(line 629,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, double)",
      "begin_line": 640,
      "end_line": 643,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 47)",
        "(line 642,col 9)-(line 642,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, double[])",
      "begin_line": 653,
      "end_line": 656,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 654,col 9)-(line 654,col 53)",
        "(line 655,col 9)-(line 655,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, double[], boolean)",
      "begin_line": 673,
      "end_line": 676,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 674,col 9)-(line 674,col 89)",
        "(line 675,col 9)-(line 675,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, float)",
      "begin_line": 686,
      "end_line": 689,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003efloat\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 687,col 9)-(line 687,col 47)",
        "(line 688,col 9)-(line 688,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, float[])",
      "begin_line": 699,
      "end_line": 702,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 700,col 53)",
        "(line 701,col 9)-(line 701,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, float[], boolean)",
      "begin_line": 719,
      "end_line": 722,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 89)",
        "(line 721,col 9)-(line 721,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, int)",
      "begin_line": 732,
      "end_line": 735,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 733,col 9)-(line 733,col 47)",
        "(line 734,col 9)-(line 734,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, int[])",
      "begin_line": 745,
      "end_line": 748,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 53)",
        "(line 747,col 9)-(line 747,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, int[], boolean)",
      "begin_line": 765,
      "end_line": 768,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 766,col 9)-(line 766,col 89)",
        "(line 767,col 9)-(line 767,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, long)",
      "begin_line": 778,
      "end_line": 781,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 779,col 9)-(line 779,col 47)",
        "(line 780,col 9)-(line 780,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, long[])",
      "begin_line": 791,
      "end_line": 794,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 792,col 9)-(line 792,col 53)",
        "(line 793,col 9)-(line 793,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, long[], boolean)",
      "begin_line": 811,
      "end_line": 814,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 812,col 9)-(line 812,col 89)",
        "(line 813,col 9)-(line 813,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, java.lang.Object)",
      "begin_line": 824,
      "end_line": 827,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param object  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 825,col 9)-(line 825,col 54)",
        "(line 826,col 9)-(line 826,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, java.lang.Object, boolean)",
      "begin_line": 839,
      "end_line": 842,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param object  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail,\n     *  \u003ccode\u003efalse\u003c/code\u003e for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 840,col 9)-(line 840,col 90)",
        "(line 841,col 9)-(line 841,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, java.lang.Object[])",
      "begin_line": 852,
      "end_line": 855,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 853,col 9)-(line 853,col 53)",
        "(line 854,col 9)-(line 854,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, java.lang.Object[], boolean)",
      "begin_line": 872,
      "end_line": 875,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 873,col 9)-(line 873,col 89)",
        "(line 874,col 9)-(line 874,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, short)",
      "begin_line": 885,
      "end_line": 888,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eshort\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 886,col 9)-(line 886,col 47)",
        "(line 887,col 9)-(line 887,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, short[])",
      "begin_line": 898,
      "end_line": 901,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 899,col 9)-(line 899,col 53)",
        "(line 900,col 9)-(line 900,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, short[], boolean)",
      "begin_line": 918,
      "end_line": 921,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 919,col 9)-(line 919,col 89)",
        "(line 920,col 9)-(line 920,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.appendAsObjectToString(java.lang.Object)",
      "begin_line": 932,
      "end_line": 935,
      "comment": "\n     * \u003cp\u003eAppends with the same format as the default \u003ccode\u003eObject toString()\n     * \u003c/code\u003e method. Appends the class name followed by \n     * {@link System#identityHashCode(java.lang.Object)}.\u003c/p\u003e\n     * \n     * @param object  the \u003ccode\u003eObject\u003c/code\u003e whose class name and id to output\n     * @return this\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 933,col 9)-(line 933,col 75)",
        "(line 934,col 9)-(line 934,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.appendSuper(java.lang.String)",
      "begin_line": 951,
      "end_line": 956,
      "comment": "\n     * \u003cp\u003eAppend the \u003ccode\u003etoString\u003c/code\u003e from the superclass.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method assumes that the superclass uses the same \u003ccode\u003eToStringStyle\u003c/code\u003e\n     * as this one.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf \u003ccode\u003esuperToString\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, no change is made.\u003c/p\u003e\n     *\n     * @param superToString  the result of \u003ccode\u003esuper.toString()\u003c/code\u003e\n     * @return this\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 952,col 9)-(line 954,col 9)",
        "(line 955,col 9)-(line 955,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.appendToString(java.lang.String)",
      "begin_line": 985,
      "end_line": 990,
      "comment": "\n     * \u003cp\u003eAppend the \u003ccode\u003etoString\u003c/code\u003e from another object.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method is useful where a class delegates most of the implementation of\n     * its properties to another class. You can then call \u003ccode\u003etoString()\u003c/code\u003e on\n     * the other class and pass the result into this method.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   private AnotherObject delegate;\n     *   private String fieldInThisClass;\n     * \n     *   public String toString() {\n     *     return new ToStringBuilder(this).\n     *       appendToString(delegate.toString()).\n     *       append(fieldInThisClass).\n     *       toString();\n     *   }\u003c/pre\u003e\n     * \n     * \u003cp\u003eThis method assumes that the other object uses the same \u003ccode\u003eToStringStyle\u003c/code\u003e\n     * as this one.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the \u003ccode\u003etoString\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, no change is made.\u003c/p\u003e\n     *\n     * @param toString  the result of \u003ccode\u003etoString()\u003c/code\u003e on another object\n     * @return this\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 986,col 9)-(line 988,col 9)",
        "(line 989,col 9)-(line 989,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.getObject()",
      "begin_line": 998,
      "end_line": 1000,
      "comment": "\n     * \u003cp\u003eReturns the \u003ccode\u003eObject\u003c/code\u003e being output.\u003c/p\u003e\n     * \n     * @return The object being output.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 999,col 9)-(line 999,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.getStringBuffer()",
      "begin_line": 1007,
      "end_line": 1009,
      "comment": "\n     * \u003cp\u003eGets the \u003ccode\u003eStringBuffer\u003c/code\u003e being populated.\u003c/p\u003e\n     * \n     * @return the \u003ccode\u003eStringBuffer\u003c/code\u003e being populated\n     ",
      "child_ranges": [
        "(line 1008,col 9)-(line 1008,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.getStyle()",
      "begin_line": 1019,
      "end_line": 1021,
      "comment": "\n     * \u003cp\u003eGets the \u003ccode\u003eToStringStyle\u003c/code\u003e being used.\u003c/p\u003e\n     * \n     * @return the \u003ccode\u003eToStringStyle\u003c/code\u003e being used\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1020,col 9)-(line 1020,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.toString()",
      "begin_line": 1033,
      "end_line": 1040,
      "comment": "\n     * \u003cp\u003eReturns the built \u003ccode\u003etoString\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method appends the end of data indicator, and can only be called once.\n     * Use {@link #getStringBuffer} to get the current string state.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the object is \u003ccode\u003enull\u003c/code\u003e, return the style\u0027s \u003ccode\u003enullText\u003c/code\u003e\u003c/p\u003e\n     * \n     * @return the String \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1034,col 9)-(line 1038,col 9)",
        "(line 1039,col 9)-(line 1039,col 49)"
      ]
    }
  ]
}