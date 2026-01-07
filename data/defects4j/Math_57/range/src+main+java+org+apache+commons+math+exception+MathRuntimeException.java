{
  "filepath": "/tmp/Math-57b/src/main/java/org/apache/commons/math/exception/MathRuntimeException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathRuntimeException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException",
        "org.apache.commons.math.exception.MathThrowable"
      ],
      "begin_line": 41,
      "end_line": 297,
      "comment": "\n * This class is the base class for all exceptions.\n *\n * @since 3.0\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serializable version Id. "
    },
    {
      "type": "field",
      "varNames": [
        "messages"
      ],
      "begin_line": 48,
      "end_line": 49,
      "comment": "\n     * Various informations that enrich the informative message.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "context"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Arbitrary context information.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.MathRuntimeException()",
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Builds an exception.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.MathRuntimeException(java.lang.Throwable)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Builds an exception.\n     *\n     * @param cause Cause of the error (may be null).\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.addMessage(org.apache.commons.math.exception.util.Localizable)",
      "begin_line": 70,
      "end_line": 72,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.addMessage(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 75,
      "end_line": 79,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 77,col 9)-(line 78,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.setContext(java.lang.String, java.lang.Object)",
      "begin_line": 82,
      "end_line": 84,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.getContext(java.lang.String)",
      "begin_line": 87,
      "end_line": 89,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.getContextKeys()",
      "begin_line": 92,
      "end_line": 94,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.getMessage(java.util.Locale)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Gets the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated.\n     * @return the localized message.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.getMessage(java.util.Locale, java.lang.String)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "\n     * Gets the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated.\n     * @param separator Separator inserted between the message parts.\n     * @return the localized message.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.getMessage()",
      "begin_line": 119,
      "end_line": 122,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.getLocalizedMessage()",
      "begin_line": 125,
      "end_line": 128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.buildMessage(java.util.Locale, java.lang.String)",
      "begin_line": 137,
      "end_line": 153,
      "comment": "\n     * Builds a message string.\n     *\n     * @param locale Locale in which the message should be translated.\n     * @param separator Message separator.\n     * @return a localized message string.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 53)",
        "(line 140,col 9)-(line 140,col 22)",
        "(line 141,col 9)-(line 141,col 40)",
        "(line 142,col 9)-(line 150,col 9)",
        "(line 152,col 9)-(line 152,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 161,
      "end_line": 165,
      "comment": "\n     * Serialize this object to the given stream.\n     *\n     * @param out Stream.\n     * @throws IOException This should never happen.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 31)",
        "(line 164,col 9)-(line 164,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.readObject(java.io.ObjectInputStream)",
      "begin_line": 173,
      "end_line": 178,
      "comment": "\n     * Deserialize this object from the given stream.\n     *\n     * @param in Stream.\n     * @throws IOException This should never happen.\n     * @throws ClassNotFoundException This should never happen.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 32)",
        "(line 177,col 9)-(line 177,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.serializeMessages(java.io.ObjectOutputStream)",
      "begin_line": 186,
      "end_line": 210,
      "comment": "\n     * Serialize {@link #messages}.\n     *\n     * @param out Stream.\n     * @throws IOException This should never happen.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 40)",
        "(line 190,col 9)-(line 190,col 26)",
        "(line 192,col 9)-(line 209,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.deSerializeMessages(java.io.ObjectInputStream)",
      "begin_line": 219,
      "end_line": 238,
      "comment": "\n     * Deserialize {@link #messages}.\n     *\n     * @param in Stream.\n     * @throws IOException This should never happen.\n     * @throws ClassNotFoundException This should never happen.\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 37)",
        "(line 224,col 9)-(line 224,col 79)",
        "(line 226,col 9)-(line 237,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.serializeContext(java.io.ObjectOutputStream)",
      "begin_line": 246,
      "end_line": 263,
      "comment": "\n     * Serialize {@link #context}.\n     *\n     * @param out Stream.\n     * @throws IOException This should never happen.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 48)",
        "(line 250,col 9)-(line 250,col 26)",
        "(line 251,col 9)-(line 262,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.deSerializeContext(java.io.ObjectInputStream)",
      "begin_line": 272,
      "end_line": 285,
      "comment": "\n     * Deserialize {@link #context}.\n     *\n     * @param in Stream.\n     * @throws IOException This should never happen.\n     * @throws ClassNotFoundException This should never happen.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 37)",
        "(line 277,col 9)-(line 277,col 48)",
        "(line 278,col 9)-(line 284,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.nonSerializableReplacement(java.lang.Object)",
      "begin_line": 294,
      "end_line": 296,
      "comment": "\n     * Replaces a non-serializable object with an error message string.\n     *\n     * @param obj Object that does not implement the {@code Serializable\n     * interface\n     * @return a string that mentions which class could not be serialized.\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 84)"
      ]
    }
  ]
}