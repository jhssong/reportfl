{
  "filepath": "/tmp/JxPath-14b/src/java/org/apache/commons/jxpath/util/KeyManagerUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KeyManagerUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 67,
      "comment": "\n * Utility class.\n * @author Matt Benson\n * @since JXPath 1.3\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "class_interface",
      "name": "SingleNodeExtendedKeyManager",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ExtendedKeyManager"
      ],
      "begin_line": 34,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.util.KeyManagerUtils.SingleNodeExtendedKeyManager.SingleNodeExtendedKeyManager(org.apache.commons.jxpath.KeyManager)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 13)-(line 39,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.KeyManagerUtils.SingleNodeExtendedKeyManager.getNodeSetByKey(org.apache.commons.jxpath.JXPathContext, java.lang.String, java.lang.Object)",
      "begin_line": 42,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 44,col 13)-(line 44,col 101)",
        "(line 45,col 13)-(line 45,col 53)",
        "(line 46,col 13)-(line 46,col 32)",
        "(line 47,col 13)-(line 47,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.KeyManagerUtils.SingleNodeExtendedKeyManager.getPointerByKey(org.apache.commons.jxpath.JXPathContext, java.lang.String, java.lang.String)",
      "begin_line": 50,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 13)-(line 52,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.KeyManagerUtils.getExtendedKeyManager(org.apache.commons.jxpath.KeyManager)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n     * Get an ExtendedKeyManager from the specified KeyManager.\n     * @param keyManager\n     * @return \u003ccode\u003ekeyManager\u003c/code\u003e if it implements ExtendedKeyManager\n     *         or a basic single-result ExtendedKeyManager that delegates to\n     *         \u003ccode\u003ekeyManager\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 65,col 63)"
      ]
    }
  ]
}