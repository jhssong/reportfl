{
  "filepath": "/tmp/Lang-40b/src/java/org/apache/commons/lang/builder/ToStringBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ToStringBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 92,
      "end_line": 1057,
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
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * \u003cp\u003eForwards to \u003ccode\u003eReflectionToStringBuilder\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param object  the Object to be output\n     * @return the String result\n     * @see ReflectionToStringBuilder#toString(Object)\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(java.lang.Object, org.apache.commons.lang.builder.ToStringStyle)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * \u003cp\u003eForwards to \u003ccode\u003eReflectionToStringBuilder\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param object  the Object to be output\n     * @param style  the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the String result\n     * @see ReflectionToStringBuilder#toString(Object,ToStringStyle)\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(java.lang.Object, org.apache.commons.lang.builder.ToStringStyle, boolean)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * \u003cp\u003eForwards to \u003ccode\u003eReflectionToStringBuilder\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param object  the Object to be output\n     * @param style  the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param outputTransients  whether to include transient fields\n     * @return the String result\n     * @see ReflectionToStringBuilder#toString(Object,ToStringStyle,boolean)\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(T, org.apache.commons.lang.builder.ToStringStyle, boolean, java.lang.Class\u003c? super T\u003e)",
      "begin_line": 164,
      "end_line": 170,
      "comment": "\n     * \u003cp\u003eForwards to \u003ccode\u003eReflectionToStringBuilder\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param object  the Object to be output\n     * @param style  the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param outputTransients  whether to include transient fields\n     * @param reflectUpToClass  the superclass to reflect up to (inclusive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the String result\n     * @see ReflectionToStringBuilder#toString(Object,ToStringStyle,boolean,boolean,Class)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.setDefaultStyle(org.apache.commons.lang.builder.ToStringStyle)",
      "begin_line": 178,
      "end_line": 183,
      "comment": "\n     * \u003cp\u003eSets the default \u003ccode\u003eToStringStyle\u003c/code\u003e to use.\u003c/p\u003e\n     * \n     * @param style  the default \u003ccode\u003eToStringStyle\u003c/code\u003e\n     * @throws IllegalArgumentException if the style is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": "\n     * Current toString buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "object"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": "\n     * The object being output.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "style"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": "\n     * The style of output to use.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.ToStringBuilder(T)",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\n     * \u003cp\u003eConstructor for \u003ccode\u003eToStringBuilder\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor outputs using the default style set with\n     * \u003ccode\u003esetDefaultStyle\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param object  the Object to build a \u003ccode\u003etoString\u003c/code\u003e for\n     * @throws IllegalArgumentException  if the Object passed in is\n     *  \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.ToStringBuilder(T, org.apache.commons.lang.builder.ToStringStyle)",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n     * \u003cp\u003eConstructor for \u003ccode\u003eToStringBuilder\u003c/code\u003e specifying the\n     * output style.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the style is \u003ccode\u003enull\u003c/code\u003e, the default style is used.\u003c/p\u003e\n     * \n     * @param object  the Object to build a \u003ccode\u003etoString\u003c/code\u003e for\n     * @param style  the style of the \u003ccode\u003etoString\u003c/code\u003e to create,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException  if the Object passed in is\n     *  \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.ToStringBuilder(T, org.apache.commons.lang.builder.ToStringStyle, java.lang.StringBuffer)",
      "begin_line": 243,
      "end_line": 255,
      "comment": "\n     * \u003cp\u003eConstructor for \u003ccode\u003eToStringBuilder\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the style is \u003ccode\u003enull\u003c/code\u003e, the default style is used.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the buffer is \u003ccode\u003enull\u003c/code\u003e, a new one is created.\u003c/p\u003e\n     * \n     * @param object  the Object to build a \u003ccode\u003etoString\u003c/code\u003e for\n     * @param style  the style of the \u003ccode\u003etoString\u003c/code\u003e to create,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate, may be\n     *  \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 29)",
        "(line 251,col 9)-(line 251,col 27)",
        "(line 252,col 9)-(line 252,col 29)",
        "(line 254,col 9)-(line 254,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(boolean)",
      "begin_line": 266,
      "end_line": 269,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 42)",
        "(line 268,col 9)-(line 268,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(boolean[])",
      "begin_line": 280,
      "end_line": 283,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 48)",
        "(line 282,col 9)-(line 282,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(byte)",
      "begin_line": 294,
      "end_line": 297,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 42)",
        "(line 296,col 9)-(line 296,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(byte[])",
      "begin_line": 308,
      "end_line": 311,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 48)",
        "(line 310,col 9)-(line 310,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(char)",
      "begin_line": 322,
      "end_line": 325,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 42)",
        "(line 324,col 9)-(line 324,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(char[])",
      "begin_line": 336,
      "end_line": 339,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 48)",
        "(line 338,col 9)-(line 338,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(double)",
      "begin_line": 350,
      "end_line": 353,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 42)",
        "(line 352,col 9)-(line 352,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(double[])",
      "begin_line": 364,
      "end_line": 367,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 48)",
        "(line 366,col 9)-(line 366,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(float)",
      "begin_line": 378,
      "end_line": 381,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 42)",
        "(line 380,col 9)-(line 380,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(float[])",
      "begin_line": 392,
      "end_line": 395,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 48)",
        "(line 394,col 9)-(line 394,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(int)",
      "begin_line": 406,
      "end_line": 409,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 42)",
        "(line 408,col 9)-(line 408,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(int[])",
      "begin_line": 420,
      "end_line": 423,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 48)",
        "(line 422,col 9)-(line 422,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(long)",
      "begin_line": 434,
      "end_line": 437,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 42)",
        "(line 436,col 9)-(line 436,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(long[])",
      "begin_line": 448,
      "end_line": 451,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 48)",
        "(line 450,col 9)-(line 450,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.Object)",
      "begin_line": 462,
      "end_line": 465,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param obj  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 46)",
        "(line 464,col 9)-(line 464,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.Object[])",
      "begin_line": 476,
      "end_line": 479,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 48)",
        "(line 478,col 9)-(line 478,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(short)",
      "begin_line": 490,
      "end_line": 493,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 42)",
        "(line 492,col 9)-(line 492,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(short[])",
      "begin_line": 504,
      "end_line": 507,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 48)",
        "(line 506,col 9)-(line 506,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, boolean)",
      "begin_line": 517,
      "end_line": 520,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 47)",
        "(line 519,col 9)-(line 519,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, boolean[])",
      "begin_line": 530,
      "end_line": 533,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 53)",
        "(line 532,col 9)-(line 532,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, boolean[], boolean)",
      "begin_line": 550,
      "end_line": 553,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 76)",
        "(line 552,col 9)-(line 552,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, byte)",
      "begin_line": 563,
      "end_line": 566,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003ebyte\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 47)",
        "(line 565,col 9)-(line 565,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, byte[])",
      "begin_line": 575,
      "end_line": 578,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 53)",
        "(line 577,col 9)-(line 577,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, byte[], boolean)",
      "begin_line": 595,
      "end_line": 598,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 76)",
        "(line 597,col 9)-(line 597,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, char)",
      "begin_line": 608,
      "end_line": 611,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 47)",
        "(line 610,col 9)-(line 610,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, char[])",
      "begin_line": 621,
      "end_line": 624,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 53)",
        "(line 623,col 9)-(line 623,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, char[], boolean)",
      "begin_line": 641,
      "end_line": 644,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 642,col 76)",
        "(line 643,col 9)-(line 643,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, double)",
      "begin_line": 654,
      "end_line": 657,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 47)",
        "(line 656,col 9)-(line 656,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, double[])",
      "begin_line": 667,
      "end_line": 670,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 668,col 9)-(line 668,col 53)",
        "(line 669,col 9)-(line 669,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, double[], boolean)",
      "begin_line": 687,
      "end_line": 690,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 76)",
        "(line 689,col 9)-(line 689,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, float)",
      "begin_line": 700,
      "end_line": 703,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003efloat\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 701,col 9)-(line 701,col 47)",
        "(line 702,col 9)-(line 702,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, float[])",
      "begin_line": 713,
      "end_line": 716,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 714,col 9)-(line 714,col 53)",
        "(line 715,col 9)-(line 715,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, float[], boolean)",
      "begin_line": 733,
      "end_line": 736,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 734,col 9)-(line 734,col 76)",
        "(line 735,col 9)-(line 735,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, int)",
      "begin_line": 746,
      "end_line": 749,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 747,col 9)-(line 747,col 47)",
        "(line 748,col 9)-(line 748,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, int[])",
      "begin_line": 759,
      "end_line": 762,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 760,col 9)-(line 760,col 53)",
        "(line 761,col 9)-(line 761,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, int[], boolean)",
      "begin_line": 779,
      "end_line": 782,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 780,col 9)-(line 780,col 76)",
        "(line 781,col 9)-(line 781,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, long)",
      "begin_line": 792,
      "end_line": 795,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 793,col 9)-(line 793,col 47)",
        "(line 794,col 9)-(line 794,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, long[])",
      "begin_line": 805,
      "end_line": 808,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 806,col 9)-(line 806,col 53)",
        "(line 807,col 9)-(line 807,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, long[], boolean)",
      "begin_line": 825,
      "end_line": 828,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 826,col 9)-(line 826,col 76)",
        "(line 827,col 9)-(line 827,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, java.lang.Object)",
      "begin_line": 838,
      "end_line": 841,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param obj  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 839,col 9)-(line 839,col 51)",
        "(line 840,col 9)-(line 840,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, java.lang.Object, boolean)",
      "begin_line": 853,
      "end_line": 856,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param obj  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail,\n     *  \u003ccode\u003efalse\u003c/code\u003e for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 854,col 9)-(line 854,col 74)",
        "(line 855,col 9)-(line 855,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, java.lang.Object[])",
      "begin_line": 866,
      "end_line": 869,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 867,col 9)-(line 867,col 53)",
        "(line 868,col 9)-(line 868,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, java.lang.Object[], boolean)",
      "begin_line": 886,
      "end_line": 889,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 887,col 9)-(line 887,col 76)",
        "(line 888,col 9)-(line 888,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, short)",
      "begin_line": 899,
      "end_line": 902,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eshort\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 900,col 9)-(line 900,col 47)",
        "(line 901,col 9)-(line 901,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, short[])",
      "begin_line": 912,
      "end_line": 915,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 913,col 9)-(line 913,col 53)",
        "(line 914,col 9)-(line 914,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, short[], boolean)",
      "begin_line": 932,
      "end_line": 935,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 933,col 9)-(line 933,col 76)",
        "(line 934,col 9)-(line 934,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.appendAsObjectToString(java.lang.Object)",
      "begin_line": 946,
      "end_line": 949,
      "comment": "\n     * \u003cp\u003eAppends with the same format as the default \u003ccode\u003eObject toString()\n     * \u003c/code\u003e method. Appends the class name followed by \n     * {@link System#identityHashCode(java.lang.Object)}.\u003c/p\u003e\n     * \n     * @param object  the \u003ccode\u003eObject\u003c/code\u003e whose class name and id to output\n     * @return this\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 947,col 9)-(line 947,col 69)",
        "(line 948,col 9)-(line 948,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.appendSuper(java.lang.String)",
      "begin_line": 965,
      "end_line": 970,
      "comment": "\n     * \u003cp\u003eAppend the \u003ccode\u003etoString\u003c/code\u003e from the superclass.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method assumes that the superclass uses the same \u003ccode\u003eToStringStyle\u003c/code\u003e\n     * as this one.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf \u003ccode\u003esuperToString\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, no change is made.\u003c/p\u003e\n     *\n     * @param superToString  the result of \u003ccode\u003esuper.toString()\u003c/code\u003e\n     * @return this\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 966,col 9)-(line 968,col 9)",
        "(line 969,col 9)-(line 969,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.appendToString(java.lang.String)",
      "begin_line": 999,
      "end_line": 1004,
      "comment": "\n     * \u003cp\u003eAppend the \u003ccode\u003etoString\u003c/code\u003e from another object.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method is useful where a class delegates most of the implementation of\n     * its properties to another class. You can then call \u003ccode\u003etoString()\u003c/code\u003e on\n     * the other class and pass the result into this method.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   private AnotherObject delegate;\n     *   private String fieldInThisClass;\n     * \n     *   public String toString() {\n     *     return new ToStringBuilder(this).\n     *       appendToString(delegate.toString()).\n     *       append(fieldInThisClass).\n     *       toString();\n     *   }\u003c/pre\u003e\n     * \n     * \u003cp\u003eThis method assumes that the other object uses the same \u003ccode\u003eToStringStyle\u003c/code\u003e\n     * as this one.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the \u003ccode\u003etoString\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, no change is made.\u003c/p\u003e\n     *\n     * @param toString  the result of \u003ccode\u003etoString()\u003c/code\u003e on another object\n     * @return this\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1000,col 9)-(line 1002,col 9)",
        "(line 1003,col 9)-(line 1003,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.getObject()",
      "begin_line": 1012,
      "end_line": 1014,
      "comment": "\n     * \u003cp\u003eReturns the \u003ccode\u003eObject\u003c/code\u003e being output.\u003c/p\u003e\n     * \n     * @return The object being output.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1013,col 9)-(line 1013,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.getStringBuffer()",
      "begin_line": 1021,
      "end_line": 1023,
      "comment": "\n     * \u003cp\u003eGets the \u003ccode\u003eStringBuffer\u003c/code\u003e being populated.\u003c/p\u003e\n     * \n     * @return the \u003ccode\u003eStringBuffer\u003c/code\u003e being populated\n     ",
      "child_ranges": [
        "(line 1022,col 9)-(line 1022,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.getStyle()",
      "begin_line": 1033,
      "end_line": 1035,
      "comment": "\n     * \u003cp\u003eGets the \u003ccode\u003eToStringStyle\u003c/code\u003e being used.\u003c/p\u003e\n     * \n     * @return the \u003ccode\u003eToStringStyle\u003c/code\u003e being used\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1034,col 9)-(line 1034,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.toString()",
      "begin_line": 1047,
      "end_line": 1055,
      "comment": "\n     * \u003cp\u003eReturns the built \u003ccode\u003etoString\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method appends the end of data indicator, and can only be called once.\n     * Use {@link #getStringBuffer} to get the current string state.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the object is \u003ccode\u003enull\u003c/code\u003e, return the style\u0027s \u003ccode\u003enullText\u003c/code\u003e\u003c/p\u003e\n     * \n     * @return the String \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1049,col 9)-(line 1053,col 9)",
        "(line 1054,col 9)-(line 1054,col 49)"
      ]
    }
  ]
}