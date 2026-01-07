{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/ArrayUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 49,
      "end_line": 4416,
      "comment": "\n * \u003cp\u003eOperations on arrays, primitive arrays (like \u003ccode\u003eint[]\u003c/code\u003e) and\n * primitive wrapper arrays (like \u003ccode\u003eInteger[]\u003c/code\u003e).\u003c/p\u003e\n * \n * \u003cp\u003eThis class tries to handle \u003ccode\u003enull\u003c/code\u003e input gracefully.\n * An exception will not be thrown for a \u003ccode\u003enull\u003c/code\u003e\n * array input. However, an Object array that contains a \u003ccode\u003enull\u003c/code\u003e\n * element may throw an exception. Each method documents its behaviour.\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @author Moritz Petersen\n * @author \u003ca href\u003d\"mailto:fredrik@westermarck.com\"\u003eFredrik Westermarck\u003c/a\u003e\n * @author Nikolay Metchev\n * @author Matthew Hawthorne\n * @author Tim O\u0027Brien\n * @author Pete Gieser\n * @author Gary Gregory\n * @author \u003ca href\u003d\"mailto:equinus100@hotmail.com\"\u003eAshwin S\u003c/a\u003e\n * @author Maarten Coene\n * @since 2.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang.ArrayUtils.ArrayUtils()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * \u003cp\u003eArrayUtils instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as \u003ccode\u003eArrayUtils.clone(new int[] {2})\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 143,col 7)-(line 143,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toString(java.lang.Object)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * \u003cp\u003eOutputs an array as a String, treating \u003ccode\u003enull\u003c/code\u003e as an empty array.\u003c/p\u003e\n     *\n     * \u003cp\u003eMulti-dimensional arrays are handled correctly, including\n     * multi-dimensional primitive arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format is that of Java source code, for example \u003ccode\u003e{a,b}\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param array  the array to get a toString for, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a String representation of the array, \u0027{}\u0027 if null array input\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toString(java.lang.Object, java.lang.String)",
      "begin_line": 175,
      "end_line": 180,
      "comment": "\n     * \u003cp\u003eOutputs an array as a String handling \u003ccode\u003enull\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003cp\u003eMulti-dimensional arrays are handled correctly, including\n     * multi-dimensional primitive arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format is that of Java source code, for example \u003ccode\u003e{a,b}\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param array  the array to get a toString for, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param stringIfNull  the String to return if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @return a String representation of the array\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.hashCode(java.lang.Object)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * \u003cp\u003eGet a hashCode for an array handling multi-dimensional arrays correctly.\u003c/p\u003e\n     * \n     * \u003cp\u003eMulti-dimensional primitive arrays are also handled correctly by this method.\u003c/p\u003e\n     * \n     * @param array  the array to get a hashCode for, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a hashCode for the array, zero if null array input\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isEquals(java.lang.Object, java.lang.Object)",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * \u003cp\u003eCompares two arrays, using equals(), handling multi-dimensional arrays\n     * correctly.\u003c/p\u003e\n     * \n     * \u003cp\u003eMulti-dimensional primitive arrays are also handled correctly by this method.\u003c/p\u003e\n     * \n     * @param array1  the left hand array to compare, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2  the right hand array to compare, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the arrays are equal\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toMap(java.lang.Object[])",
      "begin_line": 235,
      "end_line": 260,
      "comment": "\n     * \u003cp\u003eConverts the given array into a {@link java.util.Map}. Each element of the array\n     * must be either a {@link java.util.Map.Entry} or an Array, containing at least two\n     * elements, where the first element is used as key and the second as\n     * value.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method can be used to initialize:\u003c/p\u003e\n     * \u003cpre\u003e\n     * // Create a Map mapping colors.\n     * Map colorMap \u003d MapUtils.toMap(new String[][] {{\n     *     {\"RED\", \"#FF0000\"},\n     *     {\"GREEN\", \"#00FF00\"},\n     *     {\"BLUE\", \"#0000FF\"}});\n     * \u003c/pre\u003e\n     * \n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array  an array whose elements are either a {@link java.util.Map.Entry} or\n     *  an Array containing at least two elements, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eMap\u003c/code\u003e that was created from the array\n     * @throws IllegalArgumentException  if one element of this Array is\n     *  itself an Array containing less then two elements\n     * @throws IllegalArgumentException  if the array contains elements other\n     *  than {@link java.util.Map.Entry} and an Array\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 64)",
        "(line 240,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.clone(java.lang.Object[])",
      "begin_line": 276,
      "end_line": 281,
      "comment": "\n     * \u003cp\u003eShallow clones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe objects in the array are not cloned, thus there is no special\n     * handling for multi-dimensional arrays.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to shallow clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.clone(long[])",
      "begin_line": 292,
      "end_line": 297,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.clone(int[])",
      "begin_line": 308,
      "end_line": 313,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.clone(short[])",
      "begin_line": 324,
      "end_line": 329,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 328,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.clone(char[])",
      "begin_line": 340,
      "end_line": 345,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 344,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.clone(byte[])",
      "begin_line": 356,
      "end_line": 361,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 360,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.clone(double[])",
      "begin_line": 372,
      "end_line": 377,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 376,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.clone(float[])",
      "begin_line": 388,
      "end_line": 393,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.clone(boolean[])",
      "begin_line": 404,
      "end_line": 409,
      "comment": "\n     * \u003cp\u003eClones an array returning a typecast result and handling\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to clone, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the cloned array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.subarray(java.lang.Object[], int, int)",
      "begin_line": 440,
      "end_line": 458,
      "comment": "\n     * \u003cp\u003eProduces a new array containing the elements between\n     * the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe component type of the subarray is always the same as\n     * that of the input array. Thus, if the input is an array of type\n     * \u003ccode\u003eDate\u003c/code\u003e, the following usage is envisaged:\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Date[] someDates \u003d (Date[])ArrayUtils.subarray(allDates, 2, 5);\n     * \u003c/pre\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 446,col 9)",
        "(line 447,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 450,col 62)",
        "(line 451,col 9)-(line 451,col 57)",
        "(line 452,col 9)-(line 454,col 9)",
        "(line 455,col 9)-(line 455,col 72)",
        "(line 456,col 9)-(line 456,col 75)",
        "(line 457,col 9)-(line 457,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.subarray(long[], int, int)",
      "begin_line": 479,
      "end_line": 497,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003elong\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 482,col 9)",
        "(line 483,col 9)-(line 485,col 9)",
        "(line 486,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 489,col 62)",
        "(line 490,col 9)-(line 492,col 9)",
        "(line 494,col 9)-(line 494,col 44)",
        "(line 495,col 9)-(line 495,col 75)",
        "(line 496,col 9)-(line 496,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.subarray(int[], int, int)",
      "begin_line": 518,
      "end_line": 536,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003eint\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 521,col 9)",
        "(line 522,col 9)-(line 524,col 9)",
        "(line 525,col 9)-(line 527,col 9)",
        "(line 528,col 9)-(line 528,col 62)",
        "(line 529,col 9)-(line 531,col 9)",
        "(line 533,col 9)-(line 533,col 42)",
        "(line 534,col 9)-(line 534,col 75)",
        "(line 535,col 9)-(line 535,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.subarray(short[], int, int)",
      "begin_line": 557,
      "end_line": 575,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003eshort\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 560,col 9)",
        "(line 561,col 9)-(line 563,col 9)",
        "(line 564,col 9)-(line 566,col 9)",
        "(line 567,col 9)-(line 567,col 62)",
        "(line 568,col 9)-(line 570,col 9)",
        "(line 572,col 9)-(line 572,col 46)",
        "(line 573,col 9)-(line 573,col 75)",
        "(line 574,col 9)-(line 574,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.subarray(char[], int, int)",
      "begin_line": 596,
      "end_line": 614,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003echar\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 599,col 9)",
        "(line 600,col 9)-(line 602,col 9)",
        "(line 603,col 9)-(line 605,col 9)",
        "(line 606,col 9)-(line 606,col 62)",
        "(line 607,col 9)-(line 609,col 9)",
        "(line 611,col 9)-(line 611,col 44)",
        "(line 612,col 9)-(line 612,col 75)",
        "(line 613,col 9)-(line 613,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.subarray(byte[], int, int)",
      "begin_line": 635,
      "end_line": 653,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003ebyte\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 636,col 9)-(line 638,col 9)",
        "(line 639,col 9)-(line 641,col 9)",
        "(line 642,col 9)-(line 644,col 9)",
        "(line 645,col 9)-(line 645,col 62)",
        "(line 646,col 9)-(line 648,col 9)",
        "(line 650,col 9)-(line 650,col 44)",
        "(line 651,col 9)-(line 651,col 75)",
        "(line 652,col 9)-(line 652,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.subarray(double[], int, int)",
      "begin_line": 674,
      "end_line": 692,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003edouble\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 677,col 9)",
        "(line 678,col 9)-(line 680,col 9)",
        "(line 681,col 9)-(line 683,col 9)",
        "(line 684,col 9)-(line 684,col 62)",
        "(line 685,col 9)-(line 687,col 9)",
        "(line 689,col 9)-(line 689,col 48)",
        "(line 690,col 9)-(line 690,col 75)",
        "(line 691,col 9)-(line 691,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.subarray(float[], int, int)",
      "begin_line": 713,
      "end_line": 731,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003efloat\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 714,col 9)-(line 716,col 9)",
        "(line 717,col 9)-(line 719,col 9)",
        "(line 720,col 9)-(line 722,col 9)",
        "(line 723,col 9)-(line 723,col 62)",
        "(line 724,col 9)-(line 726,col 9)",
        "(line 728,col 9)-(line 728,col 46)",
        "(line 729,col 9)-(line 729,col 75)",
        "(line 730,col 9)-(line 730,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.subarray(boolean[], int, int)",
      "begin_line": 752,
      "end_line": 770,
      "comment": "\n     * \u003cp\u003eProduces a new \u003ccode\u003eboolean\u003c/code\u003e array containing the elements\n     * between the start and end indices.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe start index is inclusive, the end index exclusive.\n     * Null array input produces null output.\u003c/p\u003e\n     *\n     * @param array  the array\n     * @param startIndexInclusive  the starting index. Undervalue (\u0026lt;0)\n     *      is promoted to 0, overvalue (\u0026gt;array.length) results\n     *      in an empty array.\n     * @param endIndexExclusive  elements up to endIndex-1 are present in the\n     *      returned subarray. Undervalue (\u0026lt; startIndex) produces\n     *      empty array, overvalue (\u0026gt;array.length) is demoted to\n     *      array length.\n     * @return a new array containing the elements between\n     *      the start and end indices.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 753,col 9)-(line 755,col 9)",
        "(line 756,col 9)-(line 758,col 9)",
        "(line 759,col 9)-(line 761,col 9)",
        "(line 762,col 9)-(line 762,col 62)",
        "(line 763,col 9)-(line 765,col 9)",
        "(line 767,col 9)-(line 767,col 50)",
        "(line 768,col 9)-(line 768,col 75)",
        "(line 769,col 9)-(line 769,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isSameLength(java.lang.Object[], java.lang.Object[])",
      "begin_line": 785,
      "end_line": 792,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\n     *\n     * \u003cp\u003eAny multi-dimensional aspects of the arrays are ignored.\u003c/p\u003e\n     * \n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 786,col 9)-(line 790,col 9)",
        "(line 791,col 9)-(line 791,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isSameLength(long[], long[])",
      "begin_line": 803,
      "end_line": 810,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 804,col 9)-(line 808,col 9)",
        "(line 809,col 9)-(line 809,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isSameLength(int[], int[])",
      "begin_line": 821,
      "end_line": 828,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 822,col 9)-(line 826,col 9)",
        "(line 827,col 9)-(line 827,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isSameLength(short[], short[])",
      "begin_line": 839,
      "end_line": 846,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 840,col 9)-(line 844,col 9)",
        "(line 845,col 9)-(line 845,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isSameLength(char[], char[])",
      "begin_line": 857,
      "end_line": 864,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 858,col 9)-(line 862,col 9)",
        "(line 863,col 9)-(line 863,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isSameLength(byte[], byte[])",
      "begin_line": 875,
      "end_line": 882,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 876,col 9)-(line 880,col 9)",
        "(line 881,col 9)-(line 881,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isSameLength(double[], double[])",
      "begin_line": 893,
      "end_line": 900,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 894,col 9)-(line 898,col 9)",
        "(line 899,col 9)-(line 899,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isSameLength(float[], float[])",
      "begin_line": 911,
      "end_line": 918,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 912,col 9)-(line 916,col 9)",
        "(line 917,col 9)-(line 917,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isSameLength(boolean[], boolean[])",
      "begin_line": 929,
      "end_line": 936,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same length, treating\n     * \u003ccode\u003enull\u003c/code\u003e arrays as length \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param array1 the first array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if length of arrays matches, treating\n     *  \u003ccode\u003enull\u003c/code\u003e as an empty array\n     ",
      "child_ranges": [
        "(line 930,col 9)-(line 934,col 9)",
        "(line 935,col 9)-(line 935,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.getLength(java.lang.Object)",
      "begin_line": 959,
      "end_line": 964,
      "comment": "\n     * \u003cp\u003eReturns the length of the specified array.\n     * This method can deal with \u003ccode\u003eObject\u003c/code\u003e arrays and with primitive arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003e0\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.getLength(null)            \u003d 0\n     * ArrayUtils.getLength([])              \u003d 0\n     * ArrayUtils.getLength([null])          \u003d 1\n     * ArrayUtils.getLength([true, false])   \u003d 2\n     * ArrayUtils.getLength([1, 2, 3])       \u003d 3\n     * ArrayUtils.getLength([\"a\", \"b\", \"c\"]) \u003d 3\n     * \u003c/pre\u003e\n     *\n     * @param array  the array to retrieve the length from, may be null\n     * @return The length of the array, or \u003ccode\u003e0\u003c/code\u003e if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the object arguement is not an array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 960,col 9)-(line 962,col 9)",
        "(line 963,col 9)-(line 963,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isSameType(java.lang.Object, java.lang.Object)",
      "begin_line": 975,
      "end_line": 980,
      "comment": "\n     * \u003cp\u003eChecks whether two arrays are the same type taking into account\n     * multi-dimensional arrays.\u003c/p\u003e\n     * \n     * @param array1 the first array, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2 the second array, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if type of arrays matches\n     * @throws IllegalArgumentException if either array is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 976,col 9)-(line 978,col 9)",
        "(line 979,col 9)-(line 979,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.reverse(java.lang.Object[])",
      "begin_line": 993,
      "end_line": 1007,
      "comment": " \n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThere is no special handling for multi-dimensional arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 994,col 9)-(line 996,col 9)",
        "(line 997,col 9)-(line 997,col 18)",
        "(line 998,col 9)-(line 998,col 33)",
        "(line 999,col 9)-(line 999,col 19)",
        "(line 1000,col 9)-(line 1006,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.reverse(long[])",
      "begin_line": 1016,
      "end_line": 1030,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1017,col 9)-(line 1019,col 9)",
        "(line 1020,col 9)-(line 1020,col 18)",
        "(line 1021,col 9)-(line 1021,col 33)",
        "(line 1022,col 9)-(line 1022,col 17)",
        "(line 1023,col 9)-(line 1029,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.reverse(int[])",
      "begin_line": 1039,
      "end_line": 1053,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1040,col 9)-(line 1042,col 9)",
        "(line 1043,col 9)-(line 1043,col 18)",
        "(line 1044,col 9)-(line 1044,col 33)",
        "(line 1045,col 9)-(line 1045,col 16)",
        "(line 1046,col 9)-(line 1052,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.reverse(short[])",
      "begin_line": 1062,
      "end_line": 1076,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1063,col 9)-(line 1065,col 9)",
        "(line 1066,col 9)-(line 1066,col 18)",
        "(line 1067,col 9)-(line 1067,col 33)",
        "(line 1068,col 9)-(line 1068,col 18)",
        "(line 1069,col 9)-(line 1075,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.reverse(char[])",
      "begin_line": 1085,
      "end_line": 1099,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1086,col 9)-(line 1088,col 9)",
        "(line 1089,col 9)-(line 1089,col 18)",
        "(line 1090,col 9)-(line 1090,col 33)",
        "(line 1091,col 9)-(line 1091,col 17)",
        "(line 1092,col 9)-(line 1098,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.reverse(byte[])",
      "begin_line": 1108,
      "end_line": 1122,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1109,col 9)-(line 1111,col 9)",
        "(line 1112,col 9)-(line 1112,col 18)",
        "(line 1113,col 9)-(line 1113,col 33)",
        "(line 1114,col 9)-(line 1114,col 17)",
        "(line 1115,col 9)-(line 1121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.reverse(double[])",
      "begin_line": 1131,
      "end_line": 1145,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1132,col 9)-(line 1134,col 9)",
        "(line 1135,col 9)-(line 1135,col 18)",
        "(line 1136,col 9)-(line 1136,col 33)",
        "(line 1137,col 9)-(line 1137,col 19)",
        "(line 1138,col 9)-(line 1144,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.reverse(float[])",
      "begin_line": 1154,
      "end_line": 1168,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1155,col 9)-(line 1157,col 9)",
        "(line 1158,col 9)-(line 1158,col 18)",
        "(line 1159,col 9)-(line 1159,col 33)",
        "(line 1160,col 9)-(line 1160,col 18)",
        "(line 1161,col 9)-(line 1167,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.reverse(boolean[])",
      "begin_line": 1177,
      "end_line": 1191,
      "comment": "\n     * \u003cp\u003eReverses the order of the given array.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method does nothing for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to reverse, may be \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1178,col 9)-(line 1180,col 9)",
        "(line 1181,col 9)-(line 1181,col 18)",
        "(line 1182,col 9)-(line 1182,col 33)",
        "(line 1183,col 9)-(line 1183,col 20)",
        "(line 1184,col 9)-(line 1190,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(java.lang.Object[], java.lang.Object)",
      "begin_line": 1208,
      "end_line": 1210,
      "comment": "\n     * \u003cp\u003eFinds the index of the given object in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param objectToFind  the object to find, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the index of the object within the array, \n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1209,col 9)-(line 1209,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(java.lang.Object[], java.lang.Object, int)",
      "begin_line": 1226,
      "end_line": 1247,
      "comment": "\n     * \u003cp\u003eFinds the index of the given object in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param objectToFind  the object to find, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param startIndex  the index to start searching at\n     * @return the index of the object within the array starting at the index,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1227,col 9)-(line 1229,col 9)",
        "(line 1230,col 9)-(line 1232,col 9)",
        "(line 1233,col 9)-(line 1245,col 9)",
        "(line 1246,col 9)-(line 1246,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(java.lang.Object[], java.lang.Object)",
      "begin_line": 1259,
      "end_line": 1261,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given object within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param objectToFind  the object to find, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the last index of the object within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1260,col 9)-(line 1260,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(java.lang.Object[], java.lang.Object, int)",
      "begin_line": 1277,
      "end_line": 1300,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given object in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than\n     * the array length will search from the end of the array.\u003c/p\u003e\n     * \n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param objectToFind  the object to find, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the object within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1278,col 9)-(line 1280,col 9)",
        "(line 1281,col 9)-(line 1285,col 9)",
        "(line 1286,col 9)-(line 1298,col 9)",
        "(line 1299,col 9)-(line 1299,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.contains(java.lang.Object[], java.lang.Object)",
      "begin_line": 1311,
      "end_line": 1313,
      "comment": "\n     * \u003cp\u003eChecks if the object is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     * \n     * @param array  the array to search through\n     * @param objectToFind  the object to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 1312,col 9)-(line 1312,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(long[], long)",
      "begin_line": 1327,
      "end_line": 1329,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1328,col 9)-(line 1328,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(long[], long, int)",
      "begin_line": 1345,
      "end_line": 1358,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1346,col 9)-(line 1348,col 9)",
        "(line 1349,col 9)-(line 1351,col 9)",
        "(line 1352,col 9)-(line 1356,col 9)",
        "(line 1357,col 9)-(line 1357,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(long[], long)",
      "begin_line": 1370,
      "end_line": 1372,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1371,col 9)-(line 1371,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(long[], long, int)",
      "begin_line": 1388,
      "end_line": 1403,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     * \n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1389,col 9)-(line 1391,col 9)",
        "(line 1392,col 9)-(line 1396,col 9)",
        "(line 1397,col 9)-(line 1401,col 9)",
        "(line 1402,col 9)-(line 1402,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.contains(long[], long)",
      "begin_line": 1414,
      "end_line": 1416,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     * \n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 1415,col 9)-(line 1415,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(int[], int)",
      "begin_line": 1430,
      "end_line": 1432,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1431,col 9)-(line 1431,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(int[], int, int)",
      "begin_line": 1448,
      "end_line": 1461,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1449,col 9)-(line 1451,col 9)",
        "(line 1452,col 9)-(line 1454,col 9)",
        "(line 1455,col 9)-(line 1459,col 9)",
        "(line 1460,col 9)-(line 1460,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(int[], int)",
      "begin_line": 1473,
      "end_line": 1475,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1474,col 9)-(line 1474,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(int[], int, int)",
      "begin_line": 1491,
      "end_line": 1506,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     * \n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1492,col 9)-(line 1494,col 9)",
        "(line 1495,col 9)-(line 1499,col 9)",
        "(line 1500,col 9)-(line 1504,col 9)",
        "(line 1505,col 9)-(line 1505,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.contains(int[], int)",
      "begin_line": 1517,
      "end_line": 1519,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     * \n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 1518,col 9)-(line 1518,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(short[], short)",
      "begin_line": 1533,
      "end_line": 1535,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1534,col 9)-(line 1534,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(short[], short, int)",
      "begin_line": 1551,
      "end_line": 1564,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1552,col 9)-(line 1554,col 9)",
        "(line 1555,col 9)-(line 1557,col 9)",
        "(line 1558,col 9)-(line 1562,col 9)",
        "(line 1563,col 9)-(line 1563,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(short[], short)",
      "begin_line": 1576,
      "end_line": 1578,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1577,col 9)-(line 1577,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(short[], short, int)",
      "begin_line": 1594,
      "end_line": 1609,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the \n     * array length will search from the end of the array.\u003c/p\u003e\n     * \n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1595,col 9)-(line 1597,col 9)",
        "(line 1598,col 9)-(line 1602,col 9)",
        "(line 1603,col 9)-(line 1607,col 9)",
        "(line 1608,col 9)-(line 1608,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.contains(short[], short)",
      "begin_line": 1620,
      "end_line": 1622,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     * \n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 1621,col 9)-(line 1621,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(char[], char)",
      "begin_line": 1637,
      "end_line": 1639,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1638,col 9)-(line 1638,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(char[], char, int)",
      "begin_line": 1656,
      "end_line": 1669,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1657,col 9)-(line 1659,col 9)",
        "(line 1660,col 9)-(line 1662,col 9)",
        "(line 1663,col 9)-(line 1667,col 9)",
        "(line 1668,col 9)-(line 1668,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(char[], char)",
      "begin_line": 1682,
      "end_line": 1684,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1683,col 9)-(line 1683,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(char[], char, int)",
      "begin_line": 1701,
      "end_line": 1716,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the\n     * array length will search from the end of the array.\u003c/p\u003e\n     * \n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1702,col 9)-(line 1704,col 9)",
        "(line 1705,col 9)-(line 1709,col 9)",
        "(line 1710,col 9)-(line 1714,col 9)",
        "(line 1715,col 9)-(line 1715,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.contains(char[], char)",
      "begin_line": 1728,
      "end_line": 1730,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     * \n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1729,col 9)-(line 1729,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(byte[], byte)",
      "begin_line": 1744,
      "end_line": 1746,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1745,col 9)-(line 1745,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(byte[], byte, int)",
      "begin_line": 1762,
      "end_line": 1775,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1763,col 9)-(line 1765,col 9)",
        "(line 1766,col 9)-(line 1768,col 9)",
        "(line 1769,col 9)-(line 1773,col 9)",
        "(line 1774,col 9)-(line 1774,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(byte[], byte)",
      "begin_line": 1787,
      "end_line": 1789,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1788,col 9)-(line 1788,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(byte[], byte, int)",
      "begin_line": 1805,
      "end_line": 1820,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the \n     * array length will search from the end of the array.\u003c/p\u003e\n     * \n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1806,col 9)-(line 1808,col 9)",
        "(line 1809,col 9)-(line 1813,col 9)",
        "(line 1814,col 9)-(line 1818,col 9)",
        "(line 1819,col 9)-(line 1819,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.contains(byte[], byte)",
      "begin_line": 1831,
      "end_line": 1833,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     * \n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 1832,col 9)-(line 1832,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(double[], double)",
      "begin_line": 1847,
      "end_line": 1849,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1848,col 9)-(line 1848,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(double[], double, double)",
      "begin_line": 1864,
      "end_line": 1866,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value within a given tolerance in the array.\n     * This method will return the index of the first value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param tolerance tolerance of the search\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1865,col 9)-(line 1865,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(double[], double, int)",
      "begin_line": 1882,
      "end_line": 1895,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1883,col 9)-(line 1885,col 9)",
        "(line 1886,col 9)-(line 1888,col 9)",
        "(line 1889,col 9)-(line 1893,col 9)",
        "(line 1894,col 9)-(line 1894,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(double[], double, int, double)",
      "begin_line": 1914,
      "end_line": 1929,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\n     * This method will return the index of the first value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @param tolerance tolerance of the search\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1915,col 9)-(line 1917,col 9)",
        "(line 1918,col 9)-(line 1920,col 9)",
        "(line 1921,col 9)-(line 1921,col 45)",
        "(line 1922,col 9)-(line 1922,col 45)",
        "(line 1923,col 9)-(line 1927,col 9)",
        "(line 1928,col 9)-(line 1928,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(double[], double)",
      "begin_line": 1941,
      "end_line": 1943,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1942,col 9)-(line 1942,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(double[], double, double)",
      "begin_line": 1958,
      "end_line": 1960,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within a given tolerance in the array.\n     * This method will return the index of the last value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param tolerance tolerance of the search\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1959,col 9)-(line 1959,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(double[], double, int)",
      "begin_line": 1976,
      "end_line": 1991,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the \n     * array length will search from the end of the array.\u003c/p\u003e\n     * \n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 1977,col 9)-(line 1979,col 9)",
        "(line 1980,col 9)-(line 1984,col 9)",
        "(line 1985,col 9)-(line 1989,col 9)",
        "(line 1990,col 9)-(line 1990,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(double[], double, int, double)",
      "begin_line": 2010,
      "end_line": 2027,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\n     * This method will return the index of the last value which falls between the region\n     * defined by valueToFind - tolerance and valueToFind + tolerance.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the \n     * array length will search from the end of the array.\u003c/p\u003e\n     * \n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @param tolerance  search for value within plus/minus this amount\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2011,col 9)-(line 2013,col 9)",
        "(line 2014,col 9)-(line 2018,col 9)",
        "(line 2019,col 9)-(line 2019,col 45)",
        "(line 2020,col 9)-(line 2020,col 45)",
        "(line 2021,col 9)-(line 2025,col 9)",
        "(line 2026,col 9)-(line 2026,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.contains(double[], double)",
      "begin_line": 2038,
      "end_line": 2040,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     * \n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 2039,col 9)-(line 2039,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.contains(double[], double, double)",
      "begin_line": 2055,
      "end_line": 2057,
      "comment": "\n     * \u003cp\u003eChecks if a value falling within the given tolerance is in the\n     * given array.  If the array contains a value within the inclusive range \n     * defined by (value - tolerance) to (value + tolerance).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array\n     * is passed in.\u003c/p\u003e\n     *\n     * @param array  the array to search\n     * @param valueToFind  the value to find\n     * @param tolerance  the array contains the tolerance of the search\n     * @return true if value falling within tolerance is in array\n     ",
      "child_ranges": [
        "(line 2056,col 9)-(line 2056,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(float[], float)",
      "begin_line": 2071,
      "end_line": 2073,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2072,col 9)-(line 2072,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(float[], float, int)",
      "begin_line": 2089,
      "end_line": 2102,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2090,col 9)-(line 2092,col 9)",
        "(line 2093,col 9)-(line 2095,col 9)",
        "(line 2096,col 9)-(line 2100,col 9)",
        "(line 2101,col 9)-(line 2101,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(float[], float)",
      "begin_line": 2114,
      "end_line": 2116,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2115,col 9)-(line 2115,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(float[], float, int)",
      "begin_line": 2132,
      "end_line": 2147,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than the \n     * array length will search from the end of the array.\u003c/p\u003e\n     * \n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2133,col 9)-(line 2135,col 9)",
        "(line 2136,col 9)-(line 2140,col 9)",
        "(line 2141,col 9)-(line 2145,col 9)",
        "(line 2146,col 9)-(line 2146,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.contains(float[], float)",
      "begin_line": 2158,
      "end_line": 2160,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     * \n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 2159,col 9)-(line 2159,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(boolean[], boolean)",
      "begin_line": 2174,
      "end_line": 2176,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2175,col 9)-(line 2175,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.indexOf(boolean[], boolean, int)",
      "begin_line": 2193,
      "end_line": 2206,
      "comment": "\n     * \u003cp\u003eFinds the index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex is treated as zero. A startIndex larger than the array\n     * length will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e).\u003c/p\u003e\n     * \n     * @param array  the array to search through for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the index to start searching at\n     * @return the index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e\n     *  array input\n     ",
      "child_ranges": [
        "(line 2194,col 9)-(line 2196,col 9)",
        "(line 2197,col 9)-(line 2199,col 9)",
        "(line 2200,col 9)-(line 2204,col 9)",
        "(line 2205,col 9)-(line 2205,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(boolean[], boolean)",
      "begin_line": 2219,
      "end_line": 2221,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value within the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if \n     * \u003ccode\u003enull\u003c/code\u003e array input.\u003c/p\u003e\n     * \n     * @param array  the array to travers backwords looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the object to find\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2220,col 9)-(line 2220,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.lastIndexOf(boolean[], boolean, int)",
      "begin_line": 2237,
      "end_line": 2252,
      "comment": "\n     * \u003cp\u003eFinds the last index of the given value in the array starting at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative startIndex will return {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e). A startIndex larger than \n     * the array length will search from the end of the array.\u003c/p\u003e\n     * \n     * @param array  the array to traverse for looking for the object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueToFind  the value to find\n     * @param startIndex  the start index to travers backwards from\n     * @return the last index of the value within the array,\n     *  {@link #INDEX_NOT_FOUND} (\u003ccode\u003e-1\u003c/code\u003e) if not found or \u003ccode\u003enull\u003c/code\u003e array input\n     ",
      "child_ranges": [
        "(line 2238,col 9)-(line 2240,col 9)",
        "(line 2241,col 9)-(line 2245,col 9)",
        "(line 2246,col 9)-(line 2250,col 9)",
        "(line 2251,col 9)-(line 2251,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.contains(boolean[], boolean)",
      "begin_line": 2263,
      "end_line": 2265,
      "comment": "\n     * \u003cp\u003eChecks if the value is in the given array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method returns \u003ccode\u003efalse\u003c/code\u003e if a \u003ccode\u003enull\u003c/code\u003e array is passed in.\u003c/p\u003e\n     * \n     * @param array  the array to search through\n     * @param valueToFind  the value to find\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array contains the object\n     ",
      "child_ranges": [
        "(line 2264,col 9)-(line 2264,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Character[])",
      "begin_line": 2281,
      "end_line": 2292,
      "comment": "\n     * \u003cp\u003eConverts an array of object Characters to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eCharacter\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003echar\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2282,col 9)-(line 2286,col 9)",
        "(line 2287,col 9)-(line 2287,col 53)",
        "(line 2288,col 9)-(line 2290,col 9)",
        "(line 2291,col 9)-(line 2291,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Character[], char)",
      "begin_line": 2303,
      "end_line": 2315,
      "comment": "\n     * \u003cp\u003eConverts an array of object Character to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eCharacter\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003echar\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2304,col 9)-(line 2308,col 9)",
        "(line 2309,col 9)-(line 2309,col 53)",
        "(line 2310,col 9)-(line 2313,col 9)",
        "(line 2314,col 9)-(line 2314,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toObject(char[])",
      "begin_line": 2325,
      "end_line": 2336,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive chars to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array a \u003ccode\u003echar\u003c/code\u003e array\n     * @return a \u003ccode\u003eCharacter\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2326,col 9)-(line 2330,col 9)",
        "(line 2331,col 9)-(line 2331,col 63)",
        "(line 2332,col 9)-(line 2334,col 9)",
        "(line 2335,col 9)-(line 2335,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Long[])",
      "begin_line": 2349,
      "end_line": 2360,
      "comment": "\n     * \u003cp\u003eConverts an array of object Longs to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eLong\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003elong\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2350,col 9)-(line 2354,col 9)",
        "(line 2355,col 9)-(line 2355,col 53)",
        "(line 2356,col 9)-(line 2358,col 9)",
        "(line 2359,col 9)-(line 2359,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Long[], long)",
      "begin_line": 2371,
      "end_line": 2383,
      "comment": "\n     * \u003cp\u003eConverts an array of object Long to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eLong\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003elong\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2372,col 9)-(line 2376,col 9)",
        "(line 2377,col 9)-(line 2377,col 53)",
        "(line 2378,col 9)-(line 2381,col 9)",
        "(line 2382,col 9)-(line 2382,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toObject(long[])",
      "begin_line": 2393,
      "end_line": 2404,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive longs to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003elong\u003c/code\u003e array\n     * @return a \u003ccode\u003eLong\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2394,col 9)-(line 2398,col 9)",
        "(line 2399,col 9)-(line 2399,col 53)",
        "(line 2400,col 9)-(line 2402,col 9)",
        "(line 2403,col 9)-(line 2403,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Integer[])",
      "begin_line": 2417,
      "end_line": 2428,
      "comment": "\n     * \u003cp\u003eConverts an array of object Integers to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eInteger\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return an \u003ccode\u003eint\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2418,col 9)-(line 2422,col 9)",
        "(line 2423,col 9)-(line 2423,col 51)",
        "(line 2424,col 9)-(line 2426,col 9)",
        "(line 2427,col 9)-(line 2427,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Integer[], int)",
      "begin_line": 2439,
      "end_line": 2451,
      "comment": "\n     * \u003cp\u003eConverts an array of object Integer to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eInteger\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return an \u003ccode\u003eint\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2440,col 9)-(line 2444,col 9)",
        "(line 2445,col 9)-(line 2445,col 51)",
        "(line 2446,col 9)-(line 2449,col 9)",
        "(line 2450,col 9)-(line 2450,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toObject(int[])",
      "begin_line": 2461,
      "end_line": 2472,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive ints to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  an \u003ccode\u003eint\u003c/code\u003e array\n     * @return an \u003ccode\u003eInteger\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2462,col 9)-(line 2466,col 9)",
        "(line 2467,col 9)-(line 2467,col 59)",
        "(line 2468,col 9)-(line 2470,col 9)",
        "(line 2471,col 9)-(line 2471,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Short[])",
      "begin_line": 2485,
      "end_line": 2496,
      "comment": "\n     * \u003cp\u003eConverts an array of object Shorts to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eShort\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003ebyte\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2486,col 9)-(line 2490,col 9)",
        "(line 2491,col 9)-(line 2491,col 55)",
        "(line 2492,col 9)-(line 2494,col 9)",
        "(line 2495,col 9)-(line 2495,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Short[], short)",
      "begin_line": 2507,
      "end_line": 2519,
      "comment": "\n     * \u003cp\u003eConverts an array of object Short to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eShort\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003ebyte\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2508,col 9)-(line 2512,col 9)",
        "(line 2513,col 9)-(line 2513,col 55)",
        "(line 2514,col 9)-(line 2517,col 9)",
        "(line 2518,col 9)-(line 2518,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toObject(short[])",
      "begin_line": 2529,
      "end_line": 2540,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive shorts to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eshort\u003c/code\u003e array\n     * @return a \u003ccode\u003eShort\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2530,col 9)-(line 2534,col 9)",
        "(line 2535,col 9)-(line 2535,col 55)",
        "(line 2536,col 9)-(line 2538,col 9)",
        "(line 2539,col 9)-(line 2539,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Byte[])",
      "begin_line": 2553,
      "end_line": 2564,
      "comment": "\n     * \u003cp\u003eConverts an array of object Bytes to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eByte\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003ebyte\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2554,col 9)-(line 2558,col 9)",
        "(line 2559,col 9)-(line 2559,col 53)",
        "(line 2560,col 9)-(line 2562,col 9)",
        "(line 2563,col 9)-(line 2563,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Byte[], byte)",
      "begin_line": 2575,
      "end_line": 2587,
      "comment": "\n     * \u003cp\u003eConverts an array of object Bytes to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eByte\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003ebyte\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2576,col 9)-(line 2580,col 9)",
        "(line 2581,col 9)-(line 2581,col 53)",
        "(line 2582,col 9)-(line 2585,col 9)",
        "(line 2586,col 9)-(line 2586,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toObject(byte[])",
      "begin_line": 2597,
      "end_line": 2608,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive bytes to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003ebyte\u003c/code\u003e array\n     * @return a \u003ccode\u003eByte\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2598,col 9)-(line 2602,col 9)",
        "(line 2603,col 9)-(line 2603,col 53)",
        "(line 2604,col 9)-(line 2606,col 9)",
        "(line 2607,col 9)-(line 2607,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Double[])",
      "begin_line": 2621,
      "end_line": 2632,
      "comment": "\n     * \u003cp\u003eConverts an array of object Doubles to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eDouble\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003edouble\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2622,col 9)-(line 2626,col 9)",
        "(line 2627,col 9)-(line 2627,col 57)",
        "(line 2628,col 9)-(line 2630,col 9)",
        "(line 2631,col 9)-(line 2631,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Double[], double)",
      "begin_line": 2643,
      "end_line": 2655,
      "comment": "\n     * \u003cp\u003eConverts an array of object Doubles to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eDouble\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003edouble\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2644,col 9)-(line 2648,col 9)",
        "(line 2649,col 9)-(line 2649,col 57)",
        "(line 2650,col 9)-(line 2653,col 9)",
        "(line 2654,col 9)-(line 2654,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toObject(double[])",
      "begin_line": 2665,
      "end_line": 2676,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive doubles to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003edouble\u003c/code\u003e array\n     * @return a \u003ccode\u003eDouble\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2666,col 9)-(line 2670,col 9)",
        "(line 2671,col 9)-(line 2671,col 57)",
        "(line 2672,col 9)-(line 2674,col 9)",
        "(line 2675,col 9)-(line 2675,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Float[])",
      "begin_line": 2689,
      "end_line": 2700,
      "comment": "\n     * \u003cp\u003eConverts an array of object Floats to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eFloat\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003efloat\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2690,col 9)-(line 2694,col 9)",
        "(line 2695,col 9)-(line 2695,col 55)",
        "(line 2696,col 9)-(line 2698,col 9)",
        "(line 2699,col 9)-(line 2699,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Float[], float)",
      "begin_line": 2711,
      "end_line": 2723,
      "comment": "\n     * \u003cp\u003eConverts an array of object Floats to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eFloat\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003efloat\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2712,col 9)-(line 2716,col 9)",
        "(line 2717,col 9)-(line 2717,col 55)",
        "(line 2718,col 9)-(line 2721,col 9)",
        "(line 2722,col 9)-(line 2722,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toObject(float[])",
      "begin_line": 2733,
      "end_line": 2744,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive floats to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003efloat\u003c/code\u003e array\n     * @return a \u003ccode\u003eFloat\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2734,col 9)-(line 2738,col 9)",
        "(line 2739,col 9)-(line 2739,col 55)",
        "(line 2740,col 9)-(line 2742,col 9)",
        "(line 2743,col 9)-(line 2743,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Boolean[])",
      "begin_line": 2757,
      "end_line": 2768,
      "comment": "\n     * \u003cp\u003eConverts an array of object Booleans to primitives.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eBoolean\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eboolean\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @throws NullPointerException if array content is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 2758,col 9)-(line 2762,col 9)",
        "(line 2763,col 9)-(line 2763,col 59)",
        "(line 2764,col 9)-(line 2766,col 9)",
        "(line 2767,col 9)-(line 2767,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toPrimitive(java.lang.Boolean[], boolean)",
      "begin_line": 2779,
      "end_line": 2791,
      "comment": "\n     * \u003cp\u003eConverts an array of object Booleans to primitives handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eBoolean\u003c/code\u003e array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param valueForNull  the value to insert if \u003ccode\u003enull\u003c/code\u003e found\n     * @return a \u003ccode\u003eboolean\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2780,col 9)-(line 2784,col 9)",
        "(line 2785,col 9)-(line 2785,col 59)",
        "(line 2786,col 9)-(line 2789,col 9)",
        "(line 2790,col 9)-(line 2790,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.toObject(boolean[])",
      "begin_line": 2801,
      "end_line": 2812,
      "comment": "\n     * \u003cp\u003eConverts an array of primitive booleans to objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     * \n     * @param array  a \u003ccode\u003eboolean\u003c/code\u003e array\n     * @return a \u003ccode\u003eBoolean\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2802,col 9)-(line 2806,col 9)",
        "(line 2807,col 9)-(line 2807,col 59)",
        "(line 2808,col 9)-(line 2810,col 9)",
        "(line 2811,col 9)-(line 2811,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isEmpty(java.lang.Object[])",
      "begin_line": 2822,
      "end_line": 2827,
      "comment": "\n     * \u003cp\u003eChecks if an array of Objects is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2823,col 9)-(line 2825,col 9)",
        "(line 2826,col 9)-(line 2826,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isEmpty(long[])",
      "begin_line": 2836,
      "end_line": 2841,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive longs is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2837,col 9)-(line 2839,col 9)",
        "(line 2840,col 9)-(line 2840,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isEmpty(int[])",
      "begin_line": 2850,
      "end_line": 2855,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive ints is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2851,col 9)-(line 2853,col 9)",
        "(line 2854,col 9)-(line 2854,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isEmpty(short[])",
      "begin_line": 2864,
      "end_line": 2869,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive shorts is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2865,col 9)-(line 2867,col 9)",
        "(line 2868,col 9)-(line 2868,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isEmpty(char[])",
      "begin_line": 2878,
      "end_line": 2883,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive chars is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2879,col 9)-(line 2881,col 9)",
        "(line 2882,col 9)-(line 2882,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isEmpty(byte[])",
      "begin_line": 2892,
      "end_line": 2897,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive bytes is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2893,col 9)-(line 2895,col 9)",
        "(line 2896,col 9)-(line 2896,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isEmpty(double[])",
      "begin_line": 2906,
      "end_line": 2911,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive doubles is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2907,col 9)-(line 2909,col 9)",
        "(line 2910,col 9)-(line 2910,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isEmpty(float[])",
      "begin_line": 2920,
      "end_line": 2925,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive floats is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2921,col 9)-(line 2923,col 9)",
        "(line 2924,col 9)-(line 2924,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.isEmpty(boolean[])",
      "begin_line": 2934,
      "end_line": 2939,
      "comment": "\n     * \u003cp\u003eChecks if an array of primitive booleans is empty or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param array  the array to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the array is empty or \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2935,col 9)-(line 2937,col 9)",
        "(line 2938,col 9)-(line 2938,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.addAll(java.lang.Object[], java.lang.Object[])",
      "begin_line": 2962,
      "end_line": 2973,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(null, null)     \u003d null\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * ArrayUtils.addAll([null], [null]) \u003d [null, null]\n     * ArrayUtils.addAll([\"a\", \"b\", \"c\"], [\"1\", \"2\", \"3\"]) \u003d [\"a\", \"b\", \"c\", \"1\", \"2\", \"3\"]\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param array2  the second array whose elements are added to the new array, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return The new array, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e array inputs. \n     *      The type of the new array is the type of the first array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2963,col 9)-(line 2967,col 9)",
        "(line 2968,col 9)-(line 2969,col 91)",
        "(line 2970,col 9)-(line 2970,col 67)",
        "(line 2971,col 9)-(line 2971,col 79)",
        "(line 2972,col 9)-(line 2972,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.addAll(boolean[], boolean[])",
      "begin_line": 2992,
      "end_line": 3002,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new boolean[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2993,col 9)-(line 2997,col 9)",
        "(line 2998,col 9)-(line 2998,col 75)",
        "(line 2999,col 9)-(line 2999,col 67)",
        "(line 3000,col 9)-(line 3000,col 79)",
        "(line 3001,col 9)-(line 3001,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.addAll(char[], char[])",
      "begin_line": 3021,
      "end_line": 3031,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new char[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3022,col 9)-(line 3026,col 9)",
        "(line 3027,col 9)-(line 3027,col 69)",
        "(line 3028,col 9)-(line 3028,col 67)",
        "(line 3029,col 9)-(line 3029,col 79)",
        "(line 3030,col 9)-(line 3030,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.addAll(byte[], byte[])",
      "begin_line": 3050,
      "end_line": 3060,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new byte[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3051,col 9)-(line 3055,col 9)",
        "(line 3056,col 9)-(line 3056,col 69)",
        "(line 3057,col 9)-(line 3057,col 67)",
        "(line 3058,col 9)-(line 3058,col 79)",
        "(line 3059,col 9)-(line 3059,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.addAll(short[], short[])",
      "begin_line": 3079,
      "end_line": 3089,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new short[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3080,col 9)-(line 3084,col 9)",
        "(line 3085,col 9)-(line 3085,col 71)",
        "(line 3086,col 9)-(line 3086,col 67)",
        "(line 3087,col 9)-(line 3087,col 79)",
        "(line 3088,col 9)-(line 3088,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.addAll(int[], int[])",
      "begin_line": 3108,
      "end_line": 3118,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new int[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3109,col 9)-(line 3113,col 9)",
        "(line 3114,col 9)-(line 3114,col 67)",
        "(line 3115,col 9)-(line 3115,col 67)",
        "(line 3116,col 9)-(line 3116,col 79)",
        "(line 3117,col 9)-(line 3117,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.addAll(long[], long[])",
      "begin_line": 3137,
      "end_line": 3147,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new long[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3138,col 9)-(line 3142,col 9)",
        "(line 3143,col 9)-(line 3143,col 69)",
        "(line 3144,col 9)-(line 3144,col 67)",
        "(line 3145,col 9)-(line 3145,col 79)",
        "(line 3146,col 9)-(line 3146,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.addAll(float[], float[])",
      "begin_line": 3166,
      "end_line": 3176,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new float[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3167,col 9)-(line 3171,col 9)",
        "(line 3172,col 9)-(line 3172,col 71)",
        "(line 3173,col 9)-(line 3173,col 67)",
        "(line 3174,col 9)-(line 3174,col 79)",
        "(line 3175,col 9)-(line 3175,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.addAll(double[], double[])",
      "begin_line": 3195,
      "end_line": 3205,
      "comment": "\n     * \u003cp\u003eAdds all the elements of the given arrays into a new array.\u003c/p\u003e\n     * \u003cp\u003eThe new array contains all of the element of \u003ccode\u003earray1\u003c/code\u003e followed\n     * by all of the elements \u003ccode\u003earray2\u003c/code\u003e. When an array is returned, it is always\n     * a new array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.addAll(array1, null)   \u003d cloned copy of array1\n     * ArrayUtils.addAll(null, array2)   \u003d cloned copy of array2\n     * ArrayUtils.addAll([], [])         \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param array1  the first array whose elements are added to the new array.\n     * @param array2  the second array whose elements are added to the new array.\n     * @return The new double[] array.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3196,col 9)-(line 3200,col 9)",
        "(line 3201,col 9)-(line 3201,col 73)",
        "(line 3202,col 9)-(line 3202,col 67)",
        "(line 3203,col 9)-(line 3203,col 79)",
        "(line 3204,col 9)-(line 3204,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(java.lang.Object[], java.lang.Object)",
      "begin_line": 3230,
      "end_line": 3235,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of \n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add(null, null)      \u003d [null]\n     * ArrayUtils.add(null, \"a\")       \u003d [\"a\"]\n     * ArrayUtils.add([\"a\"], null)     \u003d [\"a\", null]\n     * ArrayUtils.add([\"a\"], \"b\")      \u003d [\"a\", \"b\"]\n     * ArrayUtils.add([\"a\", \"b\"], \"c\") \u003d [\"a\", \"b\", \"c\"]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to \"add\" the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3231,col 9)-(line 3231,col 112)",
        "(line 3232,col 9)-(line 3232,col 67)",
        "(line 3233,col 9)-(line 3233,col 48)",
        "(line 3234,col 9)-(line 3234,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(boolean[], boolean)",
      "begin_line": 3258,
      "end_line": 3262,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of \n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add(null, true)          \u003d [true]\n     * ArrayUtils.add([true], false)       \u003d [true, false]\n     * ArrayUtils.add([true, false], true) \u003d [true, false, true]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3259,col 9)-(line 3259,col 76)",
        "(line 3260,col 9)-(line 3260,col 48)",
        "(line 3261,col 9)-(line 3261,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(byte[], byte)",
      "begin_line": 3285,
      "end_line": 3289,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of \n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3286,col 9)-(line 3286,col 67)",
        "(line 3287,col 9)-(line 3287,col 48)",
        "(line 3288,col 9)-(line 3288,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(char[], char)",
      "begin_line": 3312,
      "end_line": 3316,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of \n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add(null, \u00270\u0027)       \u003d [\u00270\u0027]\n     * ArrayUtils.add([\u00271\u0027], \u00270\u0027)      \u003d [\u00271\u0027, \u00270\u0027]\n     * ArrayUtils.add([\u00271\u0027, \u00270\u0027], \u00271\u0027) \u003d [\u00271\u0027, \u00270\u0027, \u00271\u0027]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3313,col 9)-(line 3313,col 72)",
        "(line 3314,col 9)-(line 3314,col 48)",
        "(line 3315,col 9)-(line 3315,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(double[], double)",
      "begin_line": 3339,
      "end_line": 3343,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of \n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3340,col 9)-(line 3340,col 73)",
        "(line 3341,col 9)-(line 3341,col 48)",
        "(line 3342,col 9)-(line 3342,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(float[], float)",
      "begin_line": 3366,
      "end_line": 3370,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of \n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3367,col 9)-(line 3367,col 70)",
        "(line 3368,col 9)-(line 3368,col 48)",
        "(line 3369,col 9)-(line 3369,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(int[], int)",
      "begin_line": 3393,
      "end_line": 3397,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of \n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3394,col 9)-(line 3394,col 68)",
        "(line 3395,col 9)-(line 3395,col 48)",
        "(line 3396,col 9)-(line 3396,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(long[], long)",
      "begin_line": 3420,
      "end_line": 3424,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of \n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3421,col 9)-(line 3421,col 67)",
        "(line 3422,col 9)-(line 3422,col 48)",
        "(line 3423,col 9)-(line 3423,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(short[], short)",
      "begin_line": 3447,
      "end_line": 3451,
      "comment": "\n     * \u003cp\u003eCopies the given array and adds the given element at the end of the new array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe new array contains the same elements of the input\n     * array plus the given element in the last position. The component type of \n     * the new array is the same as that of the input array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0)   \u003d [0]\n     * ArrayUtils.add([1], 0)    \u003d [1, 0]\n     * ArrayUtils.add([1, 0], 1) \u003d [1, 0, 1]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to copy and add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the object to add at the last index of the new array\n     * @return A new array containing the existing elements plus the new element\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3448,col 9)-(line 3448,col 70)",
        "(line 3449,col 9)-(line 3449,col 48)",
        "(line 3450,col 9)-(line 3450,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.copyArrayGrow1(java.lang.Object, java.lang.Class)",
      "begin_line": 3462,
      "end_line": 3470,
      "comment": "\n     * Returns a copy of the given array of size 1 greater than the argument. \n     * The last value of the array is left to the default value.\n     * \n     * @param array The array to copy, must not be \u003ccode\u003enull\u003c/code\u003e.\n     * @param newArrayComponentType If \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, create a \n     * size 1 array of this type.\n     * @return A new copy of the array of size 1 greater than the input.\n     ",
      "child_ranges": [
        "(line 3463,col 9)-(line 3468,col 9)",
        "(line 3469,col 9)-(line 3469,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(java.lang.Object[], int, java.lang.Object)",
      "begin_line": 3500,
      "end_line": 3511,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array. \n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0, null)      \u003d [null]\n     * ArrayUtils.add(null, 0, \"a\")       \u003d [\"a\"]\n     * ArrayUtils.add([\"a\"], 1, null)     \u003d [\"a\", null]\n     * ArrayUtils.add([\"a\"], 1, \"b\")      \u003d [\"a\", \"b\"]\n     * ArrayUtils.add([\"a\", \"b\"], 3, \"c\") \u003d [\"a\", \"b\", \"c\"]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3501,col 9)-(line 3501,col 26)",
        "(line 3502,col 9)-(line 3509,col 9)",
        "(line 3510,col 9)-(line 3510,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(boolean[], int, boolean)",
      "begin_line": 3540,
      "end_line": 3542,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array. \n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0, true)          \u003d [true]\n     * ArrayUtils.add([true], 0, false)       \u003d [false, true]\n     * ArrayUtils.add([false], 1, true)       \u003d [false, true]\n     * ArrayUtils.add([true, false], 1, true) \u003d [true, true, false]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3541,col 9)-(line 3541,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(char[], int, char)",
      "begin_line": 3572,
      "end_line": 3574,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array. \n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add(null, 0, \u0027a\u0027)            \u003d [\u0027a\u0027]\n     * ArrayUtils.add([\u0027a\u0027], 0, \u0027b\u0027)           \u003d [\u0027b\u0027, \u0027a\u0027]\n     * ArrayUtils.add([\u0027a\u0027, \u0027b\u0027], 0, \u0027c\u0027)      \u003d [\u0027c\u0027, \u0027a\u0027, \u0027b\u0027]\n     * ArrayUtils.add([\u0027a\u0027, \u0027b\u0027], 1, \u0027k\u0027)      \u003d [\u0027a\u0027, \u0027k\u0027, \u0027b\u0027]\n     * ArrayUtils.add([\u0027a\u0027, \u0027b\u0027, \u0027c\u0027], 1, \u0027t\u0027) \u003d [\u0027a\u0027, \u0027t\u0027, \u0027b\u0027, \u0027c\u0027]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3573,col 9)-(line 3573,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(byte[], int, byte)",
      "begin_line": 3603,
      "end_line": 3605,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array. \n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add([1], 0, 2)         \u003d [2, 1]\n     * ArrayUtils.add([2, 6], 2, 3)      \u003d [2, 6, 3]\n     * ArrayUtils.add([2, 6], 0, 1)      \u003d [1, 2, 6]\n     * ArrayUtils.add([2, 6, 3], 2, 1)   \u003d [2, 6, 1, 3]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3604,col 9)-(line 3604,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(short[], int, short)",
      "begin_line": 3634,
      "end_line": 3636,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array. \n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add([1], 0, 2)         \u003d [2, 1]\n     * ArrayUtils.add([2, 6], 2, 10)     \u003d [2, 6, 10]\n     * ArrayUtils.add([2, 6], 0, -4)     \u003d [-4, 2, 6]\n     * ArrayUtils.add([2, 6, 3], 2, 1)   \u003d [2, 6, 1, 3]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3635,col 9)-(line 3635,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(int[], int, int)",
      "begin_line": 3665,
      "end_line": 3667,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array. \n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add([1], 0, 2)         \u003d [2, 1]\n     * ArrayUtils.add([2, 6], 2, 10)     \u003d [2, 6, 10]\n     * ArrayUtils.add([2, 6], 0, -4)     \u003d [-4, 2, 6]\n     * ArrayUtils.add([2, 6, 3], 2, 1)   \u003d [2, 6, 1, 3]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3666,col 9)-(line 3666,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(long[], int, long)",
      "begin_line": 3696,
      "end_line": 3698,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array. \n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add([1L], 0, 2L)           \u003d [2L, 1L]\n     * ArrayUtils.add([2L, 6L], 2, 10L)      \u003d [2L, 6L, 10L]\n     * ArrayUtils.add([2L, 6L], 0, -4L)      \u003d [-4L, 2L, 6L]\n     * ArrayUtils.add([2L, 6L, 3L], 2, 1L)   \u003d [2L, 6L, 1L, 3L]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3697,col 9)-(line 3697,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(float[], int, float)",
      "begin_line": 3727,
      "end_line": 3729,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array. \n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add([1.1f], 0, 2.2f)               \u003d [2.2f, 1.1f]\n     * ArrayUtils.add([2.3f, 6.4f], 2, 10.5f)        \u003d [2.3f, 6.4f, 10.5f]\n     * ArrayUtils.add([2.6f, 6.7f], 0, -4.8f)        \u003d [-4.8f, 2.6f, 6.7f]\n     * ArrayUtils.add([2.9f, 6.0f, 0.3f], 2, 1.0f)   \u003d [2.9f, 6.0f, 1.0f, 0.3f]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3728,col 9)-(line 3728,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(double[], int, double)",
      "begin_line": 3758,
      "end_line": 3760,
      "comment": "\n     * \u003cp\u003eInserts the specified element at the specified position in the array. \n     * Shifts the element currently at that position (if any) and any subsequent\n     * elements to the right (adds one to their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array plus the given element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, a new one element array is returned\n     *  whose component type is the same as the element.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ArrayUtils.add([1.1], 0, 2.2)              \u003d [2.2, 1.1]\n     * ArrayUtils.add([2.3, 6.4], 2, 10.5)        \u003d [2.3, 6.4, 10.5]\n     * ArrayUtils.add([2.6, 6.7], 0, -4.8)        \u003d [-4.8, 2.6, 6.7]\n     * ArrayUtils.add([2.9, 6.0, 0.3], 2, 1.0)    \u003d [2.9, 6.0, 1.0, 0.3]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @return A new array containing the existing elements and the new element\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e array.length).\n     ",
      "child_ranges": [
        "(line 3759,col 9)-(line 3759,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.add(java.lang.Object, int, java.lang.Object, java.lang.Class)",
      "begin_line": 3773,
      "end_line": 3793,
      "comment": "\n     * Underlying implementation of add(array, index, element) methods. \n     * The last parameter is the class, which may not equal element.getClass \n     * for primitives.\n     *\n     * @param array  the array to add the element to, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the new object\n     * @param element  the object to add\n     * @param clss the type of the element being added\n     * @return A new array containing the existing elements and the new element\n     ",
      "child_ranges": [
        "(line 3774,col 9)-(line 3781,col 9)",
        "(line 3782,col 9)-(line 3782,col 44)",
        "(line 3783,col 9)-(line 3785,col 9)",
        "(line 3786,col 9)-(line 3786,col 60)",
        "(line 3787,col 9)-(line 3787,col 53)",
        "(line 3788,col 9)-(line 3788,col 42)",
        "(line 3789,col 9)-(line 3791,col 9)",
        "(line 3792,col 9)-(line 3792,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.remove(java.lang.Object[], int)",
      "begin_line": 3823,
      "end_line": 3825,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([\"a\"], 0)           \u003d []\n     * ArrayUtils.remove([\"a\", \"b\"], 0)      \u003d [\"b\"]\n     * ArrayUtils.remove([\"a\", \"b\"], 1)      \u003d [\"a\"]\n     * ArrayUtils.remove([\"a\", \"b\", \"c\"], 1) \u003d [\"a\", \"c\"]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3824,col 9)-(line 3824,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.removeElement(java.lang.Object[], java.lang.Object)",
      "begin_line": 3852,
      "end_line": 3858,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left \n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, \"a\")            \u003d null\n     * ArrayUtils.removeElement([], \"a\")              \u003d []\n     * ArrayUtils.removeElement([\"a\"], \"b\")           \u003d [\"a\"]\n     * ArrayUtils.removeElement([\"a\", \"b\"], \"a\")      \u003d [\"b\"]\n     * ArrayUtils.removeElement([\"a\", \"b\", \"a\"], \"a\") \u003d [\"b\", \"a\"]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3853,col 9)-(line 3853,col 44)",
        "(line 3854,col 9)-(line 3856,col 9)",
        "(line 3857,col 9)-(line 3857,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.remove(boolean[], int)",
      "begin_line": 3888,
      "end_line": 3890,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([true], 0)              \u003d []\n     * ArrayUtils.remove([true, false], 0)       \u003d [false]\n     * ArrayUtils.remove([true, false], 1)       \u003d [true]\n     * ArrayUtils.remove([true, true, false], 1) \u003d [true, false]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3889,col 9)-(line 3889,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.removeElement(boolean[], boolean)",
      "begin_line": 3917,
      "end_line": 3923,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left \n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, true)                \u003d null\n     * ArrayUtils.removeElement([], true)                  \u003d []\n     * ArrayUtils.removeElement([true], false)             \u003d [true]\n     * ArrayUtils.removeElement([true, false], false)      \u003d [true]\n     * ArrayUtils.removeElement([true, false, true], true) \u003d [false, true]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3918,col 9)-(line 3918,col 44)",
        "(line 3919,col 9)-(line 3921,col 9)",
        "(line 3922,col 9)-(line 3922,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.remove(byte[], int)",
      "begin_line": 3953,
      "end_line": 3955,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)          \u003d []\n     * ArrayUtils.remove([1, 0], 0)       \u003d [0]\n     * ArrayUtils.remove([1, 0], 1)       \u003d [1]\n     * ArrayUtils.remove([1, 0, 1], 1)    \u003d [1, 1]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3954,col 9)-(line 3954,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.removeElement(byte[], byte)",
      "begin_line": 3982,
      "end_line": 3988,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left \n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)        \u003d null\n     * ArrayUtils.removeElement([], 1)          \u003d []\n     * ArrayUtils.removeElement([1], 0)         \u003d [1]\n     * ArrayUtils.removeElement([1, 0], 0)      \u003d [1]\n     * ArrayUtils.removeElement([1, 0, 1], 1)   \u003d [0, 1]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3983,col 9)-(line 3983,col 44)",
        "(line 3984,col 9)-(line 3986,col 9)",
        "(line 3987,col 9)-(line 3987,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.remove(char[], int)",
      "begin_line": 4018,
      "end_line": 4020,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([\u0027a\u0027], 0)           \u003d []\n     * ArrayUtils.remove([\u0027a\u0027, \u0027b\u0027], 0)      \u003d [\u0027b\u0027]\n     * ArrayUtils.remove([\u0027a\u0027, \u0027b\u0027], 1)      \u003d [\u0027a\u0027]\n     * ArrayUtils.remove([\u0027a\u0027, \u0027b\u0027, \u0027c\u0027], 1) \u003d [\u0027a\u0027, \u0027c\u0027]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4019,col 9)-(line 4019,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.removeElement(char[], char)",
      "begin_line": 4047,
      "end_line": 4053,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left \n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, \u0027a\u0027)            \u003d null\n     * ArrayUtils.removeElement([], \u0027a\u0027)              \u003d []\n     * ArrayUtils.removeElement([\u0027a\u0027], \u0027b\u0027)           \u003d [\u0027a\u0027]\n     * ArrayUtils.removeElement([\u0027a\u0027, \u0027b\u0027], \u0027a\u0027)      \u003d [\u0027b\u0027]\n     * ArrayUtils.removeElement([\u0027a\u0027, \u0027b\u0027, \u0027a\u0027], \u0027a\u0027) \u003d [\u0027b\u0027, \u0027a\u0027]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4048,col 9)-(line 4048,col 44)",
        "(line 4049,col 9)-(line 4051,col 9)",
        "(line 4052,col 9)-(line 4052,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.remove(double[], int)",
      "begin_line": 4083,
      "end_line": 4085,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1.1], 0)           \u003d []\n     * ArrayUtils.remove([2.5, 6.0], 0)      \u003d [6.0]\n     * ArrayUtils.remove([2.5, 6.0], 1)      \u003d [2.5]\n     * ArrayUtils.remove([2.5, 6.0, 3.8], 1) \u003d [2.5, 3.8]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4084,col 9)-(line 4084,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.removeElement(double[], double)",
      "begin_line": 4112,
      "end_line": 4118,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left \n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1.1)            \u003d null\n     * ArrayUtils.removeElement([], 1.1)              \u003d []\n     * ArrayUtils.removeElement([1.1], 1.2)           \u003d [1.1]\n     * ArrayUtils.removeElement([1.1, 2.3], 1.1)      \u003d [2.3]\n     * ArrayUtils.removeElement([1.1, 2.3, 1.1], 1.1) \u003d [2.3, 1.1]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4113,col 9)-(line 4113,col 44)",
        "(line 4114,col 9)-(line 4116,col 9)",
        "(line 4117,col 9)-(line 4117,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.remove(float[], int)",
      "begin_line": 4148,
      "end_line": 4150,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1.1], 0)           \u003d []\n     * ArrayUtils.remove([2.5, 6.0], 0)      \u003d [6.0]\n     * ArrayUtils.remove([2.5, 6.0], 1)      \u003d [2.5]\n     * ArrayUtils.remove([2.5, 6.0, 3.8], 1) \u003d [2.5, 3.8]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4149,col 9)-(line 4149,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.removeElement(float[], float)",
      "begin_line": 4177,
      "end_line": 4183,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left \n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1.1)            \u003d null\n     * ArrayUtils.removeElement([], 1.1)              \u003d []\n     * ArrayUtils.removeElement([1.1], 1.2)           \u003d [1.1]\n     * ArrayUtils.removeElement([1.1, 2.3], 1.1)      \u003d [2.3]\n     * ArrayUtils.removeElement([1.1, 2.3, 1.1], 1.1) \u003d [2.3, 1.1]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4178,col 9)-(line 4178,col 44)",
        "(line 4179,col 9)-(line 4181,col 9)",
        "(line 4182,col 9)-(line 4182,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.remove(int[], int)",
      "begin_line": 4213,
      "end_line": 4215,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)         \u003d []\n     * ArrayUtils.remove([2, 6], 0)      \u003d [6]\n     * ArrayUtils.remove([2, 6], 1)      \u003d [2]\n     * ArrayUtils.remove([2, 6, 3], 1)   \u003d [2, 3]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4214,col 9)-(line 4214,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.removeElement(int[], int)",
      "begin_line": 4242,
      "end_line": 4248,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left \n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)      \u003d null\n     * ArrayUtils.removeElement([], 1)        \u003d []\n     * ArrayUtils.removeElement([1], 2)       \u003d [1]\n     * ArrayUtils.removeElement([1, 3], 1)    \u003d [3]\n     * ArrayUtils.removeElement([1, 3, 1], 1) \u003d [3, 1]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4243,col 9)-(line 4243,col 44)",
        "(line 4244,col 9)-(line 4246,col 9)",
        "(line 4247,col 9)-(line 4247,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.remove(long[], int)",
      "begin_line": 4278,
      "end_line": 4280,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)         \u003d []\n     * ArrayUtils.remove([2, 6], 0)      \u003d [6]\n     * ArrayUtils.remove([2, 6], 1)      \u003d [2]\n     * ArrayUtils.remove([2, 6, 3], 1)   \u003d [2, 3]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4279,col 9)-(line 4279,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.removeElement(long[], long)",
      "begin_line": 4307,
      "end_line": 4313,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left \n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)      \u003d null\n     * ArrayUtils.removeElement([], 1)        \u003d []\n     * ArrayUtils.removeElement([1], 2)       \u003d [1]\n     * ArrayUtils.removeElement([1, 3], 1)    \u003d [3]\n     * ArrayUtils.removeElement([1, 3, 1], 1) \u003d [3, 1]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4308,col 9)-(line 4308,col 44)",
        "(line 4309,col 9)-(line 4311,col 9)",
        "(line 4312,col 9)-(line 4312,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.remove(short[], int)",
      "begin_line": 4343,
      "end_line": 4345,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.remove([1], 0)         \u003d []\n     * ArrayUtils.remove([2, 6], 0)      \u003d [6]\n     * ArrayUtils.remove([2, 6], 1)      \u003d [2]\n     * ArrayUtils.remove([2, 6, 3], 1)   \u003d [2, 3]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4344,col 9)-(line 4344,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.removeElement(short[], short)",
      "begin_line": 4372,
      "end_line": 4378,
      "comment": "\n     * \u003cp\u003eRemoves the first occurrence of the specified element from the\n     * specified array. All subsequent elements are shifted to the left \n     * (substracts one from their indices). If the array doesn\u0027t contains\n     * such an element, no elements are removed from the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the first occurrence of the specified element. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ArrayUtils.removeElement(null, 1)      \u003d null\n     * ArrayUtils.removeElement([], 1)        \u003d []\n     * ArrayUtils.removeElement([1], 2)       \u003d [1]\n     * ArrayUtils.removeElement([1, 3], 1)    \u003d [3]\n     * ArrayUtils.removeElement([1, 3, 1], 1) \u003d [3, 1]\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to remove the element from, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param element  the element to be removed\n     * @return A new array containing the existing elements except the first\n     *         occurrence of the specified element.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4373,col 9)-(line 4373,col 44)",
        "(line 4374,col 9)-(line 4376,col 9)",
        "(line 4377,col 9)-(line 4377,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ArrayUtils.remove(java.lang.Object, int)",
      "begin_line": 4401,
      "end_line": 4414,
      "comment": "\n     * \u003cp\u003eRemoves the element at the specified position from the specified array.\n     * All subsequent elements are shifted to the left (substracts one from\n     * their indices).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns a new array with the same elements of the input\n     * array except the element on the specified position. The component \n     * type of the returned array is always the same as that of the input \n     * array.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the input array is \u003ccode\u003enull\u003c/code\u003e, an IndexOutOfBoundsException\n     * will be thrown, because in that case no valid index can be specified.\u003c/p\u003e\n     * \n     * @param array  the array to remove the element from, may not be \u003ccode\u003enull\u003c/code\u003e\n     * @param index  the position of the element to be removed\n     * @return A new array containing the existing elements except the element\n     *         at the specified position.\n     * @throws IndexOutOfBoundsException if the index is out of range \n     * (index \u003c 0 || index \u003e\u003d array.length), or if the array is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4402,col 9)-(line 4402,col 38)",
        "(line 4403,col 9)-(line 4405,col 9)",
        "(line 4407,col 9)-(line 4407,col 91)",
        "(line 4408,col 9)-(line 4408,col 53)",
        "(line 4409,col 9)-(line 4411,col 9)",
        "(line 4413,col 9)-(line 4413,col 22)"
      ]
    }
  ]
}