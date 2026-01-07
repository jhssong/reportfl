{
  "filepath": "/tmp/Csv-1b/src/test/java/org/apache/commons/csv/CSVLexerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVLexerTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 174,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVLexerTest.getLexer(java.lang.String, org.apache.commons.csv.CSVFormat)",
      "begin_line": 30,
      "end_line": 32,
      "comment": "",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVLexerTest.assertTokenEquals(org.apache.commons.csv.Token.Type, java.lang.String, org.apache.commons.csv.Token)",
      "begin_line": 34,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 61)",
        "(line 36,col 9)-(line 36,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVLexerTest.testNextToken1()",
      "begin_line": 40,
      "end_line": 54,
      "comment": " Single line (without comment)",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 71)",
        "(line 43,col 9)-(line 43,col 95)",
        "(line 44,col 9)-(line 44,col 71)",
        "(line 45,col 9)-(line 45,col 71)",
        "(line 46,col 9)-(line 46,col 72)",
        "(line 47,col 9)-(line 47,col 73)",
        "(line 48,col 9)-(line 48,col 72)",
        "(line 49,col 9)-(line 49,col 70)",
        "(line 50,col 9)-(line 50,col 71)",
        "(line 51,col 9)-(line 51,col 69)",
        "(line 52,col 9)-(line 52,col 68)",
        "(line 53,col 9)-(line 53,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVLexerTest.testNextToken2()",
      "begin_line": 57,
      "end_line": 86,
      "comment": " multiline including comments (and empty lines)",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 58)",
        "(line 67,col 9)-(line 67,col 67)",
        "(line 69,col 9)-(line 69,col 49)",
        "(line 72,col 9)-(line 72,col 69)",
        "(line 73,col 9)-(line 73,col 69)",
        "(line 74,col 9)-(line 74,col 69)",
        "(line 75,col 9)-(line 75,col 71)",
        "(line 76,col 9)-(line 76,col 69)",
        "(line 77,col 9)-(line 77,col 71)",
        "(line 78,col 9)-(line 78,col 72)",
        "(line 79,col 9)-(line 79,col 71)",
        "(line 80,col 9)-(line 80,col 69)",
        "(line 81,col 9)-(line 81,col 69)",
        "(line 82,col 9)-(line 82,col 71)",
        "(line 83,col 9)-(line 83,col 66)",
        "(line 84,col 9)-(line 84,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVLexerTest.testNextToken3()",
      "begin_line": 89,
      "end_line": 107,
      "comment": " simple token with escaping",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 38)",
        "(line 95,col 9)-(line 95,col 67)",
        "(line 96,col 9)-(line 96,col 49)",
        "(line 98,col 9)-(line 98,col 69)",
        "(line 100,col 9)-(line 100,col 70)",
        "(line 101,col 9)-(line 101,col 68)",
        "(line 102,col 9)-(line 102,col 72)",
        "(line 104,col 9)-(line 104,col 70)",
        "(line 105,col 9)-(line 105,col 68)",
        "(line 106,col 9)-(line 106,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVLexerTest.testNextToken4()",
      "begin_line": 110,
      "end_line": 132,
      "comment": " encapsulator tokenizer (sinle line)",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 88)",
        "(line 118,col 9)-(line 118,col 95)",
        "(line 119,col 9)-(line 119,col 69)",
        "(line 120,col 9)-(line 120,col 71)",
        "(line 121,col 9)-(line 121,col 72)",
        "(line 122,col 9)-(line 122,col 69)",
        "(line 123,col 9)-(line 123,col 72)",
        "(line 124,col 9)-(line 124,col 72)",
        "(line 125,col 9)-(line 125,col 69)",
        "(line 126,col 9)-(line 126,col 72)",
        "(line 127,col 9)-(line 127,col 72)",
        "(line 128,col 9)-(line 128,col 69)",
        "(line 129,col 9)-(line 129,col 73)",
        "(line 131,col 9)-(line 131,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVLexerTest.testNextToken5()",
      "begin_line": 135,
      "end_line": 145,
      "comment": " encapsulator tokenizer (multi line, delimiter in string)",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 72)",
        "(line 138,col 9)-(line 138,col 60)",
        "(line 139,col 9)-(line 139,col 69)",
        "(line 140,col 9)-(line 140,col 73)",
        "(line 141,col 9)-(line 141,col 72)",
        "(line 142,col 9)-(line 142,col 86)",
        "(line 143,col 9)-(line 143,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVLexerTest.testNextToken6()",
      "begin_line": 148,
      "end_line": 160,
      "comment": " change delimiters, comment, encapsulater",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 62)",
        "(line 156,col 9)-(line 156,col 109)",
        "(line 157,col 9)-(line 157,col 49)",
        "(line 158,col 9)-(line 158,col 69)",
        "(line 159,col 9)-(line 159,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVLexerTest.testDelimiterIsWhitespace()",
      "begin_line": 163,
      "end_line": 173,
      "comment": " From CSV-1",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 55)",
        "(line 166,col 9)-(line 166,col 56)",
        "(line 167,col 9)-(line 167,col 71)",
        "(line 168,col 9)-(line 168,col 71)",
        "(line 169,col 9)-(line 169,col 68)",
        "(line 170,col 9)-(line 170,col 72)",
        "(line 171,col 9)-(line 171,col 72)",
        "(line 172,col 9)-(line 172,col 69)"
      ]
    }
  ]
}