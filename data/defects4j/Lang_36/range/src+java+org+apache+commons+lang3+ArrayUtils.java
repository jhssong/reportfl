{
  "filepath": "/tmp/Lang-36b/src/java/org/apache/commons/lang3/ArrayUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 49,
      "end_line": 4433,
      "comment": "\n * \u003cp\u003eOperations on arrays, primitive arrays (like \u003ccode\u003eint[]\u003c/code\u003e) and\n * primitive wrapper arrays (like \u003ccode\u003eInteger[]\u003c/code\u003e).\u003c/p\u003e\n *\n * \u003cp\u003eThis class tries to handle \u003ccode\u003enull\u003c/code\u003e input gracefully.\n * An exception will not be thrown for a \u003ccode\u003enull\u003c/code\u003e\n * array input. However, an Object array that contains a \u003ccode\u003enull\u003c/code\u003e\n * element may throw an exception. Each method documents its behaviour.\u003c/p\u003e\n *\n * @author Apache Software Foundation\n * @author Moritz Petersen\n * @author \u003ca href\u003d\"mailto:fredrik@westermarck.com\"\u003eFredrik Westermarck\u003c/a\u003e\n * @author Nikolay Metchev\n * @author Matthew Hawthorne\n * @author Tim O\u0027Brien\n * @author Pete Gieser\n * @author Gary Gregory\n * @author \u003ca href\u003d\"mailto:equinus100@hotmail.com\"\u003eAshwin S\u003c/a\u003e\n * @author Maarten Coene\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_OBJECT_ARRAY"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * An empty immutable \u003ccode\u003eObject\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_CLASS_ARRAY"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * An empty immutable \u003ccode\u003eClass\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_STRING_ARRAY"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * An empty immutable \u003ccode\u003eString\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_LONG_ARRAY"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * An empty immutable \u003ccode\u003elong\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_LONG_OBJECT_ARRAY"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * An empty immutable \u003ccode\u003eLong\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_INT_ARRAY"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * An empty immutable \u003ccode\u003eint\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_INTEGER_OBJECT_ARRAY"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * An empty immutable \u003ccode\u003eInteger\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_SHORT_ARRAY"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * An empty immutable \u003ccode\u003eshort\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_SHORT_OBJECT_ARRAY"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * An empty immutable \u003ccode\u003eShort\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_BYTE_ARRAY"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * An empty immutable \u003ccode\u003ebyte\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_BYTE_OBJECT_ARRAY"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * An empty immutable \u003ccode\u003eByte\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_DOUBLE_ARRAY"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * An empty immutable \u003ccode\u003edouble\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_DOUBLE_OBJECT_ARRAY"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * An empty immutable \u003ccode\u003eDouble\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_FLOAT_ARRAY"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * An empty immutable \u003ccode\u003efloat\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_FLOAT_OBJECT_ARRAY"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": "\n     * An empty immutable \u003ccode\u003eFloat\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_BOOLEAN_ARRAY"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * An empty immutable \u003ccode\u003eboolean\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_BOOLEAN_OBJECT_ARRAY"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": "\n     * An empty immutable \u003ccode\u003eBoolean\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_CHAR_ARRAY"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * An empty immutable \u003ccode\u003echar\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_CHARACTER_OBJECT_ARRAY"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": "\n     * An empty immutable \u003ccode\u003eCharacter\u003c/code\u003e array.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INDEX_NOT_FOUND"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": "\n     * The index value when an element is not found in a list or array: \u003ccode\u003e-1\u003c/code\u003e.\n     * This value is returned by methods in this class and can also be used in comparisons with values returned by\n     * various method from {@link java.util.List}.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.ArrayUtils.ArrayUtils()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * \u003cp\u003eArrayUtils instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as \u003ccode\u003eArrayUtils.clone(new int[] {2})\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 143,col 7)-(line 143,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toString(java.lang.Object)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * \u003cp\u003eOutputs an array as a String, treating \u003ccode\u003enull\u003c/code\u003e as an empty array.\u003c/p\u003e\n     *\n     * \u003cp\u003eMulti-dimensional arrays are handled correctly, including\n     * multi-dimensional primitive arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format is that of Java source code, for example \u003ccode\u003e{a,b}\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to get a toString for, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a String representation of the array, \u0027{}\u0027 if null array input\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toString(java.lang.Object, java.lang.String)",
      "begin_line": 175,
      "end_line": 180,
      "comment": "\n     * \u003cp\u003eOutputs an array as a String handling \u003ccode\u003enull\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003cp\u003eMulti-dimensional arrays are handled correctly, including\n     * multi-dimensional primitive arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format is that of Java source code, for example \u003ccode\u003e{a,b}\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to get a toString for, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param stringIfNull  the String to return if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @return a String representation of the array\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEquals(java.lang.Object, java.lang.Object)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * \u003cp\u003eCompares two arrays, using equals(), handling multi-dimensional arrays\n     * correctly.\u003c/p\u003e\n     *\n     * \u003cp\u003eMulti-dimensional primitive arrays are also handled correctly by this method.\u003c/p\u003e\n     *\n     * @param array1  the left hand array to compare, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2  the right hand array to compare, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the arrays are equal\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toMap(java.lang.Object[])",
      "begin_line": 223,
      "end_line": 248,
      "comment": "\n     * \u003cp\u003eConverts the given array into a {@link java.util.Map}. Each element of the array\n     * must be either a {@link java.util.Map.Entry} or an Array, containing at least two\n     * elements, where the first element is used as key and the second as\n     * value.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method can be used to initialize:\u003c/p\u003e\n     * \u003cpre\u003e\n     * // Create a Map mapping colors.\n     * Map colorMap \u003d MapUtils.toMap(new String[][] {{\n     *     {\"RED\", \"#FF0000\"},\n     *     {\"GREEN\", \"#00FF00\"},\n     *     {\"BLUE\", \"#0000FF\"}});\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  an array whose elements are either a {@link java.util.Map.Entry} or\n     *  an Array containing at least two elements, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eMap\u003c/code\u003e that was created from the array\n     * @throws IllegalArgumentException  if one element of this Array is\n     *  itself an Array containing less then two elements\n     * @throws IllegalArgumentException  if the array contains elements other\n     *  than {@link java.util.Map.Entry} and an Array\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 96)",
        "(line 228,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(T[])",
      "begin_line": 264,
      "end_line": 269,
      "comment": "\n     * \u003cp\u003eShallow clones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe objects in the array are not cloned, thus there is no special\n     * handling for multi-dimensional arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to shallow clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(long[])",
      "begin_line": 280,
      "end_line": 285,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(int[])",
      "begin_line": 296,
      "end_line": 301,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 300,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(short[])",
      "begin_line": 312,
      "end_line": 317,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(char[])",
      "begin_line": 328,
      "end_line": 333,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(byte[])",
      "begin_line": 344,
      "end_line": 349,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(double[])",
      "begin_line": 360,
      "end_line": 365,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 364,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(float[])",
      "begin_line": 376,
      "end_line": 381,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 380,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.clone(boolean[])",
      "begin_line": 392,
      "end_line": 397,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 396,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(T[], int, int)",
      "begin_line": 428,
      "end_line": 449,
      "comment": "\n     * \u003cp\u003eProduces a new array containing the elements between\n     * the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe component type of the subarray is always the same as\n     * that of the input array. Thus, if the input is an array of type\n     * \u003ccode\u003eDate\u003c/code\u003e, the following usage is envisaged:\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Date[] someDates \u003d (Date[])ArrayUtils.subarray(allDates, 2, 5);\n     * \u003c/pre\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 62)",
        "(line 439,col 9)-(line 439,col 60)",
        "(line 440,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 446,col 62)",
        "(line 447,col 9)-(line 447,col 75)",
        "(line 448,col 9)-(line 448,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(long[], int, int)",
      "begin_line": 470,
      "end_line": 488,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003elong\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 476,col 9)",
        "(line 477,col 9)-(line 479,col 9)",
        "(line 480,col 9)-(line 480,col 62)",
        "(line 481,col 9)-(line 483,col 9)",
        "(line 485,col 9)-(line 485,col 44)",
        "(line 486,col 9)-(line 486,col 75)",
        "(line 487,col 9)-(line 487,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(int[], int, int)",
      "begin_line": 509,
      "end_line": 527,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003eint\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 512,col 9)",
        "(line 513,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 518,col 9)",
        "(line 519,col 9)-(line 519,col 62)",
        "(line 520,col 9)-(line 522,col 9)",
        "(line 524,col 9)-(line 524,col 42)",
        "(line 525,col 9)-(line 525,col 75)",
        "(line 526,col 9)-(line 526,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(short[], int, int)",
      "begin_line": 548,
      "end_line": 566,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003eshort\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 549,col 9)-(line 551,col 9)",
        "(line 552,col 9)-(line 554,col 9)",
        "(line 555,col 9)-(line 557,col 9)",
        "(line 558,col 9)-(line 558,col 62)",
        "(line 559,col 9)-(line 561,col 9)",
        "(line 563,col 9)-(line 563,col 46)",
        "(line 564,col 9)-(line 564,col 75)",
        "(line 565,col 9)-(line 565,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(char[], int, int)",
      "begin_line": 587,
      "end_line": 605,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003echar\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 590,col 9)",
        "(line 591,col 9)-(line 593,col 9)",
        "(line 594,col 9)-(line 596,col 9)",
        "(line 597,col 9)-(line 597,col 62)",
        "(line 598,col 9)-(line 600,col 9)",
        "(line 602,col 9)-(line 602,col 44)",
        "(line 603,col 9)-(line 603,col 75)",
        "(line 604,col 9)-(line 604,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(byte[], int, int)",
      "begin_line": 626,
      "end_line": 644,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003ebyte\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 632,col 9)",
        "(line 633,col 9)-(line 635,col 9)",
        "(line 636,col 9)-(line 636,col 62)",
        "(line 637,col 9)-(line 639,col 9)",
        "(line 641,col 9)-(line 641,col 44)",
        "(line 642,col 9)-(line 642,col 75)",
        "(line 643,col 9)-(line 643,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(double[], int, int)",
      "begin_line": 665,
      "end_line": 683,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003edouble\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 666,col 9)-(line 668,col 9)",
        "(line 669,col 9)-(line 671,col 9)",
        "(line 672,col 9)-(line 674,col 9)",
        "(line 675,col 9)-(line 675,col 62)",
        "(line 676,col 9)-(line 678,col 9)",
        "(line 680,col 9)-(line 680,col 48)",
        "(line 681,col 9)-(line 681,col 75)",
        "(line 682,col 9)-(line 682,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(float[], int, int)",
      "begin_line": 704,
      "end_line": 722,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003efloat\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 705,col 9)-(line 707,col 9)",
        "(line 708,col 9)-(line 710,col 9)",
        "(line 711,col 9)-(line 713,col 9)",
        "(line 714,col 9)-(line 714,col 62)",
        "(line 715,col 9)-(line 717,col 9)",
        "(line 719,col 9)-(line 719,col 46)",
        "(line 720,col 9)-(line 720,col 75)",
        "(line 721,col 9)-(line 721,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(boolean[], int, int)",
      "begin_line": 743,
      "end_line": 761,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003eboolean\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 744,col 9)-(line 746,col 9)",
        "(line 747,col 9)-(line 749,col 9)",
        "(line 750,col 9)-(line 752,col 9)",
        "(line 753,col 9)-(line 753,col 62)",
        "(line 754,col 9)-(line 756,col 9)",
        "(line 758,col 9)-(line 758,col 50)",
        "(line 759,col 9)-(line 759,col 75)",
        "(line 760,col 9)-(line 760,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(java.lang.Object[], java.lang.Object[])",
      "begin_line": 776,
      "end_line": 783,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\n     *\n     * \u003cp\u003eAny multi-dimensional aspects of the arrays are ignored.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 781,col 9)",
        "(line 782,col 9)-(line 782,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(long[], long[])",
      "begin_line": 794,
      "end_line": 801,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 795,col 9)-(line 799,col 9)",
        "(line 800,col 9)-(line 800,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(int[], int[])",
      "begin_line": 812,
      "end_line": 819,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 813,col 9)-(line 817,col 9)",
        "(line 818,col 9)-(line 818,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(short[], short[])",
      "begin_line": 830,
      "end_line": 837,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 831,col 9)-(line 835,col 9)",
        "(line 836,col 9)-(line 836,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(char[], char[])",
      "begin_line": 848,
      "end_line": 855,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 849,col 9)-(line 853,col 9)",
        "(line 854,col 9)-(line 854,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(byte[], byte[])",
      "begin_line": 866,
      "end_line": 873,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 867,col 9)-(line 871,col 9)",
        "(line 872,col 9)-(line 872,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(double[], double[])",
      "begin_line": 884,
      "end_line": 891,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 885,col 9)-(line 889,col 9)",
        "(line 890,col 9)-(line 890,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(float[], float[])",
      "begin_line": 902,
      "end_line": 909,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 903,col 9)-(line 907,col 9)",
        "(line 908,col 9)-(line 908,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(boolean[], boolean[])",
      "begin_line": 920,
      "end_line": 927,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 921,col 9)-(line 925,col 9)",
        "(line 926,col 9)-(line 926,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.getLength(java.lang.Object)",
      "begin_line": 950,
      "end_line": 955,
      "comment": "\n     * \u003cp\u003eReturns the length of the specified array.\n     * This method can deal with \u003ccode\u003eObject\u003c/code\u003e arrays and with primitive arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003e0\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.getLength(null)            \u003d 0\n     * ArrayUtils.getLength([])              \u003d 0\n     * ArrayUtils.getLength([null])          \u003d 1\n     * ArrayUtils.getLength([true, false])   \u003d 2\n     * ArrayUtils.getLength([1, 2, 3])       \u003d 3\n     * ArrayUtils.getLength([\"a\", \"b\", \"c\"]) \u003d 3\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to retrieve the length from, may be null\n     * @return The length of the array, or \u003ccode\u003e0\u003c/code\u003e if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the object arguement is not an array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 951,col 9)-(line 953,col 9)",
        "(line 954,col 9)-(line 954,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameType(java.lang.Object, java.lang.Object)",
      "begin_line": 966,
      "end_line": 971,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same type taking into account\n     * multi-dimensional arrays.\u003c/p\u003e\n     *\n     * @param array1 the first array, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if type of arrays matches\n     * @throws IllegalArgumentException if either array is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 967,col 9)-(line 969,col 9)",
        "(line 970,col 9)-(line 970,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(java.lang.Object[])",
      "begin_line": 984,
      "end_line": 998,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThere is no special handling for multi-dimensional arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 985,col 9)-(line 987,col 9)",
        "(line 988,col 9)-(line 988,col 18)",
        "(line 989,col 9)-(line 989,col 33)",
        "(line 990,col 9)-(line 990,col 19)",
        "(line 991,col 9)-(line 997,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(long[])",
      "begin_line": 1007,
      "end_line": 1021,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1008,col 9)-(line 1010,col 9)",
        "(line 1011,col 9)-(line 1011,col 18)",
        "(line 1012,col 9)-(line 1012,col 33)",
        "(line 1013,col 9)-(line 1013,col 17)",
        "(line 1014,col 9)-(line 1020,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(int[])",
      "begin_line": 1030,
      "end_line": 1044,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1031,col 9)-(line 1033,col 9)",
        "(line 1034,col 9)-(line 1034,col 18)",
        "(line 1035,col 9)-(line 1035,col 33)",
        "(line 1036,col 9)-(line 1036,col 16)",
        "(line 1037,col 9)-(line 1043,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(short[])",
      "begin_line": 1053,
      "end_line": 1067,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1054,col 9)-(line 1056,col 9)",
        "(line 1057,col 9)-(line 1057,col 18)",
        "(line 1058,col 9)-(line 1058,col 33)",
        "(line 1059,col 9)-(line 1059,col 18)",
        "(line 1060,col 9)-(line 1066,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(char[])",
      "begin_line": 1076,
      "end_line": 1090,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1077,col 9)-(line 1079,col 9)",
        "(line 1080,col 9)-(line 1080,col 18)",
        "(line 1081,col 9)-(line 1081,col 33)",
        "(line 1082,col 9)-(line 1082,col 17)",
        "(line 1083,col 9)-(line 1089,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(byte[])",
      "begin_line": 1099,
      "end_line": 1113,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1100,col 9)-(line 1102,col 9)",
        "(line 1103,col 9)-(line 1103,col 18)",
        "(line 1104,col 9)-(line 1104,col 33)",
        "(line 1105,col 9)-(line 1105,col 17)",
        "(line 1106,col 9)-(line 1112,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(double[])",
      "begin_line": 1122,
      "end_line": 1136,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1123,col 9)-(line 1125,col 9)",
        "(line 1126,col 9)-(line 1126,col 18)",
        "(line 1127,col 9)-(line 1127,col 33)",
        "(line 1128,col 9)-(line 1128,col 19)",
        "(line 1129,col 9)-(line 1135,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(float[])",
      "begin_line": 1145,
      "end_line": 1159,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1146,col 9)-(line 1148,col 9)",
        "(line 1149,col 9)-(line 1149,col 18)",
        "(line 1150,col 9)-(line 1150,col 33)",
        "(line 1151,col 9)-(line 1151,col 18)",
        "(line 1152,col 9)-(line 1158,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(boolean[])",
      "begin_line": 1168,
      "end_line": 1182,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1169,col 9)-(line 1171,col 9)",
        "(line 1172,col 9)-(line 1172,col 18)",
        "(line 1173,col 9)-(line 1173,col 33)",
        "(line 1174,col 9)-(line 1174,col 20)",
        "(line 1175,col 9)-(line 1181,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(java.lang.Object[], java.lang.Object)",
      "begin_line": 1199,
      "end_line": 1201,
      "comment": "\n     * \u003cp\u003eFinds the index of the given object in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param objectToFind  the object to find, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the index of the object within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1200,col 9)-(line 1200,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(java.lang.Object[], java.lang.Object, int)",
      "begin_line": 1217,
      "end_line": 1238,
      "comment": "\n     * \u003cp\u003eFinds the index of the given object in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param objectToFind  the object to find, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param startIndex  the index to start searching at\n     * @return the index of the object within the array starting at the index,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1218,col 9)-(line 1220,col 9)",
        "(line 1221,col 9)-(line 1223,col 9)",
        "(line 1224,col 9)-(line 1236,col 9)",
        "(line 1237,col 9)-(line 1237,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(java.lang.Object[], java.lang.Object)",
      "begin_line": 1250,
      "end_line": 1252,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given object within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param objectToFind  the object to find, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the last index of the object within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1251,col 9)-(line 1251,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(java.lang.Object[], java.lang.Object, int)",
      "begin_line": 1268,
      "end_line": 1291,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given object in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than\n     * the array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param objectToFind  the object to find, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the object within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1269,col 9)-(line 1271,col 9)",
        "(line 1272,col 9)-(line 1276,col 9)",
        "(line 1277,col 9)-(line 1289,col 9)",
        "(line 1290,col 9)-(line 1290,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(java.lang.Object[], java.lang.Object)",
      "begin_line": 1302,
      "end_line": 1304,
      "comment": "\n     * \u003cp\u003eChecks if the object is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param objectToFind  the object to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 1303,col 9)-(line 1303,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(long[], long)",
      "begin_line": 1318,
      "end_line": 1320,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1319,col 9)-(line 1319,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(long[], long, int)",
      "begin_line": 1336,
      "end_line": 1349,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1337,col 9)-(line 1339,col 9)",
        "(line 1340,col 9)-(line 1342,col 9)",
        "(line 1343,col 9)-(line 1347,col 9)",
        "(line 1348,col 9)-(line 1348,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(long[], long)",
      "begin_line": 1361,
      "end_line": 1363,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1362,col 9)-(line 1362,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(long[], long, int)",
      "begin_line": 1379,
      "end_line": 1394,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1380,col 9)-(line 1382,col 9)",
        "(line 1383,col 9)-(line 1387,col 9)",
        "(line 1388,col 9)-(line 1392,col 9)",
        "(line 1393,col 9)-(line 1393,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(long[], long)",
      "begin_line": 1405,
      "end_line": 1407,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 1406,col 9)-(line 1406,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(int[], int)",
      "begin_line": 1421,
      "end_line": 1423,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1422,col 9)-(line 1422,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(int[], int, int)",
      "begin_line": 1439,
      "end_line": 1452,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1440,col 9)-(line 1442,col 9)",
        "(line 1443,col 9)-(line 1445,col 9)",
        "(line 1446,col 9)-(line 1450,col 9)",
        "(line 1451,col 9)-(line 1451,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(int[], int)",
      "begin_line": 1464,
      "end_line": 1466,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1465,col 9)-(line 1465,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(int[], int, int)",
      "begin_line": 1482,
      "end_line": 1497,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1483,col 9)-(line 1485,col 9)",
        "(line 1486,col 9)-(line 1490,col 9)",
        "(line 1491,col 9)-(line 1495,col 9)",
        "(line 1496,col 9)-(line 1496,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(int[], int)",
      "begin_line": 1508,
      "end_line": 1510,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 1509,col 9)-(line 1509,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(short[], short)",
      "begin_line": 1524,
      "end_line": 1526,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1525,col 9)-(line 1525,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(short[], short, int)",
      "begin_line": 1542,
      "end_line": 1555,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1543,col 9)-(line 1545,col 9)",
        "(line 1546,col 9)-(line 1548,col 9)",
        "(line 1549,col 9)-(line 1553,col 9)",
        "(line 1554,col 9)-(line 1554,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(short[], short)",
      "begin_line": 1567,
      "end_line": 1569,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1568,col 9)-(line 1568,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(short[], short, int)",
      "begin_line": 1585,
      "end_line": 1600,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1586,col 9)-(line 1588,col 9)",
        "(line 1589,col 9)-(line 1593,col 9)",
        "(line 1594,col 9)-(line 1598,col 9)",
        "(line 1599,col 9)-(line 1599,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(short[], short)",
      "begin_line": 1611,
      "end_line": 1613,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 1612,col 9)-(line 1612,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(char[], char)",
      "begin_line": 1628,
      "end_line": 1630,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1629,col 9)-(line 1629,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(char[], char, int)",
      "begin_line": 1647,
      "end_line": 1660,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1648,col 9)-(line 1650,col 9)",
        "(line 1651,col 9)-(line 1653,col 9)",
        "(line 1654,col 9)-(line 1658,col 9)",
        "(line 1659,col 9)-(line 1659,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(char[], char)",
      "begin_line": 1673,
      "end_line": 1675,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1674,col 9)-(line 1674,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(char[], char, int)",
      "begin_line": 1692,
      "end_line": 1707,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1693,col 9)-(line 1695,col 9)",
        "(line 1696,col 9)-(line 1700,col 9)",
        "(line 1701,col 9)-(line 1705,col 9)",
        "(line 1706,col 9)-(line 1706,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(char[], char)",
      "begin_line": 1719,
      "end_line": 1721,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1720,col 9)-(line 1720,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(byte[], byte)",
      "begin_line": 1735,
      "end_line": 1737,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1736,col 9)-(line 1736,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(byte[], byte, int)",
      "begin_line": 1753,
      "end_line": 1766,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1754,col 9)-(line 1756,col 9)",
        "(line 1757,col 9)-(line 1759,col 9)",
        "(line 1760,col 9)-(line 1764,col 9)",
        "(line 1765,col 9)-(line 1765,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(byte[], byte)",
      "begin_line": 1778,
      "end_line": 1780,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1779,col 9)-(line 1779,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(byte[], byte, int)",
      "begin_line": 1796,
      "end_line": 1811,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1797,col 9)-(line 1799,col 9)",
        "(line 1800,col 9)-(line 1804,col 9)",
        "(line 1805,col 9)-(line 1809,col 9)",
        "(line 1810,col 9)-(line 1810,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(byte[], byte)",
      "begin_line": 1822,
      "end_line": 1824,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 1823,col 9)-(line 1823,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(double[], double)",
      "begin_line": 1838,
      "end_line": 1840,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1839,col 9)-(line 1839,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(double[], double, double)",
      "begin_line": 1855,
      "end_line": 1857,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value within a given tolerance in the array.\n     * This method will return the index of the first value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param tolerance tolerance of the search\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1856,col 9)-(line 1856,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(double[], double, int)",
      "begin_line": 1873,
      "end_line": 1886,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1874,col 9)-(line 1876,col 9)",
        "(line 1877,col 9)-(line 1879,col 9)",
        "(line 1880,col 9)-(line 1884,col 9)",
        "(line 1885,col 9)-(line 1885,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(double[], double, int, double)",
      "begin_line": 1905,
      "end_line": 1920,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\n     * This method will return the index of the first value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @param tolerance tolerance of the search\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1906,col 9)-(line 1908,col 9)",
        "(line 1909,col 9)-(line 1911,col 9)",
        "(line 1912,col 9)-(line 1912,col 45)",
        "(line 1913,col 9)-(line 1913,col 45)",
        "(line 1914,col 9)-(line 1918,col 9)",
        "(line 1919,col 9)-(line 1919,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(double[], double)",
      "begin_line": 1932,
      "end_line": 1934,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1933,col 9)-(line 1933,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(double[], double, double)",
      "begin_line": 1949,
      "end_line": 1951,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within a given tolerance in the array.\n     * This method will return the index of the last value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param tolerance tolerance of the search\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1950,col 9)-(line 1950,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(double[], double, int)",
      "begin_line": 1967,
      "end_line": 1982,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1968,col 9)-(line 1970,col 9)",
        "(line 1971,col 9)-(line 1975,col 9)",
        "(line 1976,col 9)-(line 1980,col 9)",
        "(line 1981,col 9)-(line 1981,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(double[], double, int, double)",
      "begin_line": 2001,
      "end_line": 2018,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\n     * This method will return the index of the last value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @param tolerance  search for value within plus/minus this amount\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2002,col 9)-(line 2004,col 9)",
        "(line 2005,col 9)-(line 2009,col 9)",
        "(line 2010,col 9)-(line 2010,col 45)",
        "(line 2011,col 9)-(line 2011,col 45)",
        "(line 2012,col 9)-(line 2016,col 9)",
        "(line 2017,col 9)-(line 2017,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(double[], double)",
      "begin_line": 2029,
      "end_line": 2031,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 2030,col 9)-(line 2030,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(double[], double, double)",
      "begin_line": 2046,
      "end_line": 2048,
      "comment": "\n     * \u003cp\u003eChecks if a value falling within the given tolerance is in the\n     * given array.  If the array contains a value within the inclusive range\n     * defined by (value - tolerance) to (value + tolerance).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array\n     * is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search\n     * @param valueToFind  the value to find\n     * @param tolerance  the array contains the tolerance of the search\n     * @return true if value falling within tolerance is in array\n     ",
      "child_ranges": [
        "(line 2047,col 9)-(line 2047,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(float[], float)",
      "begin_line": 2062,
      "end_line": 2064,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2063,col 9)-(line 2063,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(float[], float, int)",
      "begin_line": 2080,
      "end_line": 2093,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2081,col 9)-(line 2083,col 9)",
        "(line 2084,col 9)-(line 2086,col 9)",
        "(line 2087,col 9)-(line 2091,col 9)",
        "(line 2092,col 9)-(line 2092,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(float[], float)",
      "begin_line": 2105,
      "end_line": 2107,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2106,col 9)-(line 2106,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(float[], float, int)",
      "begin_line": 2123,
      "end_line": 2138,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2124,col 9)-(line 2126,col 9)",
        "(line 2127,col 9)-(line 2131,col 9)",
        "(line 2132,col 9)-(line 2136,col 9)",
        "(line 2137,col 9)-(line 2137,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(float[], float)",
      "begin_line": 2149,
      "end_line": 2151,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 2150,col 9)-(line 2150,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(boolean[], boolean)",
      "begin_line": 2165,
      "end_line": 2167,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2166,col 9)-(line 2166,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(boolean[], boolean, int)",
      "begin_line": 2184,
      "end_line": 2197,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e\n     *  array input\n     ",
      "child_ranges": [
        "(line 2185,col 9)-(line 2187,col 9)",
        "(line 2188,col 9)-(line 2190,col 9)",
        "(line 2191,col 9)-(line 2195,col 9)",
        "(line 2196,col 9)-(line 2196,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(boolean[], boolean)",
      "begin_line": 2210,
      "end_line": 2212,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if\n     * \u003ccode\u003enull\u003c/code\u003e array input.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2211,col 9)-(line 2211,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(boolean[], boolean, int)",
      "begin_line": 2228,
      "end_line": 2243,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than\n     * the array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2229,col 9)-(line 2231,col 9)",
        "(line 2232,col 9)-(line 2236,col 9)",
        "(line 2237,col 9)-(line 2241,col 9)",
        "(line 2242,col 9)-(line 2242,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(boolean[], boolean)",
      "begin_line": 2254,
      "end_line": 2256,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 2255,col 9)-(line 2255,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Character[])",
      "begin_line": 2272,
      "end_line": 2283,
      "comment": "\n     * \u003cp\u003eConverts an array of object Characters to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eCharacter\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003echar\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2273,col 9)-(line 2277,col 9)",
        "(line 2278,col 9)-(line 2278,col 53)",
        "(line 2279,col 9)-(line 2281,col 9)",
        "(line 2282,col 9)-(line 2282,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Character[], char)",
      "begin_line": 2294,
      "end_line": 2306,
      "comment": "\n     * \u003cp\u003eConverts an array of object Character to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eCharacter\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003echar\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2295,col 9)-(line 2299,col 9)",
        "(line 2300,col 9)-(line 2300,col 53)",
        "(line 2301,col 9)-(line 2304,col 9)",
        "(line 2305,col 9)-(line 2305,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(char[])",
      "begin_line": 2316,
      "end_line": 2327,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive chars to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array a \u003ccode\u003echar\u003c/code\u003e array\n     * @return a \u003ccode\u003eCharacter\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2317,col 9)-(line 2321,col 9)",
        "(line 2322,col 9)-(line 2322,col 63)",
        "(line 2323,col 9)-(line 2325,col 9)",
        "(line 2326,col 9)-(line 2326,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Long[])",
      "begin_line": 2340,
      "end_line": 2351,
      "comment": "\n     * \u003cp\u003eConverts an array of object Longs to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eLong\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003elong\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2341,col 9)-(line 2345,col 9)",
        "(line 2346,col 9)-(line 2346,col 53)",
        "(line 2347,col 9)-(line 2349,col 9)",
        "(line 2350,col 9)-(line 2350,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Long[], long)",
      "begin_line": 2362,
      "end_line": 2374,
      "comment": "\n     * \u003cp\u003eConverts an array of object Long to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eLong\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003elong\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2363,col 9)-(line 2367,col 9)",
        "(line 2368,col 9)-(line 2368,col 53)",
        "(line 2369,col 9)-(line 2372,col 9)",
        "(line 2373,col 9)-(line 2373,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(long[])",
      "begin_line": 2384,
      "end_line": 2395,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive longs to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003elong\u003c/code\u003e array\n     * @return a \u003ccode\u003eLong\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2385,col 9)-(line 2389,col 9)",
        "(line 2390,col 9)-(line 2390,col 53)",
        "(line 2391,col 9)-(line 2393,col 9)",
        "(line 2394,col 9)-(line 2394,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Integer[])",
      "begin_line": 2408,
      "end_line": 2419,
      "comment": "\n     * \u003cp\u003eConverts an array of object Integers to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eInteger\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return an \u003ccode\u003eint\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2409,col 9)-(line 2413,col 9)",
        "(line 2414,col 9)-(line 2414,col 51)",
        "(line 2415,col 9)-(line 2417,col 9)",
        "(line 2418,col 9)-(line 2418,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Integer[], int)",
      "begin_line": 2430,
      "end_line": 2442,
      "comment": "\n     * \u003cp\u003eConverts an array of object Integer to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eInteger\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return an \u003ccode\u003eint\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2431,col 9)-(line 2435,col 9)",
        "(line 2436,col 9)-(line 2436,col 51)",
        "(line 2437,col 9)-(line 2440,col 9)",
        "(line 2441,col 9)-(line 2441,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(int[])",
      "begin_line": 2452,
      "end_line": 2463,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive ints to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  an \u003ccode\u003eint\u003c/code\u003e array\n     * @return an \u003ccode\u003eInteger\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2453,col 9)-(line 2457,col 9)",
        "(line 2458,col 9)-(line 2458,col 59)",
        "(line 2459,col 9)-(line 2461,col 9)",
        "(line 2462,col 9)-(line 2462,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Short[])",
      "begin_line": 2476,
      "end_line": 2487,
      "comment": "\n     * \u003cp\u003eConverts an array of object Shorts to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eShort\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003ebyte\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2477,col 9)-(line 2481,col 9)",
        "(line 2482,col 9)-(line 2482,col 55)",
        "(line 2483,col 9)-(line 2485,col 9)",
        "(line 2486,col 9)-(line 2486,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Short[], short)",
      "begin_line": 2498,
      "end_line": 2510,
      "comment": "\n     * \u003cp\u003eConverts an array of object Short to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eShort\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003ebyte\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2499,col 9)-(line 2503,col 9)",
        "(line 2504,col 9)-(line 2504,col 55)",
        "(line 2505,col 9)-(line 2508,col 9)",
        "(line 2509,col 9)-(line 2509,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(short[])",
      "begin_line": 2520,
      "end_line": 2531,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive shorts to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eshort\u003c/code\u003e array\n     * @return a \u003ccode\u003eShort\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2521,col 9)-(line 2525,col 9)",
        "(line 2526,col 9)-(line 2526,col 55)",
        "(line 2527,col 9)-(line 2529,col 9)",
        "(line 2530,col 9)-(line 2530,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Byte[])",
      "begin_line": 2544,
      "end_line": 2555,
      "comment": "\n     * \u003cp\u003eConverts an array of object Bytes to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eByte\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003ebyte\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2545,col 9)-(line 2549,col 9)",
        "(line 2550,col 9)-(line 2550,col 53)",
        "(line 2551,col 9)-(line 2553,col 9)",
        "(line 2554,col 9)-(line 2554,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Byte[], byte)",
      "begin_line": 2566,
      "end_line": 2578,
      "comment": "\n     * \u003cp\u003eConverts an array of object Bytes to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eByte\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003ebyte\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2567,col 9)-(line 2571,col 9)",
        "(line 2572,col 9)-(line 2572,col 53)",
        "(line 2573,col 9)-(line 2576,col 9)",
        "(line 2577,col 9)-(line 2577,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(byte[])",
      "begin_line": 2588,
      "end_line": 2599,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive bytes to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003ebyte\u003c/code\u003e array\n     * @return a \u003ccode\u003eByte\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2589,col 9)-(line 2593,col 9)",
        "(line 2594,col 9)-(line 2594,col 53)",
        "(line 2595,col 9)-(line 2597,col 9)",
        "(line 2598,col 9)-(line 2598,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Double[])",
      "begin_line": 2612,
      "end_line": 2623,
      "comment": "\n     * \u003cp\u003eConverts an array of object Doubles to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eDouble\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003edouble\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2613,col 9)-(line 2617,col 9)",
        "(line 2618,col 9)-(line 2618,col 57)",
        "(line 2619,col 9)-(line 2621,col 9)",
        "(line 2622,col 9)-(line 2622,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Double[], double)",
      "begin_line": 2634,
      "end_line": 2646,
      "comment": "\n     * \u003cp\u003eConverts an array of object Doubles to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eDouble\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003edouble\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2635,col 9)-(line 2639,col 9)",
        "(line 2640,col 9)-(line 2640,col 57)",
        "(line 2641,col 9)-(line 2644,col 9)",
        "(line 2645,col 9)-(line 2645,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(double[])",
      "begin_line": 2656,
      "end_line": 2667,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive doubles to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003edouble\u003c/code\u003e array\n     * @return a \u003ccode\u003eDouble\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2657,col 9)-(line 2661,col 9)",
        "(line 2662,col 9)-(line 2662,col 57)",
        "(line 2663,col 9)-(line 2665,col 9)",
        "(line 2666,col 9)-(line 2666,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Float[])",
      "begin_line": 2680,
      "end_line": 2691,
      "comment": "\n     * \u003cp\u003eConverts an array of object Floats to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eFloat\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003efloat\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2681,col 9)-(line 2685,col 9)",
        "(line 2686,col 9)-(line 2686,col 55)",
        "(line 2687,col 9)-(line 2689,col 9)",
        "(line 2690,col 9)-(line 2690,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Float[], float)",
      "begin_line": 2702,
      "end_line": 2714,
      "comment": "\n     * \u003cp\u003eConverts an array of object Floats to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eFloat\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003efloat\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2703,col 9)-(line 2707,col 9)",
        "(line 2708,col 9)-(line 2708,col 55)",
        "(line 2709,col 9)-(line 2712,col 9)",
        "(line 2713,col 9)-(line 2713,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(float[])",
      "begin_line": 2724,
      "end_line": 2735,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive floats to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003efloat\u003c/code\u003e array\n     * @return a \u003ccode\u003eFloat\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2725,col 9)-(line 2729,col 9)",
        "(line 2730,col 9)-(line 2730,col 55)",
        "(line 2731,col 9)-(line 2733,col 9)",
        "(line 2734,col 9)-(line 2734,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Boolean[])",
      "begin_line": 2748,
      "end_line": 2759,
      "comment": "\n     * \u003cp\u003eConverts an array of object Booleans to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eBoolean\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eboolean\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2749,col 9)-(line 2753,col 9)",
        "(line 2754,col 9)-(line 2754,col 59)",
        "(line 2755,col 9)-(line 2757,col 9)",
        "(line 2758,col 9)-(line 2758,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Boolean[], boolean)",
      "begin_line": 2770,
      "end_line": 2782,
      "comment": "\n     * \u003cp\u003eConverts an array of object Booleans to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eBoolean\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003eboolean\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2771,col 9)-(line 2775,col 9)",
        "(line 2776,col 9)-(line 2776,col 59)",
        "(line 2777,col 9)-(line 2780,col 9)",
        "(line 2781,col 9)-(line 2781,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(boolean[])",
      "begin_line": 2792,
      "end_line": 2803,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive booleans to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eboolean\u003c/code\u003e array\n     * @return a \u003ccode\u003eBoolean\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2793,col 9)-(line 2797,col 9)",
        "(line 2798,col 9)-(line 2798,col 59)",
        "(line 2799,col 9)-(line 2801,col 9)",
        "(line 2802,col 9)-(line 2802,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(T[])",
      "begin_line": 2813,
      "end_line": 2818,
      "comment": "\n     * \u003cp\u003eChecks if an array of Objects is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2814,col 9)-(line 2816,col 9)",
        "(line 2817,col 9)-(line 2817,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(long[])",
      "begin_line": 2827,
      "end_line": 2832,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive longs is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2828,col 9)-(line 2830,col 9)",
        "(line 2831,col 9)-(line 2831,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(int[])",
      "begin_line": 2841,
      "end_line": 2846,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive ints is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2842,col 9)-(line 2844,col 9)",
        "(line 2845,col 9)-(line 2845,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(short[])",
      "begin_line": 2855,
      "end_line": 2860,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive shorts is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2856,col 9)-(line 2858,col 9)",
        "(line 2859,col 9)-(line 2859,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(char[])",
      "begin_line": 2869,
      "end_line": 2874,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive chars is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2870,col 9)-(line 2872,col 9)",
        "(line 2873,col 9)-(line 2873,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(byte[])",
      "begin_line": 2883,
      "end_line": 2888,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive bytes is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2884,col 9)-(line 2886,col 9)",
        "(line 2887,col 9)-(line 2887,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(double[])",
      "begin_line": 2897,
      "end_line": 2902,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive doubles is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2898,col 9)-(line 2900,col 9)",
        "(line 2901,col 9)-(line 2901,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(float[])",
      "begin_line": 2911,
      "end_line": 2916,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive floats is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2912,col 9)-(line 2914,col 9)",
        "(line 2915,col 9)-(line 2915,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(boolean[])",
      "begin_line": 2925,
      "end_line": 2930,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive booleans is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2926,col 9)-(line 2928,col 9)",
        "(line 2929,col 9)-(line 2929,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(T[], T...)",
      "begin_line": 2955,
      "end_line": 2981,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(null, null)     \u003d null\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * ArrayUtils.addAll([null], [null]) \u003d [null, null]\n     * ArrayUtils.addAll([\"a\", \"b\", \"c\"], [\"1\", \"2\", \"3\"]) \u003d [\"a\", \"b\", \"c\", \"1\", \"2\", \"3\"]\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2  the second array whose elements are added to the new array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return The new array, \u003ccode\u003enull\u003c/code\u003e if both arrays are \u003ccode\u003enull\u003c/code\u003e.\n     *      The type of the new array is the type of the first array,\n     *      unless the first array is null, in which case the type is the same as the second array.\n     * @since 2.1\n     * @throws IllegalArgumentException if the array types are incompatible\n     ",
      "child_ranges": [
        "(line 2956,col 9)-(line 2960,col 9)",
        "(line 2961,col 9)-(line 2961,col 68)",
        "(line 2962,col 9)-(line 2963,col 88)",
        "(line 2964,col 9)-(line 2964,col 67)",
        "(line 2965,col 9)-(line 2979,col 9)",
        "(line 2980,col 9)-(line 2980,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(boolean[], boolean...)",
      "begin_line": 3000,
      "end_line": 3010,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new boolean[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3001,col 9)-(line 3005,col 9)",
        "(line 3006,col 9)-(line 3006,col 75)",
        "(line 3007,col 9)-(line 3007,col 67)",
        "(line 3008,col 9)-(line 3008,col 79)",
        "(line 3009,col 9)-(line 3009,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(char[], char...)",
      "begin_line": 3029,
      "end_line": 3039,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new char[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3030,col 9)-(line 3034,col 9)",
        "(line 3035,col 9)-(line 3035,col 69)",
        "(line 3036,col 9)-(line 3036,col 67)",
        "(line 3037,col 9)-(line 3037,col 79)",
        "(line 3038,col 9)-(line 3038,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(byte[], byte...)",
      "begin_line": 3058,
      "end_line": 3068,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new byte[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3059,col 9)-(line 3063,col 9)",
        "(line 3064,col 9)-(line 3064,col 69)",
        "(line 3065,col 9)-(line 3065,col 67)",
        "(line 3066,col 9)-(line 3066,col 79)",
        "(line 3067,col 9)-(line 3067,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(short[], short...)",
      "begin_line": 3087,
      "end_line": 3097,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new short[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3088,col 9)-(line 3092,col 9)",
        "(line 3093,col 9)-(line 3093,col 71)",
        "(line 3094,col 9)-(line 3094,col 67)",
        "(line 3095,col 9)-(line 3095,col 79)",
        "(line 3096,col 9)-(line 3096,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(int[], int...)",
      "begin_line": 3116,
      "end_line": 3126,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new int[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3117,col 9)-(line 3121,col 9)",
        "(line 3122,col 9)-(line 3122,col 67)",
        "(line 3123,col 9)-(line 3123,col 67)",
        "(line 3124,col 9)-(line 3124,col 79)",
        "(line 3125,col 9)-(line 3125,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(long[], long...)",
      "begin_line": 3145,
      "end_line": 3155,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new long[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3146,col 9)-(line 3150,col 9)",
        "(line 3151,col 9)-(line 3151,col 69)",
        "(line 3152,col 9)-(line 3152,col 67)",
        "(line 3153,col 9)-(line 3153,col 79)",
        "(line 3154,col 9)-(line 3154,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(float[], float...)",
      "begin_line": 3174,
      "end_line": 3184,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new float[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3175,col 9)-(line 3179,col 9)",
        "(line 3180,col 9)-(line 3180,col 71)",
        "(line 3181,col 9)-(line 3181,col 67)",
        "(line 3182,col 9)-(line 3182,col 79)",
        "(line 3183,col 9)-(line 3183,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(double[], double...)",
      "begin_line": 3203,
      "end_line": 3213,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new double[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3204,col 9)-(line 3208,col 9)",
        "(line 3209,col 9)-(line 3209,col 73)",
        "(line 3210,col 9)-(line 3210,col 67)",
        "(line 3211,col 9)-(line 3211,col 79)",
        "(line 3212,col 9)-(line 3212,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(T[], T)",
      "begin_line": 3242,
      "end_line": 3248,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element, unless the element itself is null,\n     *  in which case the return type is Object[]\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, null)      \u003d [null]\n     * ArrayUtils.add(null, \"a\")       \u003d [\"a\"]\n     * ArrayUtils.add([\"a\"], null)     \u003d [\"a\", null]\n     * ArrayUtils.add([\"a\"], \"b\")      \u003d [\"a\", \"b\"]\n     * ArrayUtils.add([\"a\", \"b\"], \"c\") \u003d [\"a\", \"b\", \"c\"]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to \"add\" the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return A new array containing the existing elements plus the new element\n     * The returned array type will be that of the input array (unless null),\n     * in which case it will have the same type as the element (unless that is also null)\n     * in which case the returned type will be Object[].\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3243,col 9)-(line 3243,col 113)",
        "(line 3245,col 9)-(line 3245,col 57)",
        "(line 3246,col 9)-(line 3246,col 48)",
        "(line 3247,col 9)-(line 3247,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(boolean[], boolean)",
      "begin_line": 3271,
      "end_line": 3275,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, true)          \u003d [true]\n     * ArrayUtils.add([true], false)       \u003d [true, false]\n     * ArrayUtils.add([true, false], true) \u003d [true, false, true]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3272,col 9)-(line 3272,col 76)",
        "(line 3273,col 9)-(line 3273,col 48)",
        "(line 3274,col 9)-(line 3274,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(byte[], byte)",
      "begin_line": 3298,
      "end_line": 3302,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3299,col 9)-(line 3299,col 67)",
        "(line 3300,col 9)-(line 3300,col 48)",
        "(line 3301,col 9)-(line 3301,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(char[], char)",
      "begin_line": 3325,
      "end_line": 3329,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, \u00270\u0027)       \u003d [\u00270\u0027]\n     * ArrayUtils.add([\u00271\u0027], \u00270\u0027)      \u003d [\u00271\u0027, \u00270\u0027]\n     * ArrayUtils.add([\u00271\u0027, \u00270\u0027], \u00271\u0027) \u003d [\u00271\u0027, \u00270\u0027, \u00271\u0027]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3326,col 9)-(line 3326,col 72)",
        "(line 3327,col 9)-(line 3327,col 48)",
        "(line 3328,col 9)-(line 3328,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(double[], double)",
      "begin_line": 3352,
      "end_line": 3356,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3353,col 9)-(line 3353,col 73)",
        "(line 3354,col 9)-(line 3354,col 48)",
        "(line 3355,col 9)-(line 3355,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(float[], float)",
      "begin_line": 3379,
      "end_line": 3383,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3380,col 9)-(line 3380,col 70)",
        "(line 3381,col 9)-(line 3381,col 48)",
        "(line 3382,col 9)-(line 3382,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(int[], int)",
      "begin_line": 3406,
      "end_line": 3410,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3407,col 9)-(line 3407,col 68)",
        "(line 3408,col 9)-(line 3408,col 48)",
        "(line 3409,col 9)-(line 3409,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(long[], long)",
      "begin_line": 3433,
      "end_line": 3437,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3434,col 9)-(line 3434,col 67)",
        "(line 3435,col 9)-(line 3435,col 48)",
        "(line 3436,col 9)-(line 3436,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(short[], short)",
      "begin_line": 3460,
      "end_line": 3464,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3461,col 9)-(line 3461,col 70)",
        "(line 3462,col 9)-(line 3462,col 48)",
        "(line 3463,col 9)-(line 3463,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.copyArrayGrow1(java.lang.Object, java.lang.Class\u003c?\u003e)",
      "begin_line": 3475,
      "end_line": 3483,
      "comment": "\n     * Returns a copy of the given array of size 1 greater than the argument.\n     * The last value of the array is left to the default value.\n     *\n     * @param array The array to copy, must not be \u003ccode\u003enull\u003c/code\u003e.\n     * @param newArrayComponentType If \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, create a\n     * size 1 array of this type.\n     * @return A new copy of the array of size 1 greater than the input.\n     ",
      "child_ranges": [
        "(line 3476,col 9)-(line 3481,col 9)",
        "(line 3482,col 9)-(line 3482,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(T[], int, T)",
      "begin_line": 3513,
      "end_line": 3527,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0, null)      \u003d [null]\n     * ArrayUtils.add(null, 0, \"a\")       \u003d [\"a\"]\n     * ArrayUtils.add([\"a\"], 1, null)     \u003d [\"a\", null]\n     * ArrayUtils.add([\"a\"], 1, \"b\")      \u003d [\"a\", \"b\"]\n     * ArrayUtils.add([\"a\", \"b\"], 3, \"c\") \u003d [\"a\", \"b\", \"c\"]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3514,col 9)-(line 3514,col 29)",
        "(line 3515,col 9)-(line 3523,col 9)",
        "(line 3524,col 9)-(line 3525,col 68)",
        "(line 3526,col 9)-(line 3526,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(boolean[], int, boolean)",
      "begin_line": 3556,
      "end_line": 3558,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0, true)          \u003d [true]\n     * ArrayUtils.add([true], 0, false)       \u003d [false, true]\n     * ArrayUtils.add([false], 1, true)       \u003d [false, true]\n     * ArrayUtils.add([true, false], 1, true) \u003d [true, true, false]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3557,col 9)-(line 3557,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(char[], int, char)",
      "begin_line": 3588,
      "end_line": 3590,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0, \u0027a\u0027)            \u003d [\u0027a\u0027]\n     * ArrayUtils.add([\u0027a\u0027], 0, \u0027b\u0027)           \u003d [\u0027b\u0027, \u0027a\u0027]\n     * ArrayUtils.add([\u0027a\u0027, \u0027b\u0027], 0, \u0027c\u0027)      \u003d [\u0027c\u0027, \u0027a\u0027, \u0027b\u0027]\n     * ArrayUtils.add([\u0027a\u0027, \u0027b\u0027], 1, \u0027k\u0027)      \u003d [\u0027a\u0027, \u0027k\u0027, \u0027b\u0027]\n     * ArrayUtils.add([\u0027a\u0027, \u0027b\u0027, \u0027c\u0027], 1, \u0027t\u0027) \u003d [\u0027a\u0027, \u0027t\u0027, \u0027b\u0027, \u0027c\u0027]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3589,col 9)-(line 3589,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(byte[], int, byte)",
      "begin_line": 3619,
      "end_line": 3621,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1], 0, 2)         \u003d [2, 1]\n     * ArrayUtils.add([2, 6], 2, 3)      \u003d [2, 6, 3]\n     * ArrayUtils.add([2, 6], 0, 1)      \u003d [1, 2, 6]\n     * ArrayUtils.add([2, 6, 3], 2, 1)   \u003d [2, 6, 1, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3620,col 9)-(line 3620,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(short[], int, short)",
      "begin_line": 3650,
      "end_line": 3652,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1], 0, 2)         \u003d [2, 1]\n     * ArrayUtils.add([2, 6], 2, 10)     \u003d [2, 6, 10]\n     * ArrayUtils.add([2, 6], 0, -4)     \u003d [-4, 2, 6]\n     * ArrayUtils.add([2, 6, 3], 2, 1)   \u003d [2, 6, 1, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3651,col 9)-(line 3651,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(int[], int, int)",
      "begin_line": 3681,
      "end_line": 3683,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1], 0, 2)         \u003d [2, 1]\n     * ArrayUtils.add([2, 6], 2, 10)     \u003d [2, 6, 10]\n     * ArrayUtils.add([2, 6], 0, -4)     \u003d [-4, 2, 6]\n     * ArrayUtils.add([2, 6, 3], 2, 1)   \u003d [2, 6, 1, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3682,col 9)-(line 3682,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(long[], int, long)",
      "begin_line": 3712,
      "end_line": 3714,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1L], 0, 2L)           \u003d [2L, 1L]\n     * ArrayUtils.add([2L, 6L], 2, 10L)      \u003d [2L, 6L, 10L]\n     * ArrayUtils.add([2L, 6L], 0, -4L)      \u003d [-4L, 2L, 6L]\n     * ArrayUtils.add([2L, 6L, 3L], 2, 1L)   \u003d [2L, 6L, 1L, 3L]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3713,col 9)-(line 3713,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(float[], int, float)",
      "begin_line": 3743,
      "end_line": 3745,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1.1f], 0, 2.2f)               \u003d [2.2f, 1.1f]\n     * ArrayUtils.add([2.3f, 6.4f], 2, 10.5f)        \u003d [2.3f, 6.4f, 10.5f]\n     * ArrayUtils.add([2.6f, 6.7f], 0, -4.8f)        \u003d [-4.8f, 2.6f, 6.7f]\n     * ArrayUtils.add([2.9f, 6.0f, 0.3f], 2, 1.0f)   \u003d [2.9f, 6.0f, 1.0f, 0.3f]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3744,col 9)-(line 3744,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(double[], int, double)",
      "begin_line": 3774,
      "end_line": 3776,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1.1], 0, 2.2)              \u003d [2.2, 1.1]\n     * ArrayUtils.add([2.3, 6.4], 2, 10.5)        \u003d [2.3, 6.4, 10.5]\n     * ArrayUtils.add([2.6, 6.7], 0, -4.8)        \u003d [-4.8, 2.6, 6.7]\n     * ArrayUtils.add([2.9, 6.0, 0.3], 2, 1.0)    \u003d [2.9, 6.0, 1.0, 0.3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3775,col 9)-(line 3775,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(java.lang.Object, int, java.lang.Object, java.lang.Class\u003c?\u003e)",
      "begin_line": 3789,
      "end_line": 3809,
      "comment": "\n     * Underlying implementation of add(array, index, element) methods.\n     * The last parameter is the class, which may not equal element.getClass\n     * for primitives.\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @param clss the type of the element being added\n     * @return A new array containing the existing elements and the new element\n     ",
      "child_ranges": [
        "(line 3790,col 9)-(line 3797,col 9)",
        "(line 3798,col 9)-(line 3798,col 44)",
        "(line 3799,col 9)-(line 3801,col 9)",
        "(line 3802,col 9)-(line 3802,col 60)",
        "(line 3803,col 9)-(line 3803,col 53)",
        "(line 3804,col 9)-(line 3804,col 42)",
        "(line 3805,col 9)-(line 3807,col 9)",
        "(line 3808,col 9)-(line 3808,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(T[], int)",
      "begin_line": 3839,
      "end_line": 3842,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([\"a\"], 0)           \u003d []\n     * ArrayUtils.remove([\"a\", \"b\"], 0)      \u003d [\"b\"]\n     * ArrayUtils.remove([\"a\", \"b\"], 1)      \u003d [\"a\"]\n     * ArrayUtils.remove([\"a\", \"b\", \"c\"], 1) \u003d [\"a\", \"c\"]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3841,col 9)-(line 3841,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(T[], java.lang.Object)",
      "begin_line": 3869,
      "end_line": 3875,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, \"a\")            \u003d null\n     * ArrayUtils.removeElement([], \"a\")              \u003d []\n     * ArrayUtils.removeElement([\"a\"], \"b\")           \u003d [\"a\"]\n     * ArrayUtils.removeElement([\"a\", \"b\"], \"a\")      \u003d [\"b\"]\n     * ArrayUtils.removeElement([\"a\", \"b\", \"a\"], \"a\") \u003d [\"b\", \"a\"]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3870,col 9)-(line 3870,col 44)",
        "(line 3871,col 9)-(line 3873,col 9)",
        "(line 3874,col 9)-(line 3874,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(boolean[], int)",
      "begin_line": 3905,
      "end_line": 3907,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([true], 0)              \u003d []\n     * ArrayUtils.remove([true, false], 0)       \u003d [false]\n     * ArrayUtils.remove([true, false], 1)       \u003d [true]\n     * ArrayUtils.remove([true, true, false], 1) \u003d [true, false]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3906,col 9)-(line 3906,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(boolean[], boolean)",
      "begin_line": 3934,
      "end_line": 3940,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, true)                \u003d null\n     * ArrayUtils.removeElement([], true)                  \u003d []\n     * ArrayUtils.removeElement([true], false)             \u003d [true]\n     * ArrayUtils.removeElement([true, false], false)      \u003d [true]\n     * ArrayUtils.removeElement([true, false, true], true) \u003d [false, true]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3935,col 9)-(line 3935,col 44)",
        "(line 3936,col 9)-(line 3938,col 9)",
        "(line 3939,col 9)-(line 3939,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(byte[], int)",
      "begin_line": 3970,
      "end_line": 3972,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)          \u003d []\n     * ArrayUtils.remove([1, 0], 0)       \u003d [0]\n     * ArrayUtils.remove([1, 0], 1)       \u003d [1]\n     * ArrayUtils.remove([1, 0, 1], 1)    \u003d [1, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3971,col 9)-(line 3971,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(byte[], byte)",
      "begin_line": 3999,
      "end_line": 4005,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)        \u003d null\n     * ArrayUtils.removeElement([], 1)          \u003d []\n     * ArrayUtils.removeElement([1], 0)         \u003d [1]\n     * ArrayUtils.removeElement([1, 0], 0)      \u003d [1]\n     * ArrayUtils.removeElement([1, 0, 1], 1)   \u003d [0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4000,col 9)-(line 4000,col 44)",
        "(line 4001,col 9)-(line 4003,col 9)",
        "(line 4004,col 9)-(line 4004,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(char[], int)",
      "begin_line": 4035,
      "end_line": 4037,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([\u0027a\u0027], 0)           \u003d []\n     * ArrayUtils.remove([\u0027a\u0027, \u0027b\u0027], 0)      \u003d [\u0027b\u0027]\n     * ArrayUtils.remove([\u0027a\u0027, \u0027b\u0027], 1)      \u003d [\u0027a\u0027]\n     * ArrayUtils.remove([\u0027a\u0027, \u0027b\u0027, \u0027c\u0027], 1) \u003d [\u0027a\u0027, \u0027c\u0027]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4036,col 9)-(line 4036,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(char[], char)",
      "begin_line": 4064,
      "end_line": 4070,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, \u0027a\u0027)            \u003d null\n     * ArrayUtils.removeElement([], \u0027a\u0027)              \u003d []\n     * ArrayUtils.removeElement([\u0027a\u0027], \u0027b\u0027)           \u003d [\u0027a\u0027]\n     * ArrayUtils.removeElement([\u0027a\u0027, \u0027b\u0027], \u0027a\u0027)      \u003d [\u0027b\u0027]\n     * ArrayUtils.removeElement([\u0027a\u0027, \u0027b\u0027, \u0027a\u0027], \u0027a\u0027) \u003d [\u0027b\u0027, \u0027a\u0027]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4065,col 9)-(line 4065,col 44)",
        "(line 4066,col 9)-(line 4068,col 9)",
        "(line 4069,col 9)-(line 4069,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(double[], int)",
      "begin_line": 4100,
      "end_line": 4102,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1.1], 0)           \u003d []\n     * ArrayUtils.remove([2.5, 6.0], 0)      \u003d [6.0]\n     * ArrayUtils.remove([2.5, 6.0], 1)      \u003d [2.5]\n     * ArrayUtils.remove([2.5, 6.0, 3.8], 1) \u003d [2.5, 3.8]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4101,col 9)-(line 4101,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(double[], double)",
      "begin_line": 4129,
      "end_line": 4135,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1.1)            \u003d null\n     * ArrayUtils.removeElement([], 1.1)              \u003d []\n     * ArrayUtils.removeElement([1.1], 1.2)           \u003d [1.1]\n     * ArrayUtils.removeElement([1.1, 2.3], 1.1)      \u003d [2.3]\n     * ArrayUtils.removeElement([1.1, 2.3, 1.1], 1.1) \u003d [2.3, 1.1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4130,col 9)-(line 4130,col 44)",
        "(line 4131,col 9)-(line 4133,col 9)",
        "(line 4134,col 9)-(line 4134,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(float[], int)",
      "begin_line": 4165,
      "end_line": 4167,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1.1], 0)           \u003d []\n     * ArrayUtils.remove([2.5, 6.0], 0)      \u003d [6.0]\n     * ArrayUtils.remove([2.5, 6.0], 1)      \u003d [2.5]\n     * ArrayUtils.remove([2.5, 6.0, 3.8], 1) \u003d [2.5, 3.8]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4166,col 9)-(line 4166,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(float[], float)",
      "begin_line": 4194,
      "end_line": 4200,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1.1)            \u003d null\n     * ArrayUtils.removeElement([], 1.1)              \u003d []\n     * ArrayUtils.removeElement([1.1], 1.2)           \u003d [1.1]\n     * ArrayUtils.removeElement([1.1, 2.3], 1.1)      \u003d [2.3]\n     * ArrayUtils.removeElement([1.1, 2.3, 1.1], 1.1) \u003d [2.3, 1.1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4195,col 9)-(line 4195,col 44)",
        "(line 4196,col 9)-(line 4198,col 9)",
        "(line 4199,col 9)-(line 4199,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(int[], int)",
      "begin_line": 4230,
      "end_line": 4232,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)         \u003d []\n     * ArrayUtils.remove([2, 6], 0)      \u003d [6]\n     * ArrayUtils.remove([2, 6], 1)      \u003d [2]\n     * ArrayUtils.remove([2, 6, 3], 1)   \u003d [2, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4231,col 9)-(line 4231,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(int[], int)",
      "begin_line": 4259,
      "end_line": 4265,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)      \u003d null\n     * ArrayUtils.removeElement([], 1)        \u003d []\n     * ArrayUtils.removeElement([1], 2)       \u003d [1]\n     * ArrayUtils.removeElement([1, 3], 1)    \u003d [3]\n     * ArrayUtils.removeElement([1, 3, 1], 1) \u003d [3, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4260,col 9)-(line 4260,col 44)",
        "(line 4261,col 9)-(line 4263,col 9)",
        "(line 4264,col 9)-(line 4264,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(long[], int)",
      "begin_line": 4295,
      "end_line": 4297,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)         \u003d []\n     * ArrayUtils.remove([2, 6], 0)      \u003d [6]\n     * ArrayUtils.remove([2, 6], 1)      \u003d [2]\n     * ArrayUtils.remove([2, 6, 3], 1)   \u003d [2, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4296,col 9)-(line 4296,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(long[], long)",
      "begin_line": 4324,
      "end_line": 4330,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)      \u003d null\n     * ArrayUtils.removeElement([], 1)        \u003d []\n     * ArrayUtils.removeElement([1], 2)       \u003d [1]\n     * ArrayUtils.removeElement([1, 3], 1)    \u003d [3]\n     * ArrayUtils.removeElement([1, 3, 1], 1) \u003d [3, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4325,col 9)-(line 4325,col 44)",
        "(line 4326,col 9)-(line 4328,col 9)",
        "(line 4329,col 9)-(line 4329,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(short[], int)",
      "begin_line": 4360,
      "end_line": 4362,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)         \u003d []\n     * ArrayUtils.remove([2, 6], 0)      \u003d [6]\n     * ArrayUtils.remove([2, 6], 1)      \u003d [2]\n     * ArrayUtils.remove([2, 6, 3], 1)   \u003d [2, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4361,col 9)-(line 4361,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(short[], short)",
      "begin_line": 4389,
      "end_line": 4395,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)      \u003d null\n     * ArrayUtils.removeElement([], 1)        \u003d []\n     * ArrayUtils.removeElement([1], 2)       \u003d [1]\n     * ArrayUtils.removeElement([1, 3], 1)    \u003d [3]\n     * ArrayUtils.removeElement([1, 3, 1], 1) \u003d [3, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4390,col 9)-(line 4390,col 44)",
        "(line 4391,col 9)-(line 4393,col 9)",
        "(line 4394,col 9)-(line 4394,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(java.lang.Object, int)",
      "begin_line": 4418,
      "end_line": 4431,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4419,col 9)-(line 4419,col 38)",
        "(line 4420,col 9)-(line 4422,col 9)",
        "(line 4424,col 9)-(line 4424,col 91)",
        "(line 4425,col 9)-(line 4425,col 53)",
        "(line 4426,col 9)-(line 4428,col 9)",
        "(line 4430,col 9)-(line 4430,col 22)"
      ]
    }
  ]
}