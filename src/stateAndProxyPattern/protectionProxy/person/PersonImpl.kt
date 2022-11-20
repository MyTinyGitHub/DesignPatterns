package stateAndProxyPattern.protectionProxy.person

class PersonImpl(private var name: String, private var gender: String, private var interests: String) : Person {
    private var rating : Int = 0;
    private var ratingCount: Int = 0;

    override fun getName(): String {
        return this.name;
    }

    override fun getGender(): String {
       return this.gender;
    }

    override fun getInterests(): String {
        return this.interests
    }


    override fun getGeekRating(): Int {
        if(rating == 0 ) return 0;
        return rating/ratingCount;
    }

    override fun setName(name: String) {
        this.name = name;
    }

    override fun setGender(gender: String) {
        this.gender = gender;
    }

    override fun setInterests(interests: String) {
        this.interests = interests
    }

    override fun setGeekRating(rating : Int) {
        this.rating += rating;
        this.ratingCount++
    }
}