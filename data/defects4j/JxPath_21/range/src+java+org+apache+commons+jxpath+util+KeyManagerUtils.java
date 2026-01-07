{
  "filepath": "/tmp/JxPath-21b/src/java/org/apache/commons/jxpath/util/KeyManagerUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KeyManagerUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 75,
      "comment": "\n * Utility class.\n *\n * @author Matt Benson\n * @since JXPath 1.3\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "class_interface",
      "name": "SingleNodeExtendedKeyManager",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ExtendedKeyManager"
      ],
      "begin_line": 38,
      "end_line": 62,
      "comment": "\n     * Adapt KeyManager to implement ExtendedKeyManager.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.util.KeyManagerUtils.SingleNodeExtendedKeyManager.SingleNodeExtendedKeyManager(org.apache.commons.jxpath.KeyManager)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n         * Create a new SingleNodeExtendedKeyManager.\n         * @param delegate KeyManager to wrap\n         ",
      "child_ranges": [
        "(line 47,col 13)-(line 47,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.KeyManagerUtils.SingleNodeExtendedKeyManager.getNodeSetByKey(org.apache.commons.jxpath.JXPathContext, java.lang.String, java.lang.Object)",
      "begin_line": 50,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 52,col 13)-(line 52,col 101)",
        "(line 53,col 13)-(line 53,col 53)",
        "(line 54,col 13)-(line 54,col 32)",
        "(line 55,col 13)-(line 55,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.KeyManagerUtils.SingleNodeExtendedKeyManager.getPointerByKey(org.apache.commons.jxpath.JXPathContext, java.lang.String, java.lang.String)",
      "begin_line": 58,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 13)-(line 60,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.KeyManagerUtils.getExtendedKeyManager(org.apache.commons.jxpath.KeyManager)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Get an ExtendedKeyManager from the specified KeyManager.\n     * @param keyManager to adapt, if necessary\n     * @return \u003ccode\u003ekeyManager\u003c/code\u003e if it implements ExtendedKeyManager\n     *         or a basic single-result ExtendedKeyManager that delegates to\n     *         \u003ccode\u003ekeyManager\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 73,col 63)"
      ]
    }
  ]
}