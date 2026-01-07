{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/builder/ToStringBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ToStringBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 93,
      "end_line": 1057,
      "comment": "\n * \u003cp\u003eAssists in implementing {@link Object#toString()} methods.\u003c/p\u003e\n *\n * \u003cp\u003eThis class enables a good and consistent \u003ccode\u003etoString()\u003c/code\u003e to be built for any\n * class or object. This class aims to simplify the process by:\u003c/p\u003e\n * \u003cul\u003e\n *  \u003cli\u003eallowing field names\u003c/li\u003e\n *  \u003cli\u003ehandling all types consistently\u003c/li\u003e\n *  \u003cli\u003ehandling nulls consistently\u003c/li\u003e\n *  \u003cli\u003eoutputting arrays and multi-dimensional arrays\u003c/li\u003e\n *  \u003cli\u003eenabling the detail level to be controlled for Objects and Collections\u003c/li\u003e\n *  \u003cli\u003ehandling class hierarchies\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003eTo use this class write code as follows:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * public class Person {\n *   String name;\n *   int age;\n *   boolean smoker;\n * \n *   ...\n * \n *   public String toString() {\n *     return new ToStringBuilder(this).\n *       append(\"name\", name).\n *       append(\"age\", age).\n *       append(\"smoker\", smoker).\n *       toString();\n *   }\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003eThis will produce a toString of the format:\n * \u003ccode\u003ePerson@7f54[name\u003dStephen,age\u003d29,smoker\u003dfalse]\u003c/code\u003e\u003c/p\u003e\n * \n * \u003cp\u003eTo add the superclass \u003ccode\u003etoString\u003c/code\u003e, use {@link #appendSuper}.\n * To append the \u003ccode\u003etoString\u003c/code\u003e from an object that is delegated\n * to (or any other object), use {@link #appendToString}.\u003c/p\u003e\n *\n * \u003cp\u003eAlternatively, there is a method that uses reflection to determine\n * the fields to test. Because these fields are usually private, the method, \n * \u003ccode\u003ereflectionToString\u003c/code\u003e, uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to\n * change the visibility of the fields. This will fail under a security manager,\n * unless the appropriate permissions are set up correctly. It is also\n * slower than testing explicitly.\u003c/p\u003e\n *\n * \u003cp\u003eA typical invocation for this method would look like:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * public String toString() {\n *   return ToStringBuilder.reflectionToString(this);\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003eYou can also use the builder to debug 3rd party objects:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * System.out.println(\"An object: \" + ToStringBuilder.reflectionToString(anObject));\n * \u003c/pre\u003e\n * \n * \u003cp\u003eThe exact format of the \u003ccode\u003etoString\u003c/code\u003e is determined by\n * the {@link ToStringStyle} passed into the constructor.\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @author Gary Gregory\n * @author Pete Gieser\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "defaultStyle"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * The default style of output to use.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.getDefaultStyle()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * \u003cp\u003eGets the default \u003ccode\u003eToStringStyle\u003c/code\u003e to use.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis could allow the \u003ccode\u003eToStringStyle\u003c/code\u003e to be\n     * controlled for an entire application with one call.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis might be used to have a verbose\n     * \u003ccode\u003eToStringStyle\u003c/code\u003e during development and a compact\n     * \u003ccode\u003eToStringStyle\u003c/code\u003e in production.\u003c/p\u003e\n     * \n     * @return the default \u003ccode\u003eToStringStyle\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(java.lang.Object)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * \u003cp\u003eForwards to \u003ccode\u003eReflectionToStringBuilder\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param object  the Object to be output\n     * @return the String result\n     * @see ReflectionToStringBuilder#toString(Object)\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(java.lang.Object, org.apache.commons.lang.builder.ToStringStyle)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * \u003cp\u003eForwards to \u003ccode\u003eReflectionToStringBuilder\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param object  the Object to be output\n     * @param style  the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the String result\n     * @see ReflectionToStringBuilder#toString(Object,ToStringStyle)\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(java.lang.Object, org.apache.commons.lang.builder.ToStringStyle, boolean)",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * \u003cp\u003eForwards to \u003ccode\u003eReflectionToStringBuilder\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param object  the Object to be output\n     * @param style  the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param outputTransients  whether to include transient fields\n     * @return the String result\n     * @see ReflectionToStringBuilder#toString(Object,ToStringStyle,boolean)\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(java.lang.Object, org.apache.commons.lang.builder.ToStringStyle, boolean, java.lang.Class)",
      "begin_line": 165,
      "end_line": 171,
      "comment": "\n     * \u003cp\u003eForwards to \u003ccode\u003eReflectionToStringBuilder\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param object  the Object to be output\n     * @param style  the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param outputTransients  whether to include transient fields\n     * @param reflectUpToClass  the superclass to reflect up to (inclusive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the String result\n     * @see ReflectionToStringBuilder#toString(Object,ToStringStyle,boolean,boolean,Class)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.setDefaultStyle(org.apache.commons.lang.builder.ToStringStyle)",
      "begin_line": 179,
      "end_line": 184,
      "comment": "\n     * \u003cp\u003eSets the default \u003ccode\u003eToStringStyle\u003c/code\u003e to use.\u003c/p\u003e\n     * \n     * @param style  the default \u003ccode\u003eToStringStyle\u003c/code\u003e\n     * @throws IllegalArgumentException if the style is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": "\n     * Current toString buffer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "object"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": "\n     * The object being output.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "style"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": "\n     * The style of output to use.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.ToStringBuilder(java.lang.Object)",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n     * \u003cp\u003eConstructor for \u003ccode\u003eToStringBuilder\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor outputs using the default style set with\n     * \u003ccode\u003esetDefaultStyle\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param object  the Object to build a \u003ccode\u003etoString\u003c/code\u003e for\n     * @throws IllegalArgumentException  if the Object passed in is\n     *  \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.ToStringBuilder(java.lang.Object, org.apache.commons.lang.builder.ToStringStyle)",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\n     * \u003cp\u003eConstructor for \u003ccode\u003eToStringBuilder\u003c/code\u003e specifying the\n     * output style.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the style is \u003ccode\u003enull\u003c/code\u003e, the default style is used.\u003c/p\u003e\n     * \n     * @param object  the Object to build a \u003ccode\u003etoString\u003c/code\u003e for\n     * @param style  the style of the \u003ccode\u003etoString\u003c/code\u003e to create,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException  if the Object passed in is\n     *  \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.ToStringBuilder(java.lang.Object, org.apache.commons.lang.builder.ToStringStyle, java.lang.StringBuffer)",
      "begin_line": 244,
      "end_line": 256,
      "comment": "\n     * \u003cp\u003eConstructor for \u003ccode\u003eToStringBuilder\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the style is \u003ccode\u003enull\u003c/code\u003e, the default style is used.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the buffer is \u003ccode\u003enull\u003c/code\u003e, a new one is created.\u003c/p\u003e\n     * \n     * @param object  the Object to build a \u003ccode\u003etoString\u003c/code\u003e for\n     * @param style  the style of the \u003ccode\u003etoString\u003c/code\u003e to create,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate, may be\n     *  \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 29)",
        "(line 252,col 9)-(line 252,col 27)",
        "(line 253,col 9)-(line 253,col 29)",
        "(line 255,col 9)-(line 255,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(boolean)",
      "begin_line": 267,
      "end_line": 270,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 42)",
        "(line 269,col 9)-(line 269,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(boolean[])",
      "begin_line": 281,
      "end_line": 284,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 48)",
        "(line 283,col 9)-(line 283,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(byte)",
      "begin_line": 295,
      "end_line": 298,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 42)",
        "(line 297,col 9)-(line 297,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(byte[])",
      "begin_line": 309,
      "end_line": 312,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 48)",
        "(line 311,col 9)-(line 311,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(char)",
      "begin_line": 323,
      "end_line": 326,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 42)",
        "(line 325,col 9)-(line 325,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(char[])",
      "begin_line": 337,
      "end_line": 340,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 48)",
        "(line 339,col 9)-(line 339,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(double)",
      "begin_line": 351,
      "end_line": 354,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 42)",
        "(line 353,col 9)-(line 353,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(double[])",
      "begin_line": 365,
      "end_line": 368,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 48)",
        "(line 367,col 9)-(line 367,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(float)",
      "begin_line": 379,
      "end_line": 382,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 42)",
        "(line 381,col 9)-(line 381,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(float[])",
      "begin_line": 393,
      "end_line": 396,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 48)",
        "(line 395,col 9)-(line 395,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(int)",
      "begin_line": 407,
      "end_line": 410,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 42)",
        "(line 409,col 9)-(line 409,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(int[])",
      "begin_line": 421,
      "end_line": 424,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 48)",
        "(line 423,col 9)-(line 423,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(long)",
      "begin_line": 435,
      "end_line": 438,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 42)",
        "(line 437,col 9)-(line 437,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(long[])",
      "begin_line": 449,
      "end_line": 452,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 48)",
        "(line 451,col 9)-(line 451,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.Object)",
      "begin_line": 463,
      "end_line": 466,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param obj  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 46)",
        "(line 465,col 9)-(line 465,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.Object[])",
      "begin_line": 477,
      "end_line": 480,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 48)",
        "(line 479,col 9)-(line 479,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(short)",
      "begin_line": 491,
      "end_line": 494,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 42)",
        "(line 493,col 9)-(line 493,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(short[])",
      "begin_line": 505,
      "end_line": 508,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 48)",
        "(line 507,col 9)-(line 507,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, boolean)",
      "begin_line": 518,
      "end_line": 521,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 47)",
        "(line 520,col 9)-(line 520,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, boolean[])",
      "begin_line": 531,
      "end_line": 534,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 53)",
        "(line 533,col 9)-(line 533,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, boolean[], boolean)",
      "begin_line": 551,
      "end_line": 554,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 89)",
        "(line 553,col 9)-(line 553,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, byte)",
      "begin_line": 564,
      "end_line": 567,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003ebyte\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 47)",
        "(line 566,col 9)-(line 566,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, byte[])",
      "begin_line": 576,
      "end_line": 579,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 53)",
        "(line 578,col 9)-(line 578,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, byte[], boolean)",
      "begin_line": 596,
      "end_line": 599,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 89)",
        "(line 598,col 9)-(line 598,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, char)",
      "begin_line": 609,
      "end_line": 612,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 47)",
        "(line 611,col 9)-(line 611,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, char[])",
      "begin_line": 622,
      "end_line": 625,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 623,col 9)-(line 623,col 53)",
        "(line 624,col 9)-(line 624,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, char[], boolean)",
      "begin_line": 642,
      "end_line": 645,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 89)",
        "(line 644,col 9)-(line 644,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, double)",
      "begin_line": 655,
      "end_line": 658,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 656,col 9)-(line 656,col 47)",
        "(line 657,col 9)-(line 657,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, double[])",
      "begin_line": 668,
      "end_line": 671,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 53)",
        "(line 670,col 9)-(line 670,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, double[], boolean)",
      "begin_line": 688,
      "end_line": 691,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 689,col 9)-(line 689,col 89)",
        "(line 690,col 9)-(line 690,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, float)",
      "begin_line": 701,
      "end_line": 704,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003efloat\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 702,col 9)-(line 702,col 47)",
        "(line 703,col 9)-(line 703,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, float[])",
      "begin_line": 714,
      "end_line": 717,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 715,col 9)-(line 715,col 53)",
        "(line 716,col 9)-(line 716,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, float[], boolean)",
      "begin_line": 734,
      "end_line": 737,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 735,col 9)-(line 735,col 89)",
        "(line 736,col 9)-(line 736,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, int)",
      "begin_line": 747,
      "end_line": 750,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 748,col 9)-(line 748,col 47)",
        "(line 749,col 9)-(line 749,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, int[])",
      "begin_line": 760,
      "end_line": 763,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 761,col 9)-(line 761,col 53)",
        "(line 762,col 9)-(line 762,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, int[], boolean)",
      "begin_line": 780,
      "end_line": 783,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 781,col 9)-(line 781,col 89)",
        "(line 782,col 9)-(line 782,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, long)",
      "begin_line": 793,
      "end_line": 796,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 794,col 9)-(line 794,col 47)",
        "(line 795,col 9)-(line 795,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, long[])",
      "begin_line": 806,
      "end_line": 809,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 807,col 9)-(line 807,col 53)",
        "(line 808,col 9)-(line 808,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, long[], boolean)",
      "begin_line": 826,
      "end_line": 829,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 827,col 9)-(line 827,col 89)",
        "(line 828,col 9)-(line 828,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, java.lang.Object)",
      "begin_line": 839,
      "end_line": 842,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param obj  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 840,col 9)-(line 840,col 51)",
        "(line 841,col 9)-(line 841,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, java.lang.Object, boolean)",
      "begin_line": 854,
      "end_line": 857,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param obj  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail,\n     *  \u003ccode\u003efalse\u003c/code\u003e for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 855,col 9)-(line 855,col 87)",
        "(line 856,col 9)-(line 856,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, java.lang.Object[])",
      "begin_line": 867,
      "end_line": 870,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 868,col 9)-(line 868,col 53)",
        "(line 869,col 9)-(line 869,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, java.lang.Object[], boolean)",
      "begin_line": 887,
      "end_line": 890,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 888,col 9)-(line 888,col 89)",
        "(line 889,col 9)-(line 889,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, short)",
      "begin_line": 900,
      "end_line": 903,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eshort\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 901,col 9)-(line 901,col 47)",
        "(line 902,col 9)-(line 902,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, short[])",
      "begin_line": 913,
      "end_line": 916,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 914,col 9)-(line 914,col 53)",
        "(line 915,col 9)-(line 915,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.append(java.lang.String, short[], boolean)",
      "begin_line": 933,
      "end_line": 936,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 934,col 9)-(line 934,col 89)",
        "(line 935,col 9)-(line 935,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.appendAsObjectToString(java.lang.Object)",
      "begin_line": 947,
      "end_line": 950,
      "comment": "\n     * \u003cp\u003eAppends with the same format as the default \u003ccode\u003eObject toString()\n     * \u003c/code\u003e method. Appends the class name followed by \n     * {@link System#identityHashCode(java.lang.Object)}.\u003c/p\u003e\n     * \n     * @param object  the \u003ccode\u003eObject\u003c/code\u003e whose class name and id to output\n     * @return this\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 948,col 9)-(line 948,col 75)",
        "(line 949,col 9)-(line 949,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.appendSuper(java.lang.String)",
      "begin_line": 966,
      "end_line": 971,
      "comment": "\n     * \u003cp\u003eAppend the \u003ccode\u003etoString\u003c/code\u003e from the superclass.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method assumes that the superclass uses the same \u003ccode\u003eToStringStyle\u003c/code\u003e\n     * as this one.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf \u003ccode\u003esuperToString\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, no change is made.\u003c/p\u003e\n     *\n     * @param superToString  the result of \u003ccode\u003esuper.toString()\u003c/code\u003e\n     * @return this\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 967,col 9)-(line 969,col 9)",
        "(line 970,col 9)-(line 970,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.appendToString(java.lang.String)",
      "begin_line": 1000,
      "end_line": 1005,
      "comment": "\n     * \u003cp\u003eAppend the \u003ccode\u003etoString\u003c/code\u003e from another object.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method is useful where a class delegates most of the implementation of\n     * its properties to another class. You can then call \u003ccode\u003etoString()\u003c/code\u003e on\n     * the other class and pass the result into this method.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   private AnotherObject delegate;\n     *   private String fieldInThisClass;\n     * \n     *   public String toString() {\n     *     return new ToStringBuilder(this).\n     *       appendToString(delegate.toString()).\n     *       append(fieldInThisClass).\n     *       toString();\n     *   }\u003c/pre\u003e\n     * \n     * \u003cp\u003eThis method assumes that the other object uses the same \u003ccode\u003eToStringStyle\u003c/code\u003e\n     * as this one.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the \u003ccode\u003etoString\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, no change is made.\u003c/p\u003e\n     *\n     * @param toString  the result of \u003ccode\u003etoString()\u003c/code\u003e on another object\n     * @return this\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1001,col 9)-(line 1003,col 9)",
        "(line 1004,col 9)-(line 1004,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.getObject()",
      "begin_line": 1013,
      "end_line": 1015,
      "comment": "\n     * \u003cp\u003eReturns the \u003ccode\u003eObject\u003c/code\u003e being output.\u003c/p\u003e\n     * \n     * @return The object being output.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1014,col 9)-(line 1014,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.getStringBuffer()",
      "begin_line": 1022,
      "end_line": 1024,
      "comment": "\n     * \u003cp\u003eGets the \u003ccode\u003eStringBuffer\u003c/code\u003e being populated.\u003c/p\u003e\n     * \n     * @return the \u003ccode\u003eStringBuffer\u003c/code\u003e being populated\n     ",
      "child_ranges": [
        "(line 1023,col 9)-(line 1023,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.getStyle()",
      "begin_line": 1034,
      "end_line": 1036,
      "comment": "\n     * \u003cp\u003eGets the \u003ccode\u003eToStringStyle\u003c/code\u003e being used.\u003c/p\u003e\n     * \n     * @return the \u003ccode\u003eToStringStyle\u003c/code\u003e being used\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1035,col 9)-(line 1035,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringBuilder.toString()",
      "begin_line": 1048,
      "end_line": 1055,
      "comment": "\n     * \u003cp\u003eReturns the built \u003ccode\u003etoString\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method appends the end of data indicator, and can only be called once.\n     * Use {@link #getStringBuffer} to get the current string state.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the object is \u003ccode\u003enull\u003c/code\u003e, return the style\u0027s \u003ccode\u003enullText\u003c/code\u003e\u003c/p\u003e\n     * \n     * @return the String \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1049,col 9)-(line 1053,col 9)",
        "(line 1054,col 9)-(line 1054,col 49)"
      ]
    }
  ]
}