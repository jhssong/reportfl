{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/util/TransformerMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TransformerMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.util.NumberTransformer",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 151,
      "comment": "\n * This TansformerMap automates the transformation of of mixed object types.\n * It provides a means to set NumberTransformers that will be selected \n * based on the Class of the object handed to the Maps\n * \u003ccode\u003edouble transform(Object o)\u003c/code\u003e method.\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "defaultTransformer"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * A default Number Transformer for Numbers and numeric Strings.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * The internal Map.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.TransformerMap.TransformerMap()",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\n     * \n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 28)",
        "(line 53,col 9)-(line 53,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.TransformerMap.containsClass(java.lang.Class)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Tests if a Class is present in the TransformerMap.\n     * @param key Class to check\n     * @return true|false\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.TransformerMap.containsTransformer(org.apache.commons.math.util.NumberTransformer)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Tests if a NumberTransformer is present in the TransformerMap.\n     * @param value NumberTransformer to check\n     * @return true|false\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.TransformerMap.getTransformer(java.lang.Class)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Returns the Transformer that is mapped to a class\n     * if mapping is not present, this returns null.\n     * @param key The Class of the object\n     * @return the mapped NumberTransformer or null.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.TransformerMap.putTransformer(java.lang.Class, org.apache.commons.math.util.NumberTransformer)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Sets a Class to Transformer Mapping in the Map. If\n     * the Class is already present, this overwrites that\n     * mapping.\n     * @param key The Class\n     * @param transformer The NumberTransformer\n     * @return the replaced transformer if one is present\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.TransformerMap.removeTransformer(java.lang.Class)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Removes a Class to Transformer Mapping in the Map.\n     * @param key The Class\n     * @return the removed transformer if one is present or\n     * null if none was present.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.TransformerMap.clear()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Clears all the Class to Transformer mappings.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.TransformerMap.classes()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Returns the Set of Classes used as keys in the map.\n     * @return Set of Classes\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.TransformerMap.transformers()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * Returns the Set of NumberTransformers used as values \n     * in the map.\n     * @return Set of NumberTransformers\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.TransformerMap.transform(java.lang.Object)",
      "begin_line": 136,
      "end_line": 149,
      "comment": "\n     * Attempts to transform the Object against the map of\n     * NumberTransformers. Otherwise it returns Double.NaN.\n     * \n     * @see org.apache.commons.math.util.NumberTransformer#transform(java.lang.Object)\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 34)",
        "(line 139,col 9)-(line 146,col 9)",
        "(line 148,col 9)-(line 148,col 21)"
      ]
    }
  ]
}