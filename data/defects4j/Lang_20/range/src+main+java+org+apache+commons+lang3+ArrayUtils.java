{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/ArrayUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 4935,
      "comment": "\n * \u003cp\u003eOperations on arrays, primitive arrays (like {@code int[]}) and\n * primitive wrapper arrays (like {@code Integer[]}).\u003c/p\u003e\n *\n * \u003cp\u003eThis class tries to handle {@code null} input gracefully.\n * An exception will not be thrown for a {@code null}\n * array input. However, an Object array that contains a {@code null}\n * element may throw an exception. Each method documents its behaviour.\u003c/p\u003e\n *\n * \u003cp\u003e#ThreadSafe#\u003c/p\u003e\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_OBJECT_ARRAY"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * An empty immutable {@code Object} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_CLASS_ARRAY"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * An empty immutable {@code Class} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_STRING_ARRAY"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * An empty immutable {@code String} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_LONG_ARRAY"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * An empty immutable {@code long} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_LONG_OBJECT_ARRAY"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * An empty immutable {@code Long} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_INT_ARRAY"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * An empty immutable {@code int} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_INTEGER_OBJECT_ARRAY"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * An empty immutable {@code Integer} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_SHORT_ARRAY"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * An empty immutable {@code short} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_SHORT_OBJECT_ARRAY"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * An empty immutable {@code Short} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_BYTE_ARRAY"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * An empty immutable {@code byte} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_BYTE_OBJECT_ARRAY"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * An empty immutable {@code Byte} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_DOUBLE_ARRAY"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * An empty immutable {@code double} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_DOUBLE_OBJECT_ARRAY"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * An empty immutable {@code Double} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_FLOAT_ARRAY"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * An empty immutable {@code float} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_FLOAT_OBJECT_ARRAY"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * An empty immutable {@code Float} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_BOOLEAN_ARRAY"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * An empty immutable {@code boolean} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_BOOLEAN_OBJECT_ARRAY"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": "\n     * An empty immutable {@code Boolean} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_CHAR_ARRAY"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * An empty immutable {@code char} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_CHARACTER_OBJECT_ARRAY"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": "\n     * An empty immutable {@code Character} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INDEX_NOT_FOUND"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": "\n     * The index value when an element is not found in a list or array: {@code -1}.\n     * This value is returned by methods in this class and can also be used in comparisons with values returned by\n     * various method from {@link java.util.List}.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.ArrayUtils.ArrayUtils()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * \u003cp\u003eArrayUtils instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as \u003ccode\u003eArrayUtils.clone(new int[] {2})\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 135,col 7)-(line 135,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toString(java.lang.Object)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * \u003cp\u003eOutputs an array as a String, treating {@code null} as an empty array.\u003c/p\u003e\n     *\n     * \u003cp\u003eMulti-dimensional arrays are handled correctly, including\n     * multi-dimensional primitive arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format is that of Java source code, for example \u003ccode\u003e{a,b}\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to get a toString for, may be {@code null}\n     * @return a String representation of the array, \u0027{}\u0027 if null array input\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toString(java.lang.Object, java.lang.String)",
      "begin_line": 171,
      "end_line": 176,
      "comment": "\n     * \u003cp\u003eOutputs an array as a String handling {@code null}s.\u003c/p\u003e\n     *\n     * \u003cp\u003eMulti-dimensional arrays are handled correctly, including\n     * multi-dimensional primitive arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format is that of Java source code, for example \u003ccode\u003e{a,b}\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to get a toString for, may be {@code null}\n     * @param stringIfNull  the String to return if the array is {@code null}\n     * @return a String representation of the array\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.hashCode(java.lang.Object)",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * \u003cp\u003eGet a hash code for an array handling multi-dimensional arrays correctly.\u003c/p\u003e\n     *\n     * \u003cp\u003eMulti-dimensional primitive arrays are also handled correctly by this method.\u003c/p\u003e\n     *\n     * @param array  the array to get a hash code for, {@code null} returns zero\n     * @return a hash code for the array\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEquals(java.lang.Object, java.lang.Object)",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * \u003cp\u003eCompares two arrays, using equals(), handling multi-dimensional arrays\n     * correctly.\u003c/p\u003e\n     *\n     * \u003cp\u003eMulti-dimensional primitive arrays are also handled correctly by this method.\u003c/p\u003e\n     *\n     * @param array1  the left hand array to compare, may be {@code null}\n     * @param array2  the right hand array to compare, may be {@code null}\n     * @return {@code true} if the arrays are equal\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toMap(java.lang.Object[])",
      "begin_line": 231,
      "end_line": 256,
      "comment": "\n     * \u003cp\u003eConverts the given array into a {@link java.util.Map}. Each element of the array\n     * must be either a {@link java.util.Map.Entry} or an Array, containing at least two\n     * elements, where the first element is used as key and the second as\n     * value.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method can be used to initialize:\u003c/p\u003e\n     * \u003cpre\u003e\n     * // Create a Map mapping colors.\n     * Map colorMap \u003d MapUtils.toMap(new String[][] {{\n     *     {\"RED\", \"#FF0000\"},\n     *     {\"GREEN\", \"#00FF00\"},\n     *     {\"BLUE\", \"#0000FF\"}});\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  an array whose elements are either a {@link java.util.Map.Entry} or\n     *  an Array containing at least two elements, may be {@code null}\n     * @return a {@code Map} that was created from the array\n     * @throws IllegalArgumentException  if one element of this Array is\n     *  itself an Array containing less then two elements\n     * @throws IllegalArgumentException  if the array contains elements other\n     *  than {@link java.util.Map.Entry} and an Array\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 96)",
        "(line 236,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toArray(T...)",
      "begin_line": 297,
      "end_line": 299,
      "comment": "\n     * \u003cp\u003eCreate a type-safe generic array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe Java language does not allow an array to be created from a generic type:\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n    public static \u0026lt;T\u0026gt; T[] createAnArray(int size) {\n        return new T[size]; // compiler error here\n    }\n    public static \u0026lt;T\u0026gt; T[] createAnArray(int size) {\n        return (T[])new Object[size]; // ClassCastException at runtime\n    }\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eTherefore new arrays of generic types can be created with this method.\n     * For example, an array of Strings can be created:\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n    String[] array \u003d ArrayUtils.toArray(\"1\", \"2\");\n    String[] emptyArray \u003d ArrayUtils.\u0026lt;String\u0026gt;toArray();\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eThe method is typically used in scenarios, where the caller itself uses generic types\n     * that have to be combined into an array.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote, this method makes only sense to provide arguments of the same type so that the\n     * compiler can deduce the type of the array itself. While it is possible to select the\n     * type explicitly like in\n     * \u003ccode\u003eNumber[] array \u003d ArrayUtils.\u0026lt;Number\u0026gt;toArray(new Integer(42), new Double(Math.PI))\u003c/code\u003e,\n     * there is no real advantage when compared to\n     * \u003ccode\u003enew Number[] {new Integer(42), new Double(Math.PI)}\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param  \u003cT\u003e   the array\u0027s element type\n     * @param  items  the varargs array items, null allowed\n     * @return the array, not null unless a null array is passed in\n     * @since  3.0\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(T[])",
      "begin_line": 316,
      "end_line": 321,
      "comment": "\n     * \u003cp\u003eShallow clones an array returning a typecast result and handling\n     * {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe objects in the array are not cloned, thus there is no special\n     * handling for multi-dimensional arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the component type of the array\n     * @param array  the array to shallow clone, may be {@code null}\n     * @return the cloned array, {@code null} if {@code null} input\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 320,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(long[])",
      "begin_line": 332,
      "end_line": 337,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be {@code null}\n     * @return the cloned array, {@code null} if {@code null} input\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(int[])",
      "begin_line": 348,
      "end_line": 353,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be {@code null}\n     * @return the cloned array, {@code null} if {@code null} input\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 352,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(short[])",
      "begin_line": 364,
      "end_line": 369,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be {@code null}\n     * @return the cloned array, {@code null} if {@code null} input\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(char[])",
      "begin_line": 380,
      "end_line": 385,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be {@code null}\n     * @return the cloned array, {@code null} if {@code null} input\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 383,col 9)",
        "(line 384,col 9)-(line 384,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(byte[])",
      "begin_line": 396,
      "end_line": 401,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be {@code null}\n     * @return the cloned array, {@code null} if {@code null} input\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 399,col 9)",
        "(line 400,col 9)-(line 400,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(double[])",
      "begin_line": 412,
      "end_line": 417,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be {@code null}\n     * @return the cloned array, {@code null} if {@code null} input\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 416,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(float[])",
      "begin_line": 428,
      "end_line": 433,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be {@code null}\n     * @return the cloned array, {@code null} if {@code null} input\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 432,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(boolean[])",
      "begin_line": 444,
      "end_line": 449,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be {@code null}\n     * @return the cloned array, {@code null} if {@code null} input\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 448,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Object[])",
      "begin_line": 466,
      "end_line": 471,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 469,col 9)",
        "(line 470,col 9)-(line 470,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.String[])",
      "begin_line": 486,
      "end_line": 491,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 490,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(long[])",
      "begin_line": 506,
      "end_line": 511,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 509,col 9)",
        "(line 510,col 9)-(line 510,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(int[])",
      "begin_line": 526,
      "end_line": 531,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 530,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(short[])",
      "begin_line": 546,
      "end_line": 551,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 550,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(char[])",
      "begin_line": 566,
      "end_line": 571,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 570,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(byte[])",
      "begin_line": 586,
      "end_line": 591,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 590,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(double[])",
      "begin_line": 606,
      "end_line": 611,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 609,col 9)",
        "(line 610,col 9)-(line 610,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(float[])",
      "begin_line": 626,
      "end_line": 631,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 630,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(boolean[])",
      "begin_line": 646,
      "end_line": 651,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 647,col 9)-(line 649,col 9)",
        "(line 650,col 9)-(line 650,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Long[])",
      "begin_line": 666,
      "end_line": 671,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 667,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 670,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Integer[])",
      "begin_line": 686,
      "end_line": 691,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 687,col 9)-(line 689,col 9)",
        "(line 690,col 9)-(line 690,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Short[])",
      "begin_line": 706,
      "end_line": 711,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 707,col 9)-(line 709,col 9)",
        "(line 710,col 9)-(line 710,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Character[])",
      "begin_line": 726,
      "end_line": 731,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 727,col 9)-(line 729,col 9)",
        "(line 730,col 9)-(line 730,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Byte[])",
      "begin_line": 746,
      "end_line": 751,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 747,col 9)-(line 749,col 9)",
        "(line 750,col 9)-(line 750,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Double[])",
      "begin_line": 766,
      "end_line": 771,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 769,col 9)",
        "(line 770,col 9)-(line 770,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Float[])",
      "begin_line": 786,
      "end_line": 791,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 787,col 9)-(line 789,col 9)",
        "(line 790,col 9)-(line 790,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Boolean[])",
      "begin_line": 806,
      "end_line": 811,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 807,col 9)-(line 809,col 9)",
        "(line 810,col 9)-(line 810,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(T[], int, int)",
      "begin_line": 843,
      "end_line": 864,
      "comment": "\n     * \u003cp\u003eProduces a new array containing the elements between\n     * the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe component type of the subarray is always the same as\n     * that of the input array. Thus, if the input is an array of type\n     * {@code Date}, the following usage is envisaged:\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Date[] someDates \u003d (Date[])ArrayUtils.subarray(allDates, 2, 5);\n     * \u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the component type of the array\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 844,col 9)-(line 846,col 9)",
        "(line 847,col 9)-(line 849,col 9)",
        "(line 850,col 9)-(line 852,col 9)",
        "(line 853,col 9)-(line 853,col 62)",
        "(line 854,col 9)-(line 854,col 60)",
        "(line 855,col 9)-(line 859,col 9)",
        "(line 860,col 9)-(line 861,col 62)",
        "(line 862,col 9)-(line 862,col 75)",
        "(line 863,col 9)-(line 863,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(long[], int, int)",
      "begin_line": 885,
      "end_line": 903,
      "comment": "\n     * \u003cp\u003eProduces a new {@code long} array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 886,col 9)-(line 888,col 9)",
        "(line 889,col 9)-(line 891,col 9)",
        "(line 892,col 9)-(line 894,col 9)",
        "(line 895,col 9)-(line 895,col 62)",
        "(line 896,col 9)-(line 898,col 9)",
        "(line 900,col 9)-(line 900,col 44)",
        "(line 901,col 9)-(line 901,col 75)",
        "(line 902,col 9)-(line 902,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(int[], int, int)",
      "begin_line": 924,
      "end_line": 942,
      "comment": "\n     * \u003cp\u003eProduces a new {@code int} array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 925,col 9)-(line 927,col 9)",
        "(line 928,col 9)-(line 930,col 9)",
        "(line 931,col 9)-(line 933,col 9)",
        "(line 934,col 9)-(line 934,col 62)",
        "(line 935,col 9)-(line 937,col 9)",
        "(line 939,col 9)-(line 939,col 42)",
        "(line 940,col 9)-(line 940,col 75)",
        "(line 941,col 9)-(line 941,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(short[], int, int)",
      "begin_line": 963,
      "end_line": 981,
      "comment": "\n     * \u003cp\u003eProduces a new {@code short} array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 964,col 9)-(line 966,col 9)",
        "(line 967,col 9)-(line 969,col 9)",
        "(line 970,col 9)-(line 972,col 9)",
        "(line 973,col 9)-(line 973,col 62)",
        "(line 974,col 9)-(line 976,col 9)",
        "(line 978,col 9)-(line 978,col 46)",
        "(line 979,col 9)-(line 979,col 75)",
        "(line 980,col 9)-(line 980,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(char[], int, int)",
      "begin_line": 1002,
      "end_line": 1020,
      "comment": "\n     * \u003cp\u003eProduces a new {@code char} array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1003,col 9)-(line 1005,col 9)",
        "(line 1006,col 9)-(line 1008,col 9)",
        "(line 1009,col 9)-(line 1011,col 9)",
        "(line 1012,col 9)-(line 1012,col 62)",
        "(line 1013,col 9)-(line 1015,col 9)",
        "(line 1017,col 9)-(line 1017,col 44)",
        "(line 1018,col 9)-(line 1018,col 75)",
        "(line 1019,col 9)-(line 1019,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(byte[], int, int)",
      "begin_line": 1041,
      "end_line": 1059,
      "comment": "\n     * \u003cp\u003eProduces a new {@code byte} array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1042,col 9)-(line 1044,col 9)",
        "(line 1045,col 9)-(line 1047,col 9)",
        "(line 1048,col 9)-(line 1050,col 9)",
        "(line 1051,col 9)-(line 1051,col 62)",
        "(line 1052,col 9)-(line 1054,col 9)",
        "(line 1056,col 9)-(line 1056,col 44)",
        "(line 1057,col 9)-(line 1057,col 75)",
        "(line 1058,col 9)-(line 1058,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(double[], int, int)",
      "begin_line": 1080,
      "end_line": 1098,
      "comment": "\n     * \u003cp\u003eProduces a new {@code double} array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1081,col 9)-(line 1083,col 9)",
        "(line 1084,col 9)-(line 1086,col 9)",
        "(line 1087,col 9)-(line 1089,col 9)",
        "(line 1090,col 9)-(line 1090,col 62)",
        "(line 1091,col 9)-(line 1093,col 9)",
        "(line 1095,col 9)-(line 1095,col 48)",
        "(line 1096,col 9)-(line 1096,col 75)",
        "(line 1097,col 9)-(line 1097,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(float[], int, int)",
      "begin_line": 1119,
      "end_line": 1137,
      "comment": "\n     * \u003cp\u003eProduces a new {@code float} array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1120,col 9)-(line 1122,col 9)",
        "(line 1123,col 9)-(line 1125,col 9)",
        "(line 1126,col 9)-(line 1128,col 9)",
        "(line 1129,col 9)-(line 1129,col 62)",
        "(line 1130,col 9)-(line 1132,col 9)",
        "(line 1134,col 9)-(line 1134,col 46)",
        "(line 1135,col 9)-(line 1135,col 75)",
        "(line 1136,col 9)-(line 1136,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(boolean[], int, int)",
      "begin_line": 1158,
      "end_line": 1176,
      "comment": "\n     * \u003cp\u003eProduces a new {@code boolean} array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1159,col 9)-(line 1161,col 9)",
        "(line 1162,col 9)-(line 1164,col 9)",
        "(line 1165,col 9)-(line 1167,col 9)",
        "(line 1168,col 9)-(line 1168,col 62)",
        "(line 1169,col 9)-(line 1171,col 9)",
        "(line 1173,col 9)-(line 1173,col 50)",
        "(line 1174,col 9)-(line 1174,col 75)",
        "(line 1175,col 9)-(line 1175,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(java.lang.Object[], java.lang.Object[])",
      "begin_line": 1191,
      "end_line": 1198,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * {@code null} arrays as length {@code 0}.\n     *\n     * \u003cp\u003eAny multi-dimensional aspects of the arrays are ignored.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be {@code null}\n     * @param array2 the second array, may be {@code null}\n     * @return {@code true} if length of arrays matches, treating\n     *  {@code null} as an empty array\n     ",
      "child_ranges": [
        "(line 1192,col 9)-(line 1196,col 9)",
        "(line 1197,col 9)-(line 1197,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(long[], long[])",
      "begin_line": 1209,
      "end_line": 1216,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * {@code null} arrays as length {@code 0}.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be {@code null}\n     * @param array2 the second array, may be {@code null}\n     * @return {@code true} if length of arrays matches, treating\n     *  {@code null} as an empty array\n     ",
      "child_ranges": [
        "(line 1210,col 9)-(line 1214,col 9)",
        "(line 1215,col 9)-(line 1215,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(int[], int[])",
      "begin_line": 1227,
      "end_line": 1234,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * {@code null} arrays as length {@code 0}.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be {@code null}\n     * @param array2 the second array, may be {@code null}\n     * @return {@code true} if length of arrays matches, treating\n     *  {@code null} as an empty array\n     ",
      "child_ranges": [
        "(line 1228,col 9)-(line 1232,col 9)",
        "(line 1233,col 9)-(line 1233,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(short[], short[])",
      "begin_line": 1245,
      "end_line": 1252,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * {@code null} arrays as length {@code 0}.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be {@code null}\n     * @param array2 the second array, may be {@code null}\n     * @return {@code true} if length of arrays matches, treating\n     *  {@code null} as an empty array\n     ",
      "child_ranges": [
        "(line 1246,col 9)-(line 1250,col 9)",
        "(line 1251,col 9)-(line 1251,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(char[], char[])",
      "begin_line": 1263,
      "end_line": 1270,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * {@code null} arrays as length {@code 0}.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be {@code null}\n     * @param array2 the second array, may be {@code null}\n     * @return {@code true} if length of arrays matches, treating\n     *  {@code null} as an empty array\n     ",
      "child_ranges": [
        "(line 1264,col 9)-(line 1268,col 9)",
        "(line 1269,col 9)-(line 1269,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(byte[], byte[])",
      "begin_line": 1281,
      "end_line": 1288,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * {@code null} arrays as length {@code 0}.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be {@code null}\n     * @param array2 the second array, may be {@code null}\n     * @return {@code true} if length of arrays matches, treating\n     *  {@code null} as an empty array\n     ",
      "child_ranges": [
        "(line 1282,col 9)-(line 1286,col 9)",
        "(line 1287,col 9)-(line 1287,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(double[], double[])",
      "begin_line": 1299,
      "end_line": 1306,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * {@code null} arrays as length {@code 0}.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be {@code null}\n     * @param array2 the second array, may be {@code null}\n     * @return {@code true} if length of arrays matches, treating\n     *  {@code null} as an empty array\n     ",
      "child_ranges": [
        "(line 1300,col 9)-(line 1304,col 9)",
        "(line 1305,col 9)-(line 1305,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(float[], float[])",
      "begin_line": 1317,
      "end_line": 1324,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * {@code null} arrays as length {@code 0}.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be {@code null}\n     * @param array2 the second array, may be {@code null}\n     * @return {@code true} if length of arrays matches, treating\n     *  {@code null} as an empty array\n     ",
      "child_ranges": [
        "(line 1318,col 9)-(line 1322,col 9)",
        "(line 1323,col 9)-(line 1323,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(boolean[], boolean[])",
      "begin_line": 1335,
      "end_line": 1342,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * {@code null} arrays as length {@code 0}.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be {@code null}\n     * @param array2 the second array, may be {@code null}\n     * @return {@code true} if length of arrays matches, treating\n     *  {@code null} as an empty array\n     ",
      "child_ranges": [
        "(line 1336,col 9)-(line 1340,col 9)",
        "(line 1341,col 9)-(line 1341,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.getLength(java.lang.Object)",
      "begin_line": 1365,
      "end_line": 1370,
      "comment": "\n     * \u003cp\u003eReturns the length of the specified array.\n     * This method can deal with {@code Object} arrays and with primitive arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, {@code 0} is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.getLength(null)            \u003d 0\n     * ArrayUtils.getLength([])              \u003d 0\n     * ArrayUtils.getLength([null])          \u003d 1\n     * ArrayUtils.getLength([true, false])   \u003d 2\n     * ArrayUtils.getLength([1, 2, 3])       \u003d 3\n     * ArrayUtils.getLength([\"a\", \"b\", \"c\"]) \u003d 3\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to retrieve the length from, may be null\n     * @return The length of the array, or {@code 0} if the array is {@code null}\n     * @throws IllegalArgumentException if the object arguement is not an array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1366,col 9)-(line 1368,col 9)",
        "(line 1369,col 9)-(line 1369,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameType(java.lang.Object, java.lang.Object)",
      "begin_line": 1381,
      "end_line": 1386,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same type taking into account\n     * multi-dimensional arrays.\u003c/p\u003e\n     *\n     * @param array1 the first array, must not be {@code null}\n     * @param array2 the second array, must not be {@code null}\n     * @return {@code true} if type of arrays matches\n     * @throws IllegalArgumentException if either array is {@code null}\n     ",
      "child_ranges": [
        "(line 1382,col 9)-(line 1384,col 9)",
        "(line 1385,col 9)-(line 1385,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(java.lang.Object[])",
      "begin_line": 1399,
      "end_line": 1413,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThere is no special handling for multi-dimensional arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be {@code null}\n     ",
      "child_ranges": [
        "(line 1400,col 9)-(line 1402,col 9)",
        "(line 1403,col 9)-(line 1403,col 18)",
        "(line 1404,col 9)-(line 1404,col 33)",
        "(line 1405,col 9)-(line 1405,col 19)",
        "(line 1406,col 9)-(line 1412,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(long[])",
      "begin_line": 1422,
      "end_line": 1436,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be {@code null}\n     ",
      "child_ranges": [
        "(line 1423,col 9)-(line 1425,col 9)",
        "(line 1426,col 9)-(line 1426,col 18)",
        "(line 1427,col 9)-(line 1427,col 33)",
        "(line 1428,col 9)-(line 1428,col 17)",
        "(line 1429,col 9)-(line 1435,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(int[])",
      "begin_line": 1445,
      "end_line": 1459,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be {@code null}\n     ",
      "child_ranges": [
        "(line 1446,col 9)-(line 1448,col 9)",
        "(line 1449,col 9)-(line 1449,col 18)",
        "(line 1450,col 9)-(line 1450,col 33)",
        "(line 1451,col 9)-(line 1451,col 16)",
        "(line 1452,col 9)-(line 1458,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(short[])",
      "begin_line": 1468,
      "end_line": 1482,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be {@code null}\n     ",
      "child_ranges": [
        "(line 1469,col 9)-(line 1471,col 9)",
        "(line 1472,col 9)-(line 1472,col 18)",
        "(line 1473,col 9)-(line 1473,col 33)",
        "(line 1474,col 9)-(line 1474,col 18)",
        "(line 1475,col 9)-(line 1481,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(char[])",
      "begin_line": 1491,
      "end_line": 1505,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be {@code null}\n     ",
      "child_ranges": [
        "(line 1492,col 9)-(line 1494,col 9)",
        "(line 1495,col 9)-(line 1495,col 18)",
        "(line 1496,col 9)-(line 1496,col 33)",
        "(line 1497,col 9)-(line 1497,col 17)",
        "(line 1498,col 9)-(line 1504,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(byte[])",
      "begin_line": 1514,
      "end_line": 1528,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be {@code null}\n     ",
      "child_ranges": [
        "(line 1515,col 9)-(line 1517,col 9)",
        "(line 1518,col 9)-(line 1518,col 18)",
        "(line 1519,col 9)-(line 1519,col 33)",
        "(line 1520,col 9)-(line 1520,col 17)",
        "(line 1521,col 9)-(line 1527,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(double[])",
      "begin_line": 1537,
      "end_line": 1551,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be {@code null}\n     ",
      "child_ranges": [
        "(line 1538,col 9)-(line 1540,col 9)",
        "(line 1541,col 9)-(line 1541,col 18)",
        "(line 1542,col 9)-(line 1542,col 33)",
        "(line 1543,col 9)-(line 1543,col 19)",
        "(line 1544,col 9)-(line 1550,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(float[])",
      "begin_line": 1560,
      "end_line": 1574,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be {@code null}\n     ",
      "child_ranges": [
        "(line 1561,col 9)-(line 1563,col 9)",
        "(line 1564,col 9)-(line 1564,col 18)",
        "(line 1565,col 9)-(line 1565,col 33)",
        "(line 1566,col 9)-(line 1566,col 18)",
        "(line 1567,col 9)-(line 1573,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(boolean[])",
      "begin_line": 1583,
      "end_line": 1597,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be {@code null}\n     ",
      "child_ranges": [
        "(line 1584,col 9)-(line 1586,col 9)",
        "(line 1587,col 9)-(line 1587,col 18)",
        "(line 1588,col 9)-(line 1588,col 33)",
        "(line 1589,col 9)-(line 1589,col 20)",
        "(line 1590,col 9)-(line 1596,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(java.lang.Object[], java.lang.Object)",
      "begin_line": 1614,
      "end_line": 1616,
      "comment": "\n     * \u003cp\u003eFinds the index of the given object in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param objectToFind  the object to find, may be {@code null}\n     * @return the index of the object within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1615,col 9)-(line 1615,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(java.lang.Object[], java.lang.Object, int)",
      "begin_line": 1632,
      "end_line": 1653,
      "comment": "\n     * \u003cp\u003eFinds the index of the given object in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param objectToFind  the object to find, may be {@code null}\n     * @param startIndex  the index to start searching at\n     * @return the index of the object within the array starting at the index,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1633,col 9)-(line 1635,col 9)",
        "(line 1636,col 9)-(line 1638,col 9)",
        "(line 1639,col 9)-(line 1651,col 9)",
        "(line 1652,col 9)-(line 1652,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(java.lang.Object[], java.lang.Object)",
      "begin_line": 1665,
      "end_line": 1667,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given object within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be {@code null}\n     * @param objectToFind  the object to find, may be {@code null}\n     * @return the last index of the object within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1666,col 9)-(line 1666,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(java.lang.Object[], java.lang.Object, int)",
      "begin_line": 1683,
      "end_line": 1706,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given object in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than\n     * the array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be {@code null}\n     * @param objectToFind  the object to find, may be {@code null}\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the object within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1684,col 9)-(line 1686,col 9)",
        "(line 1687,col 9)-(line 1691,col 9)",
        "(line 1692,col 9)-(line 1704,col 9)",
        "(line 1705,col 9)-(line 1705,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(java.lang.Object[], java.lang.Object)",
      "begin_line": 1717,
      "end_line": 1719,
      "comment": "\n     * \u003cp\u003eChecks if the object is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns {@code false} if a {@code null} array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param objectToFind  the object to find\n     * @return {@code true} if the array contains the object\n     ",
      "child_ranges": [
        "(line 1718,col 9)-(line 1718,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(long[], long)",
      "begin_line": 1733,
      "end_line": 1735,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1734,col 9)-(line 1734,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(long[], long, int)",
      "begin_line": 1751,
      "end_line": 1764,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1752,col 9)-(line 1754,col 9)",
        "(line 1755,col 9)-(line 1757,col 9)",
        "(line 1758,col 9)-(line 1762,col 9)",
        "(line 1763,col 9)-(line 1763,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(long[], long)",
      "begin_line": 1776,
      "end_line": 1778,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be {@code null}\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1777,col 9)-(line 1777,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(long[], long, int)",
      "begin_line": 1794,
      "end_line": 1809,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1795,col 9)-(line 1797,col 9)",
        "(line 1798,col 9)-(line 1802,col 9)",
        "(line 1803,col 9)-(line 1807,col 9)",
        "(line 1808,col 9)-(line 1808,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(long[], long)",
      "begin_line": 1820,
      "end_line": 1822,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns {@code false} if a {@code null} array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return {@code true} if the array contains the object\n     ",
      "child_ranges": [
        "(line 1821,col 9)-(line 1821,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(int[], int)",
      "begin_line": 1836,
      "end_line": 1838,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1837,col 9)-(line 1837,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(int[], int, int)",
      "begin_line": 1854,
      "end_line": 1867,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1855,col 9)-(line 1857,col 9)",
        "(line 1858,col 9)-(line 1860,col 9)",
        "(line 1861,col 9)-(line 1865,col 9)",
        "(line 1866,col 9)-(line 1866,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(int[], int)",
      "begin_line": 1879,
      "end_line": 1881,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be {@code null}\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1880,col 9)-(line 1880,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(int[], int, int)",
      "begin_line": 1897,
      "end_line": 1912,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1898,col 9)-(line 1900,col 9)",
        "(line 1901,col 9)-(line 1905,col 9)",
        "(line 1906,col 9)-(line 1910,col 9)",
        "(line 1911,col 9)-(line 1911,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(int[], int)",
      "begin_line": 1923,
      "end_line": 1925,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns {@code false} if a {@code null} array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return {@code true} if the array contains the object\n     ",
      "child_ranges": [
        "(line 1924,col 9)-(line 1924,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(short[], short)",
      "begin_line": 1939,
      "end_line": 1941,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1940,col 9)-(line 1940,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(short[], short, int)",
      "begin_line": 1957,
      "end_line": 1970,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1958,col 9)-(line 1960,col 9)",
        "(line 1961,col 9)-(line 1963,col 9)",
        "(line 1964,col 9)-(line 1968,col 9)",
        "(line 1969,col 9)-(line 1969,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(short[], short)",
      "begin_line": 1982,
      "end_line": 1984,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be {@code null}\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1983,col 9)-(line 1983,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(short[], short, int)",
      "begin_line": 2000,
      "end_line": 2015,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2001,col 9)-(line 2003,col 9)",
        "(line 2004,col 9)-(line 2008,col 9)",
        "(line 2009,col 9)-(line 2013,col 9)",
        "(line 2014,col 9)-(line 2014,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(short[], short)",
      "begin_line": 2026,
      "end_line": 2028,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns {@code false} if a {@code null} array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return {@code true} if the array contains the object\n     ",
      "child_ranges": [
        "(line 2027,col 9)-(line 2027,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(char[], char)",
      "begin_line": 2043,
      "end_line": 2045,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2044,col 9)-(line 2044,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(char[], char, int)",
      "begin_line": 2062,
      "end_line": 2075,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2063,col 9)-(line 2065,col 9)",
        "(line 2066,col 9)-(line 2068,col 9)",
        "(line 2069,col 9)-(line 2073,col 9)",
        "(line 2074,col 9)-(line 2074,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(char[], char)",
      "begin_line": 2088,
      "end_line": 2090,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be {@code null}\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2089,col 9)-(line 2089,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(char[], char, int)",
      "begin_line": 2107,
      "end_line": 2122,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2108,col 9)-(line 2110,col 9)",
        "(line 2111,col 9)-(line 2115,col 9)",
        "(line 2116,col 9)-(line 2120,col 9)",
        "(line 2121,col 9)-(line 2121,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(char[], char)",
      "begin_line": 2134,
      "end_line": 2136,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns {@code false} if a {@code null} array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return {@code true} if the array contains the object\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2135,col 9)-(line 2135,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(byte[], byte)",
      "begin_line": 2150,
      "end_line": 2152,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2151,col 9)-(line 2151,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(byte[], byte, int)",
      "begin_line": 2168,
      "end_line": 2181,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2169,col 9)-(line 2171,col 9)",
        "(line 2172,col 9)-(line 2174,col 9)",
        "(line 2175,col 9)-(line 2179,col 9)",
        "(line 2180,col 9)-(line 2180,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(byte[], byte)",
      "begin_line": 2193,
      "end_line": 2195,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be {@code null}\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2194,col 9)-(line 2194,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(byte[], byte, int)",
      "begin_line": 2211,
      "end_line": 2226,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2212,col 9)-(line 2214,col 9)",
        "(line 2215,col 9)-(line 2219,col 9)",
        "(line 2220,col 9)-(line 2224,col 9)",
        "(line 2225,col 9)-(line 2225,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(byte[], byte)",
      "begin_line": 2237,
      "end_line": 2239,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns {@code false} if a {@code null} array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return {@code true} if the array contains the object\n     ",
      "child_ranges": [
        "(line 2238,col 9)-(line 2238,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(double[], double)",
      "begin_line": 2253,
      "end_line": 2255,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2254,col 9)-(line 2254,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(double[], double, double)",
      "begin_line": 2270,
      "end_line": 2272,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value within a given tolerance in the array.\n     * This method will return the index of the first value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param tolerance tolerance of the search\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2271,col 9)-(line 2271,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(double[], double, int)",
      "begin_line": 2288,
      "end_line": 2301,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2289,col 9)-(line 2291,col 9)",
        "(line 2292,col 9)-(line 2294,col 9)",
        "(line 2295,col 9)-(line 2299,col 9)",
        "(line 2300,col 9)-(line 2300,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(double[], double, int, double)",
      "begin_line": 2320,
      "end_line": 2335,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\n     * This method will return the index of the first value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @param tolerance tolerance of the search\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2321,col 9)-(line 2323,col 9)",
        "(line 2324,col 9)-(line 2326,col 9)",
        "(line 2327,col 9)-(line 2327,col 45)",
        "(line 2328,col 9)-(line 2328,col 45)",
        "(line 2329,col 9)-(line 2333,col 9)",
        "(line 2334,col 9)-(line 2334,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(double[], double)",
      "begin_line": 2347,
      "end_line": 2349,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be {@code null}\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2348,col 9)-(line 2348,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(double[], double, double)",
      "begin_line": 2364,
      "end_line": 2366,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within a given tolerance in the array.\n     * This method will return the index of the last value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param tolerance tolerance of the search\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2365,col 9)-(line 2365,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(double[], double, int)",
      "begin_line": 2382,
      "end_line": 2397,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2383,col 9)-(line 2385,col 9)",
        "(line 2386,col 9)-(line 2390,col 9)",
        "(line 2391,col 9)-(line 2395,col 9)",
        "(line 2396,col 9)-(line 2396,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(double[], double, int, double)",
      "begin_line": 2416,
      "end_line": 2433,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\n     * This method will return the index of the last value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @param tolerance  search for value within plus/minus this amount\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2417,col 9)-(line 2419,col 9)",
        "(line 2420,col 9)-(line 2424,col 9)",
        "(line 2425,col 9)-(line 2425,col 45)",
        "(line 2426,col 9)-(line 2426,col 45)",
        "(line 2427,col 9)-(line 2431,col 9)",
        "(line 2432,col 9)-(line 2432,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(double[], double)",
      "begin_line": 2444,
      "end_line": 2446,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns {@code false} if a {@code null} array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return {@code true} if the array contains the object\n     ",
      "child_ranges": [
        "(line 2445,col 9)-(line 2445,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(double[], double, double)",
      "begin_line": 2461,
      "end_line": 2463,
      "comment": "\n     * \u003cp\u003eChecks if a value falling within the given tolerance is in the\n     * given array.  If the array contains a value within the inclusive range\n     * defined by (value - tolerance) to (value + tolerance).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns {@code false} if a {@code null} array\n     * is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search\n     * @param valueToFind  the value to find\n     * @param tolerance  the array contains the tolerance of the search\n     * @return true if value falling within tolerance is in array\n     ",
      "child_ranges": [
        "(line 2462,col 9)-(line 2462,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(float[], float)",
      "begin_line": 2477,
      "end_line": 2479,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2478,col 9)-(line 2478,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(float[], float, int)",
      "begin_line": 2495,
      "end_line": 2508,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2496,col 9)-(line 2498,col 9)",
        "(line 2499,col 9)-(line 2501,col 9)",
        "(line 2502,col 9)-(line 2506,col 9)",
        "(line 2507,col 9)-(line 2507,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(float[], float)",
      "begin_line": 2520,
      "end_line": 2522,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be {@code null}\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2521,col 9)-(line 2521,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(float[], float, int)",
      "begin_line": 2538,
      "end_line": 2553,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2539,col 9)-(line 2541,col 9)",
        "(line 2542,col 9)-(line 2546,col 9)",
        "(line 2547,col 9)-(line 2551,col 9)",
        "(line 2552,col 9)-(line 2552,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(float[], float)",
      "begin_line": 2564,
      "end_line": 2566,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns {@code false} if a {@code null} array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return {@code true} if the array contains the object\n     ",
      "child_ranges": [
        "(line 2565,col 9)-(line 2565,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(boolean[], boolean)",
      "begin_line": 2580,
      "end_line": 2582,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2581,col 9)-(line 2581,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(boolean[], boolean, int)",
      "begin_line": 2599,
      "end_line": 2612,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null}\n     *  array input\n     ",
      "child_ranges": [
        "(line 2600,col 9)-(line 2602,col 9)",
        "(line 2603,col 9)-(line 2605,col 9)",
        "(line 2606,col 9)-(line 2610,col 9)",
        "(line 2611,col 9)-(line 2611,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(boolean[], boolean)",
      "begin_line": 2625,
      "end_line": 2627,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) if\n     * {@code null} array input.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be {@code null}\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2626,col 9)-(line 2626,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(boolean[], boolean, int)",
      "begin_line": 2643,
      "end_line": 2658,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than\n     * the array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2644,col 9)-(line 2646,col 9)",
        "(line 2647,col 9)-(line 2651,col 9)",
        "(line 2652,col 9)-(line 2656,col 9)",
        "(line 2657,col 9)-(line 2657,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(boolean[], boolean)",
      "begin_line": 2669,
      "end_line": 2671,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns {@code false} if a {@code null} array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return {@code true} if the array contains the object\n     ",
      "child_ranges": [
        "(line 2670,col 9)-(line 2670,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Character[])",
      "begin_line": 2687,
      "end_line": 2698,
      "comment": "\n     * \u003cp\u003eConverts an array of object Characters to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Character} array, may be {@code null}\n     * @return a {@code char} array, {@code null} if null array input\n     * @throws NullPointerException if array content is {@code null}\n     ",
      "child_ranges": [
        "(line 2688,col 9)-(line 2692,col 9)",
        "(line 2693,col 9)-(line 2693,col 53)",
        "(line 2694,col 9)-(line 2696,col 9)",
        "(line 2697,col 9)-(line 2697,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Character[], char)",
      "begin_line": 2709,
      "end_line": 2721,
      "comment": "\n     * \u003cp\u003eConverts an array of object Character to primitives handling {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Character} array, may be {@code null}\n     * @param valueForNull  the value to insert if {@code null} found\n     * @return a {@code char} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 2710,col 9)-(line 2714,col 9)",
        "(line 2715,col 9)-(line 2715,col 53)",
        "(line 2716,col 9)-(line 2719,col 9)",
        "(line 2720,col 9)-(line 2720,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(char[])",
      "begin_line": 2731,
      "end_line": 2742,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive chars to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array a {@code char} array\n     * @return a {@code Character} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 2732,col 9)-(line 2736,col 9)",
        "(line 2737,col 9)-(line 2737,col 63)",
        "(line 2738,col 9)-(line 2740,col 9)",
        "(line 2741,col 9)-(line 2741,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Long[])",
      "begin_line": 2755,
      "end_line": 2766,
      "comment": "\n     * \u003cp\u003eConverts an array of object Longs to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Long} array, may be {@code null}\n     * @return a {@code long} array, {@code null} if null array input\n     * @throws NullPointerException if array content is {@code null}\n     ",
      "child_ranges": [
        "(line 2756,col 9)-(line 2760,col 9)",
        "(line 2761,col 9)-(line 2761,col 53)",
        "(line 2762,col 9)-(line 2764,col 9)",
        "(line 2765,col 9)-(line 2765,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Long[], long)",
      "begin_line": 2777,
      "end_line": 2789,
      "comment": "\n     * \u003cp\u003eConverts an array of object Long to primitives handling {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Long} array, may be {@code null}\n     * @param valueForNull  the value to insert if {@code null} found\n     * @return a {@code long} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 2778,col 9)-(line 2782,col 9)",
        "(line 2783,col 9)-(line 2783,col 53)",
        "(line 2784,col 9)-(line 2787,col 9)",
        "(line 2788,col 9)-(line 2788,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(long[])",
      "begin_line": 2799,
      "end_line": 2810,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive longs to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code long} array\n     * @return a {@code Long} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 2800,col 9)-(line 2804,col 9)",
        "(line 2805,col 9)-(line 2805,col 53)",
        "(line 2806,col 9)-(line 2808,col 9)",
        "(line 2809,col 9)-(line 2809,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Integer[])",
      "begin_line": 2823,
      "end_line": 2834,
      "comment": "\n     * \u003cp\u003eConverts an array of object Integers to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Integer} array, may be {@code null}\n     * @return an {@code int} array, {@code null} if null array input\n     * @throws NullPointerException if array content is {@code null}\n     ",
      "child_ranges": [
        "(line 2824,col 9)-(line 2828,col 9)",
        "(line 2829,col 9)-(line 2829,col 51)",
        "(line 2830,col 9)-(line 2832,col 9)",
        "(line 2833,col 9)-(line 2833,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Integer[], int)",
      "begin_line": 2845,
      "end_line": 2857,
      "comment": "\n     * \u003cp\u003eConverts an array of object Integer to primitives handling {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Integer} array, may be {@code null}\n     * @param valueForNull  the value to insert if {@code null} found\n     * @return an {@code int} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 2846,col 9)-(line 2850,col 9)",
        "(line 2851,col 9)-(line 2851,col 51)",
        "(line 2852,col 9)-(line 2855,col 9)",
        "(line 2856,col 9)-(line 2856,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(int[])",
      "begin_line": 2867,
      "end_line": 2878,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive ints to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  an {@code int} array\n     * @return an {@code Integer} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 2868,col 9)-(line 2872,col 9)",
        "(line 2873,col 9)-(line 2873,col 59)",
        "(line 2874,col 9)-(line 2876,col 9)",
        "(line 2877,col 9)-(line 2877,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Short[])",
      "begin_line": 2891,
      "end_line": 2902,
      "comment": "\n     * \u003cp\u003eConverts an array of object Shorts to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Short} array, may be {@code null}\n     * @return a {@code byte} array, {@code null} if null array input\n     * @throws NullPointerException if array content is {@code null}\n     ",
      "child_ranges": [
        "(line 2892,col 9)-(line 2896,col 9)",
        "(line 2897,col 9)-(line 2897,col 55)",
        "(line 2898,col 9)-(line 2900,col 9)",
        "(line 2901,col 9)-(line 2901,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Short[], short)",
      "begin_line": 2913,
      "end_line": 2925,
      "comment": "\n     * \u003cp\u003eConverts an array of object Short to primitives handling {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Short} array, may be {@code null}\n     * @param valueForNull  the value to insert if {@code null} found\n     * @return a {@code byte} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 2914,col 9)-(line 2918,col 9)",
        "(line 2919,col 9)-(line 2919,col 55)",
        "(line 2920,col 9)-(line 2923,col 9)",
        "(line 2924,col 9)-(line 2924,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(short[])",
      "begin_line": 2935,
      "end_line": 2946,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive shorts to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code short} array\n     * @return a {@code Short} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 2936,col 9)-(line 2940,col 9)",
        "(line 2941,col 9)-(line 2941,col 55)",
        "(line 2942,col 9)-(line 2944,col 9)",
        "(line 2945,col 9)-(line 2945,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Byte[])",
      "begin_line": 2959,
      "end_line": 2970,
      "comment": "\n     * \u003cp\u003eConverts an array of object Bytes to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Byte} array, may be {@code null}\n     * @return a {@code byte} array, {@code null} if null array input\n     * @throws NullPointerException if array content is {@code null}\n     ",
      "child_ranges": [
        "(line 2960,col 9)-(line 2964,col 9)",
        "(line 2965,col 9)-(line 2965,col 53)",
        "(line 2966,col 9)-(line 2968,col 9)",
        "(line 2969,col 9)-(line 2969,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Byte[], byte)",
      "begin_line": 2981,
      "end_line": 2993,
      "comment": "\n     * \u003cp\u003eConverts an array of object Bytes to primitives handling {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Byte} array, may be {@code null}\n     * @param valueForNull  the value to insert if {@code null} found\n     * @return a {@code byte} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 2982,col 9)-(line 2986,col 9)",
        "(line 2987,col 9)-(line 2987,col 53)",
        "(line 2988,col 9)-(line 2991,col 9)",
        "(line 2992,col 9)-(line 2992,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(byte[])",
      "begin_line": 3003,
      "end_line": 3014,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive bytes to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code byte} array\n     * @return a {@code Byte} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 3004,col 9)-(line 3008,col 9)",
        "(line 3009,col 9)-(line 3009,col 53)",
        "(line 3010,col 9)-(line 3012,col 9)",
        "(line 3013,col 9)-(line 3013,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Double[])",
      "begin_line": 3027,
      "end_line": 3038,
      "comment": "\n     * \u003cp\u003eConverts an array of object Doubles to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Double} array, may be {@code null}\n     * @return a {@code double} array, {@code null} if null array input\n     * @throws NullPointerException if array content is {@code null}\n     ",
      "child_ranges": [
        "(line 3028,col 9)-(line 3032,col 9)",
        "(line 3033,col 9)-(line 3033,col 57)",
        "(line 3034,col 9)-(line 3036,col 9)",
        "(line 3037,col 9)-(line 3037,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Double[], double)",
      "begin_line": 3049,
      "end_line": 3061,
      "comment": "\n     * \u003cp\u003eConverts an array of object Doubles to primitives handling {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Double} array, may be {@code null}\n     * @param valueForNull  the value to insert if {@code null} found\n     * @return a {@code double} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 3050,col 9)-(line 3054,col 9)",
        "(line 3055,col 9)-(line 3055,col 57)",
        "(line 3056,col 9)-(line 3059,col 9)",
        "(line 3060,col 9)-(line 3060,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(double[])",
      "begin_line": 3071,
      "end_line": 3082,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive doubles to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code double} array\n     * @return a {@code Double} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 3072,col 9)-(line 3076,col 9)",
        "(line 3077,col 9)-(line 3077,col 57)",
        "(line 3078,col 9)-(line 3080,col 9)",
        "(line 3081,col 9)-(line 3081,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Float[])",
      "begin_line": 3095,
      "end_line": 3106,
      "comment": "\n     * \u003cp\u003eConverts an array of object Floats to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Float} array, may be {@code null}\n     * @return a {@code float} array, {@code null} if null array input\n     * @throws NullPointerException if array content is {@code null}\n     ",
      "child_ranges": [
        "(line 3096,col 9)-(line 3100,col 9)",
        "(line 3101,col 9)-(line 3101,col 55)",
        "(line 3102,col 9)-(line 3104,col 9)",
        "(line 3105,col 9)-(line 3105,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Float[], float)",
      "begin_line": 3117,
      "end_line": 3129,
      "comment": "\n     * \u003cp\u003eConverts an array of object Floats to primitives handling {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Float} array, may be {@code null}\n     * @param valueForNull  the value to insert if {@code null} found\n     * @return a {@code float} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 3118,col 9)-(line 3122,col 9)",
        "(line 3123,col 9)-(line 3123,col 55)",
        "(line 3124,col 9)-(line 3127,col 9)",
        "(line 3128,col 9)-(line 3128,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(float[])",
      "begin_line": 3139,
      "end_line": 3150,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive floats to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code float} array\n     * @return a {@code Float} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 3140,col 9)-(line 3144,col 9)",
        "(line 3145,col 9)-(line 3145,col 55)",
        "(line 3146,col 9)-(line 3148,col 9)",
        "(line 3149,col 9)-(line 3149,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Boolean[])",
      "begin_line": 3163,
      "end_line": 3174,
      "comment": "\n     * \u003cp\u003eConverts an array of object Booleans to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Boolean} array, may be {@code null}\n     * @return a {@code boolean} array, {@code null} if null array input\n     * @throws NullPointerException if array content is {@code null}\n     ",
      "child_ranges": [
        "(line 3164,col 9)-(line 3168,col 9)",
        "(line 3169,col 9)-(line 3169,col 59)",
        "(line 3170,col 9)-(line 3172,col 9)",
        "(line 3173,col 9)-(line 3173,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Boolean[], boolean)",
      "begin_line": 3185,
      "end_line": 3197,
      "comment": "\n     * \u003cp\u003eConverts an array of object Booleans to primitives handling {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Boolean} array, may be {@code null}\n     * @param valueForNull  the value to insert if {@code null} found\n     * @return a {@code boolean} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 3186,col 9)-(line 3190,col 9)",
        "(line 3191,col 9)-(line 3191,col 59)",
        "(line 3192,col 9)-(line 3195,col 9)",
        "(line 3196,col 9)-(line 3196,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(boolean[])",
      "begin_line": 3207,
      "end_line": 3218,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive booleans to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code boolean} array\n     * @return a {@code Boolean} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 3208,col 9)-(line 3212,col 9)",
        "(line 3213,col 9)-(line 3213,col 59)",
        "(line 3214,col 9)-(line 3216,col 9)",
        "(line 3217,col 9)-(line 3217,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(java.lang.Object[])",
      "begin_line": 3228,
      "end_line": 3230,
      "comment": "\n     * \u003cp\u003eChecks if an array of Objects is empty or {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is empty or {@code null}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3229,col 9)-(line 3229,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(long[])",
      "begin_line": 3239,
      "end_line": 3241,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive longs is empty or {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is empty or {@code null}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3240,col 9)-(line 3240,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(int[])",
      "begin_line": 3250,
      "end_line": 3252,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive ints is empty or {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is empty or {@code null}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3251,col 9)-(line 3251,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(short[])",
      "begin_line": 3261,
      "end_line": 3263,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive shorts is empty or {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is empty or {@code null}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3262,col 9)-(line 3262,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(char[])",
      "begin_line": 3272,
      "end_line": 3274,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive chars is empty or {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is empty or {@code null}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3273,col 9)-(line 3273,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(byte[])",
      "begin_line": 3283,
      "end_line": 3285,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive bytes is empty or {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is empty or {@code null}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3284,col 9)-(line 3284,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(double[])",
      "begin_line": 3294,
      "end_line": 3296,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive doubles is empty or {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is empty or {@code null}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3295,col 9)-(line 3295,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(float[])",
      "begin_line": 3305,
      "end_line": 3307,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive floats is empty or {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is empty or {@code null}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3306,col 9)-(line 3306,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(boolean[])",
      "begin_line": 3316,
      "end_line": 3318,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive booleans is empty or {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is empty or {@code null}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3317,col 9)-(line 3317,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isNotEmpty(T[])",
      "begin_line": 3329,
      "end_line": 3331,
      "comment": "\n     * \u003cp\u003eChecks if an array of Objects is not empty or not {@code null}.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the component type of the array\n     * @param array  the array to test\n     * @return {@code true} if the array is not empty or not {@code null}\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 3330,col 10)-(line 3330,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isNotEmpty(long[])",
      "begin_line": 3340,
      "end_line": 3342,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive longs is not empty or not {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is not empty or not {@code null}\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 3341,col 9)-(line 3341,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isNotEmpty(int[])",
      "begin_line": 3351,
      "end_line": 3353,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive ints is not empty or not {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is not empty or not {@code null}\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 3352,col 9)-(line 3352,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isNotEmpty(short[])",
      "begin_line": 3362,
      "end_line": 3364,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive shorts is not empty or not {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is not empty or not {@code null}\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 3363,col 9)-(line 3363,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isNotEmpty(char[])",
      "begin_line": 3373,
      "end_line": 3375,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive chars is not empty or not {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is not empty or not {@code null}\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 3374,col 9)-(line 3374,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isNotEmpty(byte[])",
      "begin_line": 3384,
      "end_line": 3386,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive bytes is not empty or not {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is not empty or not {@code null}\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 3385,col 9)-(line 3385,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isNotEmpty(double[])",
      "begin_line": 3395,
      "end_line": 3397,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive doubles is not empty or not {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is not empty or not {@code null}\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 3396,col 9)-(line 3396,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isNotEmpty(float[])",
      "begin_line": 3406,
      "end_line": 3408,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive floats is not empty or not {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is not empty or not {@code null}\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 3407,col 9)-(line 3407,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isNotEmpty(boolean[])",
      "begin_line": 3417,
      "end_line": 3419,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive booleans is not empty or not {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is not empty or not {@code null}\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 3418,col 9)-(line 3418,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(T[], T...)",
      "begin_line": 3445,
      "end_line": 3472,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of {@code array1} followed\n     * by all of the elements {@code array2}. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(null, null)     \u003d null\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * ArrayUtils.addAll([null], [null]) \u003d [null, null]\n     * ArrayUtils.addAll([\"a\", \"b\", \"c\"], [\"1\", \"2\", \"3\"]) \u003d [\"a\", \"b\", \"c\", \"1\", \"2\", \"3\"]\n     * \u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the component type of the array\n     * @param array1  the first array whose elements are added to the new array, may be {@code null}\n     * @param array2  the second array whose elements are added to the new array, may be {@code null}\n     * @return The new array, {@code null} if both arrays are {@code null}.\n     *      The type of the new array is the type of the first array,\n     *      unless the first array is null, in which case the type is the same as the second array.\n     * @since 2.1\n     * @throws IllegalArgumentException if the array types are incompatible\n     ",
      "child_ranges": [
        "(line 3446,col 9)-(line 3450,col 9)",
        "(line 3451,col 9)-(line 3451,col 68)",
        "(line 3452,col 9)-(line 3453,col 88)",
        "(line 3454,col 9)-(line 3454,col 67)",
        "(line 3455,col 9)-(line 3470,col 9)",
        "(line 3471,col 9)-(line 3471,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(boolean[], boolean...)",
      "begin_line": 3491,
      "end_line": 3501,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of {@code array1} followed\n     * by all of the elements {@code array2}. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new boolean[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3492,col 9)-(line 3496,col 9)",
        "(line 3497,col 9)-(line 3497,col 75)",
        "(line 3498,col 9)-(line 3498,col 67)",
        "(line 3499,col 9)-(line 3499,col 79)",
        "(line 3500,col 9)-(line 3500,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(char[], char...)",
      "begin_line": 3520,
      "end_line": 3530,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of {@code array1} followed\n     * by all of the elements {@code array2}. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new char[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3521,col 9)-(line 3525,col 9)",
        "(line 3526,col 9)-(line 3526,col 69)",
        "(line 3527,col 9)-(line 3527,col 67)",
        "(line 3528,col 9)-(line 3528,col 79)",
        "(line 3529,col 9)-(line 3529,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(byte[], byte...)",
      "begin_line": 3549,
      "end_line": 3559,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of {@code array1} followed\n     * by all of the elements {@code array2}. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new byte[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3550,col 9)-(line 3554,col 9)",
        "(line 3555,col 9)-(line 3555,col 69)",
        "(line 3556,col 9)-(line 3556,col 67)",
        "(line 3557,col 9)-(line 3557,col 79)",
        "(line 3558,col 9)-(line 3558,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(short[], short...)",
      "begin_line": 3578,
      "end_line": 3588,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of {@code array1} followed\n     * by all of the elements {@code array2}. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new short[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3579,col 9)-(line 3583,col 9)",
        "(line 3584,col 9)-(line 3584,col 71)",
        "(line 3585,col 9)-(line 3585,col 67)",
        "(line 3586,col 9)-(line 3586,col 79)",
        "(line 3587,col 9)-(line 3587,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(int[], int...)",
      "begin_line": 3607,
      "end_line": 3617,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of {@code array1} followed\n     * by all of the elements {@code array2}. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new int[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3608,col 9)-(line 3612,col 9)",
        "(line 3613,col 9)-(line 3613,col 67)",
        "(line 3614,col 9)-(line 3614,col 67)",
        "(line 3615,col 9)-(line 3615,col 79)",
        "(line 3616,col 9)-(line 3616,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(long[], long...)",
      "begin_line": 3636,
      "end_line": 3646,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of {@code array1} followed\n     * by all of the elements {@code array2}. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new long[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3637,col 9)-(line 3641,col 9)",
        "(line 3642,col 9)-(line 3642,col 69)",
        "(line 3643,col 9)-(line 3643,col 67)",
        "(line 3644,col 9)-(line 3644,col 79)",
        "(line 3645,col 9)-(line 3645,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(float[], float...)",
      "begin_line": 3665,
      "end_line": 3675,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of {@code array1} followed\n     * by all of the elements {@code array2}. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new float[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3666,col 9)-(line 3670,col 9)",
        "(line 3671,col 9)-(line 3671,col 71)",
        "(line 3672,col 9)-(line 3672,col 67)",
        "(line 3673,col 9)-(line 3673,col 79)",
        "(line 3674,col 9)-(line 3674,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(double[], double...)",
      "begin_line": 3694,
      "end_line": 3704,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of {@code array1} followed\n     * by all of the elements {@code array2}. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new double[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3695,col 9)-(line 3699,col 9)",
        "(line 3700,col 9)-(line 3700,col 73)",
        "(line 3701,col 9)-(line 3701,col 67)",
        "(line 3702,col 9)-(line 3702,col 79)",
        "(line 3703,col 9)-(line 3703,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(T[], T)",
      "begin_line": 3735,
      "end_line": 3748,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element, unless the element itself is null,\n     *  in which case the return type is Object[]\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, null)      \u003d [null]\n     * ArrayUtils.add(null, \"a\")       \u003d [\"a\"]\n     * ArrayUtils.add([\"a\"], null)     \u003d [\"a\", null]\n     * ArrayUtils.add([\"a\"], \"b\")      \u003d [\"a\", \"b\"]\n     * ArrayUtils.add([\"a\", \"b\"], \"c\") \u003d [\"a\", \"b\", \"c\"]\n     * \u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the component type of the array\n     * @param array  the array to \"add\" the element to, may be {@code null}\n     * @param element  the object to add, may be {@code null}\n     * @return A new array containing the existing elements plus the new element\n     * The returned array type will be that of the input array (unless null),\n     * in which case it will have the same type as the element.\n     * If both are null, an IllegalArgumentException is thrown\n     * @since 2.1\n     * @throws IllegalArgumentException if both arguments are null\n     ",
      "child_ranges": [
        "(line 3736,col 9)-(line 3736,col 22)",
        "(line 3737,col 9)-(line 3743,col 9)",
        "(line 3744,col 9)-(line 3745,col 57)",
        "(line 3746,col 9)-(line 3746,col 48)",
        "(line 3747,col 9)-(line 3747,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(boolean[], boolean)",
      "begin_line": 3771,
      "end_line": 3775,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, true)          \u003d [true]\n     * ArrayUtils.add([true], false)       \u003d [true, false]\n     * ArrayUtils.add([true, false], true) \u003d [true, false, true]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be {@code null}\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3772,col 9)-(line 3772,col 76)",
        "(line 3773,col 9)-(line 3773,col 48)",
        "(line 3774,col 9)-(line 3774,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(byte[], byte)",
      "begin_line": 3798,
      "end_line": 3802,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be {@code null}\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3799,col 9)-(line 3799,col 67)",
        "(line 3800,col 9)-(line 3800,col 48)",
        "(line 3801,col 9)-(line 3801,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(char[], char)",
      "begin_line": 3825,
      "end_line": 3829,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, \u00270\u0027)       \u003d [\u00270\u0027]\n     * ArrayUtils.add([\u00271\u0027], \u00270\u0027)      \u003d [\u00271\u0027, \u00270\u0027]\n     * ArrayUtils.add([\u00271\u0027, \u00270\u0027], \u00271\u0027) \u003d [\u00271\u0027, \u00270\u0027, \u00271\u0027]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be {@code null}\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3826,col 9)-(line 3826,col 72)",
        "(line 3827,col 9)-(line 3827,col 48)",
        "(line 3828,col 9)-(line 3828,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(double[], double)",
      "begin_line": 3852,
      "end_line": 3856,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be {@code null}\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3853,col 9)-(line 3853,col 73)",
        "(line 3854,col 9)-(line 3854,col 48)",
        "(line 3855,col 9)-(line 3855,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(float[], float)",
      "begin_line": 3879,
      "end_line": 3883,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be {@code null}\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3880,col 9)-(line 3880,col 70)",
        "(line 3881,col 9)-(line 3881,col 48)",
        "(line 3882,col 9)-(line 3882,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(int[], int)",
      "begin_line": 3906,
      "end_line": 3910,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be {@code null}\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3907,col 9)-(line 3907,col 68)",
        "(line 3908,col 9)-(line 3908,col 48)",
        "(line 3909,col 9)-(line 3909,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(long[], long)",
      "begin_line": 3933,
      "end_line": 3937,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be {@code null}\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3934,col 9)-(line 3934,col 67)",
        "(line 3935,col 9)-(line 3935,col 48)",
        "(line 3936,col 9)-(line 3936,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(short[], short)",
      "begin_line": 3960,
      "end_line": 3964,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be {@code null}\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3961,col 9)-(line 3961,col 70)",
        "(line 3962,col 9)-(line 3962,col 48)",
        "(line 3963,col 9)-(line 3963,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.copyArrayGrow1(java.lang.Object, java.lang.Class\u003c?\u003e)",
      "begin_line": 3975,
      "end_line": 3983,
      "comment": "\n     * Returns a copy of the given array of size 1 greater than the argument.\n     * The last value of the array is left to the default value.\n     *\n     * @param array The array to copy, must not be {@code null}.\n     * @param newArrayComponentType If {@code array} is {@code null}, create a\n     * size 1 array of this type.\n     * @return A new copy of the array of size 1 greater than the input.\n     ",
      "child_ranges": [
        "(line 3976,col 9)-(line 3981,col 9)",
        "(line 3982,col 9)-(line 3982,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(T[], int, T)",
      "begin_line": 4015,
      "end_line": 4027,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0, null)      \u003d [null]\n     * ArrayUtils.add(null, 0, \"a\")       \u003d [\"a\"]\n     * ArrayUtils.add([\"a\"], 1, null)     \u003d [\"a\", null]\n     * ArrayUtils.add([\"a\"], 1, \"b\")      \u003d [\"a\", \"b\"]\n     * ArrayUtils.add([\"a\", \"b\"], 3, \"c\") \u003d [\"a\", \"b\", \"c\"]\n     * \u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the component type of the array\n     * @param array  the array to add the element to, may be {@code null}\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     * @throws IllegalArgumentException if both array and element are null\n     ",
      "child_ranges": [
        "(line 4016,col 9)-(line 4016,col 29)",
        "(line 4017,col 9)-(line 4023,col 9)",
        "(line 4024,col 9)-(line 4025,col 68)",
        "(line 4026,col 9)-(line 4026,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(boolean[], int, boolean)",
      "begin_line": 4056,
      "end_line": 4058,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0, true)          \u003d [true]\n     * ArrayUtils.add([true], 0, false)       \u003d [false, true]\n     * ArrayUtils.add([false], 1, true)       \u003d [false, true]\n     * ArrayUtils.add([true, false], 1, true) \u003d [true, true, false]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be {@code null}\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 4057,col 9)-(line 4057,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(char[], int, char)",
      "begin_line": 4088,
      "end_line": 4090,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0, \u0027a\u0027)            \u003d [\u0027a\u0027]\n     * ArrayUtils.add([\u0027a\u0027], 0, \u0027b\u0027)           \u003d [\u0027b\u0027, \u0027a\u0027]\n     * ArrayUtils.add([\u0027a\u0027, \u0027b\u0027], 0, \u0027c\u0027)      \u003d [\u0027c\u0027, \u0027a\u0027, \u0027b\u0027]\n     * ArrayUtils.add([\u0027a\u0027, \u0027b\u0027], 1, \u0027k\u0027)      \u003d [\u0027a\u0027, \u0027k\u0027, \u0027b\u0027]\n     * ArrayUtils.add([\u0027a\u0027, \u0027b\u0027, \u0027c\u0027], 1, \u0027t\u0027) \u003d [\u0027a\u0027, \u0027t\u0027, \u0027b\u0027, \u0027c\u0027]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be {@code null}\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 4089,col 9)-(line 4089,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(byte[], int, byte)",
      "begin_line": 4119,
      "end_line": 4121,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1], 0, 2)         \u003d [2, 1]\n     * ArrayUtils.add([2, 6], 2, 3)      \u003d [2, 6, 3]\n     * ArrayUtils.add([2, 6], 0, 1)      \u003d [1, 2, 6]\n     * ArrayUtils.add([2, 6, 3], 2, 1)   \u003d [2, 6, 1, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be {@code null}\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 4120,col 9)-(line 4120,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(short[], int, short)",
      "begin_line": 4150,
      "end_line": 4152,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1], 0, 2)         \u003d [2, 1]\n     * ArrayUtils.add([2, 6], 2, 10)     \u003d [2, 6, 10]\n     * ArrayUtils.add([2, 6], 0, -4)     \u003d [-4, 2, 6]\n     * ArrayUtils.add([2, 6, 3], 2, 1)   \u003d [2, 6, 1, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be {@code null}\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 4151,col 9)-(line 4151,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(int[], int, int)",
      "begin_line": 4181,
      "end_line": 4183,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1], 0, 2)         \u003d [2, 1]\n     * ArrayUtils.add([2, 6], 2, 10)     \u003d [2, 6, 10]\n     * ArrayUtils.add([2, 6], 0, -4)     \u003d [-4, 2, 6]\n     * ArrayUtils.add([2, 6, 3], 2, 1)   \u003d [2, 6, 1, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be {@code null}\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 4182,col 9)-(line 4182,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(long[], int, long)",
      "begin_line": 4212,
      "end_line": 4214,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1L], 0, 2L)           \u003d [2L, 1L]\n     * ArrayUtils.add([2L, 6L], 2, 10L)      \u003d [2L, 6L, 10L]\n     * ArrayUtils.add([2L, 6L], 0, -4L)      \u003d [-4L, 2L, 6L]\n     * ArrayUtils.add([2L, 6L, 3L], 2, 1L)   \u003d [2L, 6L, 1L, 3L]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be {@code null}\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 4213,col 9)-(line 4213,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(float[], int, float)",
      "begin_line": 4243,
      "end_line": 4245,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1.1f], 0, 2.2f)               \u003d [2.2f, 1.1f]\n     * ArrayUtils.add([2.3f, 6.4f], 2, 10.5f)        \u003d [2.3f, 6.4f, 10.5f]\n     * ArrayUtils.add([2.6f, 6.7f], 0, -4.8f)        \u003d [-4.8f, 2.6f, 6.7f]\n     * ArrayUtils.add([2.9f, 6.0f, 0.3f], 2, 1.0f)   \u003d [2.9f, 6.0f, 1.0f, 0.3f]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be {@code null}\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 4244,col 9)-(line 4244,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(double[], int, double)",
      "begin_line": 4274,
      "end_line": 4276,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1.1], 0, 2.2)              \u003d [2.2, 1.1]\n     * ArrayUtils.add([2.3, 6.4], 2, 10.5)        \u003d [2.3, 6.4, 10.5]\n     * ArrayUtils.add([2.6, 6.7], 0, -4.8)        \u003d [-4.8, 2.6, 6.7]\n     * ArrayUtils.add([2.9, 6.0, 0.3], 2, 1.0)    \u003d [2.9, 6.0, 1.0, 0.3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be {@code null}\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 4275,col 9)-(line 4275,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(java.lang.Object, int, java.lang.Object, java.lang.Class\u003c?\u003e)",
      "begin_line": 4289,
      "end_line": 4309,
      "comment": "\n     * Underlying implementation of add(array, index, element) methods.\n     * The last parameter is the class, which may not equal element.getClass\n     * for primitives.\n     *\n     * @param array  the array to add the element to, may be {@code null}\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @param clss the type of the element being added\n     * @return A new array containing the existing elements and the new element\n     ",
      "child_ranges": [
        "(line 4290,col 9)-(line 4297,col 9)",
        "(line 4298,col 9)-(line 4298,col 44)",
        "(line 4299,col 9)-(line 4301,col 9)",
        "(line 4302,col 9)-(line 4302,col 60)",
        "(line 4303,col 9)-(line 4303,col 53)",
        "(line 4304,col 9)-(line 4304,col 42)",
        "(line 4305,col 9)-(line 4307,col 9)",
        "(line 4308,col 9)-(line 4308,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(T[], int)",
      "begin_line": 4340,
      "end_line": 4343,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([\"a\"], 0)           \u003d []\n     * ArrayUtils.remove([\"a\", \"b\"], 0)      \u003d [\"b\"]\n     * ArrayUtils.remove([\"a\", \"b\"], 1)      \u003d [\"a\"]\n     * ArrayUtils.remove([\"a\", \"b\", \"c\"], 1) \u003d [\"a\", \"c\"]\n     * \u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the component type of the array\n     * @param array  the array to remove the element from, may not be {@code null}\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4342,col 9)-(line 4342,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(T[], java.lang.Object)",
      "begin_line": 4371,
      "end_line": 4377,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, \"a\")            \u003d null\n     * ArrayUtils.removeElement([], \"a\")              \u003d []\n     * ArrayUtils.removeElement([\"a\"], \"b\")           \u003d [\"a\"]\n     * ArrayUtils.removeElement([\"a\", \"b\"], \"a\")      \u003d [\"b\"]\n     * ArrayUtils.removeElement([\"a\", \"b\", \"a\"], \"a\") \u003d [\"b\", \"a\"]\n     * \u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the component type of the array\n     * @param array  the array to remove the element from, may be {@code null}\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4372,col 9)-(line 4372,col 44)",
        "(line 4373,col 9)-(line 4375,col 9)",
        "(line 4376,col 9)-(line 4376,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(boolean[], int)",
      "begin_line": 4407,
      "end_line": 4409,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([true], 0)              \u003d []\n     * ArrayUtils.remove([true, false], 0)       \u003d [false]\n     * ArrayUtils.remove([true, false], 1)       \u003d [true]\n     * ArrayUtils.remove([true, true, false], 1) \u003d [true, false]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be {@code null}\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4408,col 9)-(line 4408,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(boolean[], boolean)",
      "begin_line": 4436,
      "end_line": 4442,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, true)                \u003d null\n     * ArrayUtils.removeElement([], true)                  \u003d []\n     * ArrayUtils.removeElement([true], false)             \u003d [true]\n     * ArrayUtils.removeElement([true, false], false)      \u003d [true]\n     * ArrayUtils.removeElement([true, false, true], true) \u003d [false, true]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be {@code null}\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4437,col 9)-(line 4437,col 44)",
        "(line 4438,col 9)-(line 4440,col 9)",
        "(line 4441,col 9)-(line 4441,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(byte[], int)",
      "begin_line": 4472,
      "end_line": 4474,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)          \u003d []\n     * ArrayUtils.remove([1, 0], 0)       \u003d [0]\n     * ArrayUtils.remove([1, 0], 1)       \u003d [1]\n     * ArrayUtils.remove([1, 0, 1], 1)    \u003d [1, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be {@code null}\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4473,col 9)-(line 4473,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(byte[], byte)",
      "begin_line": 4501,
      "end_line": 4507,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)        \u003d null\n     * ArrayUtils.removeElement([], 1)          \u003d []\n     * ArrayUtils.removeElement([1], 0)         \u003d [1]\n     * ArrayUtils.removeElement([1, 0], 0)      \u003d [1]\n     * ArrayUtils.removeElement([1, 0, 1], 1)   \u003d [0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be {@code null}\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4502,col 9)-(line 4502,col 44)",
        "(line 4503,col 9)-(line 4505,col 9)",
        "(line 4506,col 9)-(line 4506,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(char[], int)",
      "begin_line": 4537,
      "end_line": 4539,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([\u0027a\u0027], 0)           \u003d []\n     * ArrayUtils.remove([\u0027a\u0027, \u0027b\u0027], 0)      \u003d [\u0027b\u0027]\n     * ArrayUtils.remove([\u0027a\u0027, \u0027b\u0027], 1)      \u003d [\u0027a\u0027]\n     * ArrayUtils.remove([\u0027a\u0027, \u0027b\u0027, \u0027c\u0027], 1) \u003d [\u0027a\u0027, \u0027c\u0027]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be {@code null}\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4538,col 9)-(line 4538,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(char[], char)",
      "begin_line": 4566,
      "end_line": 4572,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, \u0027a\u0027)            \u003d null\n     * ArrayUtils.removeElement([], \u0027a\u0027)              \u003d []\n     * ArrayUtils.removeElement([\u0027a\u0027], \u0027b\u0027)           \u003d [\u0027a\u0027]\n     * ArrayUtils.removeElement([\u0027a\u0027, \u0027b\u0027], \u0027a\u0027)      \u003d [\u0027b\u0027]\n     * ArrayUtils.removeElement([\u0027a\u0027, \u0027b\u0027, \u0027a\u0027], \u0027a\u0027) \u003d [\u0027b\u0027, \u0027a\u0027]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be {@code null}\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4567,col 9)-(line 4567,col 44)",
        "(line 4568,col 9)-(line 4570,col 9)",
        "(line 4571,col 9)-(line 4571,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(double[], int)",
      "begin_line": 4602,
      "end_line": 4604,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1.1], 0)           \u003d []\n     * ArrayUtils.remove([2.5, 6.0], 0)      \u003d [6.0]\n     * ArrayUtils.remove([2.5, 6.0], 1)      \u003d [2.5]\n     * ArrayUtils.remove([2.5, 6.0, 3.8], 1) \u003d [2.5, 3.8]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be {@code null}\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4603,col 9)-(line 4603,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(double[], double)",
      "begin_line": 4631,
      "end_line": 4637,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1.1)            \u003d null\n     * ArrayUtils.removeElement([], 1.1)              \u003d []\n     * ArrayUtils.removeElement([1.1], 1.2)           \u003d [1.1]\n     * ArrayUtils.removeElement([1.1, 2.3], 1.1)      \u003d [2.3]\n     * ArrayUtils.removeElement([1.1, 2.3, 1.1], 1.1) \u003d [2.3, 1.1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be {@code null}\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4632,col 9)-(line 4632,col 44)",
        "(line 4633,col 9)-(line 4635,col 9)",
        "(line 4636,col 9)-(line 4636,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(float[], int)",
      "begin_line": 4667,
      "end_line": 4669,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1.1], 0)           \u003d []\n     * ArrayUtils.remove([2.5, 6.0], 0)      \u003d [6.0]\n     * ArrayUtils.remove([2.5, 6.0], 1)      \u003d [2.5]\n     * ArrayUtils.remove([2.5, 6.0, 3.8], 1) \u003d [2.5, 3.8]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be {@code null}\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4668,col 9)-(line 4668,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(float[], float)",
      "begin_line": 4696,
      "end_line": 4702,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1.1)            \u003d null\n     * ArrayUtils.removeElement([], 1.1)              \u003d []\n     * ArrayUtils.removeElement([1.1], 1.2)           \u003d [1.1]\n     * ArrayUtils.removeElement([1.1, 2.3], 1.1)      \u003d [2.3]\n     * ArrayUtils.removeElement([1.1, 2.3, 1.1], 1.1) \u003d [2.3, 1.1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be {@code null}\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4697,col 9)-(line 4697,col 44)",
        "(line 4698,col 9)-(line 4700,col 9)",
        "(line 4701,col 9)-(line 4701,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(int[], int)",
      "begin_line": 4732,
      "end_line": 4734,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)         \u003d []\n     * ArrayUtils.remove([2, 6], 0)      \u003d [6]\n     * ArrayUtils.remove([2, 6], 1)      \u003d [2]\n     * ArrayUtils.remove([2, 6, 3], 1)   \u003d [2, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be {@code null}\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4733,col 9)-(line 4733,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(int[], int)",
      "begin_line": 4761,
      "end_line": 4767,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)      \u003d null\n     * ArrayUtils.removeElement([], 1)        \u003d []\n     * ArrayUtils.removeElement([1], 2)       \u003d [1]\n     * ArrayUtils.removeElement([1, 3], 1)    \u003d [3]\n     * ArrayUtils.removeElement([1, 3, 1], 1) \u003d [3, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be {@code null}\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4762,col 9)-(line 4762,col 44)",
        "(line 4763,col 9)-(line 4765,col 9)",
        "(line 4766,col 9)-(line 4766,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(long[], int)",
      "begin_line": 4797,
      "end_line": 4799,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)         \u003d []\n     * ArrayUtils.remove([2, 6], 0)      \u003d [6]\n     * ArrayUtils.remove([2, 6], 1)      \u003d [2]\n     * ArrayUtils.remove([2, 6, 3], 1)   \u003d [2, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be {@code null}\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4798,col 9)-(line 4798,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(long[], long)",
      "begin_line": 4826,
      "end_line": 4832,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)      \u003d null\n     * ArrayUtils.removeElement([], 1)        \u003d []\n     * ArrayUtils.removeElement([1], 2)       \u003d [1]\n     * ArrayUtils.removeElement([1, 3], 1)    \u003d [3]\n     * ArrayUtils.removeElement([1, 3, 1], 1) \u003d [3, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be {@code null}\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4827,col 9)-(line 4827,col 44)",
        "(line 4828,col 9)-(line 4830,col 9)",
        "(line 4831,col 9)-(line 4831,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(short[], int)",
      "begin_line": 4862,
      "end_line": 4864,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)         \u003d []\n     * ArrayUtils.remove([2, 6], 0)      \u003d [6]\n     * ArrayUtils.remove([2, 6], 1)      \u003d [2]\n     * ArrayUtils.remove([2, 6, 3], 1)   \u003d [2, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be {@code null}\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4863,col 9)-(line 4863,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(short[], short)",
      "begin_line": 4891,
      "end_line": 4897,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)      \u003d null\n     * ArrayUtils.removeElement([], 1)        \u003d []\n     * ArrayUtils.removeElement([1], 2)       \u003d [1]\n     * ArrayUtils.removeElement([1, 3], 1)    \u003d [3]\n     * ArrayUtils.removeElement([1, 3, 1], 1) \u003d [3, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be {@code null}\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4892,col 9)-(line 4892,col 44)",
        "(line 4893,col 9)-(line 4895,col 9)",
        "(line 4896,col 9)-(line 4896,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(java.lang.Object, int)",
      "begin_line": 4920,
      "end_line": 4933,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * @param array  the array to remove the element from, may not be {@code null}\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4921,col 9)-(line 4921,col 38)",
        "(line 4922,col 9)-(line 4924,col 9)",
        "(line 4926,col 9)-(line 4926,col 91)",
        "(line 4927,col 9)-(line 4927,col 53)",
        "(line 4928,col 9)-(line 4930,col 9)",
        "(line 4932,col 9)-(line 4932,col 22)"
      ]
    }
  ]
}