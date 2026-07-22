class Solution {
public:
    vector<vector<int>> findDifference(vector<int>& nums1, vector<int>& nums2) {
        unordered_set<int> s1(nums1.begin(), nums1.end());
        unordered_set<int> s2(nums2.begin(), nums2.end());

        vector<int> first, second;

        for (int x : s1) {
            if (!s2.count(x))
                first.push_back(x);
        }

        for (int x : s2) {
            if (!s1.count(x))
                second.push_back(x);
        }

        return {first, second};

    }
};