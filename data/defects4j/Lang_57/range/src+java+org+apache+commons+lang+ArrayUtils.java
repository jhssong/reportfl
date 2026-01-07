{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/ArrayUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 50,
      "end_line": 4417,
      "comment": "\n * \u003cp\u003eOperations on arrays, primitive arrays (like \u003ccode\u003eint[]\u003c/code\u003e) and\n * primitive wrapper arrays (like \u003ccode\u003eInteger[]\u003c/code\u003e).\u003c/p\u003e\n * \n * \u003cp\u003eThis class tries to handle \u003ccode\u003enull\u003c/code\u003e input gracefully.\n * An exception will not be thrown for a \u003ccode\u003enull\u003c/code\u003e\n * array input. However, an Object array that contains a \u003ccode\u003enull\u003c/code\u003e\n * element may throw an exception. Each method documents its behaviour.\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @author Moritz Petersen\n * @author \u003ca href\u003d\"mailto:fredrik@westermarck.com\"\u003eFredrik Westermarck\u003c/a\u003e\n * @author Nikolay Metchev\n * @author Matthew Hawthorne\n * @author Tim O\u0027Brien\n * @author Pete Gieser\n * @author Gary Gregory\n * @author \u003ca href\u003d\"mailto:equinus100@hotmail.com\"\u003eAshwin S\u003c/a\u003e\n * @author Maarten Coene\n * @since 2.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang.ArrayUtils.ArrayUtils()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * \u003cp\u003eArrayUtils instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as \u003ccode\u003eArrayUtils.clone(new int[] {2})\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 144,col 7)-(line 144,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toString(java.lang.Object)",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * \u003cp\u003eOutputs an array as a String, treating \u003ccode\u003enull\u003c/code\u003e as an empty array.\u003c/p\u003e\n     *\n     * \u003cp\u003eMulti-dimensional arrays are handled correctly, including\n     * multi-dimensional primitive arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format is that of Java source code, for example \u003ccode\u003e{a,b}\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param array  the array to get a toString for, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a String representation of the array, \u0027{}\u0027 if null array input\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toString(java.lang.Object, java.lang.String)",
      "begin_line": 176,
      "end_line": 181,
      "comment": "\n     * \u003cp\u003eOutputs an array as a String handling \u003ccode\u003enull\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003cp\u003eMulti-dimensional arrays are handled correctly, including\n     * multi-dimensional primitive arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format is that of Java source code, for example \u003ccode\u003e{a,b}\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param array  the array to get a toString for, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param stringIfNull  the String to return if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @return a String representation of the array\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.hashCode(java.lang.Object)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * \u003cp\u003eGet a hashCode for an array handling multi-dimensional arrays correctly.\u003c/p\u003e\n     * \n     * \u003cp\u003eMulti-dimensional primitive arrays are also handled correctly by this method.\u003c/p\u003e\n     * \n     * @param array  the array to get a hashCode for, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a hashCode for the array, zero if null array input\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isEquals(java.lang.Object, java.lang.Object)",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * \u003cp\u003eCompares two arrays, using equals(), handling multi-dimensional arrays\n     * correctly.\u003c/p\u003e\n     * \n     * \u003cp\u003eMulti-dimensional primitive arrays are also handled correctly by this method.\u003c/p\u003e\n     * \n     * @param array1  the left hand array to compare, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2  the right hand array to compare, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the arrays are equal\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toMap(java.lang.Object[])",
      "begin_line": 236,
      "end_line": 261,
      "comment": "\n     * \u003cp\u003eConverts the given array into a {@link java.util.Map}. Each element of the array\n     * must be either a {@link java.util.Map.Entry} or an Array, containing at least two\n     * elements, where the first element is used as key and the second as\n     * value.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method can be used to initialize:\u003c/p\u003e\n     * \u003cpre\u003e\n     * // Create a Map mapping colors.\n     * Map colorMap \u003d MapUtils.toMap(new String[][] {{\n     *     {\"RED\", \"#FF0000\"},\n     *     {\"GREEN\", \"#00FF00\"},\n     *     {\"BLUE\", \"#0000FF\"}});\n     * \u003c/pre\u003e\n     * \n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  an array whose elements are either a {@link java.util.Map.Entry} or\n     *  an Array containing at least two elements, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eMap\u003c/code\u003e that was created from the array\n     * @throws IllegalArgumentException  if one element of this Array is\n     *  itself an Array containing less then two elements\n     * @throws IllegalArgumentException  if the array contains elements other\n     *  than {@link java.util.Map.Entry} and an Array\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 64)",
        "(line 241,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.clone(java.lang.Object[])",
      "begin_line": 277,
      "end_line": 282,
      "comment": "\n     * \u003cp\u003eShallow clones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe objects in the array are not cloned, thus there is no special\n     * handling for multi-dimensional arrays.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to shallow clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 281,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.clone(long[])",
      "begin_line": 293,
      "end_line": 298,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 297,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.clone(int[])",
      "begin_line": 309,
      "end_line": 314,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.clone(short[])",
      "begin_line": 325,
      "end_line": 330,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.clone(char[])",
      "begin_line": 341,
      "end_line": 346,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.clone(byte[])",
      "begin_line": 357,
      "end_line": 362,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 361,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.clone(double[])",
      "begin_line": 373,
      "end_line": 378,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 377,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.clone(float[])",
      "begin_line": 389,
      "end_line": 394,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 393,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.clone(boolean[])",
      "begin_line": 405,
      "end_line": 410,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 409,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.subarray(java.lang.Object[], int, int)",
      "begin_line": 441,
      "end_line": 459,
      "comment": "\n     * \u003cp\u003eProduces a new array containing the elements between\n     * the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe component type of the subarray is always the same as\n     * that of the input array. Thus, if the input is an array of type\n     * \u003ccode\u003eDate\u003c/code\u003e, the following usage is envisaged:\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Date[] someDates \u003d (Date[])ArrayUtils.subarray(allDates, 2, 5);\n     * \u003c/pre\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 450,col 9)",
        "(line 451,col 9)-(line 451,col 62)",
        "(line 452,col 9)-(line 452,col 57)",
        "(line 453,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 456,col 72)",
        "(line 457,col 9)-(line 457,col 75)",
        "(line 458,col 9)-(line 458,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.subarray(long[], int, int)",
      "begin_line": 480,
      "end_line": 498,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003elong\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 486,col 9)",
        "(line 487,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 490,col 62)",
        "(line 491,col 9)-(line 493,col 9)",
        "(line 495,col 9)-(line 495,col 44)",
        "(line 496,col 9)-(line 496,col 75)",
        "(line 497,col 9)-(line 497,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.subarray(int[], int, int)",
      "begin_line": 519,
      "end_line": 537,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003eint\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 525,col 9)",
        "(line 526,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 529,col 62)",
        "(line 530,col 9)-(line 532,col 9)",
        "(line 534,col 9)-(line 534,col 42)",
        "(line 535,col 9)-(line 535,col 75)",
        "(line 536,col 9)-(line 536,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.subarray(short[], int, int)",
      "begin_line": 558,
      "end_line": 576,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003eshort\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 561,col 9)",
        "(line 562,col 9)-(line 564,col 9)",
        "(line 565,col 9)-(line 567,col 9)",
        "(line 568,col 9)-(line 568,col 62)",
        "(line 569,col 9)-(line 571,col 9)",
        "(line 573,col 9)-(line 573,col 46)",
        "(line 574,col 9)-(line 574,col 75)",
        "(line 575,col 9)-(line 575,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.subarray(char[], int, int)",
      "begin_line": 597,
      "end_line": 615,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003echar\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 598,col 9)-(line 600,col 9)",
        "(line 601,col 9)-(line 603,col 9)",
        "(line 604,col 9)-(line 606,col 9)",
        "(line 607,col 9)-(line 607,col 62)",
        "(line 608,col 9)-(line 610,col 9)",
        "(line 612,col 9)-(line 612,col 44)",
        "(line 613,col 9)-(line 613,col 75)",
        "(line 614,col 9)-(line 614,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.subarray(byte[], int, int)",
      "begin_line": 636,
      "end_line": 654,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003ebyte\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 639,col 9)",
        "(line 640,col 9)-(line 642,col 9)",
        "(line 643,col 9)-(line 645,col 9)",
        "(line 646,col 9)-(line 646,col 62)",
        "(line 647,col 9)-(line 649,col 9)",
        "(line 651,col 9)-(line 651,col 44)",
        "(line 652,col 9)-(line 652,col 75)",
        "(line 653,col 9)-(line 653,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.subarray(double[], int, int)",
      "begin_line": 675,
      "end_line": 693,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003edouble\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 676,col 9)-(line 678,col 9)",
        "(line 679,col 9)-(line 681,col 9)",
        "(line 682,col 9)-(line 684,col 9)",
        "(line 685,col 9)-(line 685,col 62)",
        "(line 686,col 9)-(line 688,col 9)",
        "(line 690,col 9)-(line 690,col 48)",
        "(line 691,col 9)-(line 691,col 75)",
        "(line 692,col 9)-(line 692,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.subarray(float[], int, int)",
      "begin_line": 714,
      "end_line": 732,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003efloat\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 715,col 9)-(line 717,col 9)",
        "(line 718,col 9)-(line 720,col 9)",
        "(line 721,col 9)-(line 723,col 9)",
        "(line 724,col 9)-(line 724,col 62)",
        "(line 725,col 9)-(line 727,col 9)",
        "(line 729,col 9)-(line 729,col 46)",
        "(line 730,col 9)-(line 730,col 75)",
        "(line 731,col 9)-(line 731,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.subarray(boolean[], int, int)",
      "begin_line": 753,
      "end_line": 771,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003eboolean\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 754,col 9)-(line 756,col 9)",
        "(line 757,col 9)-(line 759,col 9)",
        "(line 760,col 9)-(line 762,col 9)",
        "(line 763,col 9)-(line 763,col 62)",
        "(line 764,col 9)-(line 766,col 9)",
        "(line 768,col 9)-(line 768,col 50)",
        "(line 769,col 9)-(line 769,col 75)",
        "(line 770,col 9)-(line 770,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isSameLength(java.lang.Object[], java.lang.Object[])",
      "begin_line": 786,
      "end_line": 793,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\n     *\n     * \u003cp\u003eAny multi-dimensional aspects of the arrays are ignored.\u003c/p\u003e\n     * \n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 787,col 9)-(line 791,col 9)",
        "(line 792,col 9)-(line 792,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isSameLength(long[], long[])",
      "begin_line": 804,
      "end_line": 811,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 805,col 9)-(line 809,col 9)",
        "(line 810,col 9)-(line 810,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isSameLength(int[], int[])",
      "begin_line": 822,
      "end_line": 829,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 823,col 9)-(line 827,col 9)",
        "(line 828,col 9)-(line 828,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isSameLength(short[], short[])",
      "begin_line": 840,
      "end_line": 847,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 841,col 9)-(line 845,col 9)",
        "(line 846,col 9)-(line 846,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isSameLength(char[], char[])",
      "begin_line": 858,
      "end_line": 865,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 859,col 9)-(line 863,col 9)",
        "(line 864,col 9)-(line 864,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isSameLength(byte[], byte[])",
      "begin_line": 876,
      "end_line": 883,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 877,col 9)-(line 881,col 9)",
        "(line 882,col 9)-(line 882,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isSameLength(double[], double[])",
      "begin_line": 894,
      "end_line": 901,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 895,col 9)-(line 899,col 9)",
        "(line 900,col 9)-(line 900,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isSameLength(float[], float[])",
      "begin_line": 912,
      "end_line": 919,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 913,col 9)-(line 917,col 9)",
        "(line 918,col 9)-(line 918,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isSameLength(boolean[], boolean[])",
      "begin_line": 930,
      "end_line": 937,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 931,col 9)-(line 935,col 9)",
        "(line 936,col 9)-(line 936,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.getLength(java.lang.Object)",
      "begin_line": 960,
      "end_line": 965,
      "comment": "\n     * \u003cp\u003eReturns the length of the specified array.\n     * This method can deal with \u003ccode\u003eObject\u003c/code\u003e arrays and with primitive arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003e0\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.getLength(null)            \u003d 0\n     * ArrayUtils.getLength([])              \u003d 0\n     * ArrayUtils.getLength([null])          \u003d 1\n     * ArrayUtils.getLength([true, false])   \u003d 2\n     * ArrayUtils.getLength([1, 2, 3])       \u003d 3\n     * ArrayUtils.getLength([\"a\", \"b\", \"c\"]) \u003d 3\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to retrieve the length from, may be null\n     * @return The length of the array, or \u003ccode\u003e0\u003c/code\u003e if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the object arguement is not an array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 961,col 9)-(line 963,col 9)",
        "(line 964,col 9)-(line 964,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isSameType(java.lang.Object, java.lang.Object)",
      "begin_line": 976,
      "end_line": 981,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same type taking into account\n     * multi-dimensional arrays.\u003c/p\u003e\n     * \n     * @param array1 the first array, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if type of arrays matches\n     * @throws IllegalArgumentException if either array is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 977,col 9)-(line 979,col 9)",
        "(line 980,col 9)-(line 980,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.reverse(java.lang.Object[])",
      "begin_line": 994,
      "end_line": 1008,
      "comment": " \n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThere is no special handling for multi-dimensional arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 995,col 9)-(line 997,col 9)",
        "(line 998,col 9)-(line 998,col 18)",
        "(line 999,col 9)-(line 999,col 33)",
        "(line 1000,col 9)-(line 1000,col 19)",
        "(line 1001,col 9)-(line 1007,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.reverse(long[])",
      "begin_line": 1017,
      "end_line": 1031,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1018,col 9)-(line 1020,col 9)",
        "(line 1021,col 9)-(line 1021,col 18)",
        "(line 1022,col 9)-(line 1022,col 33)",
        "(line 1023,col 9)-(line 1023,col 17)",
        "(line 1024,col 9)-(line 1030,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.reverse(int[])",
      "begin_line": 1040,
      "end_line": 1054,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1041,col 9)-(line 1043,col 9)",
        "(line 1044,col 9)-(line 1044,col 18)",
        "(line 1045,col 9)-(line 1045,col 33)",
        "(line 1046,col 9)-(line 1046,col 16)",
        "(line 1047,col 9)-(line 1053,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.reverse(short[])",
      "begin_line": 1063,
      "end_line": 1077,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1064,col 9)-(line 1066,col 9)",
        "(line 1067,col 9)-(line 1067,col 18)",
        "(line 1068,col 9)-(line 1068,col 33)",
        "(line 1069,col 9)-(line 1069,col 18)",
        "(line 1070,col 9)-(line 1076,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.reverse(char[])",
      "begin_line": 1086,
      "end_line": 1100,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1087,col 9)-(line 1089,col 9)",
        "(line 1090,col 9)-(line 1090,col 18)",
        "(line 1091,col 9)-(line 1091,col 33)",
        "(line 1092,col 9)-(line 1092,col 17)",
        "(line 1093,col 9)-(line 1099,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.reverse(byte[])",
      "begin_line": 1109,
      "end_line": 1123,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1110,col 9)-(line 1112,col 9)",
        "(line 1113,col 9)-(line 1113,col 18)",
        "(line 1114,col 9)-(line 1114,col 33)",
        "(line 1115,col 9)-(line 1115,col 17)",
        "(line 1116,col 9)-(line 1122,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.reverse(double[])",
      "begin_line": 1132,
      "end_line": 1146,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1133,col 9)-(line 1135,col 9)",
        "(line 1136,col 9)-(line 1136,col 18)",
        "(line 1137,col 9)-(line 1137,col 33)",
        "(line 1138,col 9)-(line 1138,col 19)",
        "(line 1139,col 9)-(line 1145,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.reverse(float[])",
      "begin_line": 1155,
      "end_line": 1169,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1156,col 9)-(line 1158,col 9)",
        "(line 1159,col 9)-(line 1159,col 18)",
        "(line 1160,col 9)-(line 1160,col 33)",
        "(line 1161,col 9)-(line 1161,col 18)",
        "(line 1162,col 9)-(line 1168,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.reverse(boolean[])",
      "begin_line": 1178,
      "end_line": 1192,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1179,col 9)-(line 1181,col 9)",
        "(line 1182,col 9)-(line 1182,col 18)",
        "(line 1183,col 9)-(line 1183,col 33)",
        "(line 1184,col 9)-(line 1184,col 20)",
        "(line 1185,col 9)-(line 1191,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(java.lang.Object[], java.lang.Object)",
      "begin_line": 1209,
      "end_line": 1211,
      "comment": "\n     * \u003cp\u003eFinds the index of the given object in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param objectToFind  the object to find, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the index of the object within the array, \n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1210,col 9)-(line 1210,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(java.lang.Object[], java.lang.Object, int)",
      "begin_line": 1227,
      "end_line": 1248,
      "comment": "\n     * \u003cp\u003eFinds the index of the given object in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param objectToFind  the object to find, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param startIndex  the index to start searching at\n     * @return the index of the object within the array starting at the index,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1228,col 9)-(line 1230,col 9)",
        "(line 1231,col 9)-(line 1233,col 9)",
        "(line 1234,col 9)-(line 1246,col 9)",
        "(line 1247,col 9)-(line 1247,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(java.lang.Object[], java.lang.Object)",
      "begin_line": 1260,
      "end_line": 1262,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given object within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param objectToFind  the object to find, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the last index of the object within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1261,col 9)-(line 1261,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(java.lang.Object[], java.lang.Object, int)",
      "begin_line": 1278,
      "end_line": 1301,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given object in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than\n     * the array length will search from the end of the array.\u003c/p\u003e\n     * \n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param objectToFind  the object to find, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the object within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1279,col 9)-(line 1281,col 9)",
        "(line 1282,col 9)-(line 1286,col 9)",
        "(line 1287,col 9)-(line 1299,col 9)",
        "(line 1300,col 9)-(line 1300,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.contains(java.lang.Object[], java.lang.Object)",
      "begin_line": 1312,
      "end_line": 1314,
      "comment": "\n     * \u003cp\u003eChecks if the object is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     * \n     * @param array  the array to search through\n     * @param objectToFind  the object to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 1313,col 9)-(line 1313,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(long[], long)",
      "begin_line": 1328,
      "end_line": 1330,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1329,col 9)-(line 1329,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(long[], long, int)",
      "begin_line": 1346,
      "end_line": 1359,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1347,col 9)-(line 1349,col 9)",
        "(line 1350,col 9)-(line 1352,col 9)",
        "(line 1353,col 9)-(line 1357,col 9)",
        "(line 1358,col 9)-(line 1358,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(long[], long)",
      "begin_line": 1371,
      "end_line": 1373,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1372,col 9)-(line 1372,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(long[], long, int)",
      "begin_line": 1389,
      "end_line": 1404,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     * \n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1390,col 9)-(line 1392,col 9)",
        "(line 1393,col 9)-(line 1397,col 9)",
        "(line 1398,col 9)-(line 1402,col 9)",
        "(line 1403,col 9)-(line 1403,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.contains(long[], long)",
      "begin_line": 1415,
      "end_line": 1417,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     * \n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 1416,col 9)-(line 1416,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(int[], int)",
      "begin_line": 1431,
      "end_line": 1433,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1432,col 9)-(line 1432,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(int[], int, int)",
      "begin_line": 1449,
      "end_line": 1462,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1450,col 9)-(line 1452,col 9)",
        "(line 1453,col 9)-(line 1455,col 9)",
        "(line 1456,col 9)-(line 1460,col 9)",
        "(line 1461,col 9)-(line 1461,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(int[], int)",
      "begin_line": 1474,
      "end_line": 1476,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1475,col 9)-(line 1475,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(int[], int, int)",
      "begin_line": 1492,
      "end_line": 1507,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     * \n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1493,col 9)-(line 1495,col 9)",
        "(line 1496,col 9)-(line 1500,col 9)",
        "(line 1501,col 9)-(line 1505,col 9)",
        "(line 1506,col 9)-(line 1506,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.contains(int[], int)",
      "begin_line": 1518,
      "end_line": 1520,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     * \n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 1519,col 9)-(line 1519,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(short[], short)",
      "begin_line": 1534,
      "end_line": 1536,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1535,col 9)-(line 1535,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(short[], short, int)",
      "begin_line": 1552,
      "end_line": 1565,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1553,col 9)-(line 1555,col 9)",
        "(line 1556,col 9)-(line 1558,col 9)",
        "(line 1559,col 9)-(line 1563,col 9)",
        "(line 1564,col 9)-(line 1564,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(short[], short)",
      "begin_line": 1577,
      "end_line": 1579,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1578,col 9)-(line 1578,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(short[], short, int)",
      "begin_line": 1595,
      "end_line": 1610,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the \n     * array length will search from the end of the array.\u003c/p\u003e\n     * \n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1596,col 9)-(line 1598,col 9)",
        "(line 1599,col 9)-(line 1603,col 9)",
        "(line 1604,col 9)-(line 1608,col 9)",
        "(line 1609,col 9)-(line 1609,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.contains(short[], short)",
      "begin_line": 1621,
      "end_line": 1623,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     * \n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 1622,col 9)-(line 1622,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(char[], char)",
      "begin_line": 1638,
      "end_line": 1640,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1639,col 9)-(line 1639,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(char[], char, int)",
      "begin_line": 1657,
      "end_line": 1670,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1658,col 9)-(line 1660,col 9)",
        "(line 1661,col 9)-(line 1663,col 9)",
        "(line 1664,col 9)-(line 1668,col 9)",
        "(line 1669,col 9)-(line 1669,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(char[], char)",
      "begin_line": 1683,
      "end_line": 1685,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1684,col 9)-(line 1684,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(char[], char, int)",
      "begin_line": 1702,
      "end_line": 1717,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     * \n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1703,col 9)-(line 1705,col 9)",
        "(line 1706,col 9)-(line 1710,col 9)",
        "(line 1711,col 9)-(line 1715,col 9)",
        "(line 1716,col 9)-(line 1716,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.contains(char[], char)",
      "begin_line": 1729,
      "end_line": 1731,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     * \n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1730,col 9)-(line 1730,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(byte[], byte)",
      "begin_line": 1745,
      "end_line": 1747,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1746,col 9)-(line 1746,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(byte[], byte, int)",
      "begin_line": 1763,
      "end_line": 1776,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1764,col 9)-(line 1766,col 9)",
        "(line 1767,col 9)-(line 1769,col 9)",
        "(line 1770,col 9)-(line 1774,col 9)",
        "(line 1775,col 9)-(line 1775,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(byte[], byte)",
      "begin_line": 1788,
      "end_line": 1790,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1789,col 9)-(line 1789,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(byte[], byte, int)",
      "begin_line": 1806,
      "end_line": 1821,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the \n     * array length will search from the end of the array.\u003c/p\u003e\n     * \n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1807,col 9)-(line 1809,col 9)",
        "(line 1810,col 9)-(line 1814,col 9)",
        "(line 1815,col 9)-(line 1819,col 9)",
        "(line 1820,col 9)-(line 1820,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.contains(byte[], byte)",
      "begin_line": 1832,
      "end_line": 1834,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     * \n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 1833,col 9)-(line 1833,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(double[], double)",
      "begin_line": 1848,
      "end_line": 1850,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1849,col 9)-(line 1849,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(double[], double, double)",
      "begin_line": 1865,
      "end_line": 1867,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value within a given tolerance in the array.\n     * This method will return the index of the first value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param tolerance tolerance of the search\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1866,col 9)-(line 1866,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(double[], double, int)",
      "begin_line": 1883,
      "end_line": 1896,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1884,col 9)-(line 1886,col 9)",
        "(line 1887,col 9)-(line 1889,col 9)",
        "(line 1890,col 9)-(line 1894,col 9)",
        "(line 1895,col 9)-(line 1895,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(double[], double, int, double)",
      "begin_line": 1915,
      "end_line": 1930,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\n     * This method will return the index of the first value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @param tolerance tolerance of the search\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1916,col 9)-(line 1918,col 9)",
        "(line 1919,col 9)-(line 1921,col 9)",
        "(line 1922,col 9)-(line 1922,col 45)",
        "(line 1923,col 9)-(line 1923,col 45)",
        "(line 1924,col 9)-(line 1928,col 9)",
        "(line 1929,col 9)-(line 1929,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(double[], double)",
      "begin_line": 1942,
      "end_line": 1944,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1943,col 9)-(line 1943,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(double[], double, double)",
      "begin_line": 1959,
      "end_line": 1961,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within a given tolerance in the array.\n     * This method will return the index of the last value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param tolerance tolerance of the search\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1960,col 9)-(line 1960,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(double[], double, int)",
      "begin_line": 1977,
      "end_line": 1992,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the \n     * array length will search from the end of the array.\u003c/p\u003e\n     * \n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1978,col 9)-(line 1980,col 9)",
        "(line 1981,col 9)-(line 1985,col 9)",
        "(line 1986,col 9)-(line 1990,col 9)",
        "(line 1991,col 9)-(line 1991,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(double[], double, int, double)",
      "begin_line": 2011,
      "end_line": 2028,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\n     * This method will return the index of the last value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the \n     * array length will search from the end of the array.\u003c/p\u003e\n     * \n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @param tolerance  search for value within plus/minus this amount\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2012,col 9)-(line 2014,col 9)",
        "(line 2015,col 9)-(line 2019,col 9)",
        "(line 2020,col 9)-(line 2020,col 45)",
        "(line 2021,col 9)-(line 2021,col 45)",
        "(line 2022,col 9)-(line 2026,col 9)",
        "(line 2027,col 9)-(line 2027,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.contains(double[], double)",
      "begin_line": 2039,
      "end_line": 2041,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     * \n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 2040,col 9)-(line 2040,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.contains(double[], double, double)",
      "begin_line": 2056,
      "end_line": 2058,
      "comment": "\n     * \u003cp\u003eChecks if a value falling within the given tolerance is in the\n     * given array.  If the array contains a value within the inclusive range \n     * defined by (value - tolerance) to (value + tolerance).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array\n     * is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search\n     * @param valueToFind  the value to find\n     * @param tolerance  the array contains the tolerance of the search\n     * @return true if value falling within tolerance is in array\n     ",
      "child_ranges": [
        "(line 2057,col 9)-(line 2057,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(float[], float)",
      "begin_line": 2072,
      "end_line": 2074,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2073,col 9)-(line 2073,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(float[], float, int)",
      "begin_line": 2090,
      "end_line": 2103,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2091,col 9)-(line 2093,col 9)",
        "(line 2094,col 9)-(line 2096,col 9)",
        "(line 2097,col 9)-(line 2101,col 9)",
        "(line 2102,col 9)-(line 2102,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(float[], float)",
      "begin_line": 2115,
      "end_line": 2117,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2116,col 9)-(line 2116,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(float[], float, int)",
      "begin_line": 2133,
      "end_line": 2148,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the \n     * array length will search from the end of the array.\u003c/p\u003e\n     * \n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2134,col 9)-(line 2136,col 9)",
        "(line 2137,col 9)-(line 2141,col 9)",
        "(line 2142,col 9)-(line 2146,col 9)",
        "(line 2147,col 9)-(line 2147,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.contains(float[], float)",
      "begin_line": 2159,
      "end_line": 2161,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     * \n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 2160,col 9)-(line 2160,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(boolean[], boolean)",
      "begin_line": 2175,
      "end_line": 2177,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2176,col 9)-(line 2176,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(boolean[], boolean, int)",
      "begin_line": 2194,
      "end_line": 2207,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e\n     *  array input\n     ",
      "child_ranges": [
        "(line 2195,col 9)-(line 2197,col 9)",
        "(line 2198,col 9)-(line 2200,col 9)",
        "(line 2201,col 9)-(line 2205,col 9)",
        "(line 2206,col 9)-(line 2206,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(boolean[], boolean)",
      "begin_line": 2220,
      "end_line": 2222,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if \n     * \u003ccode\u003enull\u003c/code\u003e array input.\u003c/p\u003e\n     * \n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2221,col 9)-(line 2221,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(boolean[], boolean, int)",
      "begin_line": 2238,
      "end_line": 2253,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than \n     * the array length will search from the end of the array.\u003c/p\u003e\n     * \n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2239,col 9)-(line 2241,col 9)",
        "(line 2242,col 9)-(line 2246,col 9)",
        "(line 2247,col 9)-(line 2251,col 9)",
        "(line 2252,col 9)-(line 2252,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.contains(boolean[], boolean)",
      "begin_line": 2264,
      "end_line": 2266,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     * \n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 2265,col 9)-(line 2265,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Character[])",
      "begin_line": 2282,
      "end_line": 2293,
      "comment": "\n     * \u003cp\u003eConverts an array of object Characters to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eCharacter\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003echar\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2283,col 9)-(line 2287,col 9)",
        "(line 2288,col 9)-(line 2288,col 53)",
        "(line 2289,col 9)-(line 2291,col 9)",
        "(line 2292,col 9)-(line 2292,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Character[], char)",
      "begin_line": 2304,
      "end_line": 2316,
      "comment": "\n     * \u003cp\u003eConverts an array of object Character to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eCharacter\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003echar\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2305,col 9)-(line 2309,col 9)",
        "(line 2310,col 9)-(line 2310,col 53)",
        "(line 2311,col 9)-(line 2314,col 9)",
        "(line 2315,col 9)-(line 2315,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toObject(char[])",
      "begin_line": 2326,
      "end_line": 2337,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive chars to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array a \u003ccode\u003echar\u003c/code\u003e array\n     * @return a \u003ccode\u003eCharacter\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2327,col 9)-(line 2331,col 9)",
        "(line 2332,col 9)-(line 2332,col 63)",
        "(line 2333,col 9)-(line 2335,col 9)",
        "(line 2336,col 9)-(line 2336,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Long[])",
      "begin_line": 2350,
      "end_line": 2361,
      "comment": "\n     * \u003cp\u003eConverts an array of object Longs to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eLong\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003elong\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2351,col 9)-(line 2355,col 9)",
        "(line 2356,col 9)-(line 2356,col 53)",
        "(line 2357,col 9)-(line 2359,col 9)",
        "(line 2360,col 9)-(line 2360,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Long[], long)",
      "begin_line": 2372,
      "end_line": 2384,
      "comment": "\n     * \u003cp\u003eConverts an array of object Long to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eLong\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003elong\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2373,col 9)-(line 2377,col 9)",
        "(line 2378,col 9)-(line 2378,col 53)",
        "(line 2379,col 9)-(line 2382,col 9)",
        "(line 2383,col 9)-(line 2383,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toObject(long[])",
      "begin_line": 2394,
      "end_line": 2405,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive longs to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003elong\u003c/code\u003e array\n     * @return a \u003ccode\u003eLong\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2395,col 9)-(line 2399,col 9)",
        "(line 2400,col 9)-(line 2400,col 53)",
        "(line 2401,col 9)-(line 2403,col 9)",
        "(line 2404,col 9)-(line 2404,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Integer[])",
      "begin_line": 2418,
      "end_line": 2429,
      "comment": "\n     * \u003cp\u003eConverts an array of object Integers to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eInteger\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return an \u003ccode\u003eint\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2419,col 9)-(line 2423,col 9)",
        "(line 2424,col 9)-(line 2424,col 51)",
        "(line 2425,col 9)-(line 2427,col 9)",
        "(line 2428,col 9)-(line 2428,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Integer[], int)",
      "begin_line": 2440,
      "end_line": 2452,
      "comment": "\n     * \u003cp\u003eConverts an array of object Integer to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eInteger\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return an \u003ccode\u003eint\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2441,col 9)-(line 2445,col 9)",
        "(line 2446,col 9)-(line 2446,col 51)",
        "(line 2447,col 9)-(line 2450,col 9)",
        "(line 2451,col 9)-(line 2451,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toObject(int[])",
      "begin_line": 2462,
      "end_line": 2473,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive ints to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  an \u003ccode\u003eint\u003c/code\u003e array\n     * @return an \u003ccode\u003eInteger\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2463,col 9)-(line 2467,col 9)",
        "(line 2468,col 9)-(line 2468,col 59)",
        "(line 2469,col 9)-(line 2471,col 9)",
        "(line 2472,col 9)-(line 2472,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Short[])",
      "begin_line": 2486,
      "end_line": 2497,
      "comment": "\n     * \u003cp\u003eConverts an array of object Shorts to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eShort\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003ebyte\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2487,col 9)-(line 2491,col 9)",
        "(line 2492,col 9)-(line 2492,col 55)",
        "(line 2493,col 9)-(line 2495,col 9)",
        "(line 2496,col 9)-(line 2496,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Short[], short)",
      "begin_line": 2508,
      "end_line": 2520,
      "comment": "\n     * \u003cp\u003eConverts an array of object Short to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eShort\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003ebyte\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2509,col 9)-(line 2513,col 9)",
        "(line 2514,col 9)-(line 2514,col 55)",
        "(line 2515,col 9)-(line 2518,col 9)",
        "(line 2519,col 9)-(line 2519,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toObject(short[])",
      "begin_line": 2530,
      "end_line": 2541,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive shorts to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eshort\u003c/code\u003e array\n     * @return a \u003ccode\u003eShort\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2531,col 9)-(line 2535,col 9)",
        "(line 2536,col 9)-(line 2536,col 55)",
        "(line 2537,col 9)-(line 2539,col 9)",
        "(line 2540,col 9)-(line 2540,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Byte[])",
      "begin_line": 2554,
      "end_line": 2565,
      "comment": "\n     * \u003cp\u003eConverts an array of object Bytes to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eByte\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003ebyte\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2555,col 9)-(line 2559,col 9)",
        "(line 2560,col 9)-(line 2560,col 53)",
        "(line 2561,col 9)-(line 2563,col 9)",
        "(line 2564,col 9)-(line 2564,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Byte[], byte)",
      "begin_line": 2576,
      "end_line": 2588,
      "comment": "\n     * \u003cp\u003eConverts an array of object Bytes to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eByte\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003ebyte\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2577,col 9)-(line 2581,col 9)",
        "(line 2582,col 9)-(line 2582,col 53)",
        "(line 2583,col 9)-(line 2586,col 9)",
        "(line 2587,col 9)-(line 2587,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toObject(byte[])",
      "begin_line": 2598,
      "end_line": 2609,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive bytes to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003ebyte\u003c/code\u003e array\n     * @return a \u003ccode\u003eByte\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2599,col 9)-(line 2603,col 9)",
        "(line 2604,col 9)-(line 2604,col 53)",
        "(line 2605,col 9)-(line 2607,col 9)",
        "(line 2608,col 9)-(line 2608,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Double[])",
      "begin_line": 2622,
      "end_line": 2633,
      "comment": "\n     * \u003cp\u003eConverts an array of object Doubles to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eDouble\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003edouble\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2623,col 9)-(line 2627,col 9)",
        "(line 2628,col 9)-(line 2628,col 57)",
        "(line 2629,col 9)-(line 2631,col 9)",
        "(line 2632,col 9)-(line 2632,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Double[], double)",
      "begin_line": 2644,
      "end_line": 2656,
      "comment": "\n     * \u003cp\u003eConverts an array of object Doubles to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eDouble\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003edouble\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2645,col 9)-(line 2649,col 9)",
        "(line 2650,col 9)-(line 2650,col 57)",
        "(line 2651,col 9)-(line 2654,col 9)",
        "(line 2655,col 9)-(line 2655,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toObject(double[])",
      "begin_line": 2666,
      "end_line": 2677,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive doubles to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003edouble\u003c/code\u003e array\n     * @return a \u003ccode\u003eDouble\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2667,col 9)-(line 2671,col 9)",
        "(line 2672,col 9)-(line 2672,col 57)",
        "(line 2673,col 9)-(line 2675,col 9)",
        "(line 2676,col 9)-(line 2676,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Float[])",
      "begin_line": 2690,
      "end_line": 2701,
      "comment": "\n     * \u003cp\u003eConverts an array of object Floats to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eFloat\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003efloat\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2691,col 9)-(line 2695,col 9)",
        "(line 2696,col 9)-(line 2696,col 55)",
        "(line 2697,col 9)-(line 2699,col 9)",
        "(line 2700,col 9)-(line 2700,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Float[], float)",
      "begin_line": 2712,
      "end_line": 2724,
      "comment": "\n     * \u003cp\u003eConverts an array of object Floats to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eFloat\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003efloat\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2713,col 9)-(line 2717,col 9)",
        "(line 2718,col 9)-(line 2718,col 55)",
        "(line 2719,col 9)-(line 2722,col 9)",
        "(line 2723,col 9)-(line 2723,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toObject(float[])",
      "begin_line": 2734,
      "end_line": 2745,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive floats to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003efloat\u003c/code\u003e array\n     * @return a \u003ccode\u003eFloat\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2735,col 9)-(line 2739,col 9)",
        "(line 2740,col 9)-(line 2740,col 55)",
        "(line 2741,col 9)-(line 2743,col 9)",
        "(line 2744,col 9)-(line 2744,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Boolean[])",
      "begin_line": 2758,
      "end_line": 2769,
      "comment": "\n     * \u003cp\u003eConverts an array of object Booleans to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eBoolean\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eboolean\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2759,col 9)-(line 2763,col 9)",
        "(line 2764,col 9)-(line 2764,col 59)",
        "(line 2765,col 9)-(line 2767,col 9)",
        "(line 2768,col 9)-(line 2768,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Boolean[], boolean)",
      "begin_line": 2780,
      "end_line": 2792,
      "comment": "\n     * \u003cp\u003eConverts an array of object Booleans to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eBoolean\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003eboolean\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2781,col 9)-(line 2785,col 9)",
        "(line 2786,col 9)-(line 2786,col 59)",
        "(line 2787,col 9)-(line 2790,col 9)",
        "(line 2791,col 9)-(line 2791,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toObject(boolean[])",
      "begin_line": 2802,
      "end_line": 2813,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive booleans to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eboolean\u003c/code\u003e array\n     * @return a \u003ccode\u003eBoolean\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2803,col 9)-(line 2807,col 9)",
        "(line 2808,col 9)-(line 2808,col 59)",
        "(line 2809,col 9)-(line 2811,col 9)",
        "(line 2812,col 9)-(line 2812,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isEmpty(java.lang.Object[])",
      "begin_line": 2823,
      "end_line": 2828,
      "comment": "\n     * \u003cp\u003eChecks if an array of Objects is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2824,col 9)-(line 2826,col 9)",
        "(line 2827,col 9)-(line 2827,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isEmpty(long[])",
      "begin_line": 2837,
      "end_line": 2842,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive longs is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2838,col 9)-(line 2840,col 9)",
        "(line 2841,col 9)-(line 2841,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isEmpty(int[])",
      "begin_line": 2851,
      "end_line": 2856,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive ints is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2852,col 9)-(line 2854,col 9)",
        "(line 2855,col 9)-(line 2855,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isEmpty(short[])",
      "begin_line": 2865,
      "end_line": 2870,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive shorts is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2866,col 9)-(line 2868,col 9)",
        "(line 2869,col 9)-(line 2869,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isEmpty(char[])",
      "begin_line": 2879,
      "end_line": 2884,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive chars is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2880,col 9)-(line 2882,col 9)",
        "(line 2883,col 9)-(line 2883,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isEmpty(byte[])",
      "begin_line": 2893,
      "end_line": 2898,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive bytes is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2894,col 9)-(line 2896,col 9)",
        "(line 2897,col 9)-(line 2897,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isEmpty(double[])",
      "begin_line": 2907,
      "end_line": 2912,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive doubles is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2908,col 9)-(line 2910,col 9)",
        "(line 2911,col 9)-(line 2911,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isEmpty(float[])",
      "begin_line": 2921,
      "end_line": 2926,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive floats is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2922,col 9)-(line 2924,col 9)",
        "(line 2925,col 9)-(line 2925,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isEmpty(boolean[])",
      "begin_line": 2935,
      "end_line": 2940,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive booleans is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2936,col 9)-(line 2938,col 9)",
        "(line 2939,col 9)-(line 2939,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.addAll(java.lang.Object[], java.lang.Object[])",
      "begin_line": 2963,
      "end_line": 2974,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(null, null)     \u003d null\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * ArrayUtils.addAll([null], [null]) \u003d [null, null]\n     * ArrayUtils.addAll([\"a\", \"b\", \"c\"], [\"1\", \"2\", \"3\"]) \u003d [\"a\", \"b\", \"c\", \"1\", \"2\", \"3\"]\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2  the second array whose elements are added to the new array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return The new array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e array inputs. \n     *      The type of the new array is the type of the first array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2964,col 9)-(line 2968,col 9)",
        "(line 2969,col 9)-(line 2970,col 91)",
        "(line 2971,col 9)-(line 2971,col 67)",
        "(line 2972,col 9)-(line 2972,col 79)",
        "(line 2973,col 9)-(line 2973,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.addAll(boolean[], boolean[])",
      "begin_line": 2993,
      "end_line": 3003,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new boolean[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2994,col 9)-(line 2998,col 9)",
        "(line 2999,col 9)-(line 2999,col 75)",
        "(line 3000,col 9)-(line 3000,col 67)",
        "(line 3001,col 9)-(line 3001,col 79)",
        "(line 3002,col 9)-(line 3002,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.addAll(char[], char[])",
      "begin_line": 3022,
      "end_line": 3032,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new char[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3023,col 9)-(line 3027,col 9)",
        "(line 3028,col 9)-(line 3028,col 69)",
        "(line 3029,col 9)-(line 3029,col 67)",
        "(line 3030,col 9)-(line 3030,col 79)",
        "(line 3031,col 9)-(line 3031,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.addAll(byte[], byte[])",
      "begin_line": 3051,
      "end_line": 3061,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new byte[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3052,col 9)-(line 3056,col 9)",
        "(line 3057,col 9)-(line 3057,col 69)",
        "(line 3058,col 9)-(line 3058,col 67)",
        "(line 3059,col 9)-(line 3059,col 79)",
        "(line 3060,col 9)-(line 3060,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.addAll(short[], short[])",
      "begin_line": 3080,
      "end_line": 3090,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new short[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3081,col 9)-(line 3085,col 9)",
        "(line 3086,col 9)-(line 3086,col 71)",
        "(line 3087,col 9)-(line 3087,col 67)",
        "(line 3088,col 9)-(line 3088,col 79)",
        "(line 3089,col 9)-(line 3089,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.addAll(int[], int[])",
      "begin_line": 3109,
      "end_line": 3119,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new int[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3110,col 9)-(line 3114,col 9)",
        "(line 3115,col 9)-(line 3115,col 67)",
        "(line 3116,col 9)-(line 3116,col 67)",
        "(line 3117,col 9)-(line 3117,col 79)",
        "(line 3118,col 9)-(line 3118,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.addAll(long[], long[])",
      "begin_line": 3138,
      "end_line": 3148,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new long[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3139,col 9)-(line 3143,col 9)",
        "(line 3144,col 9)-(line 3144,col 69)",
        "(line 3145,col 9)-(line 3145,col 67)",
        "(line 3146,col 9)-(line 3146,col 79)",
        "(line 3147,col 9)-(line 3147,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.addAll(float[], float[])",
      "begin_line": 3167,
      "end_line": 3177,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new float[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3168,col 9)-(line 3172,col 9)",
        "(line 3173,col 9)-(line 3173,col 71)",
        "(line 3174,col 9)-(line 3174,col 67)",
        "(line 3175,col 9)-(line 3175,col 79)",
        "(line 3176,col 9)-(line 3176,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.addAll(double[], double[])",
      "begin_line": 3196,
      "end_line": 3206,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new double[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3197,col 9)-(line 3201,col 9)",
        "(line 3202,col 9)-(line 3202,col 73)",
        "(line 3203,col 9)-(line 3203,col 67)",
        "(line 3204,col 9)-(line 3204,col 79)",
        "(line 3205,col 9)-(line 3205,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(java.lang.Object[], java.lang.Object)",
      "begin_line": 3231,
      "end_line": 3236,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of \n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add(null, null)      \u003d [null]\n     * ArrayUtils.add(null, \"a\")       \u003d [\"a\"]\n     * ArrayUtils.add([\"a\"], null)     \u003d [\"a\", null]\n     * ArrayUtils.add([\"a\"], \"b\")      \u003d [\"a\", \"b\"]\n     * ArrayUtils.add([\"a\", \"b\"], \"c\") \u003d [\"a\", \"b\", \"c\"]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to \"add\" the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3232,col 9)-(line 3232,col 112)",
        "(line 3233,col 9)-(line 3233,col 67)",
        "(line 3234,col 9)-(line 3234,col 48)",
        "(line 3235,col 9)-(line 3235,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(boolean[], boolean)",
      "begin_line": 3259,
      "end_line": 3263,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of \n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add(null, true)          \u003d [true]\n     * ArrayUtils.add([true], false)       \u003d [true, false]\n     * ArrayUtils.add([true, false], true) \u003d [true, false, true]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3260,col 9)-(line 3260,col 76)",
        "(line 3261,col 9)-(line 3261,col 48)",
        "(line 3262,col 9)-(line 3262,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(byte[], byte)",
      "begin_line": 3286,
      "end_line": 3290,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of \n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3287,col 9)-(line 3287,col 67)",
        "(line 3288,col 9)-(line 3288,col 48)",
        "(line 3289,col 9)-(line 3289,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(char[], char)",
      "begin_line": 3313,
      "end_line": 3317,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of \n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add(null, \u00270\u0027)       \u003d [\u00270\u0027]\n     * ArrayUtils.add([\u00271\u0027], \u00270\u0027)      \u003d [\u00271\u0027, \u00270\u0027]\n     * ArrayUtils.add([\u00271\u0027, \u00270\u0027], \u00271\u0027) \u003d [\u00271\u0027, \u00270\u0027, \u00271\u0027]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3314,col 9)-(line 3314,col 72)",
        "(line 3315,col 9)-(line 3315,col 48)",
        "(line 3316,col 9)-(line 3316,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(double[], double)",
      "begin_line": 3340,
      "end_line": 3344,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of \n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3341,col 9)-(line 3341,col 73)",
        "(line 3342,col 9)-(line 3342,col 48)",
        "(line 3343,col 9)-(line 3343,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(float[], float)",
      "begin_line": 3367,
      "end_line": 3371,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of \n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3368,col 9)-(line 3368,col 70)",
        "(line 3369,col 9)-(line 3369,col 48)",
        "(line 3370,col 9)-(line 3370,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(int[], int)",
      "begin_line": 3394,
      "end_line": 3398,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of \n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3395,col 9)-(line 3395,col 68)",
        "(line 3396,col 9)-(line 3396,col 48)",
        "(line 3397,col 9)-(line 3397,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(long[], long)",
      "begin_line": 3421,
      "end_line": 3425,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of \n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3422,col 9)-(line 3422,col 67)",
        "(line 3423,col 9)-(line 3423,col 48)",
        "(line 3424,col 9)-(line 3424,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(short[], short)",
      "begin_line": 3448,
      "end_line": 3452,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of \n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3449,col 9)-(line 3449,col 70)",
        "(line 3450,col 9)-(line 3450,col 48)",
        "(line 3451,col 9)-(line 3451,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.copyArrayGrow1(java.lang.Object, java.lang.Class)",
      "begin_line": 3463,
      "end_line": 3471,
      "comment": "\n     * Returns a copy of the given array of size 1 greater than the argument. \n     * The last value of the array is left to the default value.\n     * \n     * @param array The array to copy, must not be \u003ccode\u003enull\u003c/code\u003e.\n     * @param newArrayComponentType If \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, create a \n     * size 1 array of this type.\n     * @return A new copy of the array of size 1 greater than the input.\n     ",
      "child_ranges": [
        "(line 3464,col 9)-(line 3469,col 9)",
        "(line 3470,col 9)-(line 3470,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(java.lang.Object[], int, java.lang.Object)",
      "begin_line": 3501,
      "end_line": 3512,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array. \n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0, null)      \u003d [null]\n     * ArrayUtils.add(null, 0, \"a\")       \u003d [\"a\"]\n     * ArrayUtils.add([\"a\"], 1, null)     \u003d [\"a\", null]\n     * ArrayUtils.add([\"a\"], 1, \"b\")      \u003d [\"a\", \"b\"]\n     * ArrayUtils.add([\"a\", \"b\"], 3, \"c\") \u003d [\"a\", \"b\", \"c\"]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3502,col 9)-(line 3502,col 26)",
        "(line 3503,col 9)-(line 3510,col 9)",
        "(line 3511,col 9)-(line 3511,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(boolean[], int, boolean)",
      "begin_line": 3541,
      "end_line": 3543,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array. \n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0, true)          \u003d [true]\n     * ArrayUtils.add([true], 0, false)       \u003d [false, true]\n     * ArrayUtils.add([false], 1, true)       \u003d [false, true]\n     * ArrayUtils.add([true, false], 1, true) \u003d [true, true, false]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3542,col 9)-(line 3542,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(char[], int, char)",
      "begin_line": 3573,
      "end_line": 3575,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array. \n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0, \u0027a\u0027)            \u003d [\u0027a\u0027]\n     * ArrayUtils.add([\u0027a\u0027], 0, \u0027b\u0027)           \u003d [\u0027b\u0027, \u0027a\u0027]\n     * ArrayUtils.add([\u0027a\u0027, \u0027b\u0027], 0, \u0027c\u0027)      \u003d [\u0027c\u0027, \u0027a\u0027, \u0027b\u0027]\n     * ArrayUtils.add([\u0027a\u0027, \u0027b\u0027], 1, \u0027k\u0027)      \u003d [\u0027a\u0027, \u0027k\u0027, \u0027b\u0027]\n     * ArrayUtils.add([\u0027a\u0027, \u0027b\u0027, \u0027c\u0027], 1, \u0027t\u0027) \u003d [\u0027a\u0027, \u0027t\u0027, \u0027b\u0027, \u0027c\u0027]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3574,col 9)-(line 3574,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(byte[], int, byte)",
      "begin_line": 3604,
      "end_line": 3606,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array. \n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add([1], 0, 2)         \u003d [2, 1]\n     * ArrayUtils.add([2, 6], 2, 3)      \u003d [2, 6, 3]\n     * ArrayUtils.add([2, 6], 0, 1)      \u003d [1, 2, 6]\n     * ArrayUtils.add([2, 6, 3], 2, 1)   \u003d [2, 6, 1, 3]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3605,col 9)-(line 3605,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(short[], int, short)",
      "begin_line": 3635,
      "end_line": 3637,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array. \n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add([1], 0, 2)         \u003d [2, 1]\n     * ArrayUtils.add([2, 6], 2, 10)     \u003d [2, 6, 10]\n     * ArrayUtils.add([2, 6], 0, -4)     \u003d [-4, 2, 6]\n     * ArrayUtils.add([2, 6, 3], 2, 1)   \u003d [2, 6, 1, 3]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3636,col 9)-(line 3636,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(int[], int, int)",
      "begin_line": 3666,
      "end_line": 3668,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array. \n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add([1], 0, 2)         \u003d [2, 1]\n     * ArrayUtils.add([2, 6], 2, 10)     \u003d [2, 6, 10]\n     * ArrayUtils.add([2, 6], 0, -4)     \u003d [-4, 2, 6]\n     * ArrayUtils.add([2, 6, 3], 2, 1)   \u003d [2, 6, 1, 3]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3667,col 9)-(line 3667,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(long[], int, long)",
      "begin_line": 3697,
      "end_line": 3699,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array. \n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add([1L], 0, 2L)           \u003d [2L, 1L]\n     * ArrayUtils.add([2L, 6L], 2, 10L)      \u003d [2L, 6L, 10L]\n     * ArrayUtils.add([2L, 6L], 0, -4L)      \u003d [-4L, 2L, 6L]\n     * ArrayUtils.add([2L, 6L, 3L], 2, 1L)   \u003d [2L, 6L, 1L, 3L]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3698,col 9)-(line 3698,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(float[], int, float)",
      "begin_line": 3728,
      "end_line": 3730,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array. \n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add([1.1f], 0, 2.2f)               \u003d [2.2f, 1.1f]\n     * ArrayUtils.add([2.3f, 6.4f], 2, 10.5f)        \u003d [2.3f, 6.4f, 10.5f]\n     * ArrayUtils.add([2.6f, 6.7f], 0, -4.8f)        \u003d [-4.8f, 2.6f, 6.7f]\n     * ArrayUtils.add([2.9f, 6.0f, 0.3f], 2, 1.0f)   \u003d [2.9f, 6.0f, 1.0f, 0.3f]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3729,col 9)-(line 3729,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(double[], int, double)",
      "begin_line": 3759,
      "end_line": 3761,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array. \n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add([1.1], 0, 2.2)              \u003d [2.2, 1.1]\n     * ArrayUtils.add([2.3, 6.4], 2, 10.5)        \u003d [2.3, 6.4, 10.5]\n     * ArrayUtils.add([2.6, 6.7], 0, -4.8)        \u003d [-4.8, 2.6, 6.7]\n     * ArrayUtils.add([2.9, 6.0, 0.3], 2, 1.0)    \u003d [2.9, 6.0, 1.0, 0.3]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3760,col 9)-(line 3760,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(java.lang.Object, int, java.lang.Object, java.lang.Class)",
      "begin_line": 3774,
      "end_line": 3794,
      "comment": "\n     * Underlying implementation of add(array, index, element) methods. \n     * The last parameter is the class, which may not equal element.getClass \n     * for primitives.\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @param clss the type of the element being added\n     * @return A new array containing the existing elements and the new element\n     ",
      "child_ranges": [
        "(line 3775,col 9)-(line 3782,col 9)",
        "(line 3783,col 9)-(line 3783,col 44)",
        "(line 3784,col 9)-(line 3786,col 9)",
        "(line 3787,col 9)-(line 3787,col 60)",
        "(line 3788,col 9)-(line 3788,col 53)",
        "(line 3789,col 9)-(line 3789,col 42)",
        "(line 3790,col 9)-(line 3792,col 9)",
        "(line 3793,col 9)-(line 3793,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.remove(java.lang.Object[], int)",
      "begin_line": 3824,
      "end_line": 3826,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([\"a\"], 0)           \u003d []\n     * ArrayUtils.remove([\"a\", \"b\"], 0)      \u003d [\"b\"]\n     * ArrayUtils.remove([\"a\", \"b\"], 1)      \u003d [\"a\"]\n     * ArrayUtils.remove([\"a\", \"b\", \"c\"], 1) \u003d [\"a\", \"c\"]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3825,col 9)-(line 3825,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.removeElement(java.lang.Object[], java.lang.Object)",
      "begin_line": 3853,
      "end_line": 3859,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left \n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, \"a\")            \u003d null\n     * ArrayUtils.removeElement([], \"a\")              \u003d []\n     * ArrayUtils.removeElement([\"a\"], \"b\")           \u003d [\"a\"]\n     * ArrayUtils.removeElement([\"a\", \"b\"], \"a\")      \u003d [\"b\"]\n     * ArrayUtils.removeElement([\"a\", \"b\", \"a\"], \"a\") \u003d [\"b\", \"a\"]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3854,col 9)-(line 3854,col 44)",
        "(line 3855,col 9)-(line 3857,col 9)",
        "(line 3858,col 9)-(line 3858,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.remove(boolean[], int)",
      "begin_line": 3889,
      "end_line": 3891,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([true], 0)              \u003d []\n     * ArrayUtils.remove([true, false], 0)       \u003d [false]\n     * ArrayUtils.remove([true, false], 1)       \u003d [true]\n     * ArrayUtils.remove([true, true, false], 1) \u003d [true, false]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3890,col 9)-(line 3890,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.removeElement(boolean[], boolean)",
      "begin_line": 3918,
      "end_line": 3924,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left \n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, true)                \u003d null\n     * ArrayUtils.removeElement([], true)                  \u003d []\n     * ArrayUtils.removeElement([true], false)             \u003d [true]\n     * ArrayUtils.removeElement([true, false], false)      \u003d [true]\n     * ArrayUtils.removeElement([true, false, true], true) \u003d [false, true]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3919,col 9)-(line 3919,col 44)",
        "(line 3920,col 9)-(line 3922,col 9)",
        "(line 3923,col 9)-(line 3923,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.remove(byte[], int)",
      "begin_line": 3954,
      "end_line": 3956,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)          \u003d []\n     * ArrayUtils.remove([1, 0], 0)       \u003d [0]\n     * ArrayUtils.remove([1, 0], 1)       \u003d [1]\n     * ArrayUtils.remove([1, 0, 1], 1)    \u003d [1, 1]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3955,col 9)-(line 3955,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.removeElement(byte[], byte)",
      "begin_line": 3983,
      "end_line": 3989,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left \n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)        \u003d null\n     * ArrayUtils.removeElement([], 1)          \u003d []\n     * ArrayUtils.removeElement([1], 0)         \u003d [1]\n     * ArrayUtils.removeElement([1, 0], 0)      \u003d [1]\n     * ArrayUtils.removeElement([1, 0, 1], 1)   \u003d [0, 1]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3984,col 9)-(line 3984,col 44)",
        "(line 3985,col 9)-(line 3987,col 9)",
        "(line 3988,col 9)-(line 3988,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.remove(char[], int)",
      "begin_line": 4019,
      "end_line": 4021,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([\u0027a\u0027], 0)           \u003d []\n     * ArrayUtils.remove([\u0027a\u0027, \u0027b\u0027], 0)      \u003d [\u0027b\u0027]\n     * ArrayUtils.remove([\u0027a\u0027, \u0027b\u0027], 1)      \u003d [\u0027a\u0027]\n     * ArrayUtils.remove([\u0027a\u0027, \u0027b\u0027, \u0027c\u0027], 1) \u003d [\u0027a\u0027, \u0027c\u0027]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4020,col 9)-(line 4020,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.removeElement(char[], char)",
      "begin_line": 4048,
      "end_line": 4054,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left \n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, \u0027a\u0027)            \u003d null\n     * ArrayUtils.removeElement([], \u0027a\u0027)              \u003d []\n     * ArrayUtils.removeElement([\u0027a\u0027], \u0027b\u0027)           \u003d [\u0027a\u0027]\n     * ArrayUtils.removeElement([\u0027a\u0027, \u0027b\u0027], \u0027a\u0027)      \u003d [\u0027b\u0027]\n     * ArrayUtils.removeElement([\u0027a\u0027, \u0027b\u0027, \u0027a\u0027], \u0027a\u0027) \u003d [\u0027b\u0027, \u0027a\u0027]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4049,col 9)-(line 4049,col 44)",
        "(line 4050,col 9)-(line 4052,col 9)",
        "(line 4053,col 9)-(line 4053,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.remove(double[], int)",
      "begin_line": 4084,
      "end_line": 4086,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1.1], 0)           \u003d []\n     * ArrayUtils.remove([2.5, 6.0], 0)      \u003d [6.0]\n     * ArrayUtils.remove([2.5, 6.0], 1)      \u003d [2.5]\n     * ArrayUtils.remove([2.5, 6.0, 3.8], 1) \u003d [2.5, 3.8]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4085,col 9)-(line 4085,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.removeElement(double[], double)",
      "begin_line": 4113,
      "end_line": 4119,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left \n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1.1)            \u003d null\n     * ArrayUtils.removeElement([], 1.1)              \u003d []\n     * ArrayUtils.removeElement([1.1], 1.2)           \u003d [1.1]\n     * ArrayUtils.removeElement([1.1, 2.3], 1.1)      \u003d [2.3]\n     * ArrayUtils.removeElement([1.1, 2.3, 1.1], 1.1) \u003d [2.3, 1.1]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4114,col 9)-(line 4114,col 44)",
        "(line 4115,col 9)-(line 4117,col 9)",
        "(line 4118,col 9)-(line 4118,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.remove(float[], int)",
      "begin_line": 4149,
      "end_line": 4151,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1.1], 0)           \u003d []\n     * ArrayUtils.remove([2.5, 6.0], 0)      \u003d [6.0]\n     * ArrayUtils.remove([2.5, 6.0], 1)      \u003d [2.5]\n     * ArrayUtils.remove([2.5, 6.0, 3.8], 1) \u003d [2.5, 3.8]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4150,col 9)-(line 4150,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.removeElement(float[], float)",
      "begin_line": 4178,
      "end_line": 4184,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left \n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1.1)            \u003d null\n     * ArrayUtils.removeElement([], 1.1)              \u003d []\n     * ArrayUtils.removeElement([1.1], 1.2)           \u003d [1.1]\n     * ArrayUtils.removeElement([1.1, 2.3], 1.1)      \u003d [2.3]\n     * ArrayUtils.removeElement([1.1, 2.3, 1.1], 1.1) \u003d [2.3, 1.1]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4179,col 9)-(line 4179,col 44)",
        "(line 4180,col 9)-(line 4182,col 9)",
        "(line 4183,col 9)-(line 4183,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.remove(int[], int)",
      "begin_line": 4214,
      "end_line": 4216,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)         \u003d []\n     * ArrayUtils.remove([2, 6], 0)      \u003d [6]\n     * ArrayUtils.remove([2, 6], 1)      \u003d [2]\n     * ArrayUtils.remove([2, 6, 3], 1)   \u003d [2, 3]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4215,col 9)-(line 4215,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.removeElement(int[], int)",
      "begin_line": 4243,
      "end_line": 4249,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left \n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)      \u003d null\n     * ArrayUtils.removeElement([], 1)        \u003d []\n     * ArrayUtils.removeElement([1], 2)       \u003d [1]\n     * ArrayUtils.removeElement([1, 3], 1)    \u003d [3]\n     * ArrayUtils.removeElement([1, 3, 1], 1) \u003d [3, 1]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4244,col 9)-(line 4244,col 44)",
        "(line 4245,col 9)-(line 4247,col 9)",
        "(line 4248,col 9)-(line 4248,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.remove(long[], int)",
      "begin_line": 4279,
      "end_line": 4281,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)         \u003d []\n     * ArrayUtils.remove([2, 6], 0)      \u003d [6]\n     * ArrayUtils.remove([2, 6], 1)      \u003d [2]\n     * ArrayUtils.remove([2, 6, 3], 1)   \u003d [2, 3]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4280,col 9)-(line 4280,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.removeElement(long[], long)",
      "begin_line": 4308,
      "end_line": 4314,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left \n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)      \u003d null\n     * ArrayUtils.removeElement([], 1)        \u003d []\n     * ArrayUtils.removeElement([1], 2)       \u003d [1]\n     * ArrayUtils.removeElement([1, 3], 1)    \u003d [3]\n     * ArrayUtils.removeElement([1, 3, 1], 1) \u003d [3, 1]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4309,col 9)-(line 4309,col 44)",
        "(line 4310,col 9)-(line 4312,col 9)",
        "(line 4313,col 9)-(line 4313,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.remove(short[], int)",
      "begin_line": 4344,
      "end_line": 4346,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)         \u003d []\n     * ArrayUtils.remove([2, 6], 0)      \u003d [6]\n     * ArrayUtils.remove([2, 6], 1)      \u003d [2]\n     * ArrayUtils.remove([2, 6, 3], 1)   \u003d [2, 3]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4345,col 9)-(line 4345,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.removeElement(short[], short)",
      "begin_line": 4373,
      "end_line": 4379,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left \n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)      \u003d null\n     * ArrayUtils.removeElement([], 1)        \u003d []\n     * ArrayUtils.removeElement([1], 2)       \u003d [1]\n     * ArrayUtils.removeElement([1, 3], 1)    \u003d [3]\n     * ArrayUtils.removeElement([1, 3, 1], 1) \u003d [3, 1]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4374,col 9)-(line 4374,col 44)",
        "(line 4375,col 9)-(line 4377,col 9)",
        "(line 4378,col 9)-(line 4378,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.remove(java.lang.Object, int)",
      "begin_line": 4402,
      "end_line": 4415,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     * \n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4403,col 9)-(line 4403,col 38)",
        "(line 4404,col 9)-(line 4406,col 9)",
        "(line 4408,col 9)-(line 4408,col 91)",
        "(line 4409,col 9)-(line 4409,col 53)",
        "(line 4410,col 9)-(line 4412,col 9)",
        "(line 4414,col 9)-(line 4414,col 22)"
      ]
    }
  ]
}