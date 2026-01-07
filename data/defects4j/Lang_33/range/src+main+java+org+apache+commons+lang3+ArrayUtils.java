{
  "filepath": "/tmp/Lang-33b/src/main/java/org/apache/commons/lang3/ArrayUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 50,
      "end_line": 4967,
      "comment": "\n * \u003cp\u003eOperations on arrays, primitive arrays (like \u003ccode\u003eint[]\u003c/code\u003e) and\n * primitive wrapper arrays (like \u003ccode\u003eInteger[]\u003c/code\u003e).\u003c/p\u003e\n *\n * \u003cp\u003eThis class tries to handle \u003ccode\u003enull\u003c/code\u003e input gracefully.\n * An exception will not be thrown for a \u003ccode\u003enull\u003c/code\u003e\n * array input. However, an Object array that contains a \u003ccode\u003enull\u003c/code\u003e\n * element may throw an exception. Each method documents its behaviour.\u003c/p\u003e\n *\n * @author Apache Software Foundation\n * @author Moritz Petersen\n * @author \u003ca href\u003d\"mailto:fredrik@westermarck.com\"\u003eFredrik Westermarck\u003c/a\u003e\n * @author Nikolay Metchev\n * @author Matthew Hawthorne\n * @author Tim O\u0027Brien\n * @author Pete Gieser\n * @author Gary Gregory\n * @author \u003ca href\u003d\"mailto:equinus100@hotmail.com\"\u003eAshwin S\u003c/a\u003e\n * @author Maarten Coene\n * @author \u003ca href\u003d\"mailto:levon@lk.otherinbox.com\"\u003eLevon Karayan\u003c/a\u003e\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_OBJECT_ARRAY"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * An empty immutable \u003ccode\u003eObject\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_CLASS_ARRAY"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * An empty immutable \u003ccode\u003eClass\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_STRING_ARRAY"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * An empty immutable \u003ccode\u003eString\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_LONG_ARRAY"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * An empty immutable \u003ccode\u003elong\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_LONG_OBJECT_ARRAY"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * An empty immutable \u003ccode\u003eLong\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_INT_ARRAY"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * An empty immutable \u003ccode\u003eint\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_INTEGER_OBJECT_ARRAY"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * An empty immutable \u003ccode\u003eInteger\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_SHORT_ARRAY"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * An empty immutable \u003ccode\u003eshort\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_SHORT_OBJECT_ARRAY"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n     * An empty immutable \u003ccode\u003eShort\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_BYTE_ARRAY"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * An empty immutable \u003ccode\u003ebyte\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_BYTE_OBJECT_ARRAY"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * An empty immutable \u003ccode\u003eByte\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_DOUBLE_ARRAY"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * An empty immutable \u003ccode\u003edouble\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_DOUBLE_OBJECT_ARRAY"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": "\n     * An empty immutable \u003ccode\u003eDouble\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_FLOAT_ARRAY"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n     * An empty immutable \u003ccode\u003efloat\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_FLOAT_OBJECT_ARRAY"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": "\n     * An empty immutable \u003ccode\u003eFloat\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_BOOLEAN_ARRAY"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": "\n     * An empty immutable \u003ccode\u003eboolean\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_BOOLEAN_OBJECT_ARRAY"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": "\n     * An empty immutable \u003ccode\u003eBoolean\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_CHAR_ARRAY"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n     * An empty immutable \u003ccode\u003echar\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_CHARACTER_OBJECT_ARRAY"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n     * An empty immutable \u003ccode\u003eCharacter\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INDEX_NOT_FOUND"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n     * The index value when an element is not found in a list or array: \u003ccode\u003e-1\u003c/code\u003e.\n     * This value is returned by methods in this class and can also be used in comparisons with values returned by\n     * various method from {@link java.util.List}.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.ArrayUtils.ArrayUtils()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * \u003cp\u003eArrayUtils instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as \u003ccode\u003eArrayUtils.clone(new int[] {2})\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 144,col 7)-(line 144,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toString(java.lang.Object)",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * \u003cp\u003eOutputs an array as a String, treating \u003ccode\u003enull\u003c/code\u003e as an empty array.\u003c/p\u003e\n     *\n     * \u003cp\u003eMulti-dimensional arrays are handled correctly, including\n     * multi-dimensional primitive arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format is that of Java source code, for example \u003ccode\u003e{a,b}\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to get a toString for, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a String representation of the array, \u0027{}\u0027 if null array input\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toString(java.lang.Object, java.lang.String)",
      "begin_line": 176,
      "end_line": 181,
      "comment": "\n     * \u003cp\u003eOutputs an array as a String handling \u003ccode\u003enull\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003cp\u003eMulti-dimensional arrays are handled correctly, including\n     * multi-dimensional primitive arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format is that of Java source code, for example \u003ccode\u003e{a,b}\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to get a toString for, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param stringIfNull  the String to return if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @return a String representation of the array\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEquals(java.lang.Object, java.lang.Object)",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * \u003cp\u003eCompares two arrays, using equals(), handling multi-dimensional arrays\n     * correctly.\u003c/p\u003e\n     *\n     * \u003cp\u003eMulti-dimensional primitive arrays are also handled correctly by this method.\u003c/p\u003e\n     *\n     * @param array1  the left hand array to compare, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2  the right hand array to compare, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the arrays are equal\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toMap(java.lang.Object[])",
      "begin_line": 224,
      "end_line": 249,
      "comment": "\n     * \u003cp\u003eConverts the given array into a {@link java.util.Map}. Each element of the array\n     * must be either a {@link java.util.Map.Entry} or an Array, containing at least two\n     * elements, where the first element is used as key and the second as\n     * value.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method can be used to initialize:\u003c/p\u003e\n     * \u003cpre\u003e\n     * // Create a Map mapping colors.\n     * Map colorMap \u003d MapUtils.toMap(new String[][] {{\n     *     {\"RED\", \"#FF0000\"},\n     *     {\"GREEN\", \"#00FF00\"},\n     *     {\"BLUE\", \"#0000FF\"}});\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  an array whose elements are either a {@link java.util.Map.Entry} or\n     *  an Array containing at least two elements, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eMap\u003c/code\u003e that was created from the array\n     * @throws IllegalArgumentException  if one element of this Array is\n     *  itself an Array containing less then two elements\n     * @throws IllegalArgumentException  if the array contains elements other\n     *  than {@link java.util.Map.Entry} and an Array\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 96)",
        "(line 229,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toArray(T...)",
      "begin_line": 291,
      "end_line": 294,
      "comment": "\n     * Create a type-safe generic array.\n     *\n     * \u003cp\u003eArrays are covariant i.e. they cannot be created from a generic type:\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n    public static \u0026lt;T\u0026gt; T[] createAnArray(int size)\n    {\n        return T[size]; // compiler error here\n    }\n    public static \u0026lt;T\u0026gt; T[] createAnArray(int size)\n    {\n        return (T[])Object[size]; // ClassCastException at runtime\n    }\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eTherefore new arrays of generic types can be created with this method, e.g. an arrays\n     * of Strings:\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n    String[] array \u003d ArrayUtils.toArray(\"1\", \"2\");\n    String[] emptyArray \u003d ArrayUtils.\u0026lt;String\u0026gt;toArray();\n     * \u003c/pre\u003e\n     * \n     * The method is typically used in scenarios, where the caller itself uses generic types\n     * that have to be combined into an array.\n     * \n     * Note, this method makes only sense to provide arguments of the same type so that the\n     * compiler can deduce the type of the array itself. While it is possible to select the\n     * type explicitly like in \u003ccode\u003eNumber[] array \u003d ArrayUtils.\u003cNumber\u003etoArray(new\n     * Integer(42), new Double(Math.PI))\u003c/code\u003e, there is no real advantage to \u003ccode\u003enew\n     * Number[] {new Integer(42), new Double(Math.PI)}\u003c/code\u003e anymore.\n     *\n     * @param  \u003cT\u003e   the array\u0027s element type\n     * @param  items the items of the array\n     * @return the array\n     * @since  3.0\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(T[])",
      "begin_line": 310,
      "end_line": 315,
      "comment": "\n     * \u003cp\u003eShallow clones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe objects in the array are not cloned, thus there is no special\n     * handling for multi-dimensional arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to shallow clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 314,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(long[])",
      "begin_line": 326,
      "end_line": 331,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 330,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(int[])",
      "begin_line": 342,
      "end_line": 347,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 346,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(short[])",
      "begin_line": 358,
      "end_line": 363,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 362,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(char[])",
      "begin_line": 374,
      "end_line": 379,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 377,col 9)",
        "(line 378,col 9)-(line 378,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(byte[])",
      "begin_line": 390,
      "end_line": 395,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 394,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(double[])",
      "begin_line": 406,
      "end_line": 411,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 410,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(float[])",
      "begin_line": 422,
      "end_line": 427,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(boolean[])",
      "begin_line": 438,
      "end_line": 443,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 442,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Object[])",
      "begin_line": 459,
      "end_line": 466,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a \u003ccode\u003enull\u003c/code\u003e\n     * reference to an empty one..\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with \n     * the empty \u003ccode\u003epublic static\u003c/code\u003e references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for \u003ccode\u003enull\u003c/code\u003e or empty\n     * @return the same array, \u003ccode\u003epublic static\u003c/code\u003e empty array if \u003ccode\u003enull\u003c/code\u003e or empty input\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 465,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.String[])",
      "begin_line": 480,
      "end_line": 487,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a \u003ccode\u003enull\u003c/code\u003e\n     * reference to an empty one..\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with \n     * the empty \u003ccode\u003epublic static\u003c/code\u003e references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for \u003ccode\u003enull\u003c/code\u003e or empty\n     * @return the same array, \u003ccode\u003epublic static\u003c/code\u003e empty array if \u003ccode\u003enull\u003c/code\u003e or empty input\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 485,col 9)",
        "(line 486,col 9)-(line 486,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(long[])",
      "begin_line": 501,
      "end_line": 509,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a \u003ccode\u003enull\u003c/code\u003e\n     * reference to an empty one..\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with \n     * the empty \u003ccode\u003epublic static\u003c/code\u003e references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for \u003ccode\u003enull\u003c/code\u003e or empty\n     * @return the same array, \u003ccode\u003epublic static\u003c/code\u003e empty array if \u003ccode\u003enull\u003c/code\u003e or empty input\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 507,col 9)",
        "(line 508,col 9)-(line 508,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(int[])",
      "begin_line": 523,
      "end_line": 530,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a \u003ccode\u003enull\u003c/code\u003e\n     * reference to an empty one..\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with \n     * the empty \u003ccode\u003epublic static\u003c/code\u003e references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for \u003ccode\u003enull\u003c/code\u003e or empty\n     * @return the same array, \u003ccode\u003epublic static\u003c/code\u003e empty array if \u003ccode\u003enull\u003c/code\u003e or empty input\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 529,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(short[])",
      "begin_line": 544,
      "end_line": 551,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a \u003ccode\u003enull\u003c/code\u003e\n     * reference to an empty one..\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with \n     * the empty \u003ccode\u003epublic static\u003c/code\u003e references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for \u003ccode\u003enull\u003c/code\u003e or empty\n     * @return the same array, \u003ccode\u003epublic static\u003c/code\u003e empty array if \u003ccode\u003enull\u003c/code\u003e or empty input\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 550,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(char[])",
      "begin_line": 565,
      "end_line": 572,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a \u003ccode\u003enull\u003c/code\u003e\n     * reference to an empty one..\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with \n     * the empty \u003ccode\u003epublic static\u003c/code\u003e references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for \u003ccode\u003enull\u003c/code\u003e or empty\n     * @return the same array, \u003ccode\u003epublic static\u003c/code\u003e empty array if \u003ccode\u003enull\u003c/code\u003e or empty input\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 570,col 9)",
        "(line 571,col 9)-(line 571,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(byte[])",
      "begin_line": 586,
      "end_line": 593,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a \u003ccode\u003enull\u003c/code\u003e\n     * reference to an empty one..\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with \n     * the empty \u003ccode\u003epublic static\u003c/code\u003e references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for \u003ccode\u003enull\u003c/code\u003e or empty\n     * @return the same array, \u003ccode\u003epublic static\u003c/code\u003e empty array if \u003ccode\u003enull\u003c/code\u003e or empty input\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 591,col 9)",
        "(line 592,col 9)-(line 592,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(double[])",
      "begin_line": 607,
      "end_line": 614,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a \u003ccode\u003enull\u003c/code\u003e\n     * reference to an empty one..\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with \n     * the empty \u003ccode\u003epublic static\u003c/code\u003e references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for \u003ccode\u003enull\u003c/code\u003e or empty\n     * @return the same array, \u003ccode\u003epublic static\u003c/code\u003e empty array if \u003ccode\u003enull\u003c/code\u003e or empty input\n     ",
      "child_ranges": [
        "(line 608,col 9)-(line 612,col 9)",
        "(line 613,col 9)-(line 613,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(float[])",
      "begin_line": 628,
      "end_line": 635,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a \u003ccode\u003enull\u003c/code\u003e\n     * reference to an empty one..\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with \n     * the empty \u003ccode\u003epublic static\u003c/code\u003e references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for \u003ccode\u003enull\u003c/code\u003e or empty\n     * @return the same array, \u003ccode\u003epublic static\u003c/code\u003e empty array if \u003ccode\u003enull\u003c/code\u003e or empty input\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 633,col 9)",
        "(line 634,col 9)-(line 634,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(boolean[])",
      "begin_line": 649,
      "end_line": 656,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a \u003ccode\u003enull\u003c/code\u003e\n     * reference to an empty one..\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with \n     * the empty \u003ccode\u003epublic static\u003c/code\u003e references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for \u003ccode\u003enull\u003c/code\u003e or empty\n     * @return the same array, \u003ccode\u003epublic static\u003c/code\u003e empty array if \u003ccode\u003enull\u003c/code\u003e or empty input\n     ",
      "child_ranges": [
        "(line 650,col 9)-(line 654,col 9)",
        "(line 655,col 9)-(line 655,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Long[])",
      "begin_line": 670,
      "end_line": 677,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a \u003ccode\u003enull\u003c/code\u003e\n     * reference to an empty one..\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with \n     * the empty \u003ccode\u003epublic static\u003c/code\u003e references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for \u003ccode\u003enull\u003c/code\u003e or empty\n     * @return the same array, \u003ccode\u003epublic static\u003c/code\u003e empty array if \u003ccode\u003enull\u003c/code\u003e or empty input\n     ",
      "child_ranges": [
        "(line 671,col 9)-(line 675,col 9)",
        "(line 676,col 9)-(line 676,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Integer[])",
      "begin_line": 691,
      "end_line": 698,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a \u003ccode\u003enull\u003c/code\u003e\n     * reference to an empty one..\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with \n     * the empty \u003ccode\u003epublic static\u003c/code\u003e references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for \u003ccode\u003enull\u003c/code\u003e or empty\n     * @return the same array, \u003ccode\u003epublic static\u003c/code\u003e empty array if \u003ccode\u003enull\u003c/code\u003e or empty input\n     ",
      "child_ranges": [
        "(line 692,col 9)-(line 696,col 9)",
        "(line 697,col 9)-(line 697,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Short[])",
      "begin_line": 712,
      "end_line": 719,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a \u003ccode\u003enull\u003c/code\u003e\n     * reference to an empty one..\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with \n     * the empty \u003ccode\u003epublic static\u003c/code\u003e references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for \u003ccode\u003enull\u003c/code\u003e or empty\n     * @return the same array, \u003ccode\u003epublic static\u003c/code\u003e empty array if \u003ccode\u003enull\u003c/code\u003e or empty input\n     ",
      "child_ranges": [
        "(line 713,col 9)-(line 717,col 9)",
        "(line 718,col 9)-(line 718,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Character[])",
      "begin_line": 733,
      "end_line": 740,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a \u003ccode\u003enull\u003c/code\u003e\n     * reference to an empty one..\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with \n     * the empty \u003ccode\u003epublic static\u003c/code\u003e references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for \u003ccode\u003enull\u003c/code\u003e or empty\n     * @return the same array, \u003ccode\u003epublic static\u003c/code\u003e empty array if \u003ccode\u003enull\u003c/code\u003e or empty input\n     ",
      "child_ranges": [
        "(line 734,col 9)-(line 738,col 9)",
        "(line 739,col 9)-(line 739,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Byte[])",
      "begin_line": 754,
      "end_line": 761,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a \u003ccode\u003enull\u003c/code\u003e\n     * reference to an empty one..\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with \n     * the empty \u003ccode\u003epublic static\u003c/code\u003e references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for \u003ccode\u003enull\u003c/code\u003e or empty\n     * @return the same array, \u003ccode\u003epublic static\u003c/code\u003e empty array if \u003ccode\u003enull\u003c/code\u003e or empty input\n     ",
      "child_ranges": [
        "(line 755,col 9)-(line 759,col 9)",
        "(line 760,col 9)-(line 760,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Double[])",
      "begin_line": 775,
      "end_line": 782,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a \u003ccode\u003enull\u003c/code\u003e\n     * reference to an empty one..\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with \n     * the empty \u003ccode\u003epublic static\u003c/code\u003e references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for \u003ccode\u003enull\u003c/code\u003e or empty\n     * @return the same array, \u003ccode\u003epublic static\u003c/code\u003e empty array if \u003ccode\u003enull\u003c/code\u003e or empty input\n     ",
      "child_ranges": [
        "(line 776,col 9)-(line 780,col 9)",
        "(line 781,col 9)-(line 781,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Float[])",
      "begin_line": 796,
      "end_line": 803,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a \u003ccode\u003enull\u003c/code\u003e\n     * reference to an empty one..\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with \n     * the empty \u003ccode\u003epublic static\u003c/code\u003e references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for \u003ccode\u003enull\u003c/code\u003e or empty\n     * @return the same array, \u003ccode\u003epublic static\u003c/code\u003e empty array if \u003ccode\u003enull\u003c/code\u003e or empty input\n     ",
      "child_ranges": [
        "(line 797,col 9)-(line 801,col 9)",
        "(line 802,col 9)-(line 802,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Boolean[])",
      "begin_line": 817,
      "end_line": 824,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a \u003ccode\u003enull\u003c/code\u003e\n     * reference to an empty one..\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with \n     * the empty \u003ccode\u003epublic static\u003c/code\u003e references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for \u003ccode\u003enull\u003c/code\u003e or empty\n     * @return the same array, \u003ccode\u003epublic static\u003c/code\u003e empty array if \u003ccode\u003enull\u003c/code\u003e or empty input\n     ",
      "child_ranges": [
        "(line 818,col 9)-(line 822,col 9)",
        "(line 823,col 9)-(line 823,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(T[], int, int)",
      "begin_line": 855,
      "end_line": 876,
      "comment": "\n     * \u003cp\u003eProduces a new array containing the elements between\n     * the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe component type of the subarray is always the same as\n     * that of the input array. Thus, if the input is an array of type\n     * \u003ccode\u003eDate\u003c/code\u003e, the following usage is envisaged:\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Date[] someDates \u003d (Date[])ArrayUtils.subarray(allDates, 2, 5);\n     * \u003c/pre\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 856,col 9)-(line 858,col 9)",
        "(line 859,col 9)-(line 861,col 9)",
        "(line 862,col 9)-(line 864,col 9)",
        "(line 865,col 9)-(line 865,col 62)",
        "(line 866,col 9)-(line 866,col 60)",
        "(line 867,col 9)-(line 871,col 9)",
        "(line 872,col 9)-(line 873,col 62)",
        "(line 874,col 9)-(line 874,col 75)",
        "(line 875,col 9)-(line 875,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(long[], int, int)",
      "begin_line": 897,
      "end_line": 915,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003elong\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 898,col 9)-(line 900,col 9)",
        "(line 901,col 9)-(line 903,col 9)",
        "(line 904,col 9)-(line 906,col 9)",
        "(line 907,col 9)-(line 907,col 62)",
        "(line 908,col 9)-(line 910,col 9)",
        "(line 912,col 9)-(line 912,col 44)",
        "(line 913,col 9)-(line 913,col 75)",
        "(line 914,col 9)-(line 914,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(int[], int, int)",
      "begin_line": 936,
      "end_line": 954,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003eint\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 937,col 9)-(line 939,col 9)",
        "(line 940,col 9)-(line 942,col 9)",
        "(line 943,col 9)-(line 945,col 9)",
        "(line 946,col 9)-(line 946,col 62)",
        "(line 947,col 9)-(line 949,col 9)",
        "(line 951,col 9)-(line 951,col 42)",
        "(line 952,col 9)-(line 952,col 75)",
        "(line 953,col 9)-(line 953,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(short[], int, int)",
      "begin_line": 975,
      "end_line": 993,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003eshort\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 976,col 9)-(line 978,col 9)",
        "(line 979,col 9)-(line 981,col 9)",
        "(line 982,col 9)-(line 984,col 9)",
        "(line 985,col 9)-(line 985,col 62)",
        "(line 986,col 9)-(line 988,col 9)",
        "(line 990,col 9)-(line 990,col 46)",
        "(line 991,col 9)-(line 991,col 75)",
        "(line 992,col 9)-(line 992,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(char[], int, int)",
      "begin_line": 1014,
      "end_line": 1032,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003echar\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1015,col 9)-(line 1017,col 9)",
        "(line 1018,col 9)-(line 1020,col 9)",
        "(line 1021,col 9)-(line 1023,col 9)",
        "(line 1024,col 9)-(line 1024,col 62)",
        "(line 1025,col 9)-(line 1027,col 9)",
        "(line 1029,col 9)-(line 1029,col 44)",
        "(line 1030,col 9)-(line 1030,col 75)",
        "(line 1031,col 9)-(line 1031,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(byte[], int, int)",
      "begin_line": 1053,
      "end_line": 1071,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003ebyte\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1054,col 9)-(line 1056,col 9)",
        "(line 1057,col 9)-(line 1059,col 9)",
        "(line 1060,col 9)-(line 1062,col 9)",
        "(line 1063,col 9)-(line 1063,col 62)",
        "(line 1064,col 9)-(line 1066,col 9)",
        "(line 1068,col 9)-(line 1068,col 44)",
        "(line 1069,col 9)-(line 1069,col 75)",
        "(line 1070,col 9)-(line 1070,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(double[], int, int)",
      "begin_line": 1092,
      "end_line": 1110,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003edouble\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1093,col 9)-(line 1095,col 9)",
        "(line 1096,col 9)-(line 1098,col 9)",
        "(line 1099,col 9)-(line 1101,col 9)",
        "(line 1102,col 9)-(line 1102,col 62)",
        "(line 1103,col 9)-(line 1105,col 9)",
        "(line 1107,col 9)-(line 1107,col 48)",
        "(line 1108,col 9)-(line 1108,col 75)",
        "(line 1109,col 9)-(line 1109,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(float[], int, int)",
      "begin_line": 1131,
      "end_line": 1149,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003efloat\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1132,col 9)-(line 1134,col 9)",
        "(line 1135,col 9)-(line 1137,col 9)",
        "(line 1138,col 9)-(line 1140,col 9)",
        "(line 1141,col 9)-(line 1141,col 62)",
        "(line 1142,col 9)-(line 1144,col 9)",
        "(line 1146,col 9)-(line 1146,col 46)",
        "(line 1147,col 9)-(line 1147,col 75)",
        "(line 1148,col 9)-(line 1148,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(boolean[], int, int)",
      "begin_line": 1170,
      "end_line": 1188,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003eboolean\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1171,col 9)-(line 1173,col 9)",
        "(line 1174,col 9)-(line 1176,col 9)",
        "(line 1177,col 9)-(line 1179,col 9)",
        "(line 1180,col 9)-(line 1180,col 62)",
        "(line 1181,col 9)-(line 1183,col 9)",
        "(line 1185,col 9)-(line 1185,col 50)",
        "(line 1186,col 9)-(line 1186,col 75)",
        "(line 1187,col 9)-(line 1187,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(java.lang.Object[], java.lang.Object[])",
      "begin_line": 1203,
      "end_line": 1210,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\n     *\n     * \u003cp\u003eAny multi-dimensional aspects of the arrays are ignored.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 1204,col 9)-(line 1208,col 9)",
        "(line 1209,col 9)-(line 1209,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(long[], long[])",
      "begin_line": 1221,
      "end_line": 1228,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 1222,col 9)-(line 1226,col 9)",
        "(line 1227,col 9)-(line 1227,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(int[], int[])",
      "begin_line": 1239,
      "end_line": 1246,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 1240,col 9)-(line 1244,col 9)",
        "(line 1245,col 9)-(line 1245,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(short[], short[])",
      "begin_line": 1257,
      "end_line": 1264,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 1258,col 9)-(line 1262,col 9)",
        "(line 1263,col 9)-(line 1263,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(char[], char[])",
      "begin_line": 1275,
      "end_line": 1282,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 1276,col 9)-(line 1280,col 9)",
        "(line 1281,col 9)-(line 1281,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(byte[], byte[])",
      "begin_line": 1293,
      "end_line": 1300,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 1294,col 9)-(line 1298,col 9)",
        "(line 1299,col 9)-(line 1299,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(double[], double[])",
      "begin_line": 1311,
      "end_line": 1318,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 1312,col 9)-(line 1316,col 9)",
        "(line 1317,col 9)-(line 1317,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(float[], float[])",
      "begin_line": 1329,
      "end_line": 1336,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 1330,col 9)-(line 1334,col 9)",
        "(line 1335,col 9)-(line 1335,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(boolean[], boolean[])",
      "begin_line": 1347,
      "end_line": 1354,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 1348,col 9)-(line 1352,col 9)",
        "(line 1353,col 9)-(line 1353,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.getLength(java.lang.Object)",
      "begin_line": 1377,
      "end_line": 1382,
      "comment": "\n     * \u003cp\u003eReturns the length of the specified array.\n     * This method can deal with \u003ccode\u003eObject\u003c/code\u003e arrays and with primitive arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003e0\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.getLength(null)            \u003d 0\n     * ArrayUtils.getLength([])              \u003d 0\n     * ArrayUtils.getLength([null])          \u003d 1\n     * ArrayUtils.getLength([true, false])   \u003d 2\n     * ArrayUtils.getLength([1, 2, 3])       \u003d 3\n     * ArrayUtils.getLength([\"a\", \"b\", \"c\"]) \u003d 3\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to retrieve the length from, may be null\n     * @return The length of the array, or \u003ccode\u003e0\u003c/code\u003e if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the object arguement is not an array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1378,col 9)-(line 1380,col 9)",
        "(line 1381,col 9)-(line 1381,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameType(java.lang.Object, java.lang.Object)",
      "begin_line": 1393,
      "end_line": 1398,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same type taking into account\n     * multi-dimensional arrays.\u003c/p\u003e\n     *\n     * @param array1 the first array, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if type of arrays matches\n     * @throws IllegalArgumentException if either array is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1394,col 9)-(line 1396,col 9)",
        "(line 1397,col 9)-(line 1397,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(java.lang.Object[])",
      "begin_line": 1411,
      "end_line": 1425,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThere is no special handling for multi-dimensional arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1412,col 9)-(line 1414,col 9)",
        "(line 1415,col 9)-(line 1415,col 18)",
        "(line 1416,col 9)-(line 1416,col 33)",
        "(line 1417,col 9)-(line 1417,col 19)",
        "(line 1418,col 9)-(line 1424,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(long[])",
      "begin_line": 1434,
      "end_line": 1448,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1435,col 9)-(line 1437,col 9)",
        "(line 1438,col 9)-(line 1438,col 18)",
        "(line 1439,col 9)-(line 1439,col 33)",
        "(line 1440,col 9)-(line 1440,col 17)",
        "(line 1441,col 9)-(line 1447,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(int[])",
      "begin_line": 1457,
      "end_line": 1471,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1458,col 9)-(line 1460,col 9)",
        "(line 1461,col 9)-(line 1461,col 18)",
        "(line 1462,col 9)-(line 1462,col 33)",
        "(line 1463,col 9)-(line 1463,col 16)",
        "(line 1464,col 9)-(line 1470,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(short[])",
      "begin_line": 1480,
      "end_line": 1494,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1481,col 9)-(line 1483,col 9)",
        "(line 1484,col 9)-(line 1484,col 18)",
        "(line 1485,col 9)-(line 1485,col 33)",
        "(line 1486,col 9)-(line 1486,col 18)",
        "(line 1487,col 9)-(line 1493,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(char[])",
      "begin_line": 1503,
      "end_line": 1517,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1504,col 9)-(line 1506,col 9)",
        "(line 1507,col 9)-(line 1507,col 18)",
        "(line 1508,col 9)-(line 1508,col 33)",
        "(line 1509,col 9)-(line 1509,col 17)",
        "(line 1510,col 9)-(line 1516,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(byte[])",
      "begin_line": 1526,
      "end_line": 1540,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1527,col 9)-(line 1529,col 9)",
        "(line 1530,col 9)-(line 1530,col 18)",
        "(line 1531,col 9)-(line 1531,col 33)",
        "(line 1532,col 9)-(line 1532,col 17)",
        "(line 1533,col 9)-(line 1539,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(double[])",
      "begin_line": 1549,
      "end_line": 1563,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1550,col 9)-(line 1552,col 9)",
        "(line 1553,col 9)-(line 1553,col 18)",
        "(line 1554,col 9)-(line 1554,col 33)",
        "(line 1555,col 9)-(line 1555,col 19)",
        "(line 1556,col 9)-(line 1562,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(float[])",
      "begin_line": 1572,
      "end_line": 1586,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1573,col 9)-(line 1575,col 9)",
        "(line 1576,col 9)-(line 1576,col 18)",
        "(line 1577,col 9)-(line 1577,col 33)",
        "(line 1578,col 9)-(line 1578,col 18)",
        "(line 1579,col 9)-(line 1585,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(boolean[])",
      "begin_line": 1595,
      "end_line": 1609,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1596,col 9)-(line 1598,col 9)",
        "(line 1599,col 9)-(line 1599,col 18)",
        "(line 1600,col 9)-(line 1600,col 33)",
        "(line 1601,col 9)-(line 1601,col 20)",
        "(line 1602,col 9)-(line 1608,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(java.lang.Object[], java.lang.Object)",
      "begin_line": 1626,
      "end_line": 1628,
      "comment": "\n     * \u003cp\u003eFinds the index of the given object in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param objectToFind  the object to find, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the index of the object within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1627,col 9)-(line 1627,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(java.lang.Object[], java.lang.Object, int)",
      "begin_line": 1644,
      "end_line": 1665,
      "comment": "\n     * \u003cp\u003eFinds the index of the given object in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param objectToFind  the object to find, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param startIndex  the index to start searching at\n     * @return the index of the object within the array starting at the index,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1645,col 9)-(line 1647,col 9)",
        "(line 1648,col 9)-(line 1650,col 9)",
        "(line 1651,col 9)-(line 1663,col 9)",
        "(line 1664,col 9)-(line 1664,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(java.lang.Object[], java.lang.Object)",
      "begin_line": 1677,
      "end_line": 1679,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given object within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param objectToFind  the object to find, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the last index of the object within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1678,col 9)-(line 1678,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(java.lang.Object[], java.lang.Object, int)",
      "begin_line": 1695,
      "end_line": 1718,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given object in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than\n     * the array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param objectToFind  the object to find, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the object within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1696,col 9)-(line 1698,col 9)",
        "(line 1699,col 9)-(line 1703,col 9)",
        "(line 1704,col 9)-(line 1716,col 9)",
        "(line 1717,col 9)-(line 1717,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(java.lang.Object[], java.lang.Object)",
      "begin_line": 1729,
      "end_line": 1731,
      "comment": "\n     * \u003cp\u003eChecks if the object is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param objectToFind  the object to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 1730,col 9)-(line 1730,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(long[], long)",
      "begin_line": 1745,
      "end_line": 1747,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1746,col 9)-(line 1746,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(long[], long, int)",
      "begin_line": 1763,
      "end_line": 1776,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1764,col 9)-(line 1766,col 9)",
        "(line 1767,col 9)-(line 1769,col 9)",
        "(line 1770,col 9)-(line 1774,col 9)",
        "(line 1775,col 9)-(line 1775,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(long[], long)",
      "begin_line": 1788,
      "end_line": 1790,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1789,col 9)-(line 1789,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(long[], long, int)",
      "begin_line": 1806,
      "end_line": 1821,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1807,col 9)-(line 1809,col 9)",
        "(line 1810,col 9)-(line 1814,col 9)",
        "(line 1815,col 9)-(line 1819,col 9)",
        "(line 1820,col 9)-(line 1820,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(long[], long)",
      "begin_line": 1832,
      "end_line": 1834,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 1833,col 9)-(line 1833,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(int[], int)",
      "begin_line": 1848,
      "end_line": 1850,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1849,col 9)-(line 1849,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(int[], int, int)",
      "begin_line": 1866,
      "end_line": 1879,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1867,col 9)-(line 1869,col 9)",
        "(line 1870,col 9)-(line 1872,col 9)",
        "(line 1873,col 9)-(line 1877,col 9)",
        "(line 1878,col 9)-(line 1878,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(int[], int)",
      "begin_line": 1891,
      "end_line": 1893,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1892,col 9)-(line 1892,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(int[], int, int)",
      "begin_line": 1909,
      "end_line": 1924,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1910,col 9)-(line 1912,col 9)",
        "(line 1913,col 9)-(line 1917,col 9)",
        "(line 1918,col 9)-(line 1922,col 9)",
        "(line 1923,col 9)-(line 1923,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(int[], int)",
      "begin_line": 1935,
      "end_line": 1937,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 1936,col 9)-(line 1936,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(short[], short)",
      "begin_line": 1951,
      "end_line": 1953,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1952,col 9)-(line 1952,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(short[], short, int)",
      "begin_line": 1969,
      "end_line": 1982,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1970,col 9)-(line 1972,col 9)",
        "(line 1973,col 9)-(line 1975,col 9)",
        "(line 1976,col 9)-(line 1980,col 9)",
        "(line 1981,col 9)-(line 1981,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(short[], short)",
      "begin_line": 1994,
      "end_line": 1996,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1995,col 9)-(line 1995,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(short[], short, int)",
      "begin_line": 2012,
      "end_line": 2027,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2013,col 9)-(line 2015,col 9)",
        "(line 2016,col 9)-(line 2020,col 9)",
        "(line 2021,col 9)-(line 2025,col 9)",
        "(line 2026,col 9)-(line 2026,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(short[], short)",
      "begin_line": 2038,
      "end_line": 2040,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 2039,col 9)-(line 2039,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(char[], char)",
      "begin_line": 2055,
      "end_line": 2057,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2056,col 9)-(line 2056,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(char[], char, int)",
      "begin_line": 2074,
      "end_line": 2087,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2075,col 9)-(line 2077,col 9)",
        "(line 2078,col 9)-(line 2080,col 9)",
        "(line 2081,col 9)-(line 2085,col 9)",
        "(line 2086,col 9)-(line 2086,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(char[], char)",
      "begin_line": 2100,
      "end_line": 2102,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2101,col 9)-(line 2101,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(char[], char, int)",
      "begin_line": 2119,
      "end_line": 2134,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2120,col 9)-(line 2122,col 9)",
        "(line 2123,col 9)-(line 2127,col 9)",
        "(line 2128,col 9)-(line 2132,col 9)",
        "(line 2133,col 9)-(line 2133,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(char[], char)",
      "begin_line": 2146,
      "end_line": 2148,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2147,col 9)-(line 2147,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(byte[], byte)",
      "begin_line": 2162,
      "end_line": 2164,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2163,col 9)-(line 2163,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(byte[], byte, int)",
      "begin_line": 2180,
      "end_line": 2193,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2181,col 9)-(line 2183,col 9)",
        "(line 2184,col 9)-(line 2186,col 9)",
        "(line 2187,col 9)-(line 2191,col 9)",
        "(line 2192,col 9)-(line 2192,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(byte[], byte)",
      "begin_line": 2205,
      "end_line": 2207,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2206,col 9)-(line 2206,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(byte[], byte, int)",
      "begin_line": 2223,
      "end_line": 2238,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2224,col 9)-(line 2226,col 9)",
        "(line 2227,col 9)-(line 2231,col 9)",
        "(line 2232,col 9)-(line 2236,col 9)",
        "(line 2237,col 9)-(line 2237,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(byte[], byte)",
      "begin_line": 2249,
      "end_line": 2251,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 2250,col 9)-(line 2250,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(double[], double)",
      "begin_line": 2265,
      "end_line": 2267,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2266,col 9)-(line 2266,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(double[], double, double)",
      "begin_line": 2282,
      "end_line": 2284,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value within a given tolerance in the array.\n     * This method will return the index of the first value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param tolerance tolerance of the search\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2283,col 9)-(line 2283,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(double[], double, int)",
      "begin_line": 2300,
      "end_line": 2313,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2301,col 9)-(line 2303,col 9)",
        "(line 2304,col 9)-(line 2306,col 9)",
        "(line 2307,col 9)-(line 2311,col 9)",
        "(line 2312,col 9)-(line 2312,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(double[], double, int, double)",
      "begin_line": 2332,
      "end_line": 2347,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\n     * This method will return the index of the first value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @param tolerance tolerance of the search\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2333,col 9)-(line 2335,col 9)",
        "(line 2336,col 9)-(line 2338,col 9)",
        "(line 2339,col 9)-(line 2339,col 45)",
        "(line 2340,col 9)-(line 2340,col 45)",
        "(line 2341,col 9)-(line 2345,col 9)",
        "(line 2346,col 9)-(line 2346,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(double[], double)",
      "begin_line": 2359,
      "end_line": 2361,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2360,col 9)-(line 2360,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(double[], double, double)",
      "begin_line": 2376,
      "end_line": 2378,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within a given tolerance in the array.\n     * This method will return the index of the last value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param tolerance tolerance of the search\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2377,col 9)-(line 2377,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(double[], double, int)",
      "begin_line": 2394,
      "end_line": 2409,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2395,col 9)-(line 2397,col 9)",
        "(line 2398,col 9)-(line 2402,col 9)",
        "(line 2403,col 9)-(line 2407,col 9)",
        "(line 2408,col 9)-(line 2408,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(double[], double, int, double)",
      "begin_line": 2428,
      "end_line": 2445,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\n     * This method will return the index of the last value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @param tolerance  search for value within plus/minus this amount\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2429,col 9)-(line 2431,col 9)",
        "(line 2432,col 9)-(line 2436,col 9)",
        "(line 2437,col 9)-(line 2437,col 45)",
        "(line 2438,col 9)-(line 2438,col 45)",
        "(line 2439,col 9)-(line 2443,col 9)",
        "(line 2444,col 9)-(line 2444,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(double[], double)",
      "begin_line": 2456,
      "end_line": 2458,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 2457,col 9)-(line 2457,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(double[], double, double)",
      "begin_line": 2473,
      "end_line": 2475,
      "comment": "\n     * \u003cp\u003eChecks if a value falling within the given tolerance is in the\n     * given array.  If the array contains a value within the inclusive range\n     * defined by (value - tolerance) to (value + tolerance).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array\n     * is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search\n     * @param valueToFind  the value to find\n     * @param tolerance  the array contains the tolerance of the search\n     * @return true if value falling within tolerance is in array\n     ",
      "child_ranges": [
        "(line 2474,col 9)-(line 2474,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(float[], float)",
      "begin_line": 2489,
      "end_line": 2491,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2490,col 9)-(line 2490,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(float[], float, int)",
      "begin_line": 2507,
      "end_line": 2520,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2508,col 9)-(line 2510,col 9)",
        "(line 2511,col 9)-(line 2513,col 9)",
        "(line 2514,col 9)-(line 2518,col 9)",
        "(line 2519,col 9)-(line 2519,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(float[], float)",
      "begin_line": 2532,
      "end_line": 2534,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2533,col 9)-(line 2533,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(float[], float, int)",
      "begin_line": 2550,
      "end_line": 2565,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2551,col 9)-(line 2553,col 9)",
        "(line 2554,col 9)-(line 2558,col 9)",
        "(line 2559,col 9)-(line 2563,col 9)",
        "(line 2564,col 9)-(line 2564,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(float[], float)",
      "begin_line": 2576,
      "end_line": 2578,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 2577,col 9)-(line 2577,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(boolean[], boolean)",
      "begin_line": 2592,
      "end_line": 2594,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2593,col 9)-(line 2593,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(boolean[], boolean, int)",
      "begin_line": 2611,
      "end_line": 2624,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e\n     *  array input\n     ",
      "child_ranges": [
        "(line 2612,col 9)-(line 2614,col 9)",
        "(line 2615,col 9)-(line 2617,col 9)",
        "(line 2618,col 9)-(line 2622,col 9)",
        "(line 2623,col 9)-(line 2623,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(boolean[], boolean)",
      "begin_line": 2637,
      "end_line": 2639,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if\n     * \u003ccode\u003enull\u003c/code\u003e array input.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2638,col 9)-(line 2638,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(boolean[], boolean, int)",
      "begin_line": 2655,
      "end_line": 2670,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than\n     * the array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2656,col 9)-(line 2658,col 9)",
        "(line 2659,col 9)-(line 2663,col 9)",
        "(line 2664,col 9)-(line 2668,col 9)",
        "(line 2669,col 9)-(line 2669,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(boolean[], boolean)",
      "begin_line": 2681,
      "end_line": 2683,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 2682,col 9)-(line 2682,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Character[])",
      "begin_line": 2699,
      "end_line": 2710,
      "comment": "\n     * \u003cp\u003eConverts an array of object Characters to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eCharacter\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003echar\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2700,col 9)-(line 2704,col 9)",
        "(line 2705,col 9)-(line 2705,col 53)",
        "(line 2706,col 9)-(line 2708,col 9)",
        "(line 2709,col 9)-(line 2709,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Character[], char)",
      "begin_line": 2721,
      "end_line": 2733,
      "comment": "\n     * \u003cp\u003eConverts an array of object Character to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eCharacter\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003echar\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2722,col 9)-(line 2726,col 9)",
        "(line 2727,col 9)-(line 2727,col 53)",
        "(line 2728,col 9)-(line 2731,col 9)",
        "(line 2732,col 9)-(line 2732,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(char[])",
      "begin_line": 2743,
      "end_line": 2754,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive chars to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array a \u003ccode\u003echar\u003c/code\u003e array\n     * @return a \u003ccode\u003eCharacter\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2744,col 9)-(line 2748,col 9)",
        "(line 2749,col 9)-(line 2749,col 63)",
        "(line 2750,col 9)-(line 2752,col 9)",
        "(line 2753,col 9)-(line 2753,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Long[])",
      "begin_line": 2767,
      "end_line": 2778,
      "comment": "\n     * \u003cp\u003eConverts an array of object Longs to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eLong\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003elong\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2768,col 9)-(line 2772,col 9)",
        "(line 2773,col 9)-(line 2773,col 53)",
        "(line 2774,col 9)-(line 2776,col 9)",
        "(line 2777,col 9)-(line 2777,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Long[], long)",
      "begin_line": 2789,
      "end_line": 2801,
      "comment": "\n     * \u003cp\u003eConverts an array of object Long to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eLong\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003elong\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2790,col 9)-(line 2794,col 9)",
        "(line 2795,col 9)-(line 2795,col 53)",
        "(line 2796,col 9)-(line 2799,col 9)",
        "(line 2800,col 9)-(line 2800,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(long[])",
      "begin_line": 2811,
      "end_line": 2822,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive longs to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003elong\u003c/code\u003e array\n     * @return a \u003ccode\u003eLong\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2812,col 9)-(line 2816,col 9)",
        "(line 2817,col 9)-(line 2817,col 53)",
        "(line 2818,col 9)-(line 2820,col 9)",
        "(line 2821,col 9)-(line 2821,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Integer[])",
      "begin_line": 2835,
      "end_line": 2846,
      "comment": "\n     * \u003cp\u003eConverts an array of object Integers to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eInteger\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return an \u003ccode\u003eint\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2836,col 9)-(line 2840,col 9)",
        "(line 2841,col 9)-(line 2841,col 51)",
        "(line 2842,col 9)-(line 2844,col 9)",
        "(line 2845,col 9)-(line 2845,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Integer[], int)",
      "begin_line": 2857,
      "end_line": 2869,
      "comment": "\n     * \u003cp\u003eConverts an array of object Integer to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eInteger\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return an \u003ccode\u003eint\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2858,col 9)-(line 2862,col 9)",
        "(line 2863,col 9)-(line 2863,col 51)",
        "(line 2864,col 9)-(line 2867,col 9)",
        "(line 2868,col 9)-(line 2868,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(int[])",
      "begin_line": 2879,
      "end_line": 2890,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive ints to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  an \u003ccode\u003eint\u003c/code\u003e array\n     * @return an \u003ccode\u003eInteger\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2880,col 9)-(line 2884,col 9)",
        "(line 2885,col 9)-(line 2885,col 59)",
        "(line 2886,col 9)-(line 2888,col 9)",
        "(line 2889,col 9)-(line 2889,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Short[])",
      "begin_line": 2903,
      "end_line": 2914,
      "comment": "\n     * \u003cp\u003eConverts an array of object Shorts to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eShort\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003ebyte\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2904,col 9)-(line 2908,col 9)",
        "(line 2909,col 9)-(line 2909,col 55)",
        "(line 2910,col 9)-(line 2912,col 9)",
        "(line 2913,col 9)-(line 2913,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Short[], short)",
      "begin_line": 2925,
      "end_line": 2937,
      "comment": "\n     * \u003cp\u003eConverts an array of object Short to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eShort\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003ebyte\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2926,col 9)-(line 2930,col 9)",
        "(line 2931,col 9)-(line 2931,col 55)",
        "(line 2932,col 9)-(line 2935,col 9)",
        "(line 2936,col 9)-(line 2936,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(short[])",
      "begin_line": 2947,
      "end_line": 2958,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive shorts to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eshort\u003c/code\u003e array\n     * @return a \u003ccode\u003eShort\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2948,col 9)-(line 2952,col 9)",
        "(line 2953,col 9)-(line 2953,col 55)",
        "(line 2954,col 9)-(line 2956,col 9)",
        "(line 2957,col 9)-(line 2957,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Byte[])",
      "begin_line": 2971,
      "end_line": 2982,
      "comment": "\n     * \u003cp\u003eConverts an array of object Bytes to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eByte\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003ebyte\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2972,col 9)-(line 2976,col 9)",
        "(line 2977,col 9)-(line 2977,col 53)",
        "(line 2978,col 9)-(line 2980,col 9)",
        "(line 2981,col 9)-(line 2981,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Byte[], byte)",
      "begin_line": 2993,
      "end_line": 3005,
      "comment": "\n     * \u003cp\u003eConverts an array of object Bytes to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eByte\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003ebyte\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2994,col 9)-(line 2998,col 9)",
        "(line 2999,col 9)-(line 2999,col 53)",
        "(line 3000,col 9)-(line 3003,col 9)",
        "(line 3004,col 9)-(line 3004,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(byte[])",
      "begin_line": 3015,
      "end_line": 3026,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive bytes to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003ebyte\u003c/code\u003e array\n     * @return a \u003ccode\u003eByte\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 3016,col 9)-(line 3020,col 9)",
        "(line 3021,col 9)-(line 3021,col 53)",
        "(line 3022,col 9)-(line 3024,col 9)",
        "(line 3025,col 9)-(line 3025,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Double[])",
      "begin_line": 3039,
      "end_line": 3050,
      "comment": "\n     * \u003cp\u003eConverts an array of object Doubles to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eDouble\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003edouble\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 3040,col 9)-(line 3044,col 9)",
        "(line 3045,col 9)-(line 3045,col 57)",
        "(line 3046,col 9)-(line 3048,col 9)",
        "(line 3049,col 9)-(line 3049,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Double[], double)",
      "begin_line": 3061,
      "end_line": 3073,
      "comment": "\n     * \u003cp\u003eConverts an array of object Doubles to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eDouble\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003edouble\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 3062,col 9)-(line 3066,col 9)",
        "(line 3067,col 9)-(line 3067,col 57)",
        "(line 3068,col 9)-(line 3071,col 9)",
        "(line 3072,col 9)-(line 3072,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(double[])",
      "begin_line": 3083,
      "end_line": 3094,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive doubles to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003edouble\u003c/code\u003e array\n     * @return a \u003ccode\u003eDouble\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 3084,col 9)-(line 3088,col 9)",
        "(line 3089,col 9)-(line 3089,col 57)",
        "(line 3090,col 9)-(line 3092,col 9)",
        "(line 3093,col 9)-(line 3093,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Float[])",
      "begin_line": 3107,
      "end_line": 3118,
      "comment": "\n     * \u003cp\u003eConverts an array of object Floats to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eFloat\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003efloat\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 3108,col 9)-(line 3112,col 9)",
        "(line 3113,col 9)-(line 3113,col 55)",
        "(line 3114,col 9)-(line 3116,col 9)",
        "(line 3117,col 9)-(line 3117,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Float[], float)",
      "begin_line": 3129,
      "end_line": 3141,
      "comment": "\n     * \u003cp\u003eConverts an array of object Floats to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eFloat\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003efloat\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 3130,col 9)-(line 3134,col 9)",
        "(line 3135,col 9)-(line 3135,col 55)",
        "(line 3136,col 9)-(line 3139,col 9)",
        "(line 3140,col 9)-(line 3140,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(float[])",
      "begin_line": 3151,
      "end_line": 3162,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive floats to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003efloat\u003c/code\u003e array\n     * @return a \u003ccode\u003eFloat\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 3152,col 9)-(line 3156,col 9)",
        "(line 3157,col 9)-(line 3157,col 55)",
        "(line 3158,col 9)-(line 3160,col 9)",
        "(line 3161,col 9)-(line 3161,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Boolean[])",
      "begin_line": 3175,
      "end_line": 3186,
      "comment": "\n     * \u003cp\u003eConverts an array of object Booleans to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eBoolean\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eboolean\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 3176,col 9)-(line 3180,col 9)",
        "(line 3181,col 9)-(line 3181,col 59)",
        "(line 3182,col 9)-(line 3184,col 9)",
        "(line 3185,col 9)-(line 3185,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Boolean[], boolean)",
      "begin_line": 3197,
      "end_line": 3209,
      "comment": "\n     * \u003cp\u003eConverts an array of object Booleans to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eBoolean\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003eboolean\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 3198,col 9)-(line 3202,col 9)",
        "(line 3203,col 9)-(line 3203,col 59)",
        "(line 3204,col 9)-(line 3207,col 9)",
        "(line 3208,col 9)-(line 3208,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(boolean[])",
      "begin_line": 3219,
      "end_line": 3230,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive booleans to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eboolean\u003c/code\u003e array\n     * @return a \u003ccode\u003eBoolean\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 3220,col 9)-(line 3224,col 9)",
        "(line 3225,col 9)-(line 3225,col 59)",
        "(line 3226,col 9)-(line 3228,col 9)",
        "(line 3229,col 9)-(line 3229,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(T[])",
      "begin_line": 3240,
      "end_line": 3245,
      "comment": "\n     * \u003cp\u003eChecks if an array of Objects is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3241,col 9)-(line 3243,col 9)",
        "(line 3244,col 9)-(line 3244,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(long[])",
      "begin_line": 3254,
      "end_line": 3259,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive longs is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3255,col 9)-(line 3257,col 9)",
        "(line 3258,col 9)-(line 3258,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(int[])",
      "begin_line": 3268,
      "end_line": 3273,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive ints is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3269,col 9)-(line 3271,col 9)",
        "(line 3272,col 9)-(line 3272,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(short[])",
      "begin_line": 3282,
      "end_line": 3287,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive shorts is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3283,col 9)-(line 3285,col 9)",
        "(line 3286,col 9)-(line 3286,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(char[])",
      "begin_line": 3296,
      "end_line": 3301,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive chars is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3297,col 9)-(line 3299,col 9)",
        "(line 3300,col 9)-(line 3300,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(byte[])",
      "begin_line": 3310,
      "end_line": 3315,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive bytes is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3311,col 9)-(line 3313,col 9)",
        "(line 3314,col 9)-(line 3314,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(double[])",
      "begin_line": 3324,
      "end_line": 3329,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive doubles is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3325,col 9)-(line 3327,col 9)",
        "(line 3328,col 9)-(line 3328,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(float[])",
      "begin_line": 3338,
      "end_line": 3343,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive floats is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3339,col 9)-(line 3341,col 9)",
        "(line 3342,col 9)-(line 3342,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(boolean[])",
      "begin_line": 3352,
      "end_line": 3357,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive booleans is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3353,col 9)-(line 3355,col 9)",
        "(line 3356,col 9)-(line 3356,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isNotEmpty(T[])",
      "begin_line": 3367,
      "end_line": 3369,
      "comment": "\n     * \u003cp\u003eChecks if an array of Objects is not empty or \u003ccode\u003enot null\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is not empty or \u003ccode\u003enot null\u003c/code\u003e\n     *\n     ",
      "child_ranges": [
        "(line 3368,col 10)-(line 3368,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isNotEmpty(long[])",
      "begin_line": 3378,
      "end_line": 3380,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive longs is not empty or \u003ccode\u003enot null\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is not empty or \u003ccode\u003enot null\u003c/code\u003e\n     *\n     ",
      "child_ranges": [
        "(line 3379,col 9)-(line 3379,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isNotEmpty(int[])",
      "begin_line": 3389,
      "end_line": 3391,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive ints is not empty or \u003ccode\u003enot null\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is not empty or \u003ccode\u003enot null\u003c/code\u003e\n     *\n     ",
      "child_ranges": [
        "(line 3390,col 9)-(line 3390,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isNotEmpty(short[])",
      "begin_line": 3400,
      "end_line": 3402,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive shorts is not empty or \u003ccode\u003enot null\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is not empty or \u003ccode\u003enot null\u003c/code\u003e\n     *\n     ",
      "child_ranges": [
        "(line 3401,col 9)-(line 3401,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isNotEmpty(char[])",
      "begin_line": 3411,
      "end_line": 3413,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive chars is not empty or \u003ccode\u003enot null\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is not empty or \u003ccode\u003enot null\u003c/code\u003e\n     *\n     ",
      "child_ranges": [
        "(line 3412,col 9)-(line 3412,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isNotEmpty(byte[])",
      "begin_line": 3422,
      "end_line": 3424,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive bytes is not empty or \u003ccode\u003enot null\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is not empty or \u003ccode\u003enot null\u003c/code\u003e\n     *\n     ",
      "child_ranges": [
        "(line 3423,col 9)-(line 3423,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isNotEmpty(double[])",
      "begin_line": 3433,
      "end_line": 3435,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive doubles is not empty or \u003ccode\u003enot null\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is not empty or \u003ccode\u003enot null\u003c/code\u003e\n     *\n     ",
      "child_ranges": [
        "(line 3434,col 9)-(line 3434,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isNotEmpty(float[])",
      "begin_line": 3444,
      "end_line": 3446,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive floats is not empty or \u003ccode\u003enot null\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is not empty or \u003ccode\u003enot null\u003c/code\u003e\n     *\n     ",
      "child_ranges": [
        "(line 3445,col 9)-(line 3445,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isNotEmpty(boolean[])",
      "begin_line": 3455,
      "end_line": 3457,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive booleans is not empty or \u003ccode\u003enot null\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is not empty or \u003ccode\u003enot null\u003c/code\u003e\n     *\n     ",
      "child_ranges": [
        "(line 3456,col 9)-(line 3456,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(T[], T...)",
      "begin_line": 3482,
      "end_line": 3508,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(null, null)     \u003d null\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * ArrayUtils.addAll([null], [null]) \u003d [null, null]\n     * ArrayUtils.addAll([\"a\", \"b\", \"c\"], [\"1\", \"2\", \"3\"]) \u003d [\"a\", \"b\", \"c\", \"1\", \"2\", \"3\"]\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2  the second array whose elements are added to the new array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return The new array, \u003ccode\u003enull\u003c/code\u003e if both arrays are \u003ccode\u003enull\u003c/code\u003e.\n     *      The type of the new array is the type of the first array,\n     *      unless the first array is null, in which case the type is the same as the second array.\n     * @since 2.1\n     * @throws IllegalArgumentException if the array types are incompatible\n     ",
      "child_ranges": [
        "(line 3483,col 9)-(line 3487,col 9)",
        "(line 3488,col 9)-(line 3488,col 68)",
        "(line 3489,col 9)-(line 3490,col 88)",
        "(line 3491,col 9)-(line 3491,col 67)",
        "(line 3492,col 9)-(line 3506,col 9)",
        "(line 3507,col 9)-(line 3507,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(boolean[], boolean...)",
      "begin_line": 3527,
      "end_line": 3537,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new boolean[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3528,col 9)-(line 3532,col 9)",
        "(line 3533,col 9)-(line 3533,col 75)",
        "(line 3534,col 9)-(line 3534,col 67)",
        "(line 3535,col 9)-(line 3535,col 79)",
        "(line 3536,col 9)-(line 3536,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(char[], char...)",
      "begin_line": 3556,
      "end_line": 3566,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new char[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3557,col 9)-(line 3561,col 9)",
        "(line 3562,col 9)-(line 3562,col 69)",
        "(line 3563,col 9)-(line 3563,col 67)",
        "(line 3564,col 9)-(line 3564,col 79)",
        "(line 3565,col 9)-(line 3565,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(byte[], byte...)",
      "begin_line": 3585,
      "end_line": 3595,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new byte[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3586,col 9)-(line 3590,col 9)",
        "(line 3591,col 9)-(line 3591,col 69)",
        "(line 3592,col 9)-(line 3592,col 67)",
        "(line 3593,col 9)-(line 3593,col 79)",
        "(line 3594,col 9)-(line 3594,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(short[], short...)",
      "begin_line": 3614,
      "end_line": 3624,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new short[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3615,col 9)-(line 3619,col 9)",
        "(line 3620,col 9)-(line 3620,col 71)",
        "(line 3621,col 9)-(line 3621,col 67)",
        "(line 3622,col 9)-(line 3622,col 79)",
        "(line 3623,col 9)-(line 3623,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(int[], int...)",
      "begin_line": 3643,
      "end_line": 3653,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new int[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3644,col 9)-(line 3648,col 9)",
        "(line 3649,col 9)-(line 3649,col 67)",
        "(line 3650,col 9)-(line 3650,col 67)",
        "(line 3651,col 9)-(line 3651,col 79)",
        "(line 3652,col 9)-(line 3652,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(long[], long...)",
      "begin_line": 3672,
      "end_line": 3682,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new long[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3673,col 9)-(line 3677,col 9)",
        "(line 3678,col 9)-(line 3678,col 69)",
        "(line 3679,col 9)-(line 3679,col 67)",
        "(line 3680,col 9)-(line 3680,col 79)",
        "(line 3681,col 9)-(line 3681,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(float[], float...)",
      "begin_line": 3701,
      "end_line": 3711,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new float[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3702,col 9)-(line 3706,col 9)",
        "(line 3707,col 9)-(line 3707,col 71)",
        "(line 3708,col 9)-(line 3708,col 67)",
        "(line 3709,col 9)-(line 3709,col 79)",
        "(line 3710,col 9)-(line 3710,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(double[], double...)",
      "begin_line": 3730,
      "end_line": 3740,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new double[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3731,col 9)-(line 3735,col 9)",
        "(line 3736,col 9)-(line 3736,col 73)",
        "(line 3737,col 9)-(line 3737,col 67)",
        "(line 3738,col 9)-(line 3738,col 79)",
        "(line 3739,col 9)-(line 3739,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(T[], T)",
      "begin_line": 3770,
      "end_line": 3783,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element, unless the element itself is null,\n     *  in which case the return type is Object[]\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, null)      \u003d [null]\n     * ArrayUtils.add(null, \"a\")       \u003d [\"a\"]\n     * ArrayUtils.add([\"a\"], null)     \u003d [\"a\", null]\n     * ArrayUtils.add([\"a\"], \"b\")      \u003d [\"a\", \"b\"]\n     * ArrayUtils.add([\"a\", \"b\"], \"c\") \u003d [\"a\", \"b\", \"c\"]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to \"add\" the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return A new array containing the existing elements plus the new element\n     * The returned array type will be that of the input array (unless null),\n     * in which case it will have the same type as the element.\n     * If both are null, an IllegalArgumentException is thrown\n     * @since 2.1\n     * @throws IllegalArgumentException if both arguments are null\n     ",
      "child_ranges": [
        "(line 3771,col 9)-(line 3771,col 22)",
        "(line 3772,col 9)-(line 3778,col 9)",
        "(line 3779,col 9)-(line 3780,col 57)",
        "(line 3781,col 9)-(line 3781,col 48)",
        "(line 3782,col 9)-(line 3782,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(boolean[], boolean)",
      "begin_line": 3806,
      "end_line": 3810,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, true)          \u003d [true]\n     * ArrayUtils.add([true], false)       \u003d [true, false]\n     * ArrayUtils.add([true, false], true) \u003d [true, false, true]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3807,col 9)-(line 3807,col 76)",
        "(line 3808,col 9)-(line 3808,col 48)",
        "(line 3809,col 9)-(line 3809,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(byte[], byte)",
      "begin_line": 3833,
      "end_line": 3837,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3834,col 9)-(line 3834,col 67)",
        "(line 3835,col 9)-(line 3835,col 48)",
        "(line 3836,col 9)-(line 3836,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(char[], char)",
      "begin_line": 3860,
      "end_line": 3864,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, \u00270\u0027)       \u003d [\u00270\u0027]\n     * ArrayUtils.add([\u00271\u0027], \u00270\u0027)      \u003d [\u00271\u0027, \u00270\u0027]\n     * ArrayUtils.add([\u00271\u0027, \u00270\u0027], \u00271\u0027) \u003d [\u00271\u0027, \u00270\u0027, \u00271\u0027]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3861,col 9)-(line 3861,col 72)",
        "(line 3862,col 9)-(line 3862,col 48)",
        "(line 3863,col 9)-(line 3863,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(double[], double)",
      "begin_line": 3887,
      "end_line": 3891,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3888,col 9)-(line 3888,col 73)",
        "(line 3889,col 9)-(line 3889,col 48)",
        "(line 3890,col 9)-(line 3890,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(float[], float)",
      "begin_line": 3914,
      "end_line": 3918,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3915,col 9)-(line 3915,col 70)",
        "(line 3916,col 9)-(line 3916,col 48)",
        "(line 3917,col 9)-(line 3917,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(int[], int)",
      "begin_line": 3941,
      "end_line": 3945,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3942,col 9)-(line 3942,col 68)",
        "(line 3943,col 9)-(line 3943,col 48)",
        "(line 3944,col 9)-(line 3944,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(long[], long)",
      "begin_line": 3968,
      "end_line": 3972,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3969,col 9)-(line 3969,col 67)",
        "(line 3970,col 9)-(line 3970,col 48)",
        "(line 3971,col 9)-(line 3971,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(short[], short)",
      "begin_line": 3995,
      "end_line": 3999,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3996,col 9)-(line 3996,col 70)",
        "(line 3997,col 9)-(line 3997,col 48)",
        "(line 3998,col 9)-(line 3998,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.copyArrayGrow1(java.lang.Object, java.lang.Class\u003c?\u003e)",
      "begin_line": 4010,
      "end_line": 4018,
      "comment": "\n     * Returns a copy of the given array of size 1 greater than the argument.\n     * The last value of the array is left to the default value.\n     *\n     * @param array The array to copy, must not be \u003ccode\u003enull\u003c/code\u003e.\n     * @param newArrayComponentType If \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, create a\n     * size 1 array of this type.\n     * @return A new copy of the array of size 1 greater than the input.\n     ",
      "child_ranges": [
        "(line 4011,col 9)-(line 4016,col 9)",
        "(line 4017,col 9)-(line 4017,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(T[], int, T)",
      "begin_line": 4049,
      "end_line": 4061,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0, null)      \u003d [null]\n     * ArrayUtils.add(null, 0, \"a\")       \u003d [\"a\"]\n     * ArrayUtils.add([\"a\"], 1, null)     \u003d [\"a\", null]\n     * ArrayUtils.add([\"a\"], 1, \"b\")      \u003d [\"a\", \"b\"]\n     * ArrayUtils.add([\"a\", \"b\"], 3, \"c\") \u003d [\"a\", \"b\", \"c\"]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     * @throws IllegalArgumentException if both array and element are null\n     ",
      "child_ranges": [
        "(line 4050,col 9)-(line 4050,col 29)",
        "(line 4051,col 9)-(line 4057,col 9)",
        "(line 4058,col 9)-(line 4059,col 68)",
        "(line 4060,col 9)-(line 4060,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(boolean[], int, boolean)",
      "begin_line": 4090,
      "end_line": 4092,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0, true)          \u003d [true]\n     * ArrayUtils.add([true], 0, false)       \u003d [false, true]\n     * ArrayUtils.add([false], 1, true)       \u003d [false, true]\n     * ArrayUtils.add([true, false], 1, true) \u003d [true, true, false]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 4091,col 9)-(line 4091,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(char[], int, char)",
      "begin_line": 4122,
      "end_line": 4124,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0, \u0027a\u0027)            \u003d [\u0027a\u0027]\n     * ArrayUtils.add([\u0027a\u0027], 0, \u0027b\u0027)           \u003d [\u0027b\u0027, \u0027a\u0027]\n     * ArrayUtils.add([\u0027a\u0027, \u0027b\u0027], 0, \u0027c\u0027)      \u003d [\u0027c\u0027, \u0027a\u0027, \u0027b\u0027]\n     * ArrayUtils.add([\u0027a\u0027, \u0027b\u0027], 1, \u0027k\u0027)      \u003d [\u0027a\u0027, \u0027k\u0027, \u0027b\u0027]\n     * ArrayUtils.add([\u0027a\u0027, \u0027b\u0027, \u0027c\u0027], 1, \u0027t\u0027) \u003d [\u0027a\u0027, \u0027t\u0027, \u0027b\u0027, \u0027c\u0027]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 4123,col 9)-(line 4123,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(byte[], int, byte)",
      "begin_line": 4153,
      "end_line": 4155,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1], 0, 2)         \u003d [2, 1]\n     * ArrayUtils.add([2, 6], 2, 3)      \u003d [2, 6, 3]\n     * ArrayUtils.add([2, 6], 0, 1)      \u003d [1, 2, 6]\n     * ArrayUtils.add([2, 6, 3], 2, 1)   \u003d [2, 6, 1, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 4154,col 9)-(line 4154,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(short[], int, short)",
      "begin_line": 4184,
      "end_line": 4186,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1], 0, 2)         \u003d [2, 1]\n     * ArrayUtils.add([2, 6], 2, 10)     \u003d [2, 6, 10]\n     * ArrayUtils.add([2, 6], 0, -4)     \u003d [-4, 2, 6]\n     * ArrayUtils.add([2, 6, 3], 2, 1)   \u003d [2, 6, 1, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 4185,col 9)-(line 4185,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(int[], int, int)",
      "begin_line": 4215,
      "end_line": 4217,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1], 0, 2)         \u003d [2, 1]\n     * ArrayUtils.add([2, 6], 2, 10)     \u003d [2, 6, 10]\n     * ArrayUtils.add([2, 6], 0, -4)     \u003d [-4, 2, 6]\n     * ArrayUtils.add([2, 6, 3], 2, 1)   \u003d [2, 6, 1, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 4216,col 9)-(line 4216,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(long[], int, long)",
      "begin_line": 4246,
      "end_line": 4248,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1L], 0, 2L)           \u003d [2L, 1L]\n     * ArrayUtils.add([2L, 6L], 2, 10L)      \u003d [2L, 6L, 10L]\n     * ArrayUtils.add([2L, 6L], 0, -4L)      \u003d [-4L, 2L, 6L]\n     * ArrayUtils.add([2L, 6L, 3L], 2, 1L)   \u003d [2L, 6L, 1L, 3L]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 4247,col 9)-(line 4247,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(float[], int, float)",
      "begin_line": 4277,
      "end_line": 4279,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1.1f], 0, 2.2f)               \u003d [2.2f, 1.1f]\n     * ArrayUtils.add([2.3f, 6.4f], 2, 10.5f)        \u003d [2.3f, 6.4f, 10.5f]\n     * ArrayUtils.add([2.6f, 6.7f], 0, -4.8f)        \u003d [-4.8f, 2.6f, 6.7f]\n     * ArrayUtils.add([2.9f, 6.0f, 0.3f], 2, 1.0f)   \u003d [2.9f, 6.0f, 1.0f, 0.3f]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 4278,col 9)-(line 4278,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(double[], int, double)",
      "begin_line": 4308,
      "end_line": 4310,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1.1], 0, 2.2)              \u003d [2.2, 1.1]\n     * ArrayUtils.add([2.3, 6.4], 2, 10.5)        \u003d [2.3, 6.4, 10.5]\n     * ArrayUtils.add([2.6, 6.7], 0, -4.8)        \u003d [-4.8, 2.6, 6.7]\n     * ArrayUtils.add([2.9, 6.0, 0.3], 2, 1.0)    \u003d [2.9, 6.0, 1.0, 0.3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 4309,col 9)-(line 4309,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(java.lang.Object, int, java.lang.Object, java.lang.Class\u003c?\u003e)",
      "begin_line": 4323,
      "end_line": 4343,
      "comment": "\n     * Underlying implementation of add(array, index, element) methods.\n     * The last parameter is the class, which may not equal element.getClass\n     * for primitives.\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @param clss the type of the element being added\n     * @return A new array containing the existing elements and the new element\n     ",
      "child_ranges": [
        "(line 4324,col 9)-(line 4331,col 9)",
        "(line 4332,col 9)-(line 4332,col 44)",
        "(line 4333,col 9)-(line 4335,col 9)",
        "(line 4336,col 9)-(line 4336,col 60)",
        "(line 4337,col 9)-(line 4337,col 53)",
        "(line 4338,col 9)-(line 4338,col 42)",
        "(line 4339,col 9)-(line 4341,col 9)",
        "(line 4342,col 9)-(line 4342,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(T[], int)",
      "begin_line": 4373,
      "end_line": 4376,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([\"a\"], 0)           \u003d []\n     * ArrayUtils.remove([\"a\", \"b\"], 0)      \u003d [\"b\"]\n     * ArrayUtils.remove([\"a\", \"b\"], 1)      \u003d [\"a\"]\n     * ArrayUtils.remove([\"a\", \"b\", \"c\"], 1) \u003d [\"a\", \"c\"]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4375,col 9)-(line 4375,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(T[], java.lang.Object)",
      "begin_line": 4403,
      "end_line": 4409,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, \"a\")            \u003d null\n     * ArrayUtils.removeElement([], \"a\")              \u003d []\n     * ArrayUtils.removeElement([\"a\"], \"b\")           \u003d [\"a\"]\n     * ArrayUtils.removeElement([\"a\", \"b\"], \"a\")      \u003d [\"b\"]\n     * ArrayUtils.removeElement([\"a\", \"b\", \"a\"], \"a\") \u003d [\"b\", \"a\"]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4404,col 9)-(line 4404,col 44)",
        "(line 4405,col 9)-(line 4407,col 9)",
        "(line 4408,col 9)-(line 4408,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(boolean[], int)",
      "begin_line": 4439,
      "end_line": 4441,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([true], 0)              \u003d []\n     * ArrayUtils.remove([true, false], 0)       \u003d [false]\n     * ArrayUtils.remove([true, false], 1)       \u003d [true]\n     * ArrayUtils.remove([true, true, false], 1) \u003d [true, false]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4440,col 9)-(line 4440,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(boolean[], boolean)",
      "begin_line": 4468,
      "end_line": 4474,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, true)                \u003d null\n     * ArrayUtils.removeElement([], true)                  \u003d []\n     * ArrayUtils.removeElement([true], false)             \u003d [true]\n     * ArrayUtils.removeElement([true, false], false)      \u003d [true]\n     * ArrayUtils.removeElement([true, false, true], true) \u003d [false, true]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4469,col 9)-(line 4469,col 44)",
        "(line 4470,col 9)-(line 4472,col 9)",
        "(line 4473,col 9)-(line 4473,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(byte[], int)",
      "begin_line": 4504,
      "end_line": 4506,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)          \u003d []\n     * ArrayUtils.remove([1, 0], 0)       \u003d [0]\n     * ArrayUtils.remove([1, 0], 1)       \u003d [1]\n     * ArrayUtils.remove([1, 0, 1], 1)    \u003d [1, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4505,col 9)-(line 4505,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(byte[], byte)",
      "begin_line": 4533,
      "end_line": 4539,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)        \u003d null\n     * ArrayUtils.removeElement([], 1)          \u003d []\n     * ArrayUtils.removeElement([1], 0)         \u003d [1]\n     * ArrayUtils.removeElement([1, 0], 0)      \u003d [1]\n     * ArrayUtils.removeElement([1, 0, 1], 1)   \u003d [0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4534,col 9)-(line 4534,col 44)",
        "(line 4535,col 9)-(line 4537,col 9)",
        "(line 4538,col 9)-(line 4538,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(char[], int)",
      "begin_line": 4569,
      "end_line": 4571,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([\u0027a\u0027], 0)           \u003d []\n     * ArrayUtils.remove([\u0027a\u0027, \u0027b\u0027], 0)      \u003d [\u0027b\u0027]\n     * ArrayUtils.remove([\u0027a\u0027, \u0027b\u0027], 1)      \u003d [\u0027a\u0027]\n     * ArrayUtils.remove([\u0027a\u0027, \u0027b\u0027, \u0027c\u0027], 1) \u003d [\u0027a\u0027, \u0027c\u0027]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4570,col 9)-(line 4570,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(char[], char)",
      "begin_line": 4598,
      "end_line": 4604,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, \u0027a\u0027)            \u003d null\n     * ArrayUtils.removeElement([], \u0027a\u0027)              \u003d []\n     * ArrayUtils.removeElement([\u0027a\u0027], \u0027b\u0027)           \u003d [\u0027a\u0027]\n     * ArrayUtils.removeElement([\u0027a\u0027, \u0027b\u0027], \u0027a\u0027)      \u003d [\u0027b\u0027]\n     * ArrayUtils.removeElement([\u0027a\u0027, \u0027b\u0027, \u0027a\u0027], \u0027a\u0027) \u003d [\u0027b\u0027, \u0027a\u0027]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4599,col 9)-(line 4599,col 44)",
        "(line 4600,col 9)-(line 4602,col 9)",
        "(line 4603,col 9)-(line 4603,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(double[], int)",
      "begin_line": 4634,
      "end_line": 4636,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1.1], 0)           \u003d []\n     * ArrayUtils.remove([2.5, 6.0], 0)      \u003d [6.0]\n     * ArrayUtils.remove([2.5, 6.0], 1)      \u003d [2.5]\n     * ArrayUtils.remove([2.5, 6.0, 3.8], 1) \u003d [2.5, 3.8]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4635,col 9)-(line 4635,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(double[], double)",
      "begin_line": 4663,
      "end_line": 4669,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1.1)            \u003d null\n     * ArrayUtils.removeElement([], 1.1)              \u003d []\n     * ArrayUtils.removeElement([1.1], 1.2)           \u003d [1.1]\n     * ArrayUtils.removeElement([1.1, 2.3], 1.1)      \u003d [2.3]\n     * ArrayUtils.removeElement([1.1, 2.3, 1.1], 1.1) \u003d [2.3, 1.1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4664,col 9)-(line 4664,col 44)",
        "(line 4665,col 9)-(line 4667,col 9)",
        "(line 4668,col 9)-(line 4668,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(float[], int)",
      "begin_line": 4699,
      "end_line": 4701,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1.1], 0)           \u003d []\n     * ArrayUtils.remove([2.5, 6.0], 0)      \u003d [6.0]\n     * ArrayUtils.remove([2.5, 6.0], 1)      \u003d [2.5]\n     * ArrayUtils.remove([2.5, 6.0, 3.8], 1) \u003d [2.5, 3.8]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4700,col 9)-(line 4700,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(float[], float)",
      "begin_line": 4728,
      "end_line": 4734,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1.1)            \u003d null\n     * ArrayUtils.removeElement([], 1.1)              \u003d []\n     * ArrayUtils.removeElement([1.1], 1.2)           \u003d [1.1]\n     * ArrayUtils.removeElement([1.1, 2.3], 1.1)      \u003d [2.3]\n     * ArrayUtils.removeElement([1.1, 2.3, 1.1], 1.1) \u003d [2.3, 1.1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4729,col 9)-(line 4729,col 44)",
        "(line 4730,col 9)-(line 4732,col 9)",
        "(line 4733,col 9)-(line 4733,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(int[], int)",
      "begin_line": 4764,
      "end_line": 4766,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)         \u003d []\n     * ArrayUtils.remove([2, 6], 0)      \u003d [6]\n     * ArrayUtils.remove([2, 6], 1)      \u003d [2]\n     * ArrayUtils.remove([2, 6, 3], 1)   \u003d [2, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4765,col 9)-(line 4765,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(int[], int)",
      "begin_line": 4793,
      "end_line": 4799,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)      \u003d null\n     * ArrayUtils.removeElement([], 1)        \u003d []\n     * ArrayUtils.removeElement([1], 2)       \u003d [1]\n     * ArrayUtils.removeElement([1, 3], 1)    \u003d [3]\n     * ArrayUtils.removeElement([1, 3, 1], 1) \u003d [3, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4794,col 9)-(line 4794,col 44)",
        "(line 4795,col 9)-(line 4797,col 9)",
        "(line 4798,col 9)-(line 4798,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(long[], int)",
      "begin_line": 4829,
      "end_line": 4831,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)         \u003d []\n     * ArrayUtils.remove([2, 6], 0)      \u003d [6]\n     * ArrayUtils.remove([2, 6], 1)      \u003d [2]\n     * ArrayUtils.remove([2, 6, 3], 1)   \u003d [2, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4830,col 9)-(line 4830,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(long[], long)",
      "begin_line": 4858,
      "end_line": 4864,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)      \u003d null\n     * ArrayUtils.removeElement([], 1)        \u003d []\n     * ArrayUtils.removeElement([1], 2)       \u003d [1]\n     * ArrayUtils.removeElement([1, 3], 1)    \u003d [3]\n     * ArrayUtils.removeElement([1, 3, 1], 1) \u003d [3, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4859,col 9)-(line 4859,col 44)",
        "(line 4860,col 9)-(line 4862,col 9)",
        "(line 4863,col 9)-(line 4863,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(short[], int)",
      "begin_line": 4894,
      "end_line": 4896,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)         \u003d []\n     * ArrayUtils.remove([2, 6], 0)      \u003d [6]\n     * ArrayUtils.remove([2, 6], 1)      \u003d [2]\n     * ArrayUtils.remove([2, 6, 3], 1)   \u003d [2, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4895,col 9)-(line 4895,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(short[], short)",
      "begin_line": 4923,
      "end_line": 4929,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)      \u003d null\n     * ArrayUtils.removeElement([], 1)        \u003d []\n     * ArrayUtils.removeElement([1], 2)       \u003d [1]\n     * ArrayUtils.removeElement([1, 3], 1)    \u003d [3]\n     * ArrayUtils.removeElement([1, 3, 1], 1) \u003d [3, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4924,col 9)-(line 4924,col 44)",
        "(line 4925,col 9)-(line 4927,col 9)",
        "(line 4928,col 9)-(line 4928,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(java.lang.Object, int)",
      "begin_line": 4952,
      "end_line": 4965,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4953,col 9)-(line 4953,col 38)",
        "(line 4954,col 9)-(line 4956,col 9)",
        "(line 4958,col 9)-(line 4958,col 91)",
        "(line 4959,col 9)-(line 4959,col 53)",
        "(line 4960,col 9)-(line 4962,col 9)",
        "(line 4964,col 9)-(line 4964,col 22)"
      ]
    }
  ]
}