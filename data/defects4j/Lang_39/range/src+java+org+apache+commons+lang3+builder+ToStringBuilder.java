{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/builder/ToStringBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ToStringBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 92,
      "end_line": 1068,
      "comment": "\n * \u003cp\u003eAssists in implementing {@link Object#toString()} methods.\u003c/p\u003e\n *\n * \u003cp\u003eThis class enables a good and consistent \u003ccode\u003etoString()\u003c/code\u003e to be built for any\n * class or object. This class aims to simplify the process by:\u003c/p\u003e\n * \u003cul\u003e\n *  \u003cli\u003eallowing field names\u003c/li\u003e\n *  \u003cli\u003ehandling all types consistently\u003c/li\u003e\n *  \u003cli\u003ehandling nulls consistently\u003c/li\u003e\n *  \u003cli\u003eoutputting arrays and multi-dimensional arrays\u003c/li\u003e\n *  \u003cli\u003eenabling the detail level to be controlled for Objects and Collections\u003c/li\u003e\n *  \u003cli\u003ehandling class hierarchies\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003eTo use this class write code as follows:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * public class Person {\n *   String name;\n *   int age;\n *   boolean smoker;\n * \n *   ...\n * \n *   public String toString() {\n *     return new ToStringBuilder(this).\n *       append(\"name\", name).\n *       append(\"age\", age).\n *       append(\"smoker\", smoker).\n *       toString();\n *   }\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003eThis will produce a toString of the format:\n * \u003ccode\u003ePerson@7f54[name\u003dStephen,age\u003d29,smoker\u003dfalse]\u003c/code\u003e\u003c/p\u003e\n * \n * \u003cp\u003eTo add the superclass \u003ccode\u003etoString\u003c/code\u003e, use {@link #appendSuper}.\n * To append the \u003ccode\u003etoString\u003c/code\u003e from an object that is delegated\n * to (or any other object), use {@link #appendToString}.\u003c/p\u003e\n *\n * \u003cp\u003eAlternatively, there is a method that uses reflection to determine\n * the fields to test. Because these fields are usually private, the method, \n * \u003ccode\u003ereflectionToString\u003c/code\u003e, uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to\n * change the visibility of the fields. This will fail under a security manager,\n * unless the appropriate permissions are set up correctly. It is also\n * slower than testing explicitly.\u003c/p\u003e\n *\n * \u003cp\u003eA typical invocation for this method would look like:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * public String toString() {\n *   return ToStringBuilder.reflectionToString(this);\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003eYou can also use the builder to debug 3rd party objects:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * System.out.println(\"An object: \" + ToStringBuilder.reflectionToString(anObject));\n * \u003c/pre\u003e\n * \n * \u003cp\u003eThe exact format of the \u003ccode\u003etoString\u003c/code\u003e is determined by\n * the {@link ToStringStyle} passed into the constructor.\u003c/p\u003e\n *\n * @author Apache Software Foundation\n * @author Gary Gregory\n * @author Pete Gieser\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "defaultStyle"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * The default style of output to use, not null.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * \u003cp\u003eGets the default \u003ccode\u003eToStringStyle\u003c/code\u003e to use.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method gets a singleton default value, typically for the whole JVM.\n     * Changing this default should generally only be done during application startup.\n     * It is recommended to pass a \u003ccode\u003eToStringStyle\u003c/code\u003e to the constructor instead\n     * of using this global default.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method can be used from multiple threads.\n     * Internally, a \u003ccode\u003evolatile\u003c/code\u003e variable is used to provide the guarantee\n     * that the latest value set using {@link #setDefaultStyle} is the value returned.\n     * It is strongly recommended that the default style is only changed during application startup.\u003c/p\u003e\n     * \n     * \u003cp\u003eOne reason for changing the default could be to have a verbose style during\n     * development and a compact style in production.\u003c/p\u003e\n     * \n     * @return the default \u003ccode\u003eToStringStyle\u003c/code\u003e, never null\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(org.apache.commons.lang3.builder.ToStringStyle)",
      "begin_line": 138,
      "end_line": 143,
      "comment": "\n     * \u003cp\u003eSets the default \u003ccode\u003eToStringStyle\u003c/code\u003e to use.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method sets a singleton default value, typically for the whole JVM.\n     * Changing this default should generally only be done during application startup.\n     * It is recommended to pass a \u003ccode\u003eToStringStyle\u003c/code\u003e to the constructor instead\n     * of changing this global default.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method is not intended for use from multiple threads.\n     * Internally, a \u003ccode\u003evolatile\u003c/code\u003e variable is used to provide the guarantee\n     * that the latest value set is the value returned from {@link #getDefaultStyle}.\u003c/p\u003e\n     * \n     * @param style  the default \u003ccode\u003eToStringStyle\u003c/code\u003e\n     * @throws IllegalArgumentException if the style is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(java.lang.Object)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * \u003cp\u003eUses \u003ccode\u003eReflectionToStringBuilder\u003c/code\u003e to generate a\n     * \u003ccode\u003etoString\u003c/code\u003e for the specified object.\u003c/p\u003e\n     * \n     * @param object  the Object to be output\n     * @return the String result\n     * @see ReflectionToStringBuilder#toString(Object)\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(java.lang.Object, org.apache.commons.lang3.builder.ToStringStyle)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * \u003cp\u003eUses \u003ccode\u003eReflectionToStringBuilder\u003c/code\u003e to generate a\n     * \u003ccode\u003etoString\u003c/code\u003e for the specified object.\u003c/p\u003e\n     * \n     * @param object  the Object to be output\n     * @param style  the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the String result\n     * @see ReflectionToStringBuilder#toString(Object,ToStringStyle)\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(java.lang.Object, org.apache.commons.lang3.builder.ToStringStyle, boolean)",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * \u003cp\u003eUses \u003ccode\u003eReflectionToStringBuilder\u003c/code\u003e to generate a\n     * \u003ccode\u003etoString\u003c/code\u003e for the specified object.\u003c/p\u003e\n     * \n     * @param object  the Object to be output\n     * @param style  the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param outputTransients  whether to include transient fields\n     * @return the String result\n     * @see ReflectionToStringBuilder#toString(Object,ToStringStyle,boolean)\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(T, org.apache.commons.lang3.builder.ToStringStyle, boolean, java.lang.Class\u003c? super T\u003e)",
      "begin_line": 197,
      "end_line": 203,
      "comment": "\n     * \u003cp\u003eUses \u003ccode\u003eReflectionToStringBuilder\u003c/code\u003e to generate a\n     * \u003ccode\u003etoString\u003c/code\u003e for the specified object.\u003c/p\u003e\n     * \n     * @param object  the Object to be output\n     * @param style  the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param outputTransients  whether to include transient fields\n     * @param reflectUpToClass  the superclass to reflect up to (inclusive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the String result\n     * @see ReflectionToStringBuilder#toString(Object,ToStringStyle,boolean,boolean,Class)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 108)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": "\n     * Current toString buffer, not null.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "object"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": "\n     * The object being output, may be null.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "style"
      ],
      "begin_line": 218,
      "end_line": 218,
      "comment": "\n     * The style of output to use, not null.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.ToStringBuilder(java.lang.Object)",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\n     * \u003cp\u003eConstructs a builder for the specified object using the default output style.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis default style is obtained from {@link #getDefaultStyle()}.\u003c/p\u003e\n     * \n     * @param object  the Object to build a \u003ccode\u003etoString\u003c/code\u003e for, not recommended to be null\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.ToStringBuilder(java.lang.Object, org.apache.commons.lang3.builder.ToStringStyle)",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n     * \u003cp\u003eConstructs a builder for the specified object using the a defined output style.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the style is \u003ccode\u003enull\u003c/code\u003e, the default style is used.\u003c/p\u003e\n     * \n     * @param object  the Object to build a \u003ccode\u003etoString\u003c/code\u003e for, not recommended to be null\n     * @param style  the style of the \u003ccode\u003etoString\u003c/code\u003e to create, null uses the default style\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.ToStringBuilder(java.lang.Object, org.apache.commons.lang3.builder.ToStringStyle, java.lang.StringBuffer)",
      "begin_line": 254,
      "end_line": 266,
      "comment": "\n     * \u003cp\u003eConstructs a builder for the specified object.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the style is \u003ccode\u003enull\u003c/code\u003e, the default style is used.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the buffer is \u003ccode\u003enull\u003c/code\u003e, a new one is created.\u003c/p\u003e\n     * \n     * @param object  the Object to build a \u003ccode\u003etoString\u003c/code\u003e for, not recommended to be null\n     * @param style  the style of the \u003ccode\u003etoString\u003c/code\u003e to create, null uses the default style\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate, may be null\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 261,col 29)",
        "(line 262,col 9)-(line 262,col 27)",
        "(line 263,col 9)-(line 263,col 29)",
        "(line 265,col 9)-(line 265,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(boolean)",
      "begin_line": 277,
      "end_line": 280,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 42)",
        "(line 279,col 9)-(line 279,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(boolean[])",
      "begin_line": 291,
      "end_line": 294,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 48)",
        "(line 293,col 9)-(line 293,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(byte)",
      "begin_line": 305,
      "end_line": 308,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 42)",
        "(line 307,col 9)-(line 307,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(byte[])",
      "begin_line": 319,
      "end_line": 322,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 48)",
        "(line 321,col 9)-(line 321,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(char)",
      "begin_line": 333,
      "end_line": 336,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 42)",
        "(line 335,col 9)-(line 335,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(char[])",
      "begin_line": 347,
      "end_line": 350,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 48)",
        "(line 349,col 9)-(line 349,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(double)",
      "begin_line": 361,
      "end_line": 364,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 42)",
        "(line 363,col 9)-(line 363,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(double[])",
      "begin_line": 375,
      "end_line": 378,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 48)",
        "(line 377,col 9)-(line 377,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(float)",
      "begin_line": 389,
      "end_line": 392,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 42)",
        "(line 391,col 9)-(line 391,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(float[])",
      "begin_line": 403,
      "end_line": 406,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 48)",
        "(line 405,col 9)-(line 405,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(int)",
      "begin_line": 417,
      "end_line": 420,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 42)",
        "(line 419,col 9)-(line 419,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(int[])",
      "begin_line": 431,
      "end_line": 434,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 48)",
        "(line 433,col 9)-(line 433,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(long)",
      "begin_line": 445,
      "end_line": 448,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 42)",
        "(line 447,col 9)-(line 447,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(long[])",
      "begin_line": 459,
      "end_line": 462,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 48)",
        "(line 461,col 9)-(line 461,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.Object)",
      "begin_line": 473,
      "end_line": 476,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param obj  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 46)",
        "(line 475,col 9)-(line 475,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.Object[])",
      "begin_line": 487,
      "end_line": 490,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 48)",
        "(line 489,col 9)-(line 489,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(short)",
      "begin_line": 501,
      "end_line": 504,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 42)",
        "(line 503,col 9)-(line 503,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(short[])",
      "begin_line": 515,
      "end_line": 518,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 48)",
        "(line 517,col 9)-(line 517,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, boolean)",
      "begin_line": 528,
      "end_line": 531,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 529,col 47)",
        "(line 530,col 9)-(line 530,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, boolean[])",
      "begin_line": 541,
      "end_line": 544,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 53)",
        "(line 543,col 9)-(line 543,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, boolean[], boolean)",
      "begin_line": 561,
      "end_line": 564,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 76)",
        "(line 563,col 9)-(line 563,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, byte)",
      "begin_line": 574,
      "end_line": 577,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003ebyte\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 47)",
        "(line 576,col 9)-(line 576,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, byte[])",
      "begin_line": 586,
      "end_line": 589,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 53)",
        "(line 588,col 9)-(line 588,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, byte[], boolean)",
      "begin_line": 606,
      "end_line": 609,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 76)",
        "(line 608,col 9)-(line 608,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, char)",
      "begin_line": 619,
      "end_line": 622,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 47)",
        "(line 621,col 9)-(line 621,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, char[])",
      "begin_line": 632,
      "end_line": 635,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 633,col 9)-(line 633,col 53)",
        "(line 634,col 9)-(line 634,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, char[], boolean)",
      "begin_line": 652,
      "end_line": 655,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 653,col 9)-(line 653,col 76)",
        "(line 654,col 9)-(line 654,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, double)",
      "begin_line": 665,
      "end_line": 668,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 666,col 9)-(line 666,col 47)",
        "(line 667,col 9)-(line 667,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, double[])",
      "begin_line": 678,
      "end_line": 681,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 679,col 9)-(line 679,col 53)",
        "(line 680,col 9)-(line 680,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, double[], boolean)",
      "begin_line": 698,
      "end_line": 701,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 699,col 9)-(line 699,col 76)",
        "(line 700,col 9)-(line 700,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, float)",
      "begin_line": 711,
      "end_line": 714,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003efloat\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 712,col 9)-(line 712,col 47)",
        "(line 713,col 9)-(line 713,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, float[])",
      "begin_line": 724,
      "end_line": 727,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 725,col 9)-(line 725,col 53)",
        "(line 726,col 9)-(line 726,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, float[], boolean)",
      "begin_line": 744,
      "end_line": 747,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 745,col 9)-(line 745,col 76)",
        "(line 746,col 9)-(line 746,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, int)",
      "begin_line": 757,
      "end_line": 760,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 758,col 9)-(line 758,col 47)",
        "(line 759,col 9)-(line 759,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, int[])",
      "begin_line": 770,
      "end_line": 773,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 53)",
        "(line 772,col 9)-(line 772,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, int[], boolean)",
      "begin_line": 790,
      "end_line": 793,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 791,col 9)-(line 791,col 76)",
        "(line 792,col 9)-(line 792,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, long)",
      "begin_line": 803,
      "end_line": 806,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 804,col 9)-(line 804,col 47)",
        "(line 805,col 9)-(line 805,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, long[])",
      "begin_line": 816,
      "end_line": 819,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 817,col 9)-(line 817,col 53)",
        "(line 818,col 9)-(line 818,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, long[], boolean)",
      "begin_line": 836,
      "end_line": 839,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 837,col 9)-(line 837,col 76)",
        "(line 838,col 9)-(line 838,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, java.lang.Object)",
      "begin_line": 849,
      "end_line": 852,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param obj  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 850,col 9)-(line 850,col 51)",
        "(line 851,col 9)-(line 851,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, java.lang.Object, boolean)",
      "begin_line": 864,
      "end_line": 867,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param obj  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail,\n     *  \u003ccode\u003efalse\u003c/code\u003e for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 865,col 74)",
        "(line 866,col 9)-(line 866,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, java.lang.Object[])",
      "begin_line": 877,
      "end_line": 880,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 878,col 9)-(line 878,col 53)",
        "(line 879,col 9)-(line 879,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, java.lang.Object[], boolean)",
      "begin_line": 897,
      "end_line": 900,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 898,col 9)-(line 898,col 76)",
        "(line 899,col 9)-(line 899,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, short)",
      "begin_line": 910,
      "end_line": 913,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eshort\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 911,col 9)-(line 911,col 47)",
        "(line 912,col 9)-(line 912,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, short[])",
      "begin_line": 923,
      "end_line": 926,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 924,col 9)-(line 924,col 53)",
        "(line 925,col 9)-(line 925,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.append(java.lang.String, short[], boolean)",
      "begin_line": 943,
      "end_line": 946,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA boolean parameter controls the level of detail to show.\n     * Setting \u003ccode\u003etrue\u003c/code\u003e will output the array in full. Setting\n     * \u003ccode\u003efalse\u003c/code\u003e will output a summary, typically the size of\n     * the array.\n     *\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info\n     * @return this\n     ",
      "child_ranges": [
        "(line 944,col 9)-(line 944,col 76)",
        "(line 945,col 9)-(line 945,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.appendAsObjectToString(java.lang.Object)",
      "begin_line": 957,
      "end_line": 960,
      "comment": "\n     * \u003cp\u003eAppends with the same format as the default \u003ccode\u003eObject toString()\n     * \u003c/code\u003e method. Appends the class name followed by \n     * {@link System#identityHashCode(java.lang.Object)}.\u003c/p\u003e\n     * \n     * @param object  the \u003ccode\u003eObject\u003c/code\u003e whose class name and id to output\n     * @return this\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 958,col 9)-(line 958,col 69)",
        "(line 959,col 9)-(line 959,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.appendSuper(java.lang.String)",
      "begin_line": 976,
      "end_line": 981,
      "comment": "\n     * \u003cp\u003eAppend the \u003ccode\u003etoString\u003c/code\u003e from the superclass.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method assumes that the superclass uses the same \u003ccode\u003eToStringStyle\u003c/code\u003e\n     * as this one.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf \u003ccode\u003esuperToString\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, no change is made.\u003c/p\u003e\n     *\n     * @param superToString  the result of \u003ccode\u003esuper.toString()\u003c/code\u003e\n     * @return this\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 977,col 9)-(line 979,col 9)",
        "(line 980,col 9)-(line 980,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.appendToString(java.lang.String)",
      "begin_line": 1010,
      "end_line": 1015,
      "comment": "\n     * \u003cp\u003eAppend the \u003ccode\u003etoString\u003c/code\u003e from another object.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method is useful where a class delegates most of the implementation of\n     * its properties to another class. You can then call \u003ccode\u003etoString()\u003c/code\u003e on\n     * the other class and pass the result into this method.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   private AnotherObject delegate;\n     *   private String fieldInThisClass;\n     * \n     *   public String toString() {\n     *     return new ToStringBuilder(this).\n     *       appendToString(delegate.toString()).\n     *       append(fieldInThisClass).\n     *       toString();\n     *   }\u003c/pre\u003e\n     * \n     * \u003cp\u003eThis method assumes that the other object uses the same \u003ccode\u003eToStringStyle\u003c/code\u003e\n     * as this one.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the \u003ccode\u003etoString\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, no change is made.\u003c/p\u003e\n     *\n     * @param toString  the result of \u003ccode\u003etoString()\u003c/code\u003e on another object\n     * @return this\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1011,col 9)-(line 1013,col 9)",
        "(line 1014,col 9)-(line 1014,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.getObject()",
      "begin_line": 1023,
      "end_line": 1025,
      "comment": "\n     * \u003cp\u003eReturns the \u003ccode\u003eObject\u003c/code\u003e being output.\u003c/p\u003e\n     * \n     * @return The object being output.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1024,col 9)-(line 1024,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.getStringBuffer()",
      "begin_line": 1032,
      "end_line": 1034,
      "comment": "\n     * \u003cp\u003eGets the \u003ccode\u003eStringBuffer\u003c/code\u003e being populated.\u003c/p\u003e\n     * \n     * @return the \u003ccode\u003eStringBuffer\u003c/code\u003e being populated\n     ",
      "child_ranges": [
        "(line 1033,col 9)-(line 1033,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.getStyle()",
      "begin_line": 1044,
      "end_line": 1046,
      "comment": "\n     * \u003cp\u003eGets the \u003ccode\u003eToStringStyle\u003c/code\u003e being used.\u003c/p\u003e\n     * \n     * @return the \u003ccode\u003eToStringStyle\u003c/code\u003e being used\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1045,col 9)-(line 1045,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilder.toString()",
      "begin_line": 1058,
      "end_line": 1066,
      "comment": "\n     * \u003cp\u003eReturns the built \u003ccode\u003etoString\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method appends the end of data indicator, and can only be called once.\n     * Use {@link #getStringBuffer} to get the current string state.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the object is \u003ccode\u003enull\u003c/code\u003e, return the style\u0027s \u003ccode\u003enullText\u003c/code\u003e\u003c/p\u003e\n     * \n     * @return the String \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1060,col 9)-(line 1064,col 9)",
        "(line 1065,col 9)-(line 1065,col 49)"
      ]
    }
  ]
}