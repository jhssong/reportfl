{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/ArrayUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 49,
      "end_line": 4408,
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
      "end_line": 447,
      "comment": "\n     * \u003cp\u003eProduces a new array containing the elements between\n     * the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe component type of the subarray is always the same as\n     * that of the input array. Thus, if the input is an array of type\n     * \u003ccode\u003eDate\u003c/code\u003e, the following usage is envisaged:\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Date[] someDates \u003d (Date[])ArrayUtils.subarray(allDates, 2, 5);\n     * \u003c/pre\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 62)",
        "(line 440,col 9)-(line 440,col 60)",
        "(line 441,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 444,col 62)",
        "(line 445,col 9)-(line 445,col 75)",
        "(line 446,col 9)-(line 446,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(long[], int, int)",
      "begin_line": 468,
      "end_line": 486,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003elong\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 471,col 9)",
        "(line 472,col 9)-(line 474,col 9)",
        "(line 475,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 478,col 62)",
        "(line 479,col 9)-(line 481,col 9)",
        "(line 483,col 9)-(line 483,col 44)",
        "(line 484,col 9)-(line 484,col 75)",
        "(line 485,col 9)-(line 485,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(int[], int, int)",
      "begin_line": 507,
      "end_line": 525,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003eint\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 513,col 9)",
        "(line 514,col 9)-(line 516,col 9)",
        "(line 517,col 9)-(line 517,col 62)",
        "(line 518,col 9)-(line 520,col 9)",
        "(line 522,col 9)-(line 522,col 42)",
        "(line 523,col 9)-(line 523,col 75)",
        "(line 524,col 9)-(line 524,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(short[], int, int)",
      "begin_line": 546,
      "end_line": 564,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003eshort\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 552,col 9)",
        "(line 553,col 9)-(line 555,col 9)",
        "(line 556,col 9)-(line 556,col 62)",
        "(line 557,col 9)-(line 559,col 9)",
        "(line 561,col 9)-(line 561,col 46)",
        "(line 562,col 9)-(line 562,col 75)",
        "(line 563,col 9)-(line 563,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(char[], int, int)",
      "begin_line": 585,
      "end_line": 603,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003echar\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 588,col 9)",
        "(line 589,col 9)-(line 591,col 9)",
        "(line 592,col 9)-(line 594,col 9)",
        "(line 595,col 9)-(line 595,col 62)",
        "(line 596,col 9)-(line 598,col 9)",
        "(line 600,col 9)-(line 600,col 44)",
        "(line 601,col 9)-(line 601,col 75)",
        "(line 602,col 9)-(line 602,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(byte[], int, int)",
      "begin_line": 624,
      "end_line": 642,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003ebyte\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 627,col 9)",
        "(line 628,col 9)-(line 630,col 9)",
        "(line 631,col 9)-(line 633,col 9)",
        "(line 634,col 9)-(line 634,col 62)",
        "(line 635,col 9)-(line 637,col 9)",
        "(line 639,col 9)-(line 639,col 44)",
        "(line 640,col 9)-(line 640,col 75)",
        "(line 641,col 9)-(line 641,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(double[], int, int)",
      "begin_line": 663,
      "end_line": 681,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003edouble\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 664,col 9)-(line 666,col 9)",
        "(line 667,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 672,col 9)",
        "(line 673,col 9)-(line 673,col 62)",
        "(line 674,col 9)-(line 676,col 9)",
        "(line 678,col 9)-(line 678,col 48)",
        "(line 679,col 9)-(line 679,col 75)",
        "(line 680,col 9)-(line 680,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(float[], int, int)",
      "begin_line": 702,
      "end_line": 720,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003efloat\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 703,col 9)-(line 705,col 9)",
        "(line 706,col 9)-(line 708,col 9)",
        "(line 709,col 9)-(line 711,col 9)",
        "(line 712,col 9)-(line 712,col 62)",
        "(line 713,col 9)-(line 715,col 9)",
        "(line 717,col 9)-(line 717,col 46)",
        "(line 718,col 9)-(line 718,col 75)",
        "(line 719,col 9)-(line 719,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.subarray(boolean[], int, int)",
      "begin_line": 741,
      "end_line": 759,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003eboolean\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 742,col 9)-(line 744,col 9)",
        "(line 745,col 9)-(line 747,col 9)",
        "(line 748,col 9)-(line 750,col 9)",
        "(line 751,col 9)-(line 751,col 62)",
        "(line 752,col 9)-(line 754,col 9)",
        "(line 756,col 9)-(line 756,col 50)",
        "(line 757,col 9)-(line 757,col 75)",
        "(line 758,col 9)-(line 758,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(java.lang.Object[], java.lang.Object[])",
      "begin_line": 774,
      "end_line": 781,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\n     *\n     * \u003cp\u003eAny multi-dimensional aspects of the arrays are ignored.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 779,col 9)",
        "(line 780,col 9)-(line 780,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(long[], long[])",
      "begin_line": 792,
      "end_line": 799,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 793,col 9)-(line 797,col 9)",
        "(line 798,col 9)-(line 798,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(int[], int[])",
      "begin_line": 810,
      "end_line": 817,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 811,col 9)-(line 815,col 9)",
        "(line 816,col 9)-(line 816,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(short[], short[])",
      "begin_line": 828,
      "end_line": 835,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 829,col 9)-(line 833,col 9)",
        "(line 834,col 9)-(line 834,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(char[], char[])",
      "begin_line": 846,
      "end_line": 853,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 847,col 9)-(line 851,col 9)",
        "(line 852,col 9)-(line 852,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(byte[], byte[])",
      "begin_line": 864,
      "end_line": 871,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 869,col 9)",
        "(line 870,col 9)-(line 870,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(double[], double[])",
      "begin_line": 882,
      "end_line": 889,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 883,col 9)-(line 887,col 9)",
        "(line 888,col 9)-(line 888,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(float[], float[])",
      "begin_line": 900,
      "end_line": 907,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 901,col 9)-(line 905,col 9)",
        "(line 906,col 9)-(line 906,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameLength(boolean[], boolean[])",
      "begin_line": 918,
      "end_line": 925,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 919,col 9)-(line 923,col 9)",
        "(line 924,col 9)-(line 924,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.getLength(java.lang.Object)",
      "begin_line": 948,
      "end_line": 953,
      "comment": "\n     * \u003cp\u003eReturns the length of the specified array.\n     * This method can deal with \u003ccode\u003eObject\u003c/code\u003e arrays and with primitive arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003e0\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.getLength(null)            \u003d 0\n     * ArrayUtils.getLength([])              \u003d 0\n     * ArrayUtils.getLength([null])          \u003d 1\n     * ArrayUtils.getLength([true, false])   \u003d 2\n     * ArrayUtils.getLength([1, 2, 3])       \u003d 3\n     * ArrayUtils.getLength([\"a\", \"b\", \"c\"]) \u003d 3\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to retrieve the length from, may be null\n     * @return The length of the array, or \u003ccode\u003e0\u003c/code\u003e if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the object arguement is not an array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 949,col 9)-(line 951,col 9)",
        "(line 952,col 9)-(line 952,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isSameType(java.lang.Object, java.lang.Object)",
      "begin_line": 964,
      "end_line": 969,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same type taking into account\n     * multi-dimensional arrays.\u003c/p\u003e\n     *\n     * @param array1 the first array, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if type of arrays matches\n     * @throws IllegalArgumentException if either array is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 965,col 9)-(line 967,col 9)",
        "(line 968,col 9)-(line 968,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(java.lang.Object[])",
      "begin_line": 982,
      "end_line": 996,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThere is no special handling for multi-dimensional arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 983,col 9)-(line 985,col 9)",
        "(line 986,col 9)-(line 986,col 18)",
        "(line 987,col 9)-(line 987,col 33)",
        "(line 988,col 9)-(line 988,col 19)",
        "(line 989,col 9)-(line 995,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(long[])",
      "begin_line": 1005,
      "end_line": 1019,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1006,col 9)-(line 1008,col 9)",
        "(line 1009,col 9)-(line 1009,col 18)",
        "(line 1010,col 9)-(line 1010,col 33)",
        "(line 1011,col 9)-(line 1011,col 17)",
        "(line 1012,col 9)-(line 1018,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(int[])",
      "begin_line": 1028,
      "end_line": 1042,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1029,col 9)-(line 1031,col 9)",
        "(line 1032,col 9)-(line 1032,col 18)",
        "(line 1033,col 9)-(line 1033,col 33)",
        "(line 1034,col 9)-(line 1034,col 16)",
        "(line 1035,col 9)-(line 1041,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(short[])",
      "begin_line": 1051,
      "end_line": 1065,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1052,col 9)-(line 1054,col 9)",
        "(line 1055,col 9)-(line 1055,col 18)",
        "(line 1056,col 9)-(line 1056,col 33)",
        "(line 1057,col 9)-(line 1057,col 18)",
        "(line 1058,col 9)-(line 1064,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(char[])",
      "begin_line": 1074,
      "end_line": 1088,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1075,col 9)-(line 1077,col 9)",
        "(line 1078,col 9)-(line 1078,col 18)",
        "(line 1079,col 9)-(line 1079,col 33)",
        "(line 1080,col 9)-(line 1080,col 17)",
        "(line 1081,col 9)-(line 1087,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(byte[])",
      "begin_line": 1097,
      "end_line": 1111,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1098,col 9)-(line 1100,col 9)",
        "(line 1101,col 9)-(line 1101,col 18)",
        "(line 1102,col 9)-(line 1102,col 33)",
        "(line 1103,col 9)-(line 1103,col 17)",
        "(line 1104,col 9)-(line 1110,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(double[])",
      "begin_line": 1120,
      "end_line": 1134,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1121,col 9)-(line 1123,col 9)",
        "(line 1124,col 9)-(line 1124,col 18)",
        "(line 1125,col 9)-(line 1125,col 33)",
        "(line 1126,col 9)-(line 1126,col 19)",
        "(line 1127,col 9)-(line 1133,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(float[])",
      "begin_line": 1143,
      "end_line": 1157,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1144,col 9)-(line 1146,col 9)",
        "(line 1147,col 9)-(line 1147,col 18)",
        "(line 1148,col 9)-(line 1148,col 33)",
        "(line 1149,col 9)-(line 1149,col 18)",
        "(line 1150,col 9)-(line 1156,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.reverse(boolean[])",
      "begin_line": 1166,
      "end_line": 1180,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1167,col 9)-(line 1169,col 9)",
        "(line 1170,col 9)-(line 1170,col 18)",
        "(line 1171,col 9)-(line 1171,col 33)",
        "(line 1172,col 9)-(line 1172,col 20)",
        "(line 1173,col 9)-(line 1179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(java.lang.Object[], java.lang.Object)",
      "begin_line": 1197,
      "end_line": 1199,
      "comment": "\n     * \u003cp\u003eFinds the index of the given object in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param objectToFind  the object to find, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the index of the object within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1198,col 9)-(line 1198,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(java.lang.Object[], java.lang.Object, int)",
      "begin_line": 1215,
      "end_line": 1236,
      "comment": "\n     * \u003cp\u003eFinds the index of the given object in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param objectToFind  the object to find, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param startIndex  the index to start searching at\n     * @return the index of the object within the array starting at the index,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1216,col 9)-(line 1218,col 9)",
        "(line 1219,col 9)-(line 1221,col 9)",
        "(line 1222,col 9)-(line 1234,col 9)",
        "(line 1235,col 9)-(line 1235,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(java.lang.Object[], java.lang.Object)",
      "begin_line": 1248,
      "end_line": 1250,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given object within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param objectToFind  the object to find, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the last index of the object within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1249,col 9)-(line 1249,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(java.lang.Object[], java.lang.Object, int)",
      "begin_line": 1266,
      "end_line": 1289,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given object in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than\n     * the array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param objectToFind  the object to find, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the object within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1267,col 9)-(line 1269,col 9)",
        "(line 1270,col 9)-(line 1274,col 9)",
        "(line 1275,col 9)-(line 1287,col 9)",
        "(line 1288,col 9)-(line 1288,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(java.lang.Object[], java.lang.Object)",
      "begin_line": 1300,
      "end_line": 1302,
      "comment": "\n     * \u003cp\u003eChecks if the object is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param objectToFind  the object to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 1301,col 9)-(line 1301,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(long[], long)",
      "begin_line": 1316,
      "end_line": 1318,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1317,col 9)-(line 1317,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(long[], long, int)",
      "begin_line": 1334,
      "end_line": 1347,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1335,col 9)-(line 1337,col 9)",
        "(line 1338,col 9)-(line 1340,col 9)",
        "(line 1341,col 9)-(line 1345,col 9)",
        "(line 1346,col 9)-(line 1346,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(long[], long)",
      "begin_line": 1359,
      "end_line": 1361,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1360,col 9)-(line 1360,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(long[], long, int)",
      "begin_line": 1377,
      "end_line": 1392,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1378,col 9)-(line 1380,col 9)",
        "(line 1381,col 9)-(line 1385,col 9)",
        "(line 1386,col 9)-(line 1390,col 9)",
        "(line 1391,col 9)-(line 1391,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(long[], long)",
      "begin_line": 1403,
      "end_line": 1405,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 1404,col 9)-(line 1404,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(int[], int)",
      "begin_line": 1419,
      "end_line": 1421,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1420,col 9)-(line 1420,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(int[], int, int)",
      "begin_line": 1437,
      "end_line": 1450,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1438,col 9)-(line 1440,col 9)",
        "(line 1441,col 9)-(line 1443,col 9)",
        "(line 1444,col 9)-(line 1448,col 9)",
        "(line 1449,col 9)-(line 1449,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(int[], int)",
      "begin_line": 1462,
      "end_line": 1464,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1463,col 9)-(line 1463,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(int[], int, int)",
      "begin_line": 1480,
      "end_line": 1495,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1481,col 9)-(line 1483,col 9)",
        "(line 1484,col 9)-(line 1488,col 9)",
        "(line 1489,col 9)-(line 1493,col 9)",
        "(line 1494,col 9)-(line 1494,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(int[], int)",
      "begin_line": 1506,
      "end_line": 1508,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 1507,col 9)-(line 1507,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(short[], short)",
      "begin_line": 1522,
      "end_line": 1524,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1523,col 9)-(line 1523,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(short[], short, int)",
      "begin_line": 1540,
      "end_line": 1553,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1541,col 9)-(line 1543,col 9)",
        "(line 1544,col 9)-(line 1546,col 9)",
        "(line 1547,col 9)-(line 1551,col 9)",
        "(line 1552,col 9)-(line 1552,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(short[], short)",
      "begin_line": 1565,
      "end_line": 1567,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1566,col 9)-(line 1566,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(short[], short, int)",
      "begin_line": 1583,
      "end_line": 1598,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1584,col 9)-(line 1586,col 9)",
        "(line 1587,col 9)-(line 1591,col 9)",
        "(line 1592,col 9)-(line 1596,col 9)",
        "(line 1597,col 9)-(line 1597,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(short[], short)",
      "begin_line": 1609,
      "end_line": 1611,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 1610,col 9)-(line 1610,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(char[], char)",
      "begin_line": 1626,
      "end_line": 1628,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1627,col 9)-(line 1627,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(char[], char, int)",
      "begin_line": 1645,
      "end_line": 1658,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1646,col 9)-(line 1648,col 9)",
        "(line 1649,col 9)-(line 1651,col 9)",
        "(line 1652,col 9)-(line 1656,col 9)",
        "(line 1657,col 9)-(line 1657,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(char[], char)",
      "begin_line": 1671,
      "end_line": 1673,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1672,col 9)-(line 1672,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(char[], char, int)",
      "begin_line": 1690,
      "end_line": 1705,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1691,col 9)-(line 1693,col 9)",
        "(line 1694,col 9)-(line 1698,col 9)",
        "(line 1699,col 9)-(line 1703,col 9)",
        "(line 1704,col 9)-(line 1704,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(char[], char)",
      "begin_line": 1717,
      "end_line": 1719,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1718,col 9)-(line 1718,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(byte[], byte)",
      "begin_line": 1733,
      "end_line": 1735,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1734,col 9)-(line 1734,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(byte[], byte, int)",
      "begin_line": 1751,
      "end_line": 1764,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1752,col 9)-(line 1754,col 9)",
        "(line 1755,col 9)-(line 1757,col 9)",
        "(line 1758,col 9)-(line 1762,col 9)",
        "(line 1763,col 9)-(line 1763,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(byte[], byte)",
      "begin_line": 1776,
      "end_line": 1778,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1777,col 9)-(line 1777,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(byte[], byte, int)",
      "begin_line": 1794,
      "end_line": 1809,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1795,col 9)-(line 1797,col 9)",
        "(line 1798,col 9)-(line 1802,col 9)",
        "(line 1803,col 9)-(line 1807,col 9)",
        "(line 1808,col 9)-(line 1808,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(byte[], byte)",
      "begin_line": 1820,
      "end_line": 1822,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 1821,col 9)-(line 1821,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(double[], double)",
      "begin_line": 1836,
      "end_line": 1838,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1837,col 9)-(line 1837,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(double[], double, double)",
      "begin_line": 1853,
      "end_line": 1855,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value within a given tolerance in the array.\n     * This method will return the index of the first value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param tolerance tolerance of the search\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1854,col 9)-(line 1854,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(double[], double, int)",
      "begin_line": 1871,
      "end_line": 1884,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1872,col 9)-(line 1874,col 9)",
        "(line 1875,col 9)-(line 1877,col 9)",
        "(line 1878,col 9)-(line 1882,col 9)",
        "(line 1883,col 9)-(line 1883,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(double[], double, int, double)",
      "begin_line": 1903,
      "end_line": 1918,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\n     * This method will return the index of the first value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @param tolerance tolerance of the search\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1904,col 9)-(line 1906,col 9)",
        "(line 1907,col 9)-(line 1909,col 9)",
        "(line 1910,col 9)-(line 1910,col 45)",
        "(line 1911,col 9)-(line 1911,col 45)",
        "(line 1912,col 9)-(line 1916,col 9)",
        "(line 1917,col 9)-(line 1917,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(double[], double)",
      "begin_line": 1930,
      "end_line": 1932,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1931,col 9)-(line 1931,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(double[], double, double)",
      "begin_line": 1947,
      "end_line": 1949,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within a given tolerance in the array.\n     * This method will return the index of the last value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param tolerance tolerance of the search\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1948,col 9)-(line 1948,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(double[], double, int)",
      "begin_line": 1965,
      "end_line": 1980,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1966,col 9)-(line 1968,col 9)",
        "(line 1969,col 9)-(line 1973,col 9)",
        "(line 1974,col 9)-(line 1978,col 9)",
        "(line 1979,col 9)-(line 1979,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(double[], double, int, double)",
      "begin_line": 1999,
      "end_line": 2016,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\n     * This method will return the index of the last value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @param tolerance  search for value within plus/minus this amount\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2000,col 9)-(line 2002,col 9)",
        "(line 2003,col 9)-(line 2007,col 9)",
        "(line 2008,col 9)-(line 2008,col 45)",
        "(line 2009,col 9)-(line 2009,col 45)",
        "(line 2010,col 9)-(line 2014,col 9)",
        "(line 2015,col 9)-(line 2015,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(double[], double)",
      "begin_line": 2027,
      "end_line": 2029,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 2028,col 9)-(line 2028,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(double[], double, double)",
      "begin_line": 2044,
      "end_line": 2046,
      "comment": "\n     * \u003cp\u003eChecks if a value falling within the given tolerance is in the\n     * given array.  If the array contains a value within the inclusive range\n     * defined by (value - tolerance) to (value + tolerance).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array\n     * is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search\n     * @param valueToFind  the value to find\n     * @param tolerance  the array contains the tolerance of the search\n     * @return true if value falling within tolerance is in array\n     ",
      "child_ranges": [
        "(line 2045,col 9)-(line 2045,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(float[], float)",
      "begin_line": 2060,
      "end_line": 2062,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2061,col 9)-(line 2061,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(float[], float, int)",
      "begin_line": 2078,
      "end_line": 2091,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2079,col 9)-(line 2081,col 9)",
        "(line 2082,col 9)-(line 2084,col 9)",
        "(line 2085,col 9)-(line 2089,col 9)",
        "(line 2090,col 9)-(line 2090,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(float[], float)",
      "begin_line": 2103,
      "end_line": 2105,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2104,col 9)-(line 2104,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(float[], float, int)",
      "begin_line": 2121,
      "end_line": 2136,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2122,col 9)-(line 2124,col 9)",
        "(line 2125,col 9)-(line 2129,col 9)",
        "(line 2130,col 9)-(line 2134,col 9)",
        "(line 2135,col 9)-(line 2135,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(float[], float)",
      "begin_line": 2147,
      "end_line": 2149,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 2148,col 9)-(line 2148,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(boolean[], boolean)",
      "begin_line": 2163,
      "end_line": 2165,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2164,col 9)-(line 2164,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.indexOf(boolean[], boolean, int)",
      "begin_line": 2182,
      "end_line": 2195,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     *\n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e\n     *  array input\n     ",
      "child_ranges": [
        "(line 2183,col 9)-(line 2185,col 9)",
        "(line 2186,col 9)-(line 2188,col 9)",
        "(line 2189,col 9)-(line 2193,col 9)",
        "(line 2194,col 9)-(line 2194,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(boolean[], boolean)",
      "begin_line": 2208,
      "end_line": 2210,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if\n     * \u003ccode\u003enull\u003c/code\u003e array input.\u003c/p\u003e\n     *\n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2209,col 9)-(line 2209,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.lastIndexOf(boolean[], boolean, int)",
      "begin_line": 2226,
      "end_line": 2241,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than\n     * the array length will search from the end of the array.\u003c/p\u003e\n     *\n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2227,col 9)-(line 2229,col 9)",
        "(line 2230,col 9)-(line 2234,col 9)",
        "(line 2235,col 9)-(line 2239,col 9)",
        "(line 2240,col 9)-(line 2240,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.contains(boolean[], boolean)",
      "begin_line": 2252,
      "end_line": 2254,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 2253,col 9)-(line 2253,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Character[])",
      "begin_line": 2270,
      "end_line": 2281,
      "comment": "\n     * \u003cp\u003eConverts an array of object Characters to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eCharacter\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003echar\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2271,col 9)-(line 2275,col 9)",
        "(line 2276,col 9)-(line 2276,col 53)",
        "(line 2277,col 9)-(line 2279,col 9)",
        "(line 2280,col 9)-(line 2280,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Character[], char)",
      "begin_line": 2292,
      "end_line": 2304,
      "comment": "\n     * \u003cp\u003eConverts an array of object Character to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eCharacter\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003echar\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2293,col 9)-(line 2297,col 9)",
        "(line 2298,col 9)-(line 2298,col 53)",
        "(line 2299,col 9)-(line 2302,col 9)",
        "(line 2303,col 9)-(line 2303,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(char[])",
      "begin_line": 2314,
      "end_line": 2325,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive chars to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array a \u003ccode\u003echar\u003c/code\u003e array\n     * @return a \u003ccode\u003eCharacter\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2315,col 9)-(line 2319,col 9)",
        "(line 2320,col 9)-(line 2320,col 63)",
        "(line 2321,col 9)-(line 2323,col 9)",
        "(line 2324,col 9)-(line 2324,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Long[])",
      "begin_line": 2338,
      "end_line": 2349,
      "comment": "\n     * \u003cp\u003eConverts an array of object Longs to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eLong\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003elong\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2339,col 9)-(line 2343,col 9)",
        "(line 2344,col 9)-(line 2344,col 53)",
        "(line 2345,col 9)-(line 2347,col 9)",
        "(line 2348,col 9)-(line 2348,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Long[], long)",
      "begin_line": 2360,
      "end_line": 2372,
      "comment": "\n     * \u003cp\u003eConverts an array of object Long to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eLong\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003elong\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2361,col 9)-(line 2365,col 9)",
        "(line 2366,col 9)-(line 2366,col 53)",
        "(line 2367,col 9)-(line 2370,col 9)",
        "(line 2371,col 9)-(line 2371,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(long[])",
      "begin_line": 2382,
      "end_line": 2393,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive longs to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003elong\u003c/code\u003e array\n     * @return a \u003ccode\u003eLong\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2383,col 9)-(line 2387,col 9)",
        "(line 2388,col 9)-(line 2388,col 53)",
        "(line 2389,col 9)-(line 2391,col 9)",
        "(line 2392,col 9)-(line 2392,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Integer[])",
      "begin_line": 2406,
      "end_line": 2417,
      "comment": "\n     * \u003cp\u003eConverts an array of object Integers to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eInteger\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return an \u003ccode\u003eint\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2407,col 9)-(line 2411,col 9)",
        "(line 2412,col 9)-(line 2412,col 51)",
        "(line 2413,col 9)-(line 2415,col 9)",
        "(line 2416,col 9)-(line 2416,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Integer[], int)",
      "begin_line": 2428,
      "end_line": 2440,
      "comment": "\n     * \u003cp\u003eConverts an array of object Integer to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eInteger\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return an \u003ccode\u003eint\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2429,col 9)-(line 2433,col 9)",
        "(line 2434,col 9)-(line 2434,col 51)",
        "(line 2435,col 9)-(line 2438,col 9)",
        "(line 2439,col 9)-(line 2439,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(int[])",
      "begin_line": 2450,
      "end_line": 2461,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive ints to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  an \u003ccode\u003eint\u003c/code\u003e array\n     * @return an \u003ccode\u003eInteger\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2451,col 9)-(line 2455,col 9)",
        "(line 2456,col 9)-(line 2456,col 59)",
        "(line 2457,col 9)-(line 2459,col 9)",
        "(line 2460,col 9)-(line 2460,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Short[])",
      "begin_line": 2474,
      "end_line": 2485,
      "comment": "\n     * \u003cp\u003eConverts an array of object Shorts to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eShort\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003ebyte\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2475,col 9)-(line 2479,col 9)",
        "(line 2480,col 9)-(line 2480,col 55)",
        "(line 2481,col 9)-(line 2483,col 9)",
        "(line 2484,col 9)-(line 2484,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Short[], short)",
      "begin_line": 2496,
      "end_line": 2508,
      "comment": "\n     * \u003cp\u003eConverts an array of object Short to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eShort\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003ebyte\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2497,col 9)-(line 2501,col 9)",
        "(line 2502,col 9)-(line 2502,col 55)",
        "(line 2503,col 9)-(line 2506,col 9)",
        "(line 2507,col 9)-(line 2507,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(short[])",
      "begin_line": 2518,
      "end_line": 2529,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive shorts to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eshort\u003c/code\u003e array\n     * @return a \u003ccode\u003eShort\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2519,col 9)-(line 2523,col 9)",
        "(line 2524,col 9)-(line 2524,col 55)",
        "(line 2525,col 9)-(line 2527,col 9)",
        "(line 2528,col 9)-(line 2528,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Byte[])",
      "begin_line": 2542,
      "end_line": 2553,
      "comment": "\n     * \u003cp\u003eConverts an array of object Bytes to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eByte\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003ebyte\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2543,col 9)-(line 2547,col 9)",
        "(line 2548,col 9)-(line 2548,col 53)",
        "(line 2549,col 9)-(line 2551,col 9)",
        "(line 2552,col 9)-(line 2552,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Byte[], byte)",
      "begin_line": 2564,
      "end_line": 2576,
      "comment": "\n     * \u003cp\u003eConverts an array of object Bytes to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eByte\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003ebyte\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2565,col 9)-(line 2569,col 9)",
        "(line 2570,col 9)-(line 2570,col 53)",
        "(line 2571,col 9)-(line 2574,col 9)",
        "(line 2575,col 9)-(line 2575,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(byte[])",
      "begin_line": 2586,
      "end_line": 2597,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive bytes to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003ebyte\u003c/code\u003e array\n     * @return a \u003ccode\u003eByte\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2587,col 9)-(line 2591,col 9)",
        "(line 2592,col 9)-(line 2592,col 53)",
        "(line 2593,col 9)-(line 2595,col 9)",
        "(line 2596,col 9)-(line 2596,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Double[])",
      "begin_line": 2610,
      "end_line": 2621,
      "comment": "\n     * \u003cp\u003eConverts an array of object Doubles to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eDouble\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003edouble\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2611,col 9)-(line 2615,col 9)",
        "(line 2616,col 9)-(line 2616,col 57)",
        "(line 2617,col 9)-(line 2619,col 9)",
        "(line 2620,col 9)-(line 2620,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Double[], double)",
      "begin_line": 2632,
      "end_line": 2644,
      "comment": "\n     * \u003cp\u003eConverts an array of object Doubles to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eDouble\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003edouble\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2633,col 9)-(line 2637,col 9)",
        "(line 2638,col 9)-(line 2638,col 57)",
        "(line 2639,col 9)-(line 2642,col 9)",
        "(line 2643,col 9)-(line 2643,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(double[])",
      "begin_line": 2654,
      "end_line": 2665,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive doubles to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003edouble\u003c/code\u003e array\n     * @return a \u003ccode\u003eDouble\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2655,col 9)-(line 2659,col 9)",
        "(line 2660,col 9)-(line 2660,col 57)",
        "(line 2661,col 9)-(line 2663,col 9)",
        "(line 2664,col 9)-(line 2664,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Float[])",
      "begin_line": 2678,
      "end_line": 2689,
      "comment": "\n     * \u003cp\u003eConverts an array of object Floats to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eFloat\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003efloat\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2679,col 9)-(line 2683,col 9)",
        "(line 2684,col 9)-(line 2684,col 55)",
        "(line 2685,col 9)-(line 2687,col 9)",
        "(line 2688,col 9)-(line 2688,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Float[], float)",
      "begin_line": 2700,
      "end_line": 2712,
      "comment": "\n     * \u003cp\u003eConverts an array of object Floats to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eFloat\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003efloat\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2701,col 9)-(line 2705,col 9)",
        "(line 2706,col 9)-(line 2706,col 55)",
        "(line 2707,col 9)-(line 2710,col 9)",
        "(line 2711,col 9)-(line 2711,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(float[])",
      "begin_line": 2722,
      "end_line": 2733,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive floats to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003efloat\u003c/code\u003e array\n     * @return a \u003ccode\u003eFloat\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2723,col 9)-(line 2727,col 9)",
        "(line 2728,col 9)-(line 2728,col 55)",
        "(line 2729,col 9)-(line 2731,col 9)",
        "(line 2732,col 9)-(line 2732,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Boolean[])",
      "begin_line": 2746,
      "end_line": 2757,
      "comment": "\n     * \u003cp\u003eConverts an array of object Booleans to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eBoolean\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eboolean\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2747,col 9)-(line 2751,col 9)",
        "(line 2752,col 9)-(line 2752,col 59)",
        "(line 2753,col 9)-(line 2755,col 9)",
        "(line 2756,col 9)-(line 2756,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Boolean[], boolean)",
      "begin_line": 2768,
      "end_line": 2780,
      "comment": "\n     * \u003cp\u003eConverts an array of object Booleans to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eBoolean\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003eboolean\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2769,col 9)-(line 2773,col 9)",
        "(line 2774,col 9)-(line 2774,col 59)",
        "(line 2775,col 9)-(line 2778,col 9)",
        "(line 2779,col 9)-(line 2779,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.toObject(boolean[])",
      "begin_line": 2790,
      "end_line": 2801,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive booleans to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  a \u003ccode\u003eboolean\u003c/code\u003e array\n     * @return a \u003ccode\u003eBoolean\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2791,col 9)-(line 2795,col 9)",
        "(line 2796,col 9)-(line 2796,col 59)",
        "(line 2797,col 9)-(line 2799,col 9)",
        "(line 2800,col 9)-(line 2800,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(T[])",
      "begin_line": 2811,
      "end_line": 2816,
      "comment": "\n     * \u003cp\u003eChecks if an array of Objects is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2812,col 9)-(line 2814,col 9)",
        "(line 2815,col 9)-(line 2815,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(long[])",
      "begin_line": 2825,
      "end_line": 2830,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive longs is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2826,col 9)-(line 2828,col 9)",
        "(line 2829,col 9)-(line 2829,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(int[])",
      "begin_line": 2839,
      "end_line": 2844,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive ints is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2840,col 9)-(line 2842,col 9)",
        "(line 2843,col 9)-(line 2843,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(short[])",
      "begin_line": 2853,
      "end_line": 2858,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive shorts is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2854,col 9)-(line 2856,col 9)",
        "(line 2857,col 9)-(line 2857,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(char[])",
      "begin_line": 2867,
      "end_line": 2872,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive chars is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2868,col 9)-(line 2870,col 9)",
        "(line 2871,col 9)-(line 2871,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(byte[])",
      "begin_line": 2881,
      "end_line": 2886,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive bytes is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2882,col 9)-(line 2884,col 9)",
        "(line 2885,col 9)-(line 2885,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(double[])",
      "begin_line": 2895,
      "end_line": 2900,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive doubles is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2896,col 9)-(line 2898,col 9)",
        "(line 2899,col 9)-(line 2899,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(float[])",
      "begin_line": 2909,
      "end_line": 2914,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive floats is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2910,col 9)-(line 2912,col 9)",
        "(line 2913,col 9)-(line 2913,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.isEmpty(boolean[])",
      "begin_line": 2923,
      "end_line": 2928,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive booleans is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2924,col 9)-(line 2926,col 9)",
        "(line 2927,col 9)-(line 2927,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(T[], T...)",
      "begin_line": 2951,
      "end_line": 2963,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(null, null)     \u003d null\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * ArrayUtils.addAll([null], [null]) \u003d [null, null]\n     * ArrayUtils.addAll([\"a\", \"b\", \"c\"], [\"1\", \"2\", \"3\"]) \u003d [\"a\", \"b\", \"c\", \"1\", \"2\", \"3\"]\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2  the second array whose elements are added to the new array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return The new array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e array inputs.\n     *      The type of the new array is the type of the first array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2953,col 9)-(line 2957,col 9)",
        "(line 2958,col 9)-(line 2959,col 91)",
        "(line 2960,col 9)-(line 2960,col 67)",
        "(line 2961,col 9)-(line 2961,col 79)",
        "(line 2962,col 9)-(line 2962,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(boolean[], boolean...)",
      "begin_line": 2982,
      "end_line": 2992,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new boolean[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2983,col 9)-(line 2987,col 9)",
        "(line 2988,col 9)-(line 2988,col 75)",
        "(line 2989,col 9)-(line 2989,col 67)",
        "(line 2990,col 9)-(line 2990,col 79)",
        "(line 2991,col 9)-(line 2991,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(char[], char...)",
      "begin_line": 3011,
      "end_line": 3021,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new char[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3012,col 9)-(line 3016,col 9)",
        "(line 3017,col 9)-(line 3017,col 69)",
        "(line 3018,col 9)-(line 3018,col 67)",
        "(line 3019,col 9)-(line 3019,col 79)",
        "(line 3020,col 9)-(line 3020,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(byte[], byte...)",
      "begin_line": 3040,
      "end_line": 3050,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new byte[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3041,col 9)-(line 3045,col 9)",
        "(line 3046,col 9)-(line 3046,col 69)",
        "(line 3047,col 9)-(line 3047,col 67)",
        "(line 3048,col 9)-(line 3048,col 79)",
        "(line 3049,col 9)-(line 3049,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(short[], short...)",
      "begin_line": 3069,
      "end_line": 3079,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new short[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3070,col 9)-(line 3074,col 9)",
        "(line 3075,col 9)-(line 3075,col 71)",
        "(line 3076,col 9)-(line 3076,col 67)",
        "(line 3077,col 9)-(line 3077,col 79)",
        "(line 3078,col 9)-(line 3078,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(int[], int...)",
      "begin_line": 3098,
      "end_line": 3108,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new int[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3099,col 9)-(line 3103,col 9)",
        "(line 3104,col 9)-(line 3104,col 67)",
        "(line 3105,col 9)-(line 3105,col 67)",
        "(line 3106,col 9)-(line 3106,col 79)",
        "(line 3107,col 9)-(line 3107,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(long[], long...)",
      "begin_line": 3127,
      "end_line": 3137,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new long[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3128,col 9)-(line 3132,col 9)",
        "(line 3133,col 9)-(line 3133,col 69)",
        "(line 3134,col 9)-(line 3134,col 67)",
        "(line 3135,col 9)-(line 3135,col 79)",
        "(line 3136,col 9)-(line 3136,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(float[], float...)",
      "begin_line": 3156,
      "end_line": 3166,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new float[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3157,col 9)-(line 3161,col 9)",
        "(line 3162,col 9)-(line 3162,col 71)",
        "(line 3163,col 9)-(line 3163,col 67)",
        "(line 3164,col 9)-(line 3164,col 79)",
        "(line 3165,col 9)-(line 3165,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.addAll(double[], double...)",
      "begin_line": 3185,
      "end_line": 3195,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new double[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3186,col 9)-(line 3190,col 9)",
        "(line 3191,col 9)-(line 3191,col 73)",
        "(line 3192,col 9)-(line 3192,col 67)",
        "(line 3193,col 9)-(line 3193,col 79)",
        "(line 3194,col 9)-(line 3194,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(T[], T)",
      "begin_line": 3220,
      "end_line": 3226,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, null)      \u003d [null]\n     * ArrayUtils.add(null, \"a\")       \u003d [\"a\"]\n     * ArrayUtils.add([\"a\"], null)     \u003d [\"a\", null]\n     * ArrayUtils.add([\"a\"], \"b\")      \u003d [\"a\", \"b\"]\n     * ArrayUtils.add([\"a\", \"b\"], \"c\") \u003d [\"a\", \"b\", \"c\"]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to \"add\" the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3222,col 9)-(line 3222,col 113)",
        "(line 3223,col 9)-(line 3223,col 57)",
        "(line 3224,col 9)-(line 3224,col 48)",
        "(line 3225,col 9)-(line 3225,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(boolean[], boolean)",
      "begin_line": 3249,
      "end_line": 3253,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, true)          \u003d [true]\n     * ArrayUtils.add([true], false)       \u003d [true, false]\n     * ArrayUtils.add([true, false], true) \u003d [true, false, true]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3250,col 9)-(line 3250,col 76)",
        "(line 3251,col 9)-(line 3251,col 48)",
        "(line 3252,col 9)-(line 3252,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(byte[], byte)",
      "begin_line": 3276,
      "end_line": 3280,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3277,col 9)-(line 3277,col 67)",
        "(line 3278,col 9)-(line 3278,col 48)",
        "(line 3279,col 9)-(line 3279,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(char[], char)",
      "begin_line": 3303,
      "end_line": 3307,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, \u00270\u0027)       \u003d [\u00270\u0027]\n     * ArrayUtils.add([\u00271\u0027], \u00270\u0027)      \u003d [\u00271\u0027, \u00270\u0027]\n     * ArrayUtils.add([\u00271\u0027, \u00270\u0027], \u00271\u0027) \u003d [\u00271\u0027, \u00270\u0027, \u00271\u0027]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3304,col 9)-(line 3304,col 72)",
        "(line 3305,col 9)-(line 3305,col 48)",
        "(line 3306,col 9)-(line 3306,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(double[], double)",
      "begin_line": 3330,
      "end_line": 3334,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3331,col 9)-(line 3331,col 73)",
        "(line 3332,col 9)-(line 3332,col 48)",
        "(line 3333,col 9)-(line 3333,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(float[], float)",
      "begin_line": 3357,
      "end_line": 3361,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3358,col 9)-(line 3358,col 70)",
        "(line 3359,col 9)-(line 3359,col 48)",
        "(line 3360,col 9)-(line 3360,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(int[], int)",
      "begin_line": 3384,
      "end_line": 3388,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3385,col 9)-(line 3385,col 68)",
        "(line 3386,col 9)-(line 3386,col 48)",
        "(line 3387,col 9)-(line 3387,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(long[], long)",
      "begin_line": 3411,
      "end_line": 3415,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3412,col 9)-(line 3412,col 67)",
        "(line 3413,col 9)-(line 3413,col 48)",
        "(line 3414,col 9)-(line 3414,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(short[], short)",
      "begin_line": 3438,
      "end_line": 3442,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of\n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3439,col 9)-(line 3439,col 70)",
        "(line 3440,col 9)-(line 3440,col 48)",
        "(line 3441,col 9)-(line 3441,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.copyArrayGrow1(java.lang.Object, java.lang.Class\u003c?\u003e)",
      "begin_line": 3453,
      "end_line": 3461,
      "comment": "\n     * Returns a copy of the given array of size 1 greater than the argument.\n     * The last value of the array is left to the default value.\n     *\n     * @param array The array to copy, must not be \u003ccode\u003enull\u003c/code\u003e.\n     * @param newArrayComponentType If \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, create a\n     * size 1 array of this type.\n     * @return A new copy of the array of size 1 greater than the input.\n     ",
      "child_ranges": [
        "(line 3454,col 9)-(line 3459,col 9)",
        "(line 3460,col 9)-(line 3460,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(T[], int, T)",
      "begin_line": 3491,
      "end_line": 3502,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0, null)      \u003d [null]\n     * ArrayUtils.add(null, 0, \"a\")       \u003d [\"a\"]\n     * ArrayUtils.add([\"a\"], 1, null)     \u003d [\"a\", null]\n     * ArrayUtils.add([\"a\"], 1, \"b\")      \u003d [\"a\", \"b\"]\n     * ArrayUtils.add([\"a\", \"b\"], 3, \"c\") \u003d [\"a\", \"b\", \"c\"]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3493,col 9)-(line 3493,col 29)",
        "(line 3494,col 9)-(line 3500,col 9)",
        "(line 3501,col 9)-(line 3501,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(boolean[], int, boolean)",
      "begin_line": 3531,
      "end_line": 3533,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0, true)          \u003d [true]\n     * ArrayUtils.add([true], 0, false)       \u003d [false, true]\n     * ArrayUtils.add([false], 1, true)       \u003d [false, true]\n     * ArrayUtils.add([true, false], 1, true) \u003d [true, true, false]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3532,col 9)-(line 3532,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(char[], int, char)",
      "begin_line": 3563,
      "end_line": 3565,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0, \u0027a\u0027)            \u003d [\u0027a\u0027]\n     * ArrayUtils.add([\u0027a\u0027], 0, \u0027b\u0027)           \u003d [\u0027b\u0027, \u0027a\u0027]\n     * ArrayUtils.add([\u0027a\u0027, \u0027b\u0027], 0, \u0027c\u0027)      \u003d [\u0027c\u0027, \u0027a\u0027, \u0027b\u0027]\n     * ArrayUtils.add([\u0027a\u0027, \u0027b\u0027], 1, \u0027k\u0027)      \u003d [\u0027a\u0027, \u0027k\u0027, \u0027b\u0027]\n     * ArrayUtils.add([\u0027a\u0027, \u0027b\u0027, \u0027c\u0027], 1, \u0027t\u0027) \u003d [\u0027a\u0027, \u0027t\u0027, \u0027b\u0027, \u0027c\u0027]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3564,col 9)-(line 3564,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(byte[], int, byte)",
      "begin_line": 3594,
      "end_line": 3596,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1], 0, 2)         \u003d [2, 1]\n     * ArrayUtils.add([2, 6], 2, 3)      \u003d [2, 6, 3]\n     * ArrayUtils.add([2, 6], 0, 1)      \u003d [1, 2, 6]\n     * ArrayUtils.add([2, 6, 3], 2, 1)   \u003d [2, 6, 1, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3595,col 9)-(line 3595,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(short[], int, short)",
      "begin_line": 3625,
      "end_line": 3627,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1], 0, 2)         \u003d [2, 1]\n     * ArrayUtils.add([2, 6], 2, 10)     \u003d [2, 6, 10]\n     * ArrayUtils.add([2, 6], 0, -4)     \u003d [-4, 2, 6]\n     * ArrayUtils.add([2, 6, 3], 2, 1)   \u003d [2, 6, 1, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3626,col 9)-(line 3626,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(int[], int, int)",
      "begin_line": 3656,
      "end_line": 3658,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1], 0, 2)         \u003d [2, 1]\n     * ArrayUtils.add([2, 6], 2, 10)     \u003d [2, 6, 10]\n     * ArrayUtils.add([2, 6], 0, -4)     \u003d [-4, 2, 6]\n     * ArrayUtils.add([2, 6, 3], 2, 1)   \u003d [2, 6, 1, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3657,col 9)-(line 3657,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(long[], int, long)",
      "begin_line": 3687,
      "end_line": 3689,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1L], 0, 2L)           \u003d [2L, 1L]\n     * ArrayUtils.add([2L, 6L], 2, 10L)      \u003d [2L, 6L, 10L]\n     * ArrayUtils.add([2L, 6L], 0, -4L)      \u003d [-4L, 2L, 6L]\n     * ArrayUtils.add([2L, 6L, 3L], 2, 1L)   \u003d [2L, 6L, 1L, 3L]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3688,col 9)-(line 3688,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(float[], int, float)",
      "begin_line": 3718,
      "end_line": 3720,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1.1f], 0, 2.2f)               \u003d [2.2f, 1.1f]\n     * ArrayUtils.add([2.3f, 6.4f], 2, 10.5f)        \u003d [2.3f, 6.4f, 10.5f]\n     * ArrayUtils.add([2.6f, 6.7f], 0, -4.8f)        \u003d [-4.8f, 2.6f, 6.7f]\n     * ArrayUtils.add([2.9f, 6.0f, 0.3f], 2, 1.0f)   \u003d [2.9f, 6.0f, 1.0f, 0.3f]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3719,col 9)-(line 3719,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(double[], int, double)",
      "begin_line": 3749,
      "end_line": 3751,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array.\n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.add([1.1], 0, 2.2)              \u003d [2.2, 1.1]\n     * ArrayUtils.add([2.3, 6.4], 2, 10.5)        \u003d [2.3, 6.4, 10.5]\n     * ArrayUtils.add([2.6, 6.7], 0, -4.8)        \u003d [-4.8, 2.6, 6.7]\n     * ArrayUtils.add([2.9, 6.0, 0.3], 2, 1.0)    \u003d [2.9, 6.0, 1.0, 0.3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3750,col 9)-(line 3750,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.add(java.lang.Object, int, java.lang.Object, java.lang.Class\u003c?\u003e)",
      "begin_line": 3764,
      "end_line": 3784,
      "comment": "\n     * Underlying implementation of add(array, index, element) methods.\n     * The last parameter is the class, which may not equal element.getClass\n     * for primitives.\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @param clss the type of the element being added\n     * @return A new array containing the existing elements and the new element\n     ",
      "child_ranges": [
        "(line 3765,col 9)-(line 3772,col 9)",
        "(line 3773,col 9)-(line 3773,col 44)",
        "(line 3774,col 9)-(line 3776,col 9)",
        "(line 3777,col 9)-(line 3777,col 60)",
        "(line 3778,col 9)-(line 3778,col 53)",
        "(line 3779,col 9)-(line 3779,col 42)",
        "(line 3780,col 9)-(line 3782,col 9)",
        "(line 3783,col 9)-(line 3783,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(T[], int)",
      "begin_line": 3814,
      "end_line": 3817,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([\"a\"], 0)           \u003d []\n     * ArrayUtils.remove([\"a\", \"b\"], 0)      \u003d [\"b\"]\n     * ArrayUtils.remove([\"a\", \"b\"], 1)      \u003d [\"a\"]\n     * ArrayUtils.remove([\"a\", \"b\", \"c\"], 1) \u003d [\"a\", \"c\"]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3816,col 9)-(line 3816,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(T[], java.lang.Object)",
      "begin_line": 3844,
      "end_line": 3850,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, \"a\")            \u003d null\n     * ArrayUtils.removeElement([], \"a\")              \u003d []\n     * ArrayUtils.removeElement([\"a\"], \"b\")           \u003d [\"a\"]\n     * ArrayUtils.removeElement([\"a\", \"b\"], \"a\")      \u003d [\"b\"]\n     * ArrayUtils.removeElement([\"a\", \"b\", \"a\"], \"a\") \u003d [\"b\", \"a\"]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3845,col 9)-(line 3845,col 44)",
        "(line 3846,col 9)-(line 3848,col 9)",
        "(line 3849,col 9)-(line 3849,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(boolean[], int)",
      "begin_line": 3880,
      "end_line": 3882,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([true], 0)              \u003d []\n     * ArrayUtils.remove([true, false], 0)       \u003d [false]\n     * ArrayUtils.remove([true, false], 1)       \u003d [true]\n     * ArrayUtils.remove([true, true, false], 1) \u003d [true, false]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3881,col 9)-(line 3881,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(boolean[], boolean)",
      "begin_line": 3909,
      "end_line": 3915,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, true)                \u003d null\n     * ArrayUtils.removeElement([], true)                  \u003d []\n     * ArrayUtils.removeElement([true], false)             \u003d [true]\n     * ArrayUtils.removeElement([true, false], false)      \u003d [true]\n     * ArrayUtils.removeElement([true, false, true], true) \u003d [false, true]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3910,col 9)-(line 3910,col 44)",
        "(line 3911,col 9)-(line 3913,col 9)",
        "(line 3914,col 9)-(line 3914,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(byte[], int)",
      "begin_line": 3945,
      "end_line": 3947,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)          \u003d []\n     * ArrayUtils.remove([1, 0], 0)       \u003d [0]\n     * ArrayUtils.remove([1, 0], 1)       \u003d [1]\n     * ArrayUtils.remove([1, 0, 1], 1)    \u003d [1, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3946,col 9)-(line 3946,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(byte[], byte)",
      "begin_line": 3974,
      "end_line": 3980,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)        \u003d null\n     * ArrayUtils.removeElement([], 1)          \u003d []\n     * ArrayUtils.removeElement([1], 0)         \u003d [1]\n     * ArrayUtils.removeElement([1, 0], 0)      \u003d [1]\n     * ArrayUtils.removeElement([1, 0, 1], 1)   \u003d [0, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3975,col 9)-(line 3975,col 44)",
        "(line 3976,col 9)-(line 3978,col 9)",
        "(line 3979,col 9)-(line 3979,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(char[], int)",
      "begin_line": 4010,
      "end_line": 4012,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([\u0027a\u0027], 0)           \u003d []\n     * ArrayUtils.remove([\u0027a\u0027, \u0027b\u0027], 0)      \u003d [\u0027b\u0027]\n     * ArrayUtils.remove([\u0027a\u0027, \u0027b\u0027], 1)      \u003d [\u0027a\u0027]\n     * ArrayUtils.remove([\u0027a\u0027, \u0027b\u0027, \u0027c\u0027], 1) \u003d [\u0027a\u0027, \u0027c\u0027]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4011,col 9)-(line 4011,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(char[], char)",
      "begin_line": 4039,
      "end_line": 4045,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, \u0027a\u0027)            \u003d null\n     * ArrayUtils.removeElement([], \u0027a\u0027)              \u003d []\n     * ArrayUtils.removeElement([\u0027a\u0027], \u0027b\u0027)           \u003d [\u0027a\u0027]\n     * ArrayUtils.removeElement([\u0027a\u0027, \u0027b\u0027], \u0027a\u0027)      \u003d [\u0027b\u0027]\n     * ArrayUtils.removeElement([\u0027a\u0027, \u0027b\u0027, \u0027a\u0027], \u0027a\u0027) \u003d [\u0027b\u0027, \u0027a\u0027]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4040,col 9)-(line 4040,col 44)",
        "(line 4041,col 9)-(line 4043,col 9)",
        "(line 4044,col 9)-(line 4044,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(double[], int)",
      "begin_line": 4075,
      "end_line": 4077,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1.1], 0)           \u003d []\n     * ArrayUtils.remove([2.5, 6.0], 0)      \u003d [6.0]\n     * ArrayUtils.remove([2.5, 6.0], 1)      \u003d [2.5]\n     * ArrayUtils.remove([2.5, 6.0, 3.8], 1) \u003d [2.5, 3.8]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4076,col 9)-(line 4076,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(double[], double)",
      "begin_line": 4104,
      "end_line": 4110,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1.1)            \u003d null\n     * ArrayUtils.removeElement([], 1.1)              \u003d []\n     * ArrayUtils.removeElement([1.1], 1.2)           \u003d [1.1]\n     * ArrayUtils.removeElement([1.1, 2.3], 1.1)      \u003d [2.3]\n     * ArrayUtils.removeElement([1.1, 2.3, 1.1], 1.1) \u003d [2.3, 1.1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4105,col 9)-(line 4105,col 44)",
        "(line 4106,col 9)-(line 4108,col 9)",
        "(line 4109,col 9)-(line 4109,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(float[], int)",
      "begin_line": 4140,
      "end_line": 4142,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1.1], 0)           \u003d []\n     * ArrayUtils.remove([2.5, 6.0], 0)      \u003d [6.0]\n     * ArrayUtils.remove([2.5, 6.0], 1)      \u003d [2.5]\n     * ArrayUtils.remove([2.5, 6.0, 3.8], 1) \u003d [2.5, 3.8]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4141,col 9)-(line 4141,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(float[], float)",
      "begin_line": 4169,
      "end_line": 4175,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1.1)            \u003d null\n     * ArrayUtils.removeElement([], 1.1)              \u003d []\n     * ArrayUtils.removeElement([1.1], 1.2)           \u003d [1.1]\n     * ArrayUtils.removeElement([1.1, 2.3], 1.1)      \u003d [2.3]\n     * ArrayUtils.removeElement([1.1, 2.3, 1.1], 1.1) \u003d [2.3, 1.1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4170,col 9)-(line 4170,col 44)",
        "(line 4171,col 9)-(line 4173,col 9)",
        "(line 4174,col 9)-(line 4174,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(int[], int)",
      "begin_line": 4205,
      "end_line": 4207,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)         \u003d []\n     * ArrayUtils.remove([2, 6], 0)      \u003d [6]\n     * ArrayUtils.remove([2, 6], 1)      \u003d [2]\n     * ArrayUtils.remove([2, 6, 3], 1)   \u003d [2, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4206,col 9)-(line 4206,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(int[], int)",
      "begin_line": 4234,
      "end_line": 4240,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)      \u003d null\n     * ArrayUtils.removeElement([], 1)        \u003d []\n     * ArrayUtils.removeElement([1], 2)       \u003d [1]\n     * ArrayUtils.removeElement([1, 3], 1)    \u003d [3]\n     * ArrayUtils.removeElement([1, 3, 1], 1) \u003d [3, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4235,col 9)-(line 4235,col 44)",
        "(line 4236,col 9)-(line 4238,col 9)",
        "(line 4239,col 9)-(line 4239,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(long[], int)",
      "begin_line": 4270,
      "end_line": 4272,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)         \u003d []\n     * ArrayUtils.remove([2, 6], 0)      \u003d [6]\n     * ArrayUtils.remove([2, 6], 1)      \u003d [2]\n     * ArrayUtils.remove([2, 6, 3], 1)   \u003d [2, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4271,col 9)-(line 4271,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(long[], long)",
      "begin_line": 4299,
      "end_line": 4305,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)      \u003d null\n     * ArrayUtils.removeElement([], 1)        \u003d []\n     * ArrayUtils.removeElement([1], 2)       \u003d [1]\n     * ArrayUtils.removeElement([1, 3], 1)    \u003d [3]\n     * ArrayUtils.removeElement([1, 3, 1], 1) \u003d [3, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4300,col 9)-(line 4300,col 44)",
        "(line 4301,col 9)-(line 4303,col 9)",
        "(line 4304,col 9)-(line 4304,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(short[], int)",
      "begin_line": 4335,
      "end_line": 4337,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)         \u003d []\n     * ArrayUtils.remove([2, 6], 0)      \u003d [6]\n     * ArrayUtils.remove([2, 6], 1)      \u003d [2]\n     * ArrayUtils.remove([2, 6, 3], 1)   \u003d [2, 3]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4336,col 9)-(line 4336,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.removeElement(short[], short)",
      "begin_line": 4364,
      "end_line": 4370,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left\n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)      \u003d null\n     * ArrayUtils.removeElement([], 1)        \u003d []\n     * ArrayUtils.removeElement([1], 2)       \u003d [1]\n     * ArrayUtils.removeElement([1, 3], 1)    \u003d [3]\n     * ArrayUtils.removeElement([1, 3, 1], 1) \u003d [3, 1]\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4365,col 9)-(line 4365,col 44)",
        "(line 4366,col 9)-(line 4368,col 9)",
        "(line 4369,col 9)-(line 4369,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ArrayUtils.remove(java.lang.Object, int)",
      "begin_line": 4393,
      "end_line": 4406,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component\n     * type of the returned array is always the same as that of the input\n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range\n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4394,col 9)-(line 4394,col 38)",
        "(line 4395,col 9)-(line 4397,col 9)",
        "(line 4399,col 9)-(line 4399,col 91)",
        "(line 4400,col 9)-(line 4400,col 53)",
        "(line 4401,col 9)-(line 4403,col 9)",
        "(line 4405,col 9)-(line 4405,col 22)"
      ]
    }
  ]
}