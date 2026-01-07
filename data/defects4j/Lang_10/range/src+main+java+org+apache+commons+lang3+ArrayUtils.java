{
  "filepath": "/tmp/Lang-10b/src/main/java/org/apache/commons/lang3/ArrayUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 5796,
      "comment": "\n * \u003cp\u003eOperations on arrays, primitive arrays (like {@code int[]}) and\n * primitive wrapper arrays (like {@code Integer[]}).\u003c/p\u003e\n *\n * \u003cp\u003eThis class tries to handle {@code null} input gracefully.\n * An exception will not be thrown for a {@code null}\n * array input. However, an Object array that contains a {@code null}\n * element may throw an exception. Each method documents its behaviour.\u003c/p\u003e\n *\n * \u003cp\u003e#ThreadSafe#\u003c/p\u003e\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_OBJECT_ARRAY"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * An empty immutable {@code Object} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_CLASS_ARRAY"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * An empty immutable {@code Class} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_STRING_ARRAY"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * An empty immutable {@code String} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_LONG_ARRAY"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * An empty immutable {@code long} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_LONG_OBJECT_ARRAY"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * An empty immutable {@code Long} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_INT_ARRAY"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * An empty immutable {@code int} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_INTEGER_OBJECT_ARRAY"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * An empty immutable {@code Integer} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_SHORT_ARRAY"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * An empty immutable {@code short} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_SHORT_OBJECT_ARRAY"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * An empty immutable {@code Short} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_BYTE_ARRAY"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n     * An empty immutable {@code byte} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_BYTE_OBJECT_ARRAY"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * An empty immutable {@code Byte} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_DOUBLE_ARRAY"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n     * An empty immutable {@code double} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_DOUBLE_OBJECT_ARRAY"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * An empty immutable {@code Double} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_FLOAT_ARRAY"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n     * An empty immutable {@code float} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_FLOAT_OBJECT_ARRAY"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * An empty immutable {@code Float} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_BOOLEAN_ARRAY"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": "\n     * An empty immutable {@code boolean} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_BOOLEAN_OBJECT_ARRAY"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * An empty immutable {@code Boolean} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_CHAR_ARRAY"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * An empty immutable {@code char} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_CHARACTER_OBJECT_ARRAY"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n     * An empty immutable {@code Character} array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INDEX_NOT_FOUND"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": "\n     * The index value when an element is not found in a list or array: {@code -1}.\n     * This value is returned by methods in this class and can also be used in comparisons with values returned by\n     * various method from {@link java.util.List}.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.ArrayUtils.ArrayUtils()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * \u003cp\u003eArrayUtils instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as \u003ccode\u003eArrayUtils.clone(new int[] {2})\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 138,col 7)-(line 138,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toString(java.lang.Object)",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * \u003cp\u003eOutputs an array as a String, treating {@code null} as an empty array.\u003c/p\u003e\n     *\n     * \u003cp\u003eMulti-dimensional arrays are handled correctly, including\n     * multi-dimensional primitive arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format is that of Java source code, for example \u003ccode\u003e{a,b}\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to get a toString for, may be {@code null}\n     * @return a String representation of the array, \u0027{}\u0027 if null array input\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toString(java.lang.Object, java.lang.String)",
      "begin_line": 174,
      "end_line": 179,
      "comment": "\n     * \u003cp\u003eOutputs an array as a String handling {@code null}s.\u003c/p\u003e\n     *\n     * \u003cp\u003eMulti-dimensional arrays are handled correctly, including\n     * multi-dimensional primitive arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format is that of Java source code, for example \u003ccode\u003e{a,b}\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to get a toString for, may be {@code null}\n     * @param stringIfNull  the String to return if the array is {@code null}\n     * @return a String representation of the array\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.hashCode(java.lang.Object)",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * \u003cp\u003eGet a hash code for an array handling multi-dimensional arrays correctly.\u003c/p\u003e\n     *\n     * \u003cp\u003eMulti-dimensional primitive arrays are also handled correctly by this method.\u003c/p\u003e\n     *\n     * @param array  the array to get a hash code for, {@code null} returns zero\n     * @return a hash code for the array\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEquals(java.lang.Object, java.lang.Object)",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     * \u003cp\u003eCompares two arrays, using equals(), handling multi-dimensional arrays\n     * correctly.\u003c/p\u003e\n     *\n     * \u003cp\u003eMulti-dimensional primitive arrays are also handled correctly by this method.\u003c/p\u003e\n     *\n     * @param array1  the left hand array to compare, may be {@code null}\n     * @param array2  the right hand array to compare, may be {@code null}\n     * @return {@code true} if the arrays are equal\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toMap(java.lang.Object[])",
      "begin_line": 234,
      "end_line": 259,
      "comment": "\n     * \u003cp\u003eConverts the given array into a {@link java.util.Map}. Each element of the array\n     * must be either a {@link java.util.Map.Entry} or an Array, containing at least two\n     * elements, where the first element is used as key and the second as\n     * value.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method can be used to initialize:\u003c/p\u003e\n     * \u003cpre\u003e\n     * // Create a Map mapping colors.\n     * Map colorMap \u003d MapUtils.toMap(new String[][] {{\n     *     {\"RED\", \"#FF0000\"},\n     *     {\"GREEN\", \"#00FF00\"},\n     *     {\"BLUE\", \"#0000FF\"}});\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  an array whose elements are either a {@link java.util.Map.Entry} or\n     *  an Array containing at least two elements, may be {@code null}\n     * @return a {@code Map} that was created from the array\n     * @throws IllegalArgumentException  if one element of this Array is\n     *  itself an Array containing less then two elements\n     * @throws IllegalArgumentException  if the array contains elements other\n     *  than {@link java.util.Map.Entry} and an Array\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 96)",
        "(line 239,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toArray(T...)",
      "begin_line": 300,
      "end_line": 302,
      "comment": "\n     * \u003cp\u003eCreate a type-safe generic array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe Java language does not allow an array to be created from a generic type:\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n    public static \u0026lt;T\u0026gt; T[] createAnArray(int size) {\n        return new T[size]; // compiler error here\n    }\n    public static \u0026lt;T\u0026gt; T[] createAnArray(int size) {\n        return (T[])new Object[size]; // ClassCastException at runtime\n    }\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eTherefore new arrays of generic types can be created with this method.\n     * For example, an array of Strings can be created:\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n    String[] array \u003d ArrayUtils.toArray(\"1\", \"2\");\n    String[] emptyArray \u003d ArrayUtils.\u0026lt;String\u0026gt;toArray();\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eThe method is typically used in scenarios, where the caller itself uses generic types\n     * that have to be combined into an array.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote, this method makes only sense to provide arguments of the same type so that the\n     * compiler can deduce the type of the array itself. While it is possible to select the\n     * type explicitly like in\n     * \u003ccode\u003eNumber[] array \u003d ArrayUtils.\u0026lt;Number\u0026gt;toArray(Integer.valueOf(42), Double.valueOf(Math.PI))\u003c/code\u003e,\n     * there is no real advantage when compared to\n     * \u003ccode\u003enew Number[] {Integer.valueOf(42), Double.valueOf(Math.PI)}\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param  \u003cT\u003e   the array\u0027s element type\n     * @param  items  the varargs array items, null allowed\n     * @return the array, not null unless a null array is passed in\n     * @since  3.0\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(T[])",
      "begin_line": 319,
      "end_line": 324,
      "comment": "\n     * \u003cp\u003eShallow clones an array returning a typecast result and handling\n     * {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe objects in the array are not cloned, thus there is no special\n     * handling for multi-dimensional arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the component type of the array\n     * @param array  the array to shallow clone, may be {@code null}\n     * @return the cloned array, {@code null} if {@code null} input\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 323,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(long[])",
      "begin_line": 335,
      "end_line": 340,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be {@code null}\n     * @return the cloned array, {@code null} if {@code null} input\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 339,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(int[])",
      "begin_line": 351,
      "end_line": 356,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be {@code null}\n     * @return the cloned array, {@code null} if {@code null} input\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 355,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(short[])",
      "begin_line": 367,
      "end_line": 372,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be {@code null}\n     * @return the cloned array, {@code null} if {@code null} input\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(char[])",
      "begin_line": 383,
      "end_line": 388,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be {@code null}\n     * @return the cloned array, {@code null} if {@code null} input\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 387,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(byte[])",
      "begin_line": 399,
      "end_line": 404,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be {@code null}\n     * @return the cloned array, {@code null} if {@code null} input\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 403,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(double[])",
      "begin_line": 415,
      "end_line": 420,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be {@code null}\n     * @return the cloned array, {@code null} if {@code null} input\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 419,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(float[])",
      "begin_line": 431,
      "end_line": 436,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be {@code null}\n     * @return the cloned array, {@code null} if {@code null} input\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 435,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(boolean[])",
      "begin_line": 447,
      "end_line": 452,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be {@code null}\n     * @return the cloned array, {@code null} if {@code null} input\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 450,col 9)",
        "(line 451,col 9)-(line 451,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Object[])",
      "begin_line": 469,
      "end_line": 474,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 473,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.String[])",
      "begin_line": 489,
      "end_line": 494,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 492,col 9)",
        "(line 493,col 9)-(line 493,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(long[])",
      "begin_line": 509,
      "end_line": 514,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 512,col 9)",
        "(line 513,col 9)-(line 513,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(int[])",
      "begin_line": 529,
      "end_line": 534,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 532,col 9)",
        "(line 533,col 9)-(line 533,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(short[])",
      "begin_line": 549,
      "end_line": 554,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 552,col 9)",
        "(line 553,col 9)-(line 553,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(char[])",
      "begin_line": 569,
      "end_line": 574,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 572,col 9)",
        "(line 573,col 9)-(line 573,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(byte[])",
      "begin_line": 589,
      "end_line": 594,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 590,col 9)-(line 592,col 9)",
        "(line 593,col 9)-(line 593,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(double[])",
      "begin_line": 609,
      "end_line": 614,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 612,col 9)",
        "(line 613,col 9)-(line 613,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(float[])",
      "begin_line": 629,
      "end_line": 634,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 630,col 9)-(line 632,col 9)",
        "(line 633,col 9)-(line 633,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(boolean[])",
      "begin_line": 649,
      "end_line": 654,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 650,col 9)-(line 652,col 9)",
        "(line 653,col 9)-(line 653,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Long[])",
      "begin_line": 669,
      "end_line": 674,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 672,col 9)",
        "(line 673,col 9)-(line 673,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Integer[])",
      "begin_line": 689,
      "end_line": 694,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 692,col 9)",
        "(line 693,col 9)-(line 693,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Short[])",
      "begin_line": 709,
      "end_line": 714,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 710,col 9)-(line 712,col 9)",
        "(line 713,col 9)-(line 713,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Character[])",
      "begin_line": 729,
      "end_line": 734,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 730,col 9)-(line 732,col 9)",
        "(line 733,col 9)-(line 733,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Byte[])",
      "begin_line": 749,
      "end_line": 754,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 750,col 9)-(line 752,col 9)",
        "(line 753,col 9)-(line 753,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Double[])",
      "begin_line": 769,
      "end_line": 774,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 770,col 9)-(line 772,col 9)",
        "(line 773,col 9)-(line 773,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Float[])",
      "begin_line": 789,
      "end_line": 794,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 790,col 9)-(line 792,col 9)",
        "(line 793,col 9)-(line 793,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Boolean[])",
      "begin_line": 809,
      "end_line": 814,
      "comment": "\n     * \u003cp\u003eDefensive programming technique to change a {@code null}\n     * reference to an empty one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns an empty array for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs a memory optimizing technique an empty array passed in will be overridden with\n     * the empty {@code public static} references in this class.\u003c/p\u003e\n     *\n     * @param array  the array to check for {@code null} or empty\n     * @return the same array, {@code public static} empty array if {@code null} or empty input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 810,col 9)-(line 812,col 9)",
        "(line 813,col 9)-(line 813,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(T[], int, int)",
      "begin_line": 846,
      "end_line": 867,
      "comment": "\n     * \u003cp\u003eProduces a new array containing the elements between\n     * the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe component type of the subarray is always the same as\n     * that of the input array. Thus, if the input is an array of type\n     * {@code Date}, the following usage is envisaged:\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Date[] someDates \u003d (Date[])ArrayUtils.subarray(allDates, 2, 5);\n     * \u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the component type of the array\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 847,col 9)-(line 849,col 9)",
        "(line 850,col 9)-(line 852,col 9)",
        "(line 853,col 9)-(line 855,col 9)",
        "(line 856,col 9)-(line 856,col 62)",
        "(line 857,col 9)-(line 857,col 60)",
        "(line 858,col 9)-(line 862,col 9)",
        "(line 863,col 9)-(line 864,col 62)",
        "(line 865,col 9)-(line 865,col 75)",
        "(line 866,col 9)-(line 866,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(long[], int, int)",
      "begin_line": 888,
      "end_line": 906,
      "comment": "\n     * \u003cp\u003eProduces a new {@code long} array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 889,col 9)-(line 891,col 9)",
        "(line 892,col 9)-(line 894,col 9)",
        "(line 895,col 9)-(line 897,col 9)",
        "(line 898,col 9)-(line 898,col 62)",
        "(line 899,col 9)-(line 901,col 9)",
        "(line 903,col 9)-(line 903,col 44)",
        "(line 904,col 9)-(line 904,col 75)",
        "(line 905,col 9)-(line 905,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(int[], int, int)",
      "begin_line": 927,
      "end_line": 945,
      "comment": "\n     * \u003cp\u003eProduces a new {@code int} array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 928,col 9)-(line 930,col 9)",
        "(line 931,col 9)-(line 933,col 9)",
        "(line 934,col 9)-(line 936,col 9)",
        "(line 937,col 9)-(line 937,col 62)",
        "(line 938,col 9)-(line 940,col 9)",
        "(line 942,col 9)-(line 942,col 42)",
        "(line 943,col 9)-(line 943,col 75)",
        "(line 944,col 9)-(line 944,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(short[], int, int)",
      "begin_line": 966,
      "end_line": 984,
      "comment": "\n     * \u003cp\u003eProduces a new {@code short} array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 967,col 9)-(line 969,col 9)",
        "(line 970,col 9)-(line 972,col 9)",
        "(line 973,col 9)-(line 975,col 9)",
        "(line 976,col 9)-(line 976,col 62)",
        "(line 977,col 9)-(line 979,col 9)",
        "(line 981,col 9)-(line 981,col 46)",
        "(line 982,col 9)-(line 982,col 75)",
        "(line 983,col 9)-(line 983,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(char[], int, int)",
      "begin_line": 1005,
      "end_line": 1023,
      "comment": "\n     * \u003cp\u003eProduces a new {@code char} array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1006,col 9)-(line 1008,col 9)",
        "(line 1009,col 9)-(line 1011,col 9)",
        "(line 1012,col 9)-(line 1014,col 9)",
        "(line 1015,col 9)-(line 1015,col 62)",
        "(line 1016,col 9)-(line 1018,col 9)",
        "(line 1020,col 9)-(line 1020,col 44)",
        "(line 1021,col 9)-(line 1021,col 75)",
        "(line 1022,col 9)-(line 1022,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(byte[], int, int)",
      "begin_line": 1044,
      "end_line": 1062,
      "comment": "\n     * \u003cp\u003eProduces a new {@code byte} array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1045,col 9)-(line 1047,col 9)",
        "(line 1048,col 9)-(line 1050,col 9)",
        "(line 1051,col 9)-(line 1053,col 9)",
        "(line 1054,col 9)-(line 1054,col 62)",
        "(line 1055,col 9)-(line 1057,col 9)",
        "(line 1059,col 9)-(line 1059,col 44)",
        "(line 1060,col 9)-(line 1060,col 75)",
        "(line 1061,col 9)-(line 1061,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(double[], int, int)",
      "begin_line": 1083,
      "end_line": 1101,
      "comment": "\n     * \u003cp\u003eProduces a new {@code double} array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1084,col 9)-(line 1086,col 9)",
        "(line 1087,col 9)-(line 1089,col 9)",
        "(line 1090,col 9)-(line 1092,col 9)",
        "(line 1093,col 9)-(line 1093,col 62)",
        "(line 1094,col 9)-(line 1096,col 9)",
        "(line 1098,col 9)-(line 1098,col 48)",
        "(line 1099,col 9)-(line 1099,col 75)",
        "(line 1100,col 9)-(line 1100,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(float[], int, int)",
      "begin_line": 1122,
      "end_line": 1140,
      "comment": "\n     * \u003cp\u003eProduces a new {@code float} array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1123,col 9)-(line 1125,col 9)",
        "(line 1126,col 9)-(line 1128,col 9)",
        "(line 1129,col 9)-(line 1131,col 9)",
        "(line 1132,col 9)-(line 1132,col 62)",
        "(line 1133,col 9)-(line 1135,col 9)",
        "(line 1137,col 9)-(line 1137,col 46)",
        "(line 1138,col 9)-(line 1138,col 75)",
        "(line 1139,col 9)-(line 1139,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(boolean[], int, int)",
      "begin_line": 1161,
      "end_line": 1179,
      "comment": "\n     * \u003cp\u003eProduces a new {@code boolean} array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1162,col 9)-(line 1164,col 9)",
        "(line 1165,col 9)-(line 1167,col 9)",
        "(line 1168,col 9)-(line 1170,col 9)",
        "(line 1171,col 9)-(line 1171,col 62)",
        "(line 1172,col 9)-(line 1174,col 9)",
        "(line 1176,col 9)-(line 1176,col 50)",
        "(line 1177,col 9)-(line 1177,col 75)",
        "(line 1178,col 9)-(line 1178,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(java.lang.Object[], java.lang.Object[])",
      "begin_line": 1194,
      "end_line": 1201,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * {@code null} arrays as length {@code 0}.\n     *\n     * \u003cp\u003eAny multi-dimensional aspects of the arrays are ignored.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be {@code null}\n     * @param array2 the second array, may be {@code null}\n     * @return {@code true} if length of arrays matches, treating\n     *  {@code null} as an empty array\n     ",
      "child_ranges": [
        "(line 1195,col 9)-(line 1199,col 9)",
        "(line 1200,col 9)-(line 1200,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(long[], long[])",
      "begin_line": 1212,
      "end_line": 1219,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * {@code null} arrays as length {@code 0}.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be {@code null}\n     * @param array2 the second array, may be {@code null}\n     * @return {@code true} if length of arrays matches, treating\n     *  {@code null} as an empty array\n     ",
      "child_ranges": [
        "(line 1213,col 9)-(line 1217,col 9)",
        "(line 1218,col 9)-(line 1218,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(int[], int[])",
      "begin_line": 1230,
      "end_line": 1237,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * {@code null} arrays as length {@code 0}.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be {@code null}\n     * @param array2 the second array, may be {@code null}\n     * @return {@code true} if length of arrays matches, treating\n     *  {@code null} as an empty array\n     ",
      "child_ranges": [
        "(line 1231,col 9)-(line 1235,col 9)",
        "(line 1236,col 9)-(line 1236,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(short[], short[])",
      "begin_line": 1248,
      "end_line": 1255,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * {@code null} arrays as length {@code 0}.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be {@code null}\n     * @param array2 the second array, may be {@code null}\n     * @return {@code true} if length of arrays matches, treating\n     *  {@code null} as an empty array\n     ",
      "child_ranges": [
        "(line 1249,col 9)-(line 1253,col 9)",
        "(line 1254,col 9)-(line 1254,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(char[], char[])",
      "begin_line": 1266,
      "end_line": 1273,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * {@code null} arrays as length {@code 0}.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be {@code null}\n     * @param array2 the second array, may be {@code null}\n     * @return {@code true} if length of arrays matches, treating\n     *  {@code null} as an empty array\n     ",
      "child_ranges": [
        "(line 1267,col 9)-(line 1271,col 9)",
        "(line 1272,col 9)-(line 1272,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(byte[], byte[])",
      "begin_line": 1284,
      "end_line": 1291,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * {@code null} arrays as length {@code 0}.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be {@code null}\n     * @param array2 the second array, may be {@code null}\n     * @return {@code true} if length of arrays matches, treating\n     *  {@code null} as an empty array\n     ",
      "child_ranges": [
        "(line 1285,col 9)-(line 1289,col 9)",
        "(line 1290,col 9)-(line 1290,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(double[], double[])",
      "begin_line": 1302,
      "end_line": 1309,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * {@code null} arrays as length {@code 0}.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be {@code null}\n     * @param array2 the second array, may be {@code null}\n     * @return {@code true} if length of arrays matches, treating\n     *  {@code null} as an empty array\n     ",
      "child_ranges": [
        "(line 1303,col 9)-(line 1307,col 9)",
        "(line 1308,col 9)-(line 1308,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(float[], float[])",
      "begin_line": 1320,
      "end_line": 1327,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * {@code null} arrays as length {@code 0}.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be {@code null}\n     * @param array2 the second array, may be {@code null}\n     * @return {@code true} if length of arrays matches, treating\n     *  {@code null} as an empty array\n     ",
      "child_ranges": [
        "(line 1321,col 9)-(line 1325,col 9)",
        "(line 1326,col 9)-(line 1326,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(boolean[], boolean[])",
      "begin_line": 1338,
      "end_line": 1345,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * {@code null} arrays as length {@code 0}.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be {@code null}\n     * @param array2 the second array, may be {@code null}\n     * @return {@code true} if length of arrays matches, treating\n     *  {@code null} as an empty array\n     ",
      "child_ranges": [
        "(line 1339,col 9)-(line 1343,col 9)",
        "(line 1344,col 9)-(line 1344,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.getLength(java.lang.Object)",
      "begin_line": 1368,
      "end_line": 1373,
      "comment": "\n     * \u003cp\u003eReturns the length of the specified array.\n     * This method can deal with {@code Object} arrays and with primitive arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, {@code 0} is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.getLength(null)            \u003d 0\n     * ArrayUtils.getLength([])              \u003d 0\n     * ArrayUtils.getLength([null])          \u003d 1\n     * ArrayUtils.getLength([true, false])   \u003d 2\n     * ArrayUtils.getLength([1, 2, 3])       \u003d 3\n     * ArrayUtils.getLength([\"a\", \"b\", \"c\"]) \u003d 3\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to retrieve the length from, may be null\n     * @return The length of the array, or {@code 0} if the array is {@code null}\n     * @throws IllegalArgumentException if the object arguement is not an array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1369,col 9)-(line 1371,col 9)",
        "(line 1372,col 9)-(line 1372,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameType(java.lang.Object, java.lang.Object)",
      "begin_line": 1384,
      "end_line": 1389,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same type taking into account\n     * multi-dimensional arrays.\u003c/p\u003e\n     *\n     * @param array1 the first array, must not be {@code null}\n     * @param array2 the second array, must not be {@code null}\n     * @return {@code true} if type of arrays matches\n     * @throws IllegalArgumentException if either array is {@code null}\n     ",
      "child_ranges": [
        "(line 1385,col 9)-(line 1387,col 9)",
        "(line 1388,col 9)-(line 1388,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(java.lang.Object[])",
      "begin_line": 1402,
      "end_line": 1416,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThere is no special handling for multi-dimensional arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be {@code null}\n     ",
      "child_ranges": [
        "(line 1403,col 9)-(line 1405,col 9)",
        "(line 1406,col 9)-(line 1406,col 18)",
        "(line 1407,col 9)-(line 1407,col 33)",
        "(line 1408,col 9)-(line 1408,col 19)",
        "(line 1409,col 9)-(line 1415,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(long[])",
      "begin_line": 1425,
      "end_line": 1439,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be {@code null}\n     ",
      "child_ranges": [
        "(line 1426,col 9)-(line 1428,col 9)",
        "(line 1429,col 9)-(line 1429,col 18)",
        "(line 1430,col 9)-(line 1430,col 33)",
        "(line 1431,col 9)-(line 1431,col 17)",
        "(line 1432,col 9)-(line 1438,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(int[])",
      "begin_line": 1448,
      "end_line": 1462,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be {@code null}\n     ",
      "child_ranges": [
        "(line 1449,col 9)-(line 1451,col 9)",
        "(line 1452,col 9)-(line 1452,col 18)",
        "(line 1453,col 9)-(line 1453,col 33)",
        "(line 1454,col 9)-(line 1454,col 16)",
        "(line 1455,col 9)-(line 1461,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(short[])",
      "begin_line": 1471,
      "end_line": 1485,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be {@code null}\n     ",
      "child_ranges": [
        "(line 1472,col 9)-(line 1474,col 9)",
        "(line 1475,col 9)-(line 1475,col 18)",
        "(line 1476,col 9)-(line 1476,col 33)",
        "(line 1477,col 9)-(line 1477,col 18)",
        "(line 1478,col 9)-(line 1484,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(char[])",
      "begin_line": 1494,
      "end_line": 1508,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be {@code null}\n     ",
      "child_ranges": [
        "(line 1495,col 9)-(line 1497,col 9)",
        "(line 1498,col 9)-(line 1498,col 18)",
        "(line 1499,col 9)-(line 1499,col 33)",
        "(line 1500,col 9)-(line 1500,col 17)",
        "(line 1501,col 9)-(line 1507,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(byte[])",
      "begin_line": 1517,
      "end_line": 1531,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be {@code null}\n     ",
      "child_ranges": [
        "(line 1518,col 9)-(line 1520,col 9)",
        "(line 1521,col 9)-(line 1521,col 18)",
        "(line 1522,col 9)-(line 1522,col 33)",
        "(line 1523,col 9)-(line 1523,col 17)",
        "(line 1524,col 9)-(line 1530,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(double[])",
      "begin_line": 1540,
      "end_line": 1554,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be {@code null}\n     ",
      "child_ranges": [
        "(line 1541,col 9)-(line 1543,col 9)",
        "(line 1544,col 9)-(line 1544,col 18)",
        "(line 1545,col 9)-(line 1545,col 33)",
        "(line 1546,col 9)-(line 1546,col 19)",
        "(line 1547,col 9)-(line 1553,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(float[])",
      "begin_line": 1563,
      "end_line": 1577,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be {@code null}\n     ",
      "child_ranges": [
        "(line 1564,col 9)-(line 1566,col 9)",
        "(line 1567,col 9)-(line 1567,col 18)",
        "(line 1568,col 9)-(line 1568,col 33)",
        "(line 1569,col 9)-(line 1569,col 18)",
        "(line 1570,col 9)-(line 1576,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(boolean[])",
      "begin_line": 1586,
      "end_line": 1600,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be {@code null}\n     ",
      "child_ranges": [
        "(line 1587,col 9)-(line 1589,col 9)",
        "(line 1590,col 9)-(line 1590,col 18)",
        "(line 1591,col 9)-(line 1591,col 33)",
        "(line 1592,col 9)-(line 1592,col 20)",
        "(line 1593,col 9)-(line 1599,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(java.lang.Object[], java.lang.Object)",
      "begin_line": 1617,
      "end_line": 1619,
      "comment": "\n     * \u003cp\u003eFinds the index of the given object in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param objectToFind  the object to find, may be {@code null}\n     * @return the index of the object within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1618,col 9)-(line 1618,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(java.lang.Object[], java.lang.Object, int)",
      "begin_line": 1635,
      "end_line": 1656,
      "comment": "\n     * \u003cp\u003eFinds the index of the given object in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param objectToFind  the object to find, may be {@code null}\n     * @param startIndex  the index to start searching at\n     * @return the index of the object within the array starting at the index,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1636,col 9)-(line 1638,col 9)",
        "(line 1639,col 9)-(line 1641,col 9)",
        "(line 1642,col 9)-(line 1654,col 9)",
        "(line 1655,col 9)-(line 1655,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(java.lang.Object[], java.lang.Object)",
      "begin_line": 1668,
      "end_line": 1670,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given object within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be {@code null}\n     * @param objectToFind  the object to find, may be {@code null}\n     * @return the last index of the object within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1669,col 9)-(line 1669,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(java.lang.Object[], java.lang.Object, int)",
      "begin_line": 1686,
      "end_line": 1709,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given object in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than\n     * the array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be {@code null}\n     * @param objectToFind  the object to find, may be {@code null}\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the object within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1687,col 9)-(line 1689,col 9)",
        "(line 1690,col 9)-(line 1694,col 9)",
        "(line 1695,col 9)-(line 1707,col 9)",
        "(line 1708,col 9)-(line 1708,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(java.lang.Object[], java.lang.Object)",
      "begin_line": 1720,
      "end_line": 1722,
      "comment": "\n     * \u003cp\u003eChecks if the object is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns {@code false} if a {@code null} array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param objectToFind  the object to find\n     * @return {@code true} if the array contains the object\n     ",
      "child_ranges": [
        "(line 1721,col 9)-(line 1721,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(long[], long)",
      "begin_line": 1736,
      "end_line": 1738,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1737,col 9)-(line 1737,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(long[], long, int)",
      "begin_line": 1754,
      "end_line": 1767,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1755,col 9)-(line 1757,col 9)",
        "(line 1758,col 9)-(line 1760,col 9)",
        "(line 1761,col 9)-(line 1765,col 9)",
        "(line 1766,col 9)-(line 1766,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(long[], long)",
      "begin_line": 1779,
      "end_line": 1781,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be {@code null}\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1780,col 9)-(line 1780,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(long[], long, int)",
      "begin_line": 1797,
      "end_line": 1812,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1798,col 9)-(line 1800,col 9)",
        "(line 1801,col 9)-(line 1805,col 9)",
        "(line 1806,col 9)-(line 1810,col 9)",
        "(line 1811,col 9)-(line 1811,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(long[], long)",
      "begin_line": 1823,
      "end_line": 1825,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns {@code false} if a {@code null} array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return {@code true} if the array contains the object\n     ",
      "child_ranges": [
        "(line 1824,col 9)-(line 1824,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(int[], int)",
      "begin_line": 1839,
      "end_line": 1841,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1840,col 9)-(line 1840,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(int[], int, int)",
      "begin_line": 1857,
      "end_line": 1870,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1858,col 9)-(line 1860,col 9)",
        "(line 1861,col 9)-(line 1863,col 9)",
        "(line 1864,col 9)-(line 1868,col 9)",
        "(line 1869,col 9)-(line 1869,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(int[], int)",
      "begin_line": 1882,
      "end_line": 1884,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be {@code null}\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1883,col 9)-(line 1883,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(int[], int, int)",
      "begin_line": 1900,
      "end_line": 1915,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1901,col 9)-(line 1903,col 9)",
        "(line 1904,col 9)-(line 1908,col 9)",
        "(line 1909,col 9)-(line 1913,col 9)",
        "(line 1914,col 9)-(line 1914,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(int[], int)",
      "begin_line": 1926,
      "end_line": 1928,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns {@code false} if a {@code null} array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return {@code true} if the array contains the object\n     ",
      "child_ranges": [
        "(line 1927,col 9)-(line 1927,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(short[], short)",
      "begin_line": 1942,
      "end_line": 1944,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1943,col 9)-(line 1943,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(short[], short, int)",
      "begin_line": 1960,
      "end_line": 1973,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1961,col 9)-(line 1963,col 9)",
        "(line 1964,col 9)-(line 1966,col 9)",
        "(line 1967,col 9)-(line 1971,col 9)",
        "(line 1972,col 9)-(line 1972,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(short[], short)",
      "begin_line": 1985,
      "end_line": 1987,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be {@code null}\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 1986,col 9)-(line 1986,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(short[], short, int)",
      "begin_line": 2003,
      "end_line": 2018,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2004,col 9)-(line 2006,col 9)",
        "(line 2007,col 9)-(line 2011,col 9)",
        "(line 2012,col 9)-(line 2016,col 9)",
        "(line 2017,col 9)-(line 2017,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(short[], short)",
      "begin_line": 2029,
      "end_line": 2031,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns {@code false} if a {@code null} array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return {@code true} if the array contains the object\n     ",
      "child_ranges": [
        "(line 2030,col 9)-(line 2030,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(char[], char)",
      "begin_line": 2046,
      "end_line": 2048,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2047,col 9)-(line 2047,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(char[], char, int)",
      "begin_line": 2065,
      "end_line": 2078,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2066,col 9)-(line 2068,col 9)",
        "(line 2069,col 9)-(line 2071,col 9)",
        "(line 2072,col 9)-(line 2076,col 9)",
        "(line 2077,col 9)-(line 2077,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(char[], char)",
      "begin_line": 2091,
      "end_line": 2093,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be {@code null}\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2092,col 9)-(line 2092,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(char[], char, int)",
      "begin_line": 2110,
      "end_line": 2125,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2111,col 9)-(line 2113,col 9)",
        "(line 2114,col 9)-(line 2118,col 9)",
        "(line 2119,col 9)-(line 2123,col 9)",
        "(line 2124,col 9)-(line 2124,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(char[], char)",
      "begin_line": 2137,
      "end_line": 2139,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns {@code false} if a {@code null} array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return {@code true} if the array contains the object\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2138,col 9)-(line 2138,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(byte[], byte)",
      "begin_line": 2153,
      "end_line": 2155,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2154,col 9)-(line 2154,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(byte[], byte, int)",
      "begin_line": 2171,
      "end_line": 2184,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2172,col 9)-(line 2174,col 9)",
        "(line 2175,col 9)-(line 2177,col 9)",
        "(line 2178,col 9)-(line 2182,col 9)",
        "(line 2183,col 9)-(line 2183,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(byte[], byte)",
      "begin_line": 2196,
      "end_line": 2198,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be {@code null}\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2197,col 9)-(line 2197,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(byte[], byte, int)",
      "begin_line": 2214,
      "end_line": 2229,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2215,col 9)-(line 2217,col 9)",
        "(line 2218,col 9)-(line 2222,col 9)",
        "(line 2223,col 9)-(line 2227,col 9)",
        "(line 2228,col 9)-(line 2228,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(byte[], byte)",
      "begin_line": 2240,
      "end_line": 2242,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns {@code false} if a {@code null} array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return {@code true} if the array contains the object\n     ",
      "child_ranges": [
        "(line 2241,col 9)-(line 2241,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(double[], double)",
      "begin_line": 2256,
      "end_line": 2258,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2257,col 9)-(line 2257,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(double[], double, double)",
      "begin_line": 2273,
      "end_line": 2275,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value within a given tolerance in the array.\n     * This method will return the index of the first value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param tolerance tolerance of the search\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2274,col 9)-(line 2274,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(double[], double, int)",
      "begin_line": 2291,
      "end_line": 2304,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2292,col 9)-(line 2294,col 9)",
        "(line 2295,col 9)-(line 2297,col 9)",
        "(line 2298,col 9)-(line 2302,col 9)",
        "(line 2303,col 9)-(line 2303,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(double[], double, int, double)",
      "begin_line": 2323,
      "end_line": 2338,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\n     * This method will return the index of the first value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @param tolerance tolerance of the search\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2324,col 9)-(line 2326,col 9)",
        "(line 2327,col 9)-(line 2329,col 9)",
        "(line 2330,col 9)-(line 2330,col 45)",
        "(line 2331,col 9)-(line 2331,col 45)",
        "(line 2332,col 9)-(line 2336,col 9)",
        "(line 2337,col 9)-(line 2337,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(double[], double)",
      "begin_line": 2350,
      "end_line": 2352,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be {@code null}\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2351,col 9)-(line 2351,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(double[], double, double)",
      "begin_line": 2367,
      "end_line": 2369,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within a given tolerance in the array.\n     * This method will return the index of the last value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param tolerance tolerance of the search\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2368,col 9)-(line 2368,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(double[], double, int)",
      "begin_line": 2385,
      "end_line": 2400,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2386,col 9)-(line 2388,col 9)",
        "(line 2389,col 9)-(line 2393,col 9)",
        "(line 2394,col 9)-(line 2398,col 9)",
        "(line 2399,col 9)-(line 2399,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(double[], double, int, double)",
      "begin_line": 2419,
      "end_line": 2436,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\n     * This method will return the index of the last value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @param tolerance  search for value within plus/minus this amount\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2420,col 9)-(line 2422,col 9)",
        "(line 2423,col 9)-(line 2427,col 9)",
        "(line 2428,col 9)-(line 2428,col 45)",
        "(line 2429,col 9)-(line 2429,col 45)",
        "(line 2430,col 9)-(line 2434,col 9)",
        "(line 2435,col 9)-(line 2435,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(double[], double)",
      "begin_line": 2447,
      "end_line": 2449,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns {@code false} if a {@code null} array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return {@code true} if the array contains the object\n     ",
      "child_ranges": [
        "(line 2448,col 9)-(line 2448,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(double[], double, double)",
      "begin_line": 2464,
      "end_line": 2466,
      "comment": "\n     * \u003cp\u003eChecks if a value falling within the given tolerance is in the\n     * given array.  If the array contains a value within the inclusive range\n     * defined by (value - tolerance) to (value + tolerance).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns {@code false} if a {@code null} array\n     * is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search\n     * @param valueToFind  the value to find\n     * @param tolerance  the array contains the tolerance of the search\n     * @return true if value falling within tolerance is in array\n     ",
      "child_ranges": [
        "(line 2465,col 9)-(line 2465,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(float[], float)",
      "begin_line": 2480,
      "end_line": 2482,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2481,col 9)-(line 2481,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(float[], float, int)",
      "begin_line": 2498,
      "end_line": 2511,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2499,col 9)-(line 2501,col 9)",
        "(line 2502,col 9)-(line 2504,col 9)",
        "(line 2505,col 9)-(line 2509,col 9)",
        "(line 2510,col 9)-(line 2510,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(float[], float)",
      "begin_line": 2523,
      "end_line": 2525,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be {@code null}\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2524,col 9)-(line 2524,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(float[], float, int)",
      "begin_line": 2541,
      "end_line": 2556,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2542,col 9)-(line 2544,col 9)",
        "(line 2545,col 9)-(line 2549,col 9)",
        "(line 2550,col 9)-(line 2554,col 9)",
        "(line 2555,col 9)-(line 2555,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(float[], float)",
      "begin_line": 2567,
      "end_line": 2569,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns {@code false} if a {@code null} array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return {@code true} if the array contains the object\n     ",
      "child_ranges": [
        "(line 2568,col 9)-(line 2568,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(boolean[], boolean)",
      "begin_line": 2583,
      "end_line": 2585,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2584,col 9)-(line 2584,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(boolean[], boolean, int)",
      "begin_line": 2602,
      "end_line": 2615,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null}\n     *  array input\n     ",
      "child_ranges": [
        "(line 2603,col 9)-(line 2605,col 9)",
        "(line 2606,col 9)-(line 2608,col 9)",
        "(line 2609,col 9)-(line 2613,col 9)",
        "(line 2614,col 9)-(line 2614,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(boolean[], boolean)",
      "begin_line": 2628,
      "end_line": 2630,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) if\n     * {@code null} array input.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be {@code null}\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2629,col 9)-(line 2629,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(boolean[], boolean, int)",
      "begin_line": 2646,
      "end_line": 2661,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than\n     * the array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be {@code null}\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input\n     ",
      "child_ranges": [
        "(line 2647,col 9)-(line 2649,col 9)",
        "(line 2650,col 9)-(line 2654,col 9)",
        "(line 2655,col 9)-(line 2659,col 9)",
        "(line 2660,col 9)-(line 2660,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(boolean[], boolean)",
      "begin_line": 2672,
      "end_line": 2674,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns {@code false} if a {@code null} array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return {@code true} if the array contains the object\n     ",
      "child_ranges": [
        "(line 2673,col 9)-(line 2673,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Character[])",
      "begin_line": 2690,
      "end_line": 2701,
      "comment": "\n     * \u003cp\u003eConverts an array of object Characters to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Character} array, may be {@code null}\n     * @return a {@code char} array, {@code null} if null array input\n     * @throws NullPointerException if array content is {@code null}\n     ",
      "child_ranges": [
        "(line 2691,col 9)-(line 2695,col 9)",
        "(line 2696,col 9)-(line 2696,col 53)",
        "(line 2697,col 9)-(line 2699,col 9)",
        "(line 2700,col 9)-(line 2700,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Character[], char)",
      "begin_line": 2712,
      "end_line": 2724,
      "comment": "\n     * \u003cp\u003eConverts an array of object Character to primitives handling {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Character} array, may be {@code null}\n     * @param valueForNull  the value to insert if {@code null} found\n     * @return a {@code char} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 2713,col 9)-(line 2717,col 9)",
        "(line 2718,col 9)-(line 2718,col 53)",
        "(line 2719,col 9)-(line 2722,col 9)",
        "(line 2723,col 9)-(line 2723,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(char[])",
      "begin_line": 2734,
      "end_line": 2745,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive chars to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array a {@code char} array\n     * @return a {@code Character} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 2735,col 9)-(line 2739,col 9)",
        "(line 2740,col 9)-(line 2740,col 63)",
        "(line 2741,col 9)-(line 2743,col 9)",
        "(line 2744,col 9)-(line 2744,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Long[])",
      "begin_line": 2758,
      "end_line": 2769,
      "comment": "\n     * \u003cp\u003eConverts an array of object Longs to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Long} array, may be {@code null}\n     * @return a {@code long} array, {@code null} if null array input\n     * @throws NullPointerException if array content is {@code null}\n     ",
      "child_ranges": [
        "(line 2759,col 9)-(line 2763,col 9)",
        "(line 2764,col 9)-(line 2764,col 53)",
        "(line 2765,col 9)-(line 2767,col 9)",
        "(line 2768,col 9)-(line 2768,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Long[], long)",
      "begin_line": 2780,
      "end_line": 2792,
      "comment": "\n     * \u003cp\u003eConverts an array of object Long to primitives handling {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Long} array, may be {@code null}\n     * @param valueForNull  the value to insert if {@code null} found\n     * @return a {@code long} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 2781,col 9)-(line 2785,col 9)",
        "(line 2786,col 9)-(line 2786,col 53)",
        "(line 2787,col 9)-(line 2790,col 9)",
        "(line 2791,col 9)-(line 2791,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(long[])",
      "begin_line": 2802,
      "end_line": 2813,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive longs to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code long} array\n     * @return a {@code Long} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 2803,col 9)-(line 2807,col 9)",
        "(line 2808,col 9)-(line 2808,col 53)",
        "(line 2809,col 9)-(line 2811,col 9)",
        "(line 2812,col 9)-(line 2812,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Integer[])",
      "begin_line": 2826,
      "end_line": 2837,
      "comment": "\n     * \u003cp\u003eConverts an array of object Integers to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Integer} array, may be {@code null}\n     * @return an {@code int} array, {@code null} if null array input\n     * @throws NullPointerException if array content is {@code null}\n     ",
      "child_ranges": [
        "(line 2827,col 9)-(line 2831,col 9)",
        "(line 2832,col 9)-(line 2832,col 51)",
        "(line 2833,col 9)-(line 2835,col 9)",
        "(line 2836,col 9)-(line 2836,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Integer[], int)",
      "begin_line": 2848,
      "end_line": 2860,
      "comment": "\n     * \u003cp\u003eConverts an array of object Integer to primitives handling {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Integer} array, may be {@code null}\n     * @param valueForNull  the value to insert if {@code null} found\n     * @return an {@code int} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 2849,col 9)-(line 2853,col 9)",
        "(line 2854,col 9)-(line 2854,col 51)",
        "(line 2855,col 9)-(line 2858,col 9)",
        "(line 2859,col 9)-(line 2859,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(int[])",
      "begin_line": 2870,
      "end_line": 2881,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive ints to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  an {@code int} array\n     * @return an {@code Integer} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 2871,col 9)-(line 2875,col 9)",
        "(line 2876,col 9)-(line 2876,col 59)",
        "(line 2877,col 9)-(line 2879,col 9)",
        "(line 2880,col 9)-(line 2880,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Short[])",
      "begin_line": 2894,
      "end_line": 2905,
      "comment": "\n     * \u003cp\u003eConverts an array of object Shorts to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Short} array, may be {@code null}\n     * @return a {@code byte} array, {@code null} if null array input\n     * @throws NullPointerException if array content is {@code null}\n     ",
      "child_ranges": [
        "(line 2895,col 9)-(line 2899,col 9)",
        "(line 2900,col 9)-(line 2900,col 55)",
        "(line 2901,col 9)-(line 2903,col 9)",
        "(line 2904,col 9)-(line 2904,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Short[], short)",
      "begin_line": 2916,
      "end_line": 2928,
      "comment": "\n     * \u003cp\u003eConverts an array of object Short to primitives handling {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Short} array, may be {@code null}\n     * @param valueForNull  the value to insert if {@code null} found\n     * @return a {@code byte} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 2917,col 9)-(line 2921,col 9)",
        "(line 2922,col 9)-(line 2922,col 55)",
        "(line 2923,col 9)-(line 2926,col 9)",
        "(line 2927,col 9)-(line 2927,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(short[])",
      "begin_line": 2938,
      "end_line": 2949,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive shorts to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code short} array\n     * @return a {@code Short} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 2939,col 9)-(line 2943,col 9)",
        "(line 2944,col 9)-(line 2944,col 55)",
        "(line 2945,col 9)-(line 2947,col 9)",
        "(line 2948,col 9)-(line 2948,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Byte[])",
      "begin_line": 2962,
      "end_line": 2973,
      "comment": "\n     * \u003cp\u003eConverts an array of object Bytes to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Byte} array, may be {@code null}\n     * @return a {@code byte} array, {@code null} if null array input\n     * @throws NullPointerException if array content is {@code null}\n     ",
      "child_ranges": [
        "(line 2963,col 9)-(line 2967,col 9)",
        "(line 2968,col 9)-(line 2968,col 53)",
        "(line 2969,col 9)-(line 2971,col 9)",
        "(line 2972,col 9)-(line 2972,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Byte[], byte)",
      "begin_line": 2984,
      "end_line": 2996,
      "comment": "\n     * \u003cp\u003eConverts an array of object Bytes to primitives handling {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Byte} array, may be {@code null}\n     * @param valueForNull  the value to insert if {@code null} found\n     * @return a {@code byte} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 2985,col 9)-(line 2989,col 9)",
        "(line 2990,col 9)-(line 2990,col 53)",
        "(line 2991,col 9)-(line 2994,col 9)",
        "(line 2995,col 9)-(line 2995,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(byte[])",
      "begin_line": 3006,
      "end_line": 3017,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive bytes to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code byte} array\n     * @return a {@code Byte} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 3007,col 9)-(line 3011,col 9)",
        "(line 3012,col 9)-(line 3012,col 53)",
        "(line 3013,col 9)-(line 3015,col 9)",
        "(line 3016,col 9)-(line 3016,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Double[])",
      "begin_line": 3030,
      "end_line": 3041,
      "comment": "\n     * \u003cp\u003eConverts an array of object Doubles to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Double} array, may be {@code null}\n     * @return a {@code double} array, {@code null} if null array input\n     * @throws NullPointerException if array content is {@code null}\n     ",
      "child_ranges": [
        "(line 3031,col 9)-(line 3035,col 9)",
        "(line 3036,col 9)-(line 3036,col 57)",
        "(line 3037,col 9)-(line 3039,col 9)",
        "(line 3040,col 9)-(line 3040,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Double[], double)",
      "begin_line": 3052,
      "end_line": 3064,
      "comment": "\n     * \u003cp\u003eConverts an array of object Doubles to primitives handling {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Double} array, may be {@code null}\n     * @param valueForNull  the value to insert if {@code null} found\n     * @return a {@code double} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 3053,col 9)-(line 3057,col 9)",
        "(line 3058,col 9)-(line 3058,col 57)",
        "(line 3059,col 9)-(line 3062,col 9)",
        "(line 3063,col 9)-(line 3063,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(double[])",
      "begin_line": 3074,
      "end_line": 3085,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive doubles to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code double} array\n     * @return a {@code Double} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 3075,col 9)-(line 3079,col 9)",
        "(line 3080,col 9)-(line 3080,col 57)",
        "(line 3081,col 9)-(line 3083,col 9)",
        "(line 3084,col 9)-(line 3084,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Float[])",
      "begin_line": 3098,
      "end_line": 3109,
      "comment": "\n     * \u003cp\u003eConverts an array of object Floats to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Float} array, may be {@code null}\n     * @return a {@code float} array, {@code null} if null array input\n     * @throws NullPointerException if array content is {@code null}\n     ",
      "child_ranges": [
        "(line 3099,col 9)-(line 3103,col 9)",
        "(line 3104,col 9)-(line 3104,col 55)",
        "(line 3105,col 9)-(line 3107,col 9)",
        "(line 3108,col 9)-(line 3108,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Float[], float)",
      "begin_line": 3120,
      "end_line": 3132,
      "comment": "\n     * \u003cp\u003eConverts an array of object Floats to primitives handling {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Float} array, may be {@code null}\n     * @param valueForNull  the value to insert if {@code null} found\n     * @return a {@code float} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 3121,col 9)-(line 3125,col 9)",
        "(line 3126,col 9)-(line 3126,col 55)",
        "(line 3127,col 9)-(line 3130,col 9)",
        "(line 3131,col 9)-(line 3131,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(float[])",
      "begin_line": 3142,
      "end_line": 3153,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive floats to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code float} array\n     * @return a {@code Float} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 3143,col 9)-(line 3147,col 9)",
        "(line 3148,col 9)-(line 3148,col 55)",
        "(line 3149,col 9)-(line 3151,col 9)",
        "(line 3152,col 9)-(line 3152,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Boolean[])",
      "begin_line": 3166,
      "end_line": 3177,
      "comment": "\n     * \u003cp\u003eConverts an array of object Booleans to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Boolean} array, may be {@code null}\n     * @return a {@code boolean} array, {@code null} if null array input\n     * @throws NullPointerException if array content is {@code null}\n     ",
      "child_ranges": [
        "(line 3167,col 9)-(line 3171,col 9)",
        "(line 3172,col 9)-(line 3172,col 59)",
        "(line 3173,col 9)-(line 3175,col 9)",
        "(line 3176,col 9)-(line 3176,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Boolean[], boolean)",
      "begin_line": 3188,
      "end_line": 3200,
      "comment": "\n     * \u003cp\u003eConverts an array of object Booleans to primitives handling {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code Boolean} array, may be {@code null}\n     * @param valueForNull  the value to insert if {@code null} found\n     * @return a {@code boolean} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 3189,col 9)-(line 3193,col 9)",
        "(line 3194,col 9)-(line 3194,col 59)",
        "(line 3195,col 9)-(line 3198,col 9)",
        "(line 3199,col 9)-(line 3199,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(boolean[])",
      "begin_line": 3210,
      "end_line": 3221,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive booleans to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array  a {@code boolean} array\n     * @return a {@code Boolean} array, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 3211,col 9)-(line 3215,col 9)",
        "(line 3216,col 9)-(line 3216,col 59)",
        "(line 3217,col 9)-(line 3219,col 9)",
        "(line 3220,col 9)-(line 3220,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(java.lang.Object[])",
      "begin_line": 3231,
      "end_line": 3233,
      "comment": "\n     * \u003cp\u003eChecks if an array of Objects is empty or {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is empty or {@code null}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3232,col 9)-(line 3232,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(long[])",
      "begin_line": 3242,
      "end_line": 3244,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive longs is empty or {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is empty or {@code null}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3243,col 9)-(line 3243,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(int[])",
      "begin_line": 3253,
      "end_line": 3255,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive ints is empty or {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is empty or {@code null}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3254,col 9)-(line 3254,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(short[])",
      "begin_line": 3264,
      "end_line": 3266,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive shorts is empty or {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is empty or {@code null}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3265,col 9)-(line 3265,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(char[])",
      "begin_line": 3275,
      "end_line": 3277,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive chars is empty or {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is empty or {@code null}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3276,col 9)-(line 3276,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(byte[])",
      "begin_line": 3286,
      "end_line": 3288,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive bytes is empty or {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is empty or {@code null}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3287,col 9)-(line 3287,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(double[])",
      "begin_line": 3297,
      "end_line": 3299,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive doubles is empty or {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is empty or {@code null}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3298,col 9)-(line 3298,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(float[])",
      "begin_line": 3308,
      "end_line": 3310,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive floats is empty or {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is empty or {@code null}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3309,col 9)-(line 3309,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(boolean[])",
      "begin_line": 3319,
      "end_line": 3321,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive booleans is empty or {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is empty or {@code null}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3320,col 9)-(line 3320,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isNotEmpty(T[])",
      "begin_line": 3332,
      "end_line": 3334,
      "comment": "\n     * \u003cp\u003eChecks if an array of Objects is not empty or not {@code null}.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the component type of the array\n     * @param array  the array to test\n     * @return {@code true} if the array is not empty or not {@code null}\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 3333,col 10)-(line 3333,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isNotEmpty(long[])",
      "begin_line": 3343,
      "end_line": 3345,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive longs is not empty or not {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is not empty or not {@code null}\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 3344,col 9)-(line 3344,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isNotEmpty(int[])",
      "begin_line": 3354,
      "end_line": 3356,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive ints is not empty or not {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is not empty or not {@code null}\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 3355,col 9)-(line 3355,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isNotEmpty(short[])",
      "begin_line": 3365,
      "end_line": 3367,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive shorts is not empty or not {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is not empty or not {@code null}\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 3366,col 9)-(line 3366,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isNotEmpty(char[])",
      "begin_line": 3376,
      "end_line": 3378,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive chars is not empty or not {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is not empty or not {@code null}\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 3377,col 9)-(line 3377,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isNotEmpty(byte[])",
      "begin_line": 3387,
      "end_line": 3389,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive bytes is not empty or not {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is not empty or not {@code null}\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 3388,col 9)-(line 3388,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isNotEmpty(double[])",
      "begin_line": 3398,
      "end_line": 3400,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive doubles is not empty or not {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is not empty or not {@code null}\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 3399,col 9)-(line 3399,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isNotEmpty(float[])",
      "begin_line": 3409,
      "end_line": 3411,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive floats is not empty or not {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is not empty or not {@code null}\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 3410,col 9)-(line 3410,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isNotEmpty(boolean[])",
      "begin_line": 3420,
      "end_line": 3422,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive booleans is not empty or not {@code null}.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return {@code true} if the array is not empty or not {@code null}\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 3421,col 9)-(line 3421,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(T[], T...)",
      "begin_line": 3448,
      "end_line": 3475,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of {@code array1} followed\n     * by all of the elements {@code array2}. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(null, null)     \u003d null\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * ArrayUtils.addAll([null], [null]) \u003d [null, null]\n     * ArrayUtils.addAll([\"a\", \"b\", \"c\"], [\"1\", \"2\", \"3\"]) \u003d [\"a\", \"b\", \"c\", \"1\", \"2\", \"3\"]\n     * \u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the component type of the array\n     * @param array1  the first array whose elements are added to the new array, may be {@code null}\n     * @param array2  the second array whose elements are added to the new array, may be {@code null}\n     * @return The new array, {@code null} if both arrays are {@code null}.\n     *      The type of the new array is the type of the first array,\n     *      unless the first array is null, in which case the type is the same as the second array.\n     * @since 2.1\n     * @throws IllegalArgumentException if the array types are incompatible\n     ",
      "child_ranges": [
        "(line 3449,col 9)-(line 3453,col 9)",
        "(line 3454,col 9)-(line 3454,col 68)",
        "(line 3455,col 9)-(line 3456,col 88)",
        "(line 3457,col 9)-(line 3457,col 67)",
        "(line 3458,col 9)-(line 3473,col 9)",
        "(line 3474,col 9)-(line 3474,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(boolean[], boolean...)",
      "begin_line": 3494,
      "end_line": 3504,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of {@code array1} followed\n     * by all of the elements {@code array2}. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new boolean[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3495,col 9)-(line 3499,col 9)",
        "(line 3500,col 9)-(line 3500,col 75)",
        "(line 3501,col 9)-(line 3501,col 67)",
        "(line 3502,col 9)-(line 3502,col 79)",
        "(line 3503,col 9)-(line 3503,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(char[], char...)",
      "begin_line": 3523,
      "end_line": 3533,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of {@code array1} followed\n     * by all of the elements {@code array2}. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new char[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3524,col 9)-(line 3528,col 9)",
        "(line 3529,col 9)-(line 3529,col 69)",
        "(line 3530,col 9)-(line 3530,col 67)",
        "(line 3531,col 9)-(line 3531,col 79)",
        "(line 3532,col 9)-(line 3532,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(byte[], byte...)",
      "begin_line": 3552,
      "end_line": 3562,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of {@code array1} followed\n     * by all of the elements {@code array2}. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new byte[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3553,col 9)-(line 3557,col 9)",
        "(line 3558,col 9)-(line 3558,col 69)",
        "(line 3559,col 9)-(line 3559,col 67)",
        "(line 3560,col 9)-(line 3560,col 79)",
        "(line 3561,col 9)-(line 3561,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(short[], short...)",
      "begin_line": 3581,
      "end_line": 3591,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of {@code array1} followed\n     * by all of the elements {@code array2}. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new short[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3582,col 9)-(line 3586,col 9)",
        "(line 3587,col 9)-(line 3587,col 71)",
        "(line 3588,col 9)-(line 3588,col 67)",
        "(line 3589,col 9)-(line 3589,col 79)",
        "(line 3590,col 9)-(line 3590,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(int[], int...)",
      "begin_line": 3610,
      "end_line": 3620,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of {@code array1} followed\n     * by all of the elements {@code array2}. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new int[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3611,col 9)-(line 3615,col 9)",
        "(line 3616,col 9)-(line 3616,col 67)",
        "(line 3617,col 9)-(line 3617,col 67)",
        "(line 3618,col 9)-(line 3618,col 79)",
        "(line 3619,col 9)-(line 3619,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(long[], long...)",
      "begin_line": 3639,
      "end_line": 3649,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of {@code array1} followed\n     * by all of the elements {@code array2}. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new long[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3640,col 9)-(line 3644,col 9)",
        "(line 3645,col 9)-(line 3645,col 69)",
        "(line 3646,col 9)-(line 3646,col 67)",
        "(line 3647,col 9)-(line 3647,col 79)",
        "(line 3648,col 9)-(line 3648,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(float[], float...)",
      "begin_line": 3668,
      "end_line": 3678,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of {@code array1} followed\n     * by all of the elements {@code array2}. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new float[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3669,col 9)-(line 3673,col 9)",
        "(line 3674,col 9)-(line 3674,col 71)",
        "(line 3675,col 9)-(line 3675,col 67)",
        "(line 3676,col 9)-(line 3676,col 79)",
        "(line 3677,col 9)-(line 3677,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(double[], double...)",
      "begin_line": 3697,
      "end_line": 3707,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of {@code array1} followed\n     * by all of the elements {@code array2}. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new double[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3698,col 9)-(line 3702,col 9)",
        "(line 3703,col 9)-(line 3703,col 73)",
        "(line 3704,col 9)-(line 3704,col 67)",
        "(line 3705,col 9)-(line 3705,col 79)",
        "(line 3706,col 9)-(line 3706,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(T[], T)",
      "begin_line": 3738,
      "end_line": 3751,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element, unless the element itself is null,\n     *  in which case the return type is Object[]\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, null)      \u003d [null]\n     * ArrayUtils.add(null, \"a\")       \u003d [\"a\"]\n     * ArrayUtils.add([\"a\"], null)     \u003d [\"a\", null]\n     * ArrayUtils.add([\"a\"], \"b\")      \u003d [\"a\", \"b\"]\n     * ArrayUtils.add([\"a\", \"b\"], \"c\") \u003d [\"a\", \"b\", \"c\"]\n     * \u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the component type of the array\n     * @param array  the array to \"add\" the element to, may be {@code null}\n     * @param element  the object to add, may be {@code null}\n     * @return A new array containing the existing elements plus the new element\n     * The returned array type will be that of the input array (unless null),\n     * in which case it will have the same type as the element.\n     * If both are null, an IllegalArgumentException is thrown\n     * @since 2.1\n     * @throws IllegalArgumentException if both arguments are null\n     ",
      "child_ranges": [
        "(line 3739,col 9)-(line 3739,col 22)",
        "(line 3740,col 9)-(line 3746,col 9)",
        "(line 3747,col 9)-(line 3748,col 57)",
        "(line 3749,col 9)-(line 3749,col 48)",
        "(line 3750,col 9)-(line 3750,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(boolean[], boolean)",
      "begin_line": 3774,
      "end_line": 3778,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, true)          \u003d [true]\n     * ArrayUtils.add([true], false)       \u003d [true, false]\n     * ArrayUtils.add([true, false], true) \u003d [true, false, true]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be {@code null}\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3775,col 9)-(line 3775,col 76)",
        "(line 3776,col 9)-(line 3776,col 48)",
        "(line 3777,col 9)-(line 3777,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(byte[], byte)",
      "begin_line": 3801,
      "end_line": 3805,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be {@code null}\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3802,col 9)-(line 3802,col 67)",
        "(line 3803,col 9)-(line 3803,col 48)",
        "(line 3804,col 9)-(line 3804,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(char[], char)",
      "begin_line": 3828,
      "end_line": 3832,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, \u00270\u0027)       \u003d [\u00270\u0027]\n     * ArrayUtils.add([\u00271\u0027], \u00270\u0027)      \u003d [\u00271\u0027, \u00270\u0027]\n     * ArrayUtils.add([\u00271\u0027, \u00270\u0027], \u00271\u0027) \u003d [\u00271\u0027, \u00270\u0027, \u00271\u0027]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be {@code null}\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3829,col 9)-(line 3829,col 72)",
        "(line 3830,col 9)-(line 3830,col 48)",
        "(line 3831,col 9)-(line 3831,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(double[], double)",
      "begin_line": 3855,
      "end_line": 3859,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be {@code null}\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3856,col 9)-(line 3856,col 73)",
        "(line 3857,col 9)-(line 3857,col 48)",
        "(line 3858,col 9)-(line 3858,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(float[], float)",
      "begin_line": 3882,
      "end_line": 3886,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be {@code null}\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3883,col 9)-(line 3883,col 70)",
        "(line 3884,col 9)-(line 3884,col 48)",
        "(line 3885,col 9)-(line 3885,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(int[], int)",
      "begin_line": 3909,
      "end_line": 3913,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be {@code null}\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3910,col 9)-(line 3910,col 68)",
        "(line 3911,col 9)-(line 3911,col 48)",
        "(line 3912,col 9)-(line 3912,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(long[], long)",
      "begin_line": 3936,
      "end_line": 3940,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be {@code null}\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3937,col 9)-(line 3937,col 67)",
        "(line 3938,col 9)-(line 3938,col 48)",
        "(line 3939,col 9)-(line 3939,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(short[], short)",
      "begin_line": 3963,
      "end_line": 3967,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be {@code null}\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3964,col 9)-(line 3964,col 70)",
        "(line 3965,col 9)-(line 3965,col 48)",
        "(line 3966,col 9)-(line 3966,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.copyArrayGrow1(java.lang.Object, java.lang.Class\u003c?\u003e)",
      "begin_line": 3978,
      "end_line": 3986,
      "comment": "\n     * Returns a copy of the given array of size 1 greater than the argument.\n     * The last value of the array is left to the default value.\n     *\n     * @param array The array to copy, must not be {@code null}.\n     * @param newArrayComponentType If {@code array} is {@code null}, create a\n     * size 1 array of this type.\n     * @return A new copy of the array of size 1 greater than the input.\n     ",
      "child_ranges": [
        "(line 3979,col 9)-(line 3984,col 9)",
        "(line 3985,col 9)-(line 3985,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(T[], int, T)",
      "begin_line": 4018,
      "end_line": 4030,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0, null)      \u003d [null]\n     * ArrayUtils.add(null, 0, \"a\")       \u003d [\"a\"]\n     * ArrayUtils.add([\"a\"], 1, null)     \u003d [\"a\", null]\n     * ArrayUtils.add([\"a\"], 1, \"b\")      \u003d [\"a\", \"b\"]\n     * ArrayUtils.add([\"a\", \"b\"], 3, \"c\") \u003d [\"a\", \"b\", \"c\"]\n     * \u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the component type of the array\n     * @param array  the array to add the element to, may be {@code null}\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     * @throws IllegalArgumentException if both array and element are null\n     ",
      "child_ranges": [
        "(line 4019,col 9)-(line 4019,col 29)",
        "(line 4020,col 9)-(line 4026,col 9)",
        "(line 4027,col 9)-(line 4028,col 68)",
        "(line 4029,col 9)-(line 4029,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(boolean[], int, boolean)",
      "begin_line": 4059,
      "end_line": 4061,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0, true)          \u003d [true]\n     * ArrayUtils.add([true], 0, false)       \u003d [false, true]\n     * ArrayUtils.add([false], 1, true)       \u003d [false, true]\n     * ArrayUtils.add([true, false], 1, true) \u003d [true, true, false]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be {@code null}\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 4060,col 9)-(line 4060,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(char[], int, char)",
      "begin_line": 4091,
      "end_line": 4093,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0, \u0027a\u0027)            \u003d [\u0027a\u0027]\n     * ArrayUtils.add([\u0027a\u0027], 0, \u0027b\u0027)           \u003d [\u0027b\u0027, \u0027a\u0027]\n     * ArrayUtils.add([\u0027a\u0027, \u0027b\u0027], 0, \u0027c\u0027)      \u003d [\u0027c\u0027, \u0027a\u0027, \u0027b\u0027]\n     * ArrayUtils.add([\u0027a\u0027, \u0027b\u0027], 1, \u0027k\u0027)      \u003d [\u0027a\u0027, \u0027k\u0027, \u0027b\u0027]\n     * ArrayUtils.add([\u0027a\u0027, \u0027b\u0027, \u0027c\u0027], 1, \u0027t\u0027) \u003d [\u0027a\u0027, \u0027t\u0027, \u0027b\u0027, \u0027c\u0027]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be {@code null}\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 4092,col 9)-(line 4092,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(byte[], int, byte)",
      "begin_line": 4122,
      "end_line": 4124,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1], 0, 2)         \u003d [2, 1]\n     * ArrayUtils.add([2, 6], 2, 3)      \u003d [2, 6, 3]\n     * ArrayUtils.add([2, 6], 0, 1)      \u003d [1, 2, 6]\n     * ArrayUtils.add([2, 6, 3], 2, 1)   \u003d [2, 6, 1, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be {@code null}\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 4123,col 9)-(line 4123,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(short[], int, short)",
      "begin_line": 4153,
      "end_line": 4155,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1], 0, 2)         \u003d [2, 1]\n     * ArrayUtils.add([2, 6], 2, 10)     \u003d [2, 6, 10]\n     * ArrayUtils.add([2, 6], 0, -4)     \u003d [-4, 2, 6]\n     * ArrayUtils.add([2, 6, 3], 2, 1)   \u003d [2, 6, 1, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be {@code null}\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 4154,col 9)-(line 4154,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(int[], int, int)",
      "begin_line": 4184,
      "end_line": 4186,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1], 0, 2)         \u003d [2, 1]\n     * ArrayUtils.add([2, 6], 2, 10)     \u003d [2, 6, 10]\n     * ArrayUtils.add([2, 6], 0, -4)     \u003d [-4, 2, 6]\n     * ArrayUtils.add([2, 6, 3], 2, 1)   \u003d [2, 6, 1, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be {@code null}\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 4185,col 9)-(line 4185,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(long[], int, long)",
      "begin_line": 4215,
      "end_line": 4217,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1L], 0, 2L)           \u003d [2L, 1L]\n     * ArrayUtils.add([2L, 6L], 2, 10L)      \u003d [2L, 6L, 10L]\n     * ArrayUtils.add([2L, 6L], 0, -4L)      \u003d [-4L, 2L, 6L]\n     * ArrayUtils.add([2L, 6L, 3L], 2, 1L)   \u003d [2L, 6L, 1L, 3L]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be {@code null}\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 4216,col 9)-(line 4216,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(float[], int, float)",
      "begin_line": 4246,
      "end_line": 4248,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1.1f], 0, 2.2f)               \u003d [2.2f, 1.1f]\n     * ArrayUtils.add([2.3f, 6.4f], 2, 10.5f)        \u003d [2.3f, 6.4f, 10.5f]\n     * ArrayUtils.add([2.6f, 6.7f], 0, -4.8f)        \u003d [-4.8f, 2.6f, 6.7f]\n     * ArrayUtils.add([2.9f, 6.0f, 0.3f], 2, 1.0f)   \u003d [2.9f, 6.0f, 1.0f, 0.3f]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be {@code null}\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 4247,col 9)-(line 4247,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(double[], int, double)",
      "begin_line": 4277,
      "end_line": 4279,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1.1], 0, 2.2)              \u003d [2.2, 1.1]\n     * ArrayUtils.add([2.3, 6.4], 2, 10.5)        \u003d [2.3, 6.4, 10.5]\n     * ArrayUtils.add([2.6, 6.7], 0, -4.8)        \u003d [-4.8, 2.6, 6.7]\n     * ArrayUtils.add([2.9, 6.0, 0.3], 2, 1.0)    \u003d [2.9, 6.0, 1.0, 0.3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be {@code null}\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 4278,col 9)-(line 4278,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(java.lang.Object, int, java.lang.Object, java.lang.Class\u003c?\u003e)",
      "begin_line": 4292,
      "end_line": 4312,
      "comment": "\n     * Underlying implementation of add(array, index, element) methods.\n     * The last parameter is the class, which may not equal element.getClass\n     * for primitives.\n     *\n     * @param array  the array to add the element to, may be {@code null}\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @param clss the type of the element being added\n     * @return A new array containing the existing elements and the new element\n     ",
      "child_ranges": [
        "(line 4293,col 9)-(line 4300,col 9)",
        "(line 4301,col 9)-(line 4301,col 44)",
        "(line 4302,col 9)-(line 4304,col 9)",
        "(line 4305,col 9)-(line 4305,col 60)",
        "(line 4306,col 9)-(line 4306,col 53)",
        "(line 4307,col 9)-(line 4307,col 42)",
        "(line 4308,col 9)-(line 4310,col 9)",
        "(line 4311,col 9)-(line 4311,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(T[], int)",
      "begin_line": 4343,
      "end_line": 4346,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (subtracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([\"a\"], 0)           \u003d []\n     * ArrayUtils.remove([\"a\", \"b\"], 0)      \u003d [\"b\"]\n     * ArrayUtils.remove([\"a\", \"b\"], 1)      \u003d [\"a\"]\n     * ArrayUtils.remove([\"a\", \"b\", \"c\"], 1) \u003d [\"a\", \"c\"]\n     * \u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the component type of the array\n     * @param array  the array to remove the element from, may not be {@code null}\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4345,col 9)-(line 4345,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(T[], java.lang.Object)",
      "begin_line": 4374,
      "end_line": 4380,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (subtracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, \"a\")            \u003d null\n     * ArrayUtils.removeElement([], \"a\")              \u003d []\n     * ArrayUtils.removeElement([\"a\"], \"b\")           \u003d [\"a\"]\n     * ArrayUtils.removeElement([\"a\", \"b\"], \"a\")      \u003d [\"b\"]\n     * ArrayUtils.removeElement([\"a\", \"b\", \"a\"], \"a\") \u003d [\"b\", \"a\"]\n     * \u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the component type of the array\n     * @param array  the array to remove the element from, may be {@code null}\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4375,col 9)-(line 4375,col 44)",
        "(line 4376,col 9)-(line 4378,col 9)",
        "(line 4379,col 9)-(line 4379,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(boolean[], int)",
      "begin_line": 4410,
      "end_line": 4412,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (subtracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([true], 0)              \u003d []\n     * ArrayUtils.remove([true, false], 0)       \u003d [false]\n     * ArrayUtils.remove([true, false], 1)       \u003d [true]\n     * ArrayUtils.remove([true, true, false], 1) \u003d [true, false]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be {@code null}\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4411,col 9)-(line 4411,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(boolean[], boolean)",
      "begin_line": 4439,
      "end_line": 4445,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (subtracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, true)                \u003d null\n     * ArrayUtils.removeElement([], true)                  \u003d []\n     * ArrayUtils.removeElement([true], false)             \u003d [true]\n     * ArrayUtils.removeElement([true, false], false)      \u003d [true]\n     * ArrayUtils.removeElement([true, false, true], true) \u003d [false, true]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be {@code null}\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4440,col 9)-(line 4440,col 44)",
        "(line 4441,col 9)-(line 4443,col 9)",
        "(line 4444,col 9)-(line 4444,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(byte[], int)",
      "begin_line": 4475,
      "end_line": 4477,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (subtracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)          \u003d []\n     * ArrayUtils.remove([1, 0], 0)       \u003d [0]\n     * ArrayUtils.remove([1, 0], 1)       \u003d [1]\n     * ArrayUtils.remove([1, 0, 1], 1)    \u003d [1, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be {@code null}\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4476,col 9)-(line 4476,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(byte[], byte)",
      "begin_line": 4504,
      "end_line": 4510,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (subtracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)        \u003d null\n     * ArrayUtils.removeElement([], 1)          \u003d []\n     * ArrayUtils.removeElement([1], 0)         \u003d [1]\n     * ArrayUtils.removeElement([1, 0], 0)      \u003d [1]\n     * ArrayUtils.removeElement([1, 0, 1], 1)   \u003d [0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be {@code null}\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4505,col 9)-(line 4505,col 44)",
        "(line 4506,col 9)-(line 4508,col 9)",
        "(line 4509,col 9)-(line 4509,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(char[], int)",
      "begin_line": 4540,
      "end_line": 4542,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (subtracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([\u0027a\u0027], 0)           \u003d []\n     * ArrayUtils.remove([\u0027a\u0027, \u0027b\u0027], 0)      \u003d [\u0027b\u0027]\n     * ArrayUtils.remove([\u0027a\u0027, \u0027b\u0027], 1)      \u003d [\u0027a\u0027]\n     * ArrayUtils.remove([\u0027a\u0027, \u0027b\u0027, \u0027c\u0027], 1) \u003d [\u0027a\u0027, \u0027c\u0027]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be {@code null}\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4541,col 9)-(line 4541,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(char[], char)",
      "begin_line": 4569,
      "end_line": 4575,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (subtracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, \u0027a\u0027)            \u003d null\n     * ArrayUtils.removeElement([], \u0027a\u0027)              \u003d []\n     * ArrayUtils.removeElement([\u0027a\u0027], \u0027b\u0027)           \u003d [\u0027a\u0027]\n     * ArrayUtils.removeElement([\u0027a\u0027, \u0027b\u0027], \u0027a\u0027)      \u003d [\u0027b\u0027]\n     * ArrayUtils.removeElement([\u0027a\u0027, \u0027b\u0027, \u0027a\u0027], \u0027a\u0027) \u003d [\u0027b\u0027, \u0027a\u0027]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be {@code null}\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4570,col 9)-(line 4570,col 44)",
        "(line 4571,col 9)-(line 4573,col 9)",
        "(line 4574,col 9)-(line 4574,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(double[], int)",
      "begin_line": 4605,
      "end_line": 4607,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (subtracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1.1], 0)           \u003d []\n     * ArrayUtils.remove([2.5, 6.0], 0)      \u003d [6.0]\n     * ArrayUtils.remove([2.5, 6.0], 1)      \u003d [2.5]\n     * ArrayUtils.remove([2.5, 6.0, 3.8], 1) \u003d [2.5, 3.8]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be {@code null}\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4606,col 9)-(line 4606,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(double[], double)",
      "begin_line": 4634,
      "end_line": 4640,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (subtracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1.1)            \u003d null\n     * ArrayUtils.removeElement([], 1.1)              \u003d []\n     * ArrayUtils.removeElement([1.1], 1.2)           \u003d [1.1]\n     * ArrayUtils.removeElement([1.1, 2.3], 1.1)      \u003d [2.3]\n     * ArrayUtils.removeElement([1.1, 2.3, 1.1], 1.1) \u003d [2.3, 1.1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be {@code null}\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4635,col 9)-(line 4635,col 44)",
        "(line 4636,col 9)-(line 4638,col 9)",
        "(line 4639,col 9)-(line 4639,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(float[], int)",
      "begin_line": 4670,
      "end_line": 4672,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (subtracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1.1], 0)           \u003d []\n     * ArrayUtils.remove([2.5, 6.0], 0)      \u003d [6.0]\n     * ArrayUtils.remove([2.5, 6.0], 1)      \u003d [2.5]\n     * ArrayUtils.remove([2.5, 6.0, 3.8], 1) \u003d [2.5, 3.8]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be {@code null}\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4671,col 9)-(line 4671,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(float[], float)",
      "begin_line": 4699,
      "end_line": 4705,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (subtracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1.1)            \u003d null\n     * ArrayUtils.removeElement([], 1.1)              \u003d []\n     * ArrayUtils.removeElement([1.1], 1.2)           \u003d [1.1]\n     * ArrayUtils.removeElement([1.1, 2.3], 1.1)      \u003d [2.3]\n     * ArrayUtils.removeElement([1.1, 2.3, 1.1], 1.1) \u003d [2.3, 1.1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be {@code null}\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4700,col 9)-(line 4700,col 44)",
        "(line 4701,col 9)-(line 4703,col 9)",
        "(line 4704,col 9)-(line 4704,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(int[], int)",
      "begin_line": 4735,
      "end_line": 4737,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (subtracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)         \u003d []\n     * ArrayUtils.remove([2, 6], 0)      \u003d [6]\n     * ArrayUtils.remove([2, 6], 1)      \u003d [2]\n     * ArrayUtils.remove([2, 6, 3], 1)   \u003d [2, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be {@code null}\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4736,col 9)-(line 4736,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(int[], int)",
      "begin_line": 4764,
      "end_line": 4770,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (subtracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)      \u003d null\n     * ArrayUtils.removeElement([], 1)        \u003d []\n     * ArrayUtils.removeElement([1], 2)       \u003d [1]\n     * ArrayUtils.removeElement([1, 3], 1)    \u003d [3]\n     * ArrayUtils.removeElement([1, 3, 1], 1) \u003d [3, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be {@code null}\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4765,col 9)-(line 4765,col 44)",
        "(line 4766,col 9)-(line 4768,col 9)",
        "(line 4769,col 9)-(line 4769,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(long[], int)",
      "begin_line": 4800,
      "end_line": 4802,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (subtracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)         \u003d []\n     * ArrayUtils.remove([2, 6], 0)      \u003d [6]\n     * ArrayUtils.remove([2, 6], 1)      \u003d [2]\n     * ArrayUtils.remove([2, 6, 3], 1)   \u003d [2, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be {@code null}\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4801,col 9)-(line 4801,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(long[], long)",
      "begin_line": 4829,
      "end_line": 4835,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (subtracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)      \u003d null\n     * ArrayUtils.removeElement([], 1)        \u003d []\n     * ArrayUtils.removeElement([1], 2)       \u003d [1]\n     * ArrayUtils.removeElement([1, 3], 1)    \u003d [3]\n     * ArrayUtils.removeElement([1, 3, 1], 1) \u003d [3, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be {@code null}\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4830,col 9)-(line 4830,col 44)",
        "(line 4831,col 9)-(line 4833,col 9)",
        "(line 4834,col 9)-(line 4834,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(short[], int)",
      "begin_line": 4865,
      "end_line": 4867,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (subtracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)         \u003d []\n     * ArrayUtils.remove([2, 6], 0)      \u003d [6]\n     * ArrayUtils.remove([2, 6], 1)      \u003d [2]\n     * ArrayUtils.remove([2, 6, 3], 1)   \u003d [2, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be {@code null}\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4866,col 9)-(line 4866,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(short[], short)",
      "begin_line": 4894,
      "end_line": 4900,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (subtracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)      \u003d null\n     * ArrayUtils.removeElement([], 1)        \u003d []\n     * ArrayUtils.removeElement([1], 2)       \u003d [1]\n     * ArrayUtils.removeElement([1, 3], 1)    \u003d [3]\n     * ArrayUtils.removeElement([1, 3, 1], 1) \u003d [3, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be {@code null}\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4895,col 9)-(line 4895,col 44)",
        "(line 4896,col 9)-(line 4898,col 9)",
        "(line 4899,col 9)-(line 4899,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(java.lang.Object, int)",
      "begin_line": 4923,
      "end_line": 4936,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (subtracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * @param array  the array to remove the element from, may not be {@code null}\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4924,col 9)-(line 4924,col 38)",
        "(line 4925,col 9)-(line 4927,col 9)",
        "(line 4929,col 9)-(line 4929,col 91)",
        "(line 4930,col 9)-(line 4930,col 53)",
        "(line 4931,col 9)-(line 4933,col 9)",
        "(line 4935,col 9)-(line 4935,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeAll(T[], int...)",
      "begin_line": 4964,
      "end_line": 4968,
      "comment": "\n     * \u003cp\u003eRemoves the elements at the specified positions from the specified array.\n     * All remaining elements are shifted to the left.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except those at the specified positions. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeAll([\"a\", \"b\", \"c\"], 0, 2) \u003d [\"b\"]\n     * ArrayUtils.removeAll([\"a\", \"b\", \"c\"], 1, 2) \u003d [\"a\"]\n     * \u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the component type of the array\n     * @param array   the array to remove the element from, may not be {@code null}\n     * @param indices the positions of the elements to be removed\n     * @return A new array containing the existing elements except those\n     *         at the specified positions.\n     * @throws IndexOutOfBoundsException if any index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 3.0.1\n     ",
      "child_ranges": [
        "(line 4967,col 9)-(line 4967,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElements(T[], T...)",
      "begin_line": 4998,
      "end_line": 5024,
      "comment": "\n     * \u003cp\u003eRemoves occurrences of specified elements, in specified quantities,\n     * from the specified array. All subsequent elements are shifted left.\n     * For any element-to-be-removed specified in greater quantities than\n     * contained in the original array, no change occurs beyond the\n     * removal of the existing matching items.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except for the earliest-encountered occurrences of the specified\n     * elements. The component type of the returned array is always the same\n     * as that of the input array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElements(null, \"a\", \"b\")            \u003d null\n     * ArrayUtils.removeElements([], \"a\", \"b\")              \u003d []\n     * ArrayUtils.removeElements([\"a\"], \"b\", \"c\")           \u003d [\"a\"]\n     * ArrayUtils.removeElements([\"a\", \"b\"], \"a\", \"c\")      \u003d [\"b\"]\n     * ArrayUtils.removeElements([\"a\", \"b\", \"a\"], \"a\")      \u003d [\"b\", \"a\"]\n     * ArrayUtils.removeElements([\"a\", \"b\", \"a\"], \"a\", \"a\") \u003d [\"b\"]\n     * \u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the component type of the array\n     * @param array  the array to remove the element from, may be {@code null}\n     * @param values the elements to be removed\n     * @return A new array containing the existing elements except the\n     *         earliest-encountered occurrences of the specified elements.\n     * @since 3.0.1\n     ",
      "child_ranges": [
        "(line 4999,col 9)-(line 5001,col 9)",
        "(line 5002,col 9)-(line 5002,col 87)",
        "(line 5003,col 9)-(line 5010,col 9)",
        "(line 5011,col 9)-(line 5011,col 59)",
        "(line 5012,col 9)-(line 5022,col 9)",
        "(line 5023,col 9)-(line 5023,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeAll(byte[], int...)",
      "begin_line": 5055,
      "end_line": 5057,
      "comment": "\n     * \u003cp\u003eRemoves the elements at the specified positions from the specified array.\n     * All remaining elements are shifted to the left.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except those at the specified positions. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeAll([1], 0)             \u003d []\n     * ArrayUtils.removeAll([2, 6], 0)          \u003d [6]\n     * ArrayUtils.removeAll([2, 6], 0, 1)       \u003d []\n     * ArrayUtils.removeAll([2, 6, 3], 1, 2)    \u003d [2]\n     * ArrayUtils.removeAll([2, 6, 3], 0, 2)    \u003d [6]\n     * ArrayUtils.removeAll([2, 6, 3], 0, 1, 2) \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array   the array to remove the element from, may not be {@code null}\n     * @param indices the positions of the elements to be removed\n     * @return A new array containing the existing elements except those\n     *         at the specified positions.\n     * @throws IndexOutOfBoundsException if any index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 3.0.1\n     ",
      "child_ranges": [
        "(line 5056,col 9)-(line 5056,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElements(byte[], byte...)",
      "begin_line": 5086,
      "end_line": 5113,
      "comment": "\n     * \u003cp\u003eRemoves occurrences of specified elements, in specified quantities,\n     * from the specified array. All subsequent elements are shifted left.\n     * For any element-to-be-removed specified in greater quantities than\n     * contained in the original array, no change occurs beyond the\n     * removal of the existing matching items.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except for the earliest-encountered occurrences of the specified\n     * elements. The component type of the returned array is always the same\n     * as that of the input array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElements(null, 1, 2)      \u003d null\n     * ArrayUtils.removeElements([], 1, 2)        \u003d []\n     * ArrayUtils.removeElements([1], 2, 3)       \u003d [1]\n     * ArrayUtils.removeElements([1, 3], 1, 2)    \u003d [3]\n     * ArrayUtils.removeElements([1, 3, 1], 1)    \u003d [3, 1]\n     * ArrayUtils.removeElements([1, 3, 1], 1, 1) \u003d [3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be {@code null}\n     * @param values the elements to be removed\n     * @return A new array containing the existing elements except the\n     *         earliest-encountered occurrences of the specified elements.\n     * @since 3.0.1\n     ",
      "child_ranges": [
        "(line 5087,col 9)-(line 5089,col 9)",
        "(line 5090,col 9)-(line 5090,col 93)",
        "(line 5091,col 9)-(line 5099,col 9)",
        "(line 5100,col 9)-(line 5100,col 59)",
        "(line 5101,col 9)-(line 5111,col 9)",
        "(line 5112,col 9)-(line 5112,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeAll(short[], int...)",
      "begin_line": 5144,
      "end_line": 5146,
      "comment": "\n     * \u003cp\u003eRemoves the elements at the specified positions from the specified array.\n     * All remaining elements are shifted to the left.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except those at the specified positions. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeAll([1], 0)             \u003d []\n     * ArrayUtils.removeAll([2, 6], 0)          \u003d [6]\n     * ArrayUtils.removeAll([2, 6], 0, 1)       \u003d []\n     * ArrayUtils.removeAll([2, 6, 3], 1, 2)    \u003d [2]\n     * ArrayUtils.removeAll([2, 6, 3], 0, 2)    \u003d [6]\n     * ArrayUtils.removeAll([2, 6, 3], 0, 1, 2) \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array   the array to remove the element from, may not be {@code null}\n     * @param indices the positions of the elements to be removed\n     * @return A new array containing the existing elements except those\n     *         at the specified positions.\n     * @throws IndexOutOfBoundsException if any index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 3.0.1\n     ",
      "child_ranges": [
        "(line 5145,col 9)-(line 5145,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElements(short[], short...)",
      "begin_line": 5175,
      "end_line": 5202,
      "comment": "\n     * \u003cp\u003eRemoves occurrences of specified elements, in specified quantities,\n     * from the specified array. All subsequent elements are shifted left.\n     * For any element-to-be-removed specified in greater quantities than\n     * contained in the original array, no change occurs beyond the\n     * removal of the existing matching items.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except for the earliest-encountered occurrences of the specified\n     * elements. The component type of the returned array is always the same\n     * as that of the input array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElements(null, 1, 2)      \u003d null\n     * ArrayUtils.removeElements([], 1, 2)        \u003d []\n     * ArrayUtils.removeElements([1], 2, 3)       \u003d [1]\n     * ArrayUtils.removeElements([1, 3], 1, 2)    \u003d [3]\n     * ArrayUtils.removeElements([1, 3, 1], 1)    \u003d [3, 1]\n     * ArrayUtils.removeElements([1, 3, 1], 1, 1) \u003d [3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be {@code null}\n     * @param values the elements to be removed\n     * @return A new array containing the existing elements except the\n     *         earliest-encountered occurrences of the specified elements.\n     * @since 3.0.1\n     ",
      "child_ranges": [
        "(line 5176,col 9)-(line 5178,col 9)",
        "(line 5179,col 9)-(line 5179,col 95)",
        "(line 5180,col 9)-(line 5188,col 9)",
        "(line 5189,col 9)-(line 5189,col 59)",
        "(line 5190,col 9)-(line 5200,col 9)",
        "(line 5201,col 9)-(line 5201,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeAll(int[], int...)",
      "begin_line": 5233,
      "end_line": 5235,
      "comment": "\n     * \u003cp\u003eRemoves the elements at the specified positions from the specified array.\n     * All remaining elements are shifted to the left.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except those at the specified positions. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeAll([1], 0)             \u003d []\n     * ArrayUtils.removeAll([2, 6], 0)          \u003d [6]\n     * ArrayUtils.removeAll([2, 6], 0, 1)       \u003d []\n     * ArrayUtils.removeAll([2, 6, 3], 1, 2)    \u003d [2]\n     * ArrayUtils.removeAll([2, 6, 3], 0, 2)    \u003d [6]\n     * ArrayUtils.removeAll([2, 6, 3], 0, 1, 2) \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array   the array to remove the element from, may not be {@code null}\n     * @param indices the positions of the elements to be removed\n     * @return A new array containing the existing elements except those\n     *         at the specified positions.\n     * @throws IndexOutOfBoundsException if any index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 3.0.1\n     ",
      "child_ranges": [
        "(line 5234,col 9)-(line 5234,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElements(int[], int...)",
      "begin_line": 5264,
      "end_line": 5291,
      "comment": "\n     * \u003cp\u003eRemoves occurrences of specified elements, in specified quantities,\n     * from the specified array. All subsequent elements are shifted left.\n     * For any element-to-be-removed specified in greater quantities than\n     * contained in the original array, no change occurs beyond the\n     * removal of the existing matching items.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except for the earliest-encountered occurrences of the specified\n     * elements. The component type of the returned array is always the same\n     * as that of the input array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElements(null, 1, 2)      \u003d null\n     * ArrayUtils.removeElements([], 1, 2)        \u003d []\n     * ArrayUtils.removeElements([1], 2, 3)       \u003d [1]\n     * ArrayUtils.removeElements([1, 3], 1, 2)    \u003d [3]\n     * ArrayUtils.removeElements([1, 3, 1], 1)    \u003d [3, 1]\n     * ArrayUtils.removeElements([1, 3, 1], 1, 1) \u003d [3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be {@code null}\n     * @param values the elements to be removed\n     * @return A new array containing the existing elements except the\n     *         earliest-encountered occurrences of the specified elements.\n     * @since 3.0.1\n     ",
      "child_ranges": [
        "(line 5265,col 9)-(line 5267,col 9)",
        "(line 5268,col 9)-(line 5268,col 99)",
        "(line 5269,col 9)-(line 5277,col 9)",
        "(line 5278,col 9)-(line 5278,col 59)",
        "(line 5279,col 9)-(line 5289,col 9)",
        "(line 5290,col 9)-(line 5290,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeAll(char[], int...)",
      "begin_line": 5322,
      "end_line": 5324,
      "comment": "\n     * \u003cp\u003eRemoves the elements at the specified positions from the specified array.\n     * All remaining elements are shifted to the left.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except those at the specified positions. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeAll([1], 0)             \u003d []\n     * ArrayUtils.removeAll([2, 6], 0)          \u003d [6]\n     * ArrayUtils.removeAll([2, 6], 0, 1)       \u003d []\n     * ArrayUtils.removeAll([2, 6, 3], 1, 2)    \u003d [2]\n     * ArrayUtils.removeAll([2, 6, 3], 0, 2)    \u003d [6]\n     * ArrayUtils.removeAll([2, 6, 3], 0, 1, 2) \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array   the array to remove the element from, may not be {@code null}\n     * @param indices the positions of the elements to be removed\n     * @return A new array containing the existing elements except those\n     *         at the specified positions.\n     * @throws IndexOutOfBoundsException if any index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 3.0.1\n     ",
      "child_ranges": [
        "(line 5323,col 9)-(line 5323,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElements(char[], char...)",
      "begin_line": 5353,
      "end_line": 5380,
      "comment": "\n     * \u003cp\u003eRemoves occurrences of specified elements, in specified quantities,\n     * from the specified array. All subsequent elements are shifted left.\n     * For any element-to-be-removed specified in greater quantities than\n     * contained in the original array, no change occurs beyond the\n     * removal of the existing matching items.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except for the earliest-encountered occurrences of the specified\n     * elements. The component type of the returned array is always the same\n     * as that of the input array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElements(null, 1, 2)      \u003d null\n     * ArrayUtils.removeElements([], 1, 2)        \u003d []\n     * ArrayUtils.removeElements([1], 2, 3)       \u003d [1]\n     * ArrayUtils.removeElements([1, 3], 1, 2)    \u003d [3]\n     * ArrayUtils.removeElements([1, 3, 1], 1)    \u003d [3, 1]\n     * ArrayUtils.removeElements([1, 3, 1], 1, 1) \u003d [3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be {@code null}\n     * @param values the elements to be removed\n     * @return A new array containing the existing elements except the\n     *         earliest-encountered occurrences of the specified elements.\n     * @since 3.0.1\n     ",
      "child_ranges": [
        "(line 5354,col 9)-(line 5356,col 9)",
        "(line 5357,col 9)-(line 5357,col 103)",
        "(line 5358,col 9)-(line 5366,col 9)",
        "(line 5367,col 9)-(line 5367,col 59)",
        "(line 5368,col 9)-(line 5378,col 9)",
        "(line 5379,col 9)-(line 5379,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeAll(long[], int...)",
      "begin_line": 5411,
      "end_line": 5413,
      "comment": "\n     * \u003cp\u003eRemoves the elements at the specified positions from the specified array.\n     * All remaining elements are shifted to the left.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except those at the specified positions. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeAll([1], 0)             \u003d []\n     * ArrayUtils.removeAll([2, 6], 0)          \u003d [6]\n     * ArrayUtils.removeAll([2, 6], 0, 1)       \u003d []\n     * ArrayUtils.removeAll([2, 6, 3], 1, 2)    \u003d [2]\n     * ArrayUtils.removeAll([2, 6, 3], 0, 2)    \u003d [6]\n     * ArrayUtils.removeAll([2, 6, 3], 0, 1, 2) \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array   the array to remove the element from, may not be {@code null}\n     * @param indices the positions of the elements to be removed\n     * @return A new array containing the existing elements except those\n     *         at the specified positions.\n     * @throws IndexOutOfBoundsException if any index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 3.0.1\n     ",
      "child_ranges": [
        "(line 5412,col 9)-(line 5412,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElements(long[], long...)",
      "begin_line": 5442,
      "end_line": 5469,
      "comment": "\n     * \u003cp\u003eRemoves occurrences of specified elements, in specified quantities,\n     * from the specified array. All subsequent elements are shifted left.\n     * For any element-to-be-removed specified in greater quantities than\n     * contained in the original array, no change occurs beyond the\n     * removal of the existing matching items.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except for the earliest-encountered occurrences of the specified\n     * elements. The component type of the returned array is always the same\n     * as that of the input array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElements(null, 1, 2)      \u003d null\n     * ArrayUtils.removeElements([], 1, 2)        \u003d []\n     * ArrayUtils.removeElements([1], 2, 3)       \u003d [1]\n     * ArrayUtils.removeElements([1, 3], 1, 2)    \u003d [3]\n     * ArrayUtils.removeElements([1, 3, 1], 1)    \u003d [3, 1]\n     * ArrayUtils.removeElements([1, 3, 1], 1, 1) \u003d [3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be {@code null}\n     * @param values the elements to be removed\n     * @return A new array containing the existing elements except the\n     *         earliest-encountered occurrences of the specified elements.\n     * @since 3.0.1\n     ",
      "child_ranges": [
        "(line 5443,col 9)-(line 5445,col 9)",
        "(line 5446,col 9)-(line 5446,col 93)",
        "(line 5447,col 9)-(line 5455,col 9)",
        "(line 5456,col 9)-(line 5456,col 59)",
        "(line 5457,col 9)-(line 5467,col 9)",
        "(line 5468,col 9)-(line 5468,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeAll(float[], int...)",
      "begin_line": 5500,
      "end_line": 5502,
      "comment": "\n     * \u003cp\u003eRemoves the elements at the specified positions from the specified array.\n     * All remaining elements are shifted to the left.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except those at the specified positions. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeAll([1], 0)             \u003d []\n     * ArrayUtils.removeAll([2, 6], 0)          \u003d [6]\n     * ArrayUtils.removeAll([2, 6], 0, 1)       \u003d []\n     * ArrayUtils.removeAll([2, 6, 3], 1, 2)    \u003d [2]\n     * ArrayUtils.removeAll([2, 6, 3], 0, 2)    \u003d [6]\n     * ArrayUtils.removeAll([2, 6, 3], 0, 1, 2) \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array   the array to remove the element from, may not be {@code null}\n     * @param indices the positions of the elements to be removed\n     * @return A new array containing the existing elements except those\n     *         at the specified positions.\n     * @throws IndexOutOfBoundsException if any index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 3.0.1\n     ",
      "child_ranges": [
        "(line 5501,col 9)-(line 5501,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElements(float[], float...)",
      "begin_line": 5531,
      "end_line": 5558,
      "comment": "\n     * \u003cp\u003eRemoves occurrences of specified elements, in specified quantities,\n     * from the specified array. All subsequent elements are shifted left.\n     * For any element-to-be-removed specified in greater quantities than\n     * contained in the original array, no change occurs beyond the\n     * removal of the existing matching items.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except for the earliest-encountered occurrences of the specified\n     * elements. The component type of the returned array is always the same\n     * as that of the input array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElements(null, 1, 2)      \u003d null\n     * ArrayUtils.removeElements([], 1, 2)        \u003d []\n     * ArrayUtils.removeElements([1], 2, 3)       \u003d [1]\n     * ArrayUtils.removeElements([1, 3], 1, 2)    \u003d [3]\n     * ArrayUtils.removeElements([1, 3, 1], 1)    \u003d [3, 1]\n     * ArrayUtils.removeElements([1, 3, 1], 1, 1) \u003d [3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be {@code null}\n     * @param values the elements to be removed\n     * @return A new array containing the existing elements except the\n     *         earliest-encountered occurrences of the specified elements.\n     * @since 3.0.1\n     ",
      "child_ranges": [
        "(line 5532,col 9)-(line 5534,col 9)",
        "(line 5535,col 9)-(line 5535,col 95)",
        "(line 5536,col 9)-(line 5544,col 9)",
        "(line 5545,col 9)-(line 5545,col 59)",
        "(line 5546,col 9)-(line 5556,col 9)",
        "(line 5557,col 9)-(line 5557,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeAll(double[], int...)",
      "begin_line": 5589,
      "end_line": 5591,
      "comment": "\n     * \u003cp\u003eRemoves the elements at the specified positions from the specified array.\n     * All remaining elements are shifted to the left.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except those at the specified positions. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeAll([1], 0)             \u003d []\n     * ArrayUtils.removeAll([2, 6], 0)          \u003d [6]\n     * ArrayUtils.removeAll([2, 6], 0, 1)       \u003d []\n     * ArrayUtils.removeAll([2, 6, 3], 1, 2)    \u003d [2]\n     * ArrayUtils.removeAll([2, 6, 3], 0, 2)    \u003d [6]\n     * ArrayUtils.removeAll([2, 6, 3], 0, 1, 2) \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array   the array to remove the element from, may not be {@code null}\n     * @param indices the positions of the elements to be removed\n     * @return A new array containing the existing elements except those\n     *         at the specified positions.\n     * @throws IndexOutOfBoundsException if any index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 3.0.1\n     ",
      "child_ranges": [
        "(line 5590,col 9)-(line 5590,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElements(double[], double...)",
      "begin_line": 5620,
      "end_line": 5647,
      "comment": "\n     * \u003cp\u003eRemoves occurrences of specified elements, in specified quantities,\n     * from the specified array. All subsequent elements are shifted left.\n     * For any element-to-be-removed specified in greater quantities than\n     * contained in the original array, no change occurs beyond the\n     * removal of the existing matching items.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except for the earliest-encountered occurrences of the specified\n     * elements. The component type of the returned array is always the same\n     * as that of the input array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElements(null, 1, 2)      \u003d null\n     * ArrayUtils.removeElements([], 1, 2)        \u003d []\n     * ArrayUtils.removeElements([1], 2, 3)       \u003d [1]\n     * ArrayUtils.removeElements([1, 3], 1, 2)    \u003d [3]\n     * ArrayUtils.removeElements([1, 3, 1], 1)    \u003d [3, 1]\n     * ArrayUtils.removeElements([1, 3, 1], 1, 1) \u003d [3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be {@code null}\n     * @param values the elements to be removed\n     * @return A new array containing the existing elements except the\n     *         earliest-encountered occurrences of the specified elements.\n     * @since 3.0.1\n     ",
      "child_ranges": [
        "(line 5621,col 9)-(line 5623,col 9)",
        "(line 5624,col 9)-(line 5624,col 97)",
        "(line 5625,col 9)-(line 5633,col 9)",
        "(line 5634,col 9)-(line 5634,col 59)",
        "(line 5635,col 9)-(line 5645,col 9)",
        "(line 5646,col 9)-(line 5646,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeAll(boolean[], int...)",
      "begin_line": 5674,
      "end_line": 5676,
      "comment": "\n     * \u003cp\u003eRemoves the elements at the specified positions from the specified array.\n     * All remaining elements are shifted to the left.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except those at the specified positions. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is {@code null}, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeAll([true, false, true], 0, 2) \u003d [false]\n     * ArrayUtils.removeAll([true, false, true], 1, 2) \u003d [true]\n     * \u003c/pre\u003e\n     *\n     * @param array   the array to remove the element from, may not be {@code null}\n     * @param indices the positions of the elements to be removed\n     * @return A new array containing the existing elements except those\n     *         at the specified positions.\n     * @throws IndexOutOfBoundsException if any index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is {@code null}.\n     * @since 3.0.1\n     ",
      "child_ranges": [
        "(line 5675,col 9)-(line 5675,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElements(boolean[], boolean...)",
      "begin_line": 5705,
      "end_line": 5732,
      "comment": "\n     * \u003cp\u003eRemoves occurrences of specified elements, in specified quantities,\n     * from the specified array. All subsequent elements are shifted left.\n     * For any element-to-be-removed specified in greater quantities than\n     * contained in the original array, no change occurs beyond the\n     * removal of the existing matching items.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except for the earliest-encountered occurrences of the specified\n     * elements. The component type of the returned array is always the same\n     * as that of the input array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElements(null, true, false)               \u003d null\n     * ArrayUtils.removeElements([], true, false)                 \u003d []\n     * ArrayUtils.removeElements([true], false, false)            \u003d [true]\n     * ArrayUtils.removeElements([true, false], true, true)       \u003d [false]\n     * ArrayUtils.removeElements([true, false, true], true)       \u003d [false, true]\n     * ArrayUtils.removeElements([true, false, true], true, true) \u003d [false]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be {@code null}\n     * @param values the elements to be removed\n     * @return A new array containing the existing elements except the\n     *         earliest-encountered occurrences of the specified elements.\n     * @since 3.0.1\n     ",
      "child_ranges": [
        "(line 5706,col 9)-(line 5708,col 9)",
        "(line 5709,col 9)-(line 5709,col 99)",
        "(line 5710,col 9)-(line 5718,col 9)",
        "(line 5719,col 9)-(line 5719,col 59)",
        "(line 5720,col 9)-(line 5730,col 9)",
        "(line 5731,col 9)-(line 5731,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeAll(java.lang.Object, int...)",
      "begin_line": 5741,
      "end_line": 5780,
      "comment": "\n     * Removes multiple array elements specified by index.\n     * @param array source\n     * @param indices to remove, WILL BE SORTED--so only clones of user-owned arrays!\n     * @return new array of same type minus elements specified by unique values of {@code indices}\n     * @since 3.0.1\n     ",
      "child_ranges": [
        "(line 5742,col 9)-(line 5742,col 38)",
        "(line 5743,col 9)-(line 5743,col 21)",
        "(line 5745,col 9)-(line 5761,col 9)",
        "(line 5762,col 9)-(line 5762,col 94)",
        "(line 5763,col 9)-(line 5778,col 9)",
        "(line 5779,col 9)-(line 5779,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.extractIndices(java.util.HashSet\u003cjava.lang.Integer\u003e)",
      "begin_line": 5788,
      "end_line": 5795,
      "comment": "\n     * Extract a set of Integer indices into an int[].\n     * @param coll {@code HashSet} of {@code Integer}\n     * @return int[]\n     * @since 3.0.1\n     ",
      "child_ranges": [
        "(line 5789,col 9)-(line 5789,col 44)",
        "(line 5790,col 9)-(line 5790,col 18)",
        "(line 5791,col 9)-(line 5793,col 9)",
        "(line 5794,col 9)-(line 5794,col 22)"
      ]
    }
  ]
}