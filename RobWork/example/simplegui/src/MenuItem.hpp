#ifndef MENUITEM_HPP_
#define MENUITEM_HPP_

#include <string>
#include "EventListener.hpp"

class MenuItem
{
public:
    MenuItem(const std::string& name, int id, example::EventListener *listener):
             _name(name),_id(id),_eventListener(listener){};
    virtual ~MenuItem(){};

    int getId(){return _id;};

    std::string getName(){ return _name;};

    void event(){
        _eventListener->event(example::EventListener::e_MENUITEM_EVENT,&_name);
    }

private:
    std::string _name;
    int _id;
    example::EventListener *_eventListener;
};

#endif /*MENUITEM_HPP_*/
